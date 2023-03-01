package org.example.reggie.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.reggie.common.CustomException;
import org.example.reggie.entity.Category;
import org.example.reggie.entity.Dish;
import org.example.reggie.entity.Setmeal;
import org.example.reggie.service.CategoryService;
import org.example.reggie.mapper.CategoryMapper;
import org.example.reggie.service.DishService;
import org.example.reggie.service.SetmealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author ZFL
* @description 针对表【category(菜品及套餐分类)】的数据库操作Service实现
* @createDate 2023-02-10 19:51:21
*/
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category>
        implements CategoryService{
    @Autowired
    DishService dishService;
    @Autowired
    SetmealService setmealService;
    @Override
    public void remove(Long id) {
        //添加查询条件，根据id进行查询
        LambdaQueryWrapper<Dish> dishLambdaQueryWrapper = new LambdaQueryWrapper<>();
        dishLambdaQueryWrapper.eq(Dish::getCategoryId,id);
        int count = dishService.count(dishLambdaQueryWrapper);
        //判断是否存在菜品关联
        if(count > 0){
            throw  new CustomException("已经关联菜品，不能删除");
        }
        //添加查询条件，根据id进行查询
        LambdaQueryWrapper<Setmeal> setmealLambdaQueryWrapper = new LambdaQueryWrapper<>();
        setmealLambdaQueryWrapper.eq(Setmeal::getCategoryId,id);
        int count1 = setmealService.count(setmealLambdaQueryWrapper);
        //判断是否存在套餐关联
        if(count1 > 0){
            throw  new CustomException("已经关联套餐，不能删除");
        }
        super.removeById(id);
    }
}




