package org.example.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.reggie.entity.OrderDetail;
import org.example.reggie.service.OrderDetailService;
import org.example.reggie.mapper.OrderDetailMapper;
import org.springframework.stereotype.Service;

/**
* @author ZFL
* @description 针对表【order_detail(订单明细表)】的数据库操作Service实现
* @createDate 2023-02-28 15:30:29
*/
@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail>
    implements OrderDetailService{

}




