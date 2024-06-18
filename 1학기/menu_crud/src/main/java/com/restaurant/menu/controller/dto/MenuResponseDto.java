package com.restaurant.menu.controller.dto;

import com.restaurant.menu.domain.Menu;
import com.restaurant.menu.domain.Separate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MenuResponseDto {
    private Long id;
    private String name;
    private Separate separate;
    private Long price;

    public MenuResponseDto(Menu menuEntity) {
        this.id = menuEntity.getId();
        this.name = menuEntity.getName();
        this.separate = menuEntity.getSeparate();
        this.price = menuEntity.getPrice();
    }

}
