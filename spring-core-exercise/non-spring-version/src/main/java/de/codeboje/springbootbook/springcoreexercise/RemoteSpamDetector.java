package de.codeboje.springbootbook.springcoreexercise;

public class RemoteSpamDetector implements SpamDetector {

	public RemoteSpamDetector(String url, String username, String password) {
		// omitted, not needed for explanation
	}
	
	public boolean containsSpam(String value) {
		// make the remote call
		return false;
	}

}
