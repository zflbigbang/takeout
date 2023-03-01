package org.example.reggie.service;

import org.example.reggie.entity.Category;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author ZFL
* @description 针对表【category(菜品及套餐分类)】的数据库操作Service
* @createDate 2023-02-10 19:51:21
*/
public interface CategoryService extends IService<Category> {
    public void remove(Long id);
}
