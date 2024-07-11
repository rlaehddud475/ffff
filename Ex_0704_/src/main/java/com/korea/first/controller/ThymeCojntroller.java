package com.korea.first.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;
import com.korea.first.vo.MemberVO;




@Controller
public class ThymeCojntroller {
	
	@RequestMapping("/ex01")
	public String ex01(Model model) {
		model.addAttribute("lastname","lee");
		model.addAttribute("firstname","GilDong");
		return "ex01";
	}
	@RequestMapping("/ex02")
	public String ex02(Model model) {
	List<MemberVO> list = new ArrayList<MemberVO>();
	model.addAttribute("list", list);
	model.addAttribute("num", 1);
		return "ex02";
	}
	@RequestMapping("/ex03")
	public String ex03(Model model) {
		List<String> fruits = new ArrayList<String>();
		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("키위");
		fruits.add("복숭아");
		fruits.add("딸기");
		
		List<MemberVO> list = new ArrayList<MemberVO>();
		list.add(new MemberVO("홍길동",20));
		list.add(new MemberVO("김길동",30));
		list.add(new MemberVO("이길동",40));
		list.add(new MemberVO("박길동",50));
		list.add(new MemberVO("조길동",60));
		model.addAttribute("fruits",fruits);
		model.addAttribute("list",list);
		return "ex03";
	}
	@RequestMapping("/ex04")
	public String ex04(Model model) {
		model.addAttribute("bno",3);
		return "ex04";
	}
	
	@RequestMapping("/read")
	public String read(int bno, Model model) {
		System.out.println("read매핑으로 이동");
		model.addAttribute("bno",3);
		return "read";
	}
	@RequestMapping("/ex05")
	public String ex05(Model model) {
		model.addAttribute("vo",new MemberVO());
		return "ex05";
	}
	
	@RequestMapping("/result")
	public String result(MemberVO vo, Model model) {
		model.addAttribute("vo",vo);
		return "result";
	}
	@RequestMapping("/ex06")
	public String ex06(Model model) {
		model.addAttribute("firstName","GilDong");
		model.addAttribute("lastName","Hong");
		model.addAttribute("list",Arrays.asList("aaa","bbb","ccc","ddd","eee"));
		model.addAttribute("member",new MemberVO("Gil-Dong", 40));
		return "ex06";
	}

}
