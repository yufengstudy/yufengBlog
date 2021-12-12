package YF.service;

import YF.pojo.User;

import java.util.Map;

public interface UserService {
    /*查询账户密码*/
    User queryLogin(Map<String,String> map);

    /*查询用户信息*/
    User queryUserByID(String id);

    /*修改用户信息*/
    int updateUser(User user);
}
