package com.web.community;

import com.web.community.domain.Board;
import com.web.community.domain.BoardType;
import com.web.community.domain.User;
import com.web.community.repository.BoardRepository;
import com.web.community.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class CommunityApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommunityApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(UserRepository userRepository, BoardRepository boardRepository) throws Exception {
		return (args) -> {
			User user = userRepository.save(User.builder()
					.name("choi")
					.password("123")
					.email("test")
					.createdDate(LocalDateTime.now())
					.updatedDate(LocalDateTime.now())
					.build());

			for (int i = 1; i <= 200; i++) {
				boardRepository.save(Board.builder()
						.title("게시글" + i)
						.subTitle("순서" + i)
						.boardType(BoardType.FREE)
						.createdDate(LocalDateTime.now())
						.updatedDate(LocalDateTime.now())
						.build());
			}
		};
	}
}
