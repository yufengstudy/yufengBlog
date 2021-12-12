package YF.controller;

import YF.pojo.User;
import YF.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class UserController {

    private UserService userService;
    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    /*登录验证*/
    @RequestMapping("/management/login")
    public String queryLogin(Map<String,String> map, @RequestParam("password") String password, @RequestParam("username") String username, HttpServletRequest request){
        map.put("username",username);
        map.put("password",password);
        User user = userService.queryLogin(map);
        HttpSession session = request.getSession();
        session.setAttribute("id",user.getId());
        if (user==null){
            return "WEB-INF/page/login";
        }else {
            return "redirect:/management/queryUser";
        }
    }

    /*页面跳转*/
    @RequestMapping("/management/article")
    public String toArticle(){
        return "WEB-INF/page/article";
    }

    /*查询用户信息*/
    @RequestMapping("/management/queryUser")
    public String queryUserByUsername(HttpServletRequest request,Model model){
        HttpSession session = request.getSession();
        String id = (String) session.getAttribute("id");
        User user = userService.queryUserByID(id);
        model.addAttribute(user);
        return "WEB-INF/page/management";
    }

    @RequestMapping("/management/updateUser")
    public String updateUser(User user,Model model){
        userService.updateUser(user);
        return "redirect:/management/queryUser";
    }

}
