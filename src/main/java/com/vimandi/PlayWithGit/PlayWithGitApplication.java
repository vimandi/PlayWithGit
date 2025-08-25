package com.vimandi.PlayWithGit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//add
@SpringBootApplication
public class PlayWithGitApplication {

	public static void main(String[] args) {
		//split1
		System.out.println(args);
		//split2
		//adding commentss
		SpringApplication.run(PlayWithGitApplication.class, args);
	}

}
