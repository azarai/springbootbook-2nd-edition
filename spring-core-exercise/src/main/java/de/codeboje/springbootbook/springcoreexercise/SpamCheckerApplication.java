package de.codeboje.springbootbook.springcoreexercise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpamCheckerApplication {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpamAppConfig.class);
		context.getBean(ControlFlow.class).run(args);
	}

}
