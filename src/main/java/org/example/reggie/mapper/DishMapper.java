package org.example.reggie.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.reggie.entity.Dish;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author ZFL
* @description 针对表【dish(菜品管理)】的数据库操作Mapper
* @createDate 2023-02-11 15:13:05
* @Entity org.example.reggie.entity.Dish
*/
@Mapper
public interface DishMapper extends BaseMapper<Dish> {

}




