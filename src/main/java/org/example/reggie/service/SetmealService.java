package org.example.reggie.service;

import org.example.reggie.dto.SetmealDto;
import org.example.reggie.entity.Setmeal;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author ZFL
* @description 针对表【setmeal(套餐)】的数据库操作Service
* @createDate 2023-02-12 19:14:19
*/
public interface SetmealService extends IService<Setmeal> {
    public void saveWithSetmealDish(SetmealDto setmealDto);
    public SetmealDto getByIdWithDish(Long id);
    public void updateWithDish(SetmealDto setmealDto);
}
