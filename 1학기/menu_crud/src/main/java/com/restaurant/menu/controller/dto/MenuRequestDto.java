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
public class MenuRequestDto {
    private String name;
    private Separate separate;
    private Long price;

    public Menu menuEntity() {
        return Menu.builder()
                .name(this.name)
                .separate(this.separate)
                .price(this.price)
                .build();
    }

}
