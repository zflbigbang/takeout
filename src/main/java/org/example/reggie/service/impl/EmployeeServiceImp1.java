package org.example.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.reggie.entity.Employee;
import org.example.reggie.mapper.EmployeeMapper;
import org.example.reggie.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * @author zfl
 * @create 2023-02-09 18:23
 */
@Service
public class EmployeeServiceImp1 extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

}
