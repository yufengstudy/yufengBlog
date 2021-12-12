package YF.controller;

import YF.pojo.Blogs;
import YF.pojo.Website;
import YF.service.WebsiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
/*redirect*/
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class WebsiteController {

    private WebsiteService websiteService;
    @Autowired
    public void setWebsiteService(WebsiteService websiteService) {
        this.websiteService = websiteService;
    }

    /*页面数据初始化*/
    @GetMapping(value = {"/","/index"})
    public String queryWebsite(Model model, HttpServletRequest request){

        Website website = websiteService.queryWebsite();
        Date life = website.getLife();
        Date date = new Date();
        long day = (date.getTime() - life.getTime())/ (1000 * 24 * 60 * 60);

        int blogsCount = websiteService.queryBlogsCount();


        /*查询文章信息*/
        Map<String,Integer> map=new HashMap<String, Integer>();
        HttpSession session = request.getSession();
        int currentPage=1;//当前页
        int pageSize=8;
        session.setAttribute("currentPage",1);
        session.setAttribute("pageSize",8);
        map.put("startIndex",(currentPage-1)*pageSize);
        map.put("pageSize",pageSize);
        List<Blogs> blogsList = websiteService.queryBlogs(map);

        model.addAttribute(blogsList);
        model.addAttribute("day",day);
        model.addAttribute("blogsCount",blogsCount);
        model.addAttribute(website);
        model.addAttribute("currentPage",currentPage);

        return "WEB-INF/page/index";
    }

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "/WEB-INF/page/login";
    }


    /*上一页*/
    @RequestMapping("/upPage")
    public String upPage(HttpServletRequest request,Model model,Map<String,Integer> map){
        HttpSession session = request.getSession();
        Integer currentPage = (Integer) session.getAttribute("currentPage");
        Integer pageSize = (Integer) session.getAttribute("pageSize");
        currentPage-=1;
        session.setAttribute("currentPage",currentPage);

        map.put("startIndex",(currentPage-1)*pageSize);
        map.put("pageSize",pageSize);

        List<Blogs> blogsList = websiteService.queryBlogs(map);
        model.addAttribute(blogsList);
        model.addAttribute("currentPage",currentPage);


        return "WEB-INF/page/index";
    }


    /*下一页*/
    @RequestMapping("/nextPage")
    public String nextPage(HttpServletRequest request,Model model,Map<String,Integer> map){
        HttpSession session = request.getSession();
        Integer currentPage = (Integer) session.getAttribute("currentPage");
        Integer pageSize = (Integer) session.getAttribute("pageSize");
        currentPage+=1;
        session.setAttribute("currentPage",currentPage);

        map.put("startIndex",(currentPage-1)*pageSize);
        map.put("pageSize",pageSize);

        List<Blogs> blogsList = websiteService.queryBlogs(map);
        model.addAttribute(blogsList);
        model.addAttribute("currentPage",currentPage);


        return "WEB-INF/page/index";
    }




}
