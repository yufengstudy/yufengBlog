package YF.service;

import YF.mapper.UserMapper;
import YF.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserServiceImpl implements UserService{
    private UserMapper userMapper;
    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User queryLogin(Map<String,String> map) {
        return userMapper.queryLogin(map);
    }

    public User queryUserByID(String id) {
        return userMapper.queryUserByID(id);
    }

    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }
}


