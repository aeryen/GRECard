import java.io.File;

public class Main {

	public static final String INPUTPATH = "." + File.separator + "08red" + File.separator;

	public static void main(String[] args) {
		File rootFolder = new File(INPUTPATH);
		if (!rootFolder.exists()) {
			System.err.println("CANNOT FIND DATA FOLDER.");
		}
		File[] listFiles = rootFolder.listFiles();
		System.out.println("A total of " + listFiles.length + " list files are found.");



		for(File f : listFiles) {

		}

	}
}
