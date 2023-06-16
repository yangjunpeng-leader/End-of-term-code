package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.Category;

public interface CategoryService extends IService<Category> {

    /**
     * 根据id删除菜品种类
     * @param id
     */
    public void remove(Long id);
}
