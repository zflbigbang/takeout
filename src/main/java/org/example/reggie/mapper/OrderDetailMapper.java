package org.example.reggie.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.reggie.entity.OrderDetail;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author ZFL
* @description 针对表【order_detail(订单明细表)】的数据库操作Mapper
* @createDate 2023-02-28 15:30:29
* @Entity org.example.reggie.entity.OrderDetail
*/
@Mapper
public interface OrderDetailMapper extends BaseMapper<OrderDetail> {

}




