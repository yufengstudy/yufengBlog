package YF.controller;

import YF.pojo.Blogs;
import YF.service.BlogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.UUID;

@Controller
public class BlogsController {

    private BlogsService blogsService;
    @Autowired
    public void setBlogsService(BlogsService blogsService) {
        this.blogsService = blogsService;
    }
    /*插入文章*/
    @RequestMapping("/blogs/addBlog")
    public String addBlog(Blogs blogs, HttpServletRequest request){
        HttpSession session = request.getSession();
        String id = (String) session.getAttribute("id");
        UUID uuid = UUID.randomUUID();
        String uid = uuid.toString();
        blogs.setId(id);
        blogs.setBlogID(uid);
        blogsService.addBlog(blogs);
        return "redirect:/management/queryUser";
    }

}
