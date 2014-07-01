package example.splittingnames;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
public class SplittingNamesFixture {
	
	public class Result {
		private final String firstName;
		private final String lastName;
		
		public Result(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public String getFirstName() {
			return firstName;
		}
		
		public String getLastName() {
			return lastName;
		}
	}

	public Result split(String fullName) {
        String[] words = fullName.split(" ");
        Result result = new Result(words[0], words[1]);
        return result;
	}
	
	
}
