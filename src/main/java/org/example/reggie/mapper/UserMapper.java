package org.example.reggie.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.reggie.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author ZFL
* @description 针对表【user(用户信息)】的数据库操作Mapper
* @createDate 2023-02-26 16:23:39
* @Entity org.example.reggie.entity.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




