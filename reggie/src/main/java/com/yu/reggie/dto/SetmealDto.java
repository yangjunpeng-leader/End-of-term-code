package com.yu.reggie.dto;

import com.yu.reggie.entity.Setmeal;
import com.yu.reggie.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
