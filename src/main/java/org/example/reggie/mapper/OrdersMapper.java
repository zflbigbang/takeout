package org.example.reggie.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.reggie.entity.Orders;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author ZFL
* @description 针对表【orders(订单表)】的数据库操作Mapper
* @createDate 2023-02-28 15:30:23
* @Entity org.example.reggie.entity.Orders
*/
@Mapper
public interface OrdersMapper extends BaseMapper<Orders> {

}




