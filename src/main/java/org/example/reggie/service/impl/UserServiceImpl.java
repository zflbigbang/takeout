package org.example.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.reggie.entity.User;
import org.example.reggie.service.UserService;
import org.example.reggie.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author ZFL
* @description 针对表【user(用户信息)】的数据库操作Service实现
* @createDate 2023-02-26 16:23:40
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




