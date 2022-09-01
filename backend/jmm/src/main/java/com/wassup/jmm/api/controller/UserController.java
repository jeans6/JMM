package com.wassup.jmm.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wassup.jmm.common.response.BaseResponseBody;

@RequestMapping("/user")
@RestController
public class UserController {
	
//	@PostMapping("/kakaoLogin")
	@GetMapping("/kakaoLogin")
	public ResponseEntity<BaseResponseBody> kakaoLogin(@RequestParam String name) {
		System.out.println("name: "+name);
		return ResponseEntity.status(200).body(BaseResponseBody.of("success"));
	}

}
