package org.example.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.reggie.entity.AddressBook;
import org.example.reggie.service.AddressBookService;
import org.example.reggie.mapper.AddressBookMapper;
import org.springframework.stereotype.Service;

/**
* @author ZFL
* @description 针对表【address_book(地址管理)】的数据库操作Service实现
* @createDate 2023-02-26 19:17:48
*/
@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook>
    implements AddressBookService{

}




