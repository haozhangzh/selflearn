package org.spi.demo.service.impl;

import org.spi.demo.service.DogService;

public class BlackDogServiceImpl implements DogService {

	@Override
	public void sleep() {
		System.out.println("黑色dog。。。汪汪叫，不睡觉...");
	}

}
