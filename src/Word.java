/**
 * Created by aeryen on 4/5/2016.
 */
public class Word {
	String english = null;
	String chinese = null;
	public Word(String initStr) {
		String[] result = initStr.split("[ ]");
		if(result.length > 2) {
			throw new RuntimeException("Error on line: [" + initStr + "]");
		}
		else {
			english = result[0];
			chinese = result[1];
		}
	}

	public void multilinePrint() {
		System.out.println(english);
		System.out.println("\t" + chinese);
	}

	public String toString() {
		return this.english + " " + this.chinese;
	}
}
