package YF.mapper;

import YF.pojo.User;

import java.util.Map;

public interface UserMapper {
    /*查询登录账号和密码*/
    User queryLogin(Map<String,String> map);

    /*登录后显示用户信息*/
    User queryUserByID(String id);

    /*修改用户信息*/
    int updateUser(User user);

}
