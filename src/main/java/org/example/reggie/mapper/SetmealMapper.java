package org.example.reggie.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.reggie.entity.Setmeal;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author ZFL
* @description 针对表【setmeal(套餐)】的数据库操作Mapper
* @createDate 2023-02-12 19:14:19
* @Entity org.example.reggie.entity.Setmeal
*/
@Mapper
public interface SetmealMapper extends BaseMapper<Setmeal> {

}




