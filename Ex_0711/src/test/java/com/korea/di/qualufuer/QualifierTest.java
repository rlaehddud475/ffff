package com.korea.di.qualufuer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;
import com.korea.di.qualifier.Computer;

@SpringBootTest
@Slf4j
public class QualifierTest {
@Autowired
Computer computer;
@Test
public void computerTest() {
	log.info(computer.getScreenWidth()+"");
}
}
