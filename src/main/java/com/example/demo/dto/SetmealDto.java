package com.example.demo.dto;

import com.example.demo.entity.Setmeal;
import com.example.demo.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
