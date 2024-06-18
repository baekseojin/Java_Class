package com.restaurant.menu.service;

import com.restaurant.menu.controller.dto.MenuRequestDto;
import com.restaurant.menu.controller.dto.MenuResponseDto;
import com.restaurant.menu.domain.Menu;
import com.restaurant.menu.repository.MenuRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Transactional
@Service
@AllArgsConstructor
public class MenuService {
    private final MenuRepository menuRepository;

    // 메뉴 등록
    public Long createMenu(MenuRequestDto menuRequestDto) {
        return menuRepository.save(menuRequestDto.menuEntity()).getId();
    }

    // 전체 조회
    public List<Menu> allMenu(MenuResponseDto menuResponseDto) {
        return menuRepository.findAll();
    }

    // 단일 조회
    public MenuResponseDto oneMenu(Long id) {
        Menu menu = menuRepository.findById(id)
                .orElse(new Menu());
        return new MenuResponseDto(menu);
    }

    // 메뉴 변경
    public void changeMenu(Long id, MenuRequestDto menuRequestDto) { // 수정할 때 이름은 바뀌지 않는다.
        Menu menu = menuRepository.findById(id).orElse(new Menu());

        menu.updateSeparate(menuRequestDto.getSeparate());
        menu.updatePrice(menuRequestDto.getPrice());
    }

    // 메뉴 삭제
    public void deleteMenu(Long id) {
        menuRepository.deleteById(id);
    }


}
