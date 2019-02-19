package org.spi.demo.service;

import java.util.ServiceLoader;
/**
 * SPI
 * Service Provider Interface
 * jar包的META-INF/services/目录里同时创建一个以【服务接口命名】的文件。
 * 该文件里就是实现该服务接口的具体实现类。
 * 而当外部程序装配这个模块的时候，
 * 就能通过该jar包META-INF/services/里的配置文件找到具体的实现类名，并装载实例化，完成模块的注入
 * 
 * SpringBoot加载自动配置类的配置文件META-INF/spring.factories类似于SPI机制
 */
public class MainTest {

	public static void main(String[] args) {
		ServiceLoader<DogService> loaders = ServiceLoader.load(DogService.class);
		
        for (DogService d : loaders) {
            d.sleep();
        }
	}

}
