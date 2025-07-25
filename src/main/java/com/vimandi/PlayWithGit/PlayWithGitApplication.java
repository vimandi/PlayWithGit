package com.vimandi.PlayWithGit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlayWithGitApplication {

	public static void main(String[] args) {
		System.out.println(args);
		SpringApplication.run(PlayWithGitApplication.class, args);
	}

}
