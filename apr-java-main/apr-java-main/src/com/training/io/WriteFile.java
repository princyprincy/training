package com.training.io;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("filename.txt");
			writer.write("start of the file");
			writer.append("my first file in java");
			writer.close();
			System.out.println("Successfully written");
		} catch (IOException e) {
			System.out.println("Error in writing");
			e.printStackTrace();
		}
	}

}
