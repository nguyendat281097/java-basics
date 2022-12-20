package com.nvd.training.java11.advanced.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/* Some File mothods have been introduced in Java 11:
 * - Files.writeString(): write the content in a file
 * - Files.readString(): read the content of a file
 * - Files.isSameFile(): used to know whether two paths locate the same file or not
 * 
 * */

public class FileExample {
	public static void main(String[] args) {
		Path tempDir = Path.of("D:\\temp");
		Path filePath = null;
		try {
			filePath = Files.writeString(Files.createTempFile(tempDir, "demo", ".txt"), "Sample text");
			String fileContent = Files.readString(filePath);
			System.out.println(fileContent.equals("Sample text"));

			System.out.println(Files.isSameFile(filePath, Path.of("D:\\temp\\demo.txt")));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
