package testProject;

import java.io.File;

public class ReadDir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("//Users//abhimandas//Movies");
		printFiles(file);
		
		
	}
		
	public static void printFiles(File file) {
		System.out.println("print files");
		System.out.println(file.isDirectory());
				File[] files = file.listFiles();
				for(int i = 0; i < files.length; i++) {
					if(files[i].isDirectory()) {
						System.out.println("dir : "+files[i]);
						printFiles(files[i]);
					}
					else
						System.out.println("Filename : "+files[i]);
				}
	}

}
