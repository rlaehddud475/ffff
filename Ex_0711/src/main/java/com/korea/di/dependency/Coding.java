package com.korea.di.dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Coding {
	
	@Autowired //스프링이 객체를 찾아서 필드에 직접 주입
	private Computer computer;
}
