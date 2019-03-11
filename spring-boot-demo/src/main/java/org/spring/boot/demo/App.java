package org.spring.boot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
        System.out.println( "Hello World!" );
        try {
			StackTraceElement[] stackTrace = new RuntimeException().getStackTrace();
			for (StackTraceElement stackTraceElement : stackTrace) {
				System.out.println(stackTraceElement.getClassName()+"#"+stackTraceElement.getMethodName());
//				if ("main".equals(stackTraceElement.getMethodName())) {
//					return Class.forName(stackTraceElement.getClassName());
//				}
			}
		}
		catch (Exception ex) {
			// Swallow and continue
		}
    }
}
