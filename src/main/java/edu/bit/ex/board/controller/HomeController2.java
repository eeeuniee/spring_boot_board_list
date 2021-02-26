//마스터
//디벨롭

package edu.bit.ex.board.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController2 {

	
	@RequestMapping("/")
	public String home() {
		return "<h1>Hello, Spring boot!dddㄹㄹㄹㄹ</h1>";
		
	}
}
