package com.example.demo.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// 200 -> OK
// 400 -> Client Request 문제
// 500 -> 서버 오류

//@ResponseStatus 어노테이션 추가하면 500 에러가 아닌 404로 리턴함
@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {

	public UserNotFoundException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}
	
	
}
