package com.korea.di.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("desktop")@Primary
public class DeskTop implements Computer {

	@Override
	public int getScreenWidth() {
		return 1920;
	}

}
