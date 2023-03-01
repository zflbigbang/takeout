package org.example.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.reggie.entity.DishFlavor;
import org.example.reggie.service.DishFlavorService;
import org.example.reggie.mapper.DishFlavorMapper;
import org.springframework.stereotype.Service;

/**
* @author ZFL
* @description 针对表【dish_flavor(菜品口味关系表)】的数据库操作Service实现
* @createDate 2023-02-11 20:29:32
*/
@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper, DishFlavor>
    implements DishFlavorService{

}




