package org.example.reggie.service;

import org.example.reggie.entity.Orders;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author ZFL
* @description 针对表【orders(订单表)】的数据库操作Service
* @createDate 2023-02-28 15:30:23
*/
public interface OrdersService extends IService<Orders> {
    public void submit(Orders orders);
}
