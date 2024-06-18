package com.restaurant.menu.controller;

import com.restaurant.menu.controller.dto.MenuRequestDto;
import com.restaurant.menu.controller.dto.MenuResponseDto;
import com.restaurant.menu.domain.Menu;
import com.restaurant.menu.service.MenuService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class MenuController {
    private final MenuService menuService;

    // create
    @PostMapping("/api/menus")
    public Long createMenu(@RequestBody MenuRequestDto menuRequestDto) { // 메뉴 등록
        return menuService.createMenu(menuRequestDto);
    }

    // read
    @GetMapping("/api/menus")
    public void allMenu(MenuResponseDto menuResponseDto) { // 전체 조회
        menuService.allMenu(menuResponseDto);
    }

    @GetMapping("/api/menus/{id}")
    public void oneMenu(@PathVariable Long id) { // 단일 조회
        menuService.oneMenu(id);
    }

    // update
    @PutMapping("/api/menus/{id}")
    public void changeMenu(@PathVariable Long id, MenuRequestDto menuRequestDto) { // 메뉴 변경
        menuService.changeMenu(id, menuRequestDto);
    }

    @DeleteMapping("/api/menus/{id}")
    public void deleteMenu(@PathVariable Long id) { // 메뉴 삭제
        menuService.deleteMenu(id);
    }

}
