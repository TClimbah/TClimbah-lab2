import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.io.*;

public class UnitTestExample {

	private Integer n; // not used, just showing a style issue
	private String planet = "Earth";
	private String satellite = "moon";

	@Test
	public void test1() {
		String expectedName = "Earth";
		String resultName = this.planet; // or would be something a method could return, etc
		assertEquals(expectedName, resultName);
	}

	@Test
	public void test2() {
		String expectedName = "Moon";
		String resultName = this.satellite; // or would be something a method could return, etc
		assertEquals(expectedName, resultName);
	}	

	// illustrates running something from the terminal via Java/Junit
	@Test
	public void test3() {
		String outputCollected = "";

		String command = "java -jar checkstyle-9.2.1-all.jar -c ./CS1111_checks.xml UnitTestExample.java";
		try {
			Process process = Runtime.getRuntime().exec(command);
			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String line;
			while ((line = reader.readLine()) != null) 
				outputCollected += line;
			reader.close();

			reader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
			while ((line = reader.readLine()) != null) 
				outputCollected += line;
			reader.close();
		} catch (IOException exc) {
			exc.printStackTrace();
		}

		System.out.println(outputCollected);

		String expectedName = "Starting audit...Audit done.";
		String resultName = outputCollected; 
		assertEquals(expectedName, resultName);
	}

	// no main method

}
Chat

New Conversation

🤓 Explain a complex thing

Explain Artificial Intelligence so that I can explain it to my six-year-old child.


🧠 Get suggestions and create new ideas

Please give me the best 10 travel ideas around the world


💭 Translate, summarize, fix grammar and more…

Translate "I love you" French


GPT-4o Mini
Hello, how can I help you today?
AITOPIA
coin image
10
Upgrade




mport org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.io.*;

public class UnitTestExample {

	private Integer n; // not used, just showing a style issue
	private String planet = "Earth";
	private String satellite = "moon";

	@Test
	public void test1() {
		String expectedName = "Earth";
		String resultName = this.planet; // or would be something a method could return, etc
		assertEquals(expectedName, resultName);
	}





Powered by AITOPIA 
Chat
Ask
Search
Write
Image
ChatFile
Vision
Full Page
