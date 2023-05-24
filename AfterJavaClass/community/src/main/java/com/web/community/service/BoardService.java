package com.web.community.service;

import com.web.community.domain.Board;
import com.web.community.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;



// 데이터 레이어 단계
// client - controller - service - repository(jpa) - DB(h2)

@RequiredArgsConstructor
@Service
public class BoardService {

    private final BoardRepository boardRepository; // final은 선언과 동시에 초기화해주어야 함

    // 게시글의 전체 리스트
    public Page<Board> findBoardList(Pageable pageable) {
        pageable = PageRequest.of(pageable.getPageNumber() <= 0 ? 0:pageable.getPageNumber()-1, pageable.getPageSize());
        return boardRepository.findAll(pageable);
    }

    // 하나의 게시글
    public Board findBoardByIdx(Long idx) {
        return boardRepository.findById(idx).orElse(new Board());
    }

}
