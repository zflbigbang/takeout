package org.example.reggie.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.reggie.entity.SetmealDish;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author ZFL
* @description 针对表【setmeal_dish(套餐菜品关系)】的数据库操作Mapper
* @createDate 2023-02-12 19:15:26
* @Entity org.example.reggie.entity.SetmealDish
*/
@Mapper
public interface SetmealDishMapper extends BaseMapper<SetmealDish> {

}




