import java.io.*;
import java.util.ArrayList;

import static java.lang.System.exit;

/**
 * Created by aeryen on 4/5/2016.
 */
public class WordList {
	ArrayList<Word> list = null;

	public WordList(File dataFile) throws FileNotFoundException {
		String thisLine;
		BufferedReader br = new BufferedReader(new FileReader(dataFile));
		try {
			while ((thisLine = br.readLine()) != null) {
				System.out.println(thisLine);
				Word w = new Word(thisLine);
				list.add(w);
			}

			System.out.println("A total of: " + list.size() + " is loaded from list: " + dataFile.getName() + ".");
		} catch(IOException e) {
			e.printStackTrace();
			exit(-1);
		}
	}
}
