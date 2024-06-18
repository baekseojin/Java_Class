package com.web.community.domain;

import com.web.community.repository.BoardRepository;
import com.web.community.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;


@DataJpaTest
class BoardTest {
    private final String boardTestTitle = "테스트";
    private final String email = "test@gmail.com";

    @Autowired
    UserRepository userRepository;

    @Autowired
    BoardRepository boardRepository;

    @BeforeEach
    public void 초기화() {
        // User를 하나 만들어서 디비에 저장
        User user = userRepository.save(User.builder()
                .name("choi")
                .password("123")
                .email(email)
                .createdDate(LocalDateTime.now())
                .updatedDate(LocalDateTime.now())
                .build());

        Board board = boardRepository.save(Board.builder()
                .title(boardTestTitle)
                .subTitle("서브타이틀")
                .boardType(BoardType.FREE)
                .createdDate(LocalDateTime.now())
                .updatedDate(LocalDateTime.now())
                .user(user)
                .build());
    }

    @Test
    public void 저장이잘되었는지확인() {
        // 1. 데이터 찾아옴
        User user = userRepository.findByEmail(email);

        // 2. 데이터 비교해서 맞는지 확인함
        Assertions.assertEquals(user.getEmail(), email);
        Assertions.assertEquals(user.getName(), "choi");

        Board board = boardRepository.findByUser(user);
        assertEquals(board.getTitle(), boardTestTitle);
    }
}