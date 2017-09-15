package de.codeboje.springbootbook.springcoreexercise;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ControlFlow {

	private SpamDetector spamDetector = null;
	
	public ControlFlow( @Qualifier("simpleSpamDetector") SpamDetector spamDetector) {
		super();
		this.spamDetector = spamDetector;
	}

	public void run(String[] args) throws IOException {
		System.out.println(spamDetector.containsSpam(args[0]));
	}
}
