package utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class StringTools {
	
	public static class StringFromFile {

		private String path;
		private String fileName;
		private String totalFilePath;
		
		public StringFromFile(String path, String fileName) {
			this.path = path;
			this.fileName = fileName;
			init();
		}
		
		public String getStringFromFile() {

			BufferedReader bufferedReader = null;
			StringBuilder stringBuilder = new StringBuilder();
			
			try {
				String line;
				bufferedReader = new BufferedReader(new FileReader(totalFilePath));

				while ((line = bufferedReader.readLine()) != null) {
					stringBuilder.append(line);
				}
			} catch (FileNotFoundException e) {
				System.out.println("File " + totalFilePath
						+ " was not found. Exception " + e);
			} catch (IOException e) {
				System.out.println("IOException while receive file " + totalFilePath
						+ ". Exception " + e);
			} finally {
				try {
					if (bufferedReader != null) {
						bufferedReader.close();
					}
				} catch (IOException e) {
					System.out.println("IOException while receive file "
							+ totalFilePath + ". Exception " + e);
				}
			}
			return stringBuilder.toString().toLowerCase();
		}
		
		private void init(){
			totalFilePath = path+fileName;
		}
	}

	public static class StringSpliter {
		public List<String> splitStringToWords(String string){
			string = string.replaceAll("[(),.»«-—;:\"\"''!?]", "");
			String[] stringsArray = string.split("\\s+");
			return Arrays.asList(stringsArray);
		}
	}

}
