package hello;

import java.io.IOException;

public interface Outputter {
	
	void output(String message) throws IOException;
}
