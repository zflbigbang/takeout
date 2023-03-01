package org.example.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.reggie.entity.ShoppingCart;
import org.example.reggie.service.ShoppingCartService;
import org.example.reggie.mapper.ShoppingCartMapper;
import org.springframework.stereotype.Service;

/**
* @author ZFL
* @description 针对表【shopping_cart(购物车)】的数据库操作Service实现
* @createDate 2023-02-26 20:34:00
*/
@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart>
    implements ShoppingCartService{

}




