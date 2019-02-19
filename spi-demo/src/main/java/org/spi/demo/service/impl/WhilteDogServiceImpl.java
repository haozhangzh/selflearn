package org.spi.demo.service.impl;

import org.spi.demo.service.DogService;

public class WhilteDogServiceImpl implements DogService {

	@Override
	public void sleep() {
		 System.out.println("白色dog。。。呼呼大睡觉...");
	}

}
