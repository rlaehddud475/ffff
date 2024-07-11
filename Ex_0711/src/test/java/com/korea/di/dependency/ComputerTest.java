package com.korea.di.dependency;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest // 스프링 부트는 해당 어노테이션을 통해 스프링부트 프로젝트 테스트에 필요한 모든 의존성을 제공
// 통합 테스트를 제공하는 기본적인 스프링 부트 테스트 어노테이션
@Slf4j//롬복에 있는 로그를 사용할 수 있는 어노테이션
public class ComputerTest {
	@Autowired
	Coding coding;
	
	@Test
	public void computerTest() {
//		Coding coding = new Coding();
		log.info(coding.getComputer().toString());
	}
}
