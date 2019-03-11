package org.spring.boot.demo.subpackage;

import java.util.List;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
@Component
public class ApplicationRunnerTest implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		List<String> argList = args.getNonOptionArgs();
		if(!CollectionUtils.isEmpty(argList)){
			for(String str	: argList){
				System.out.println(str+":"+args.getOptionValues(str));
			}
		}
		System.out.println("ApplicationRunner running");

	}

}
