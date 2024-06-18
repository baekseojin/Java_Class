package com.web.community.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter // @Getter를 붙이면 Getter 사용 가능
@NoArgsConstructor // 디폴트 생성자를 추가하겠다
@Entity
@Table
public class Board {

    @Id
    @GeneratedValue
    private Long idx;

    @Column(nullable = false)
    private String title;

    @Column
    private String subTitle;

    @Column
    @Enumerated(EnumType.STRING)
    private BoardType boardType;

    @Column
    private LocalDateTime createdDate;

    @Column
    private LocalDateTime updatedDate;

    @OneToOne(fetch = FetchType.LAZY)
    private User user;

    @Builder // 생성자에 붙이면 생성할 때 값을 주입, 그 데이터가 끝
    public Board(String title, String subTitle, BoardType boardType, LocalDateTime createdDate, LocalDateTime updatedDate, User user) {
        this.title = title;
        this.subTitle = subTitle;
        this.boardType = boardType;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
        this.user = user;
    }
}
