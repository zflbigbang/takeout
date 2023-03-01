package org.example.reggie.service;

import org.example.reggie.dto.DishDto;
import org.example.reggie.entity.Dish;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author ZFL
* @description 针对表【dish(菜品管理)】的数据库操作Service
* @createDate 2023-02-11 15:13:05
*/
public interface DishService extends IService<Dish> {
    public void saveWithFlavor(DishDto dishDto);
    public DishDto getByIdWithFlavor(Long id);
    public void updateWithFlavor(DishDto dishDto);
}
