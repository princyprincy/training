package com.training.io;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) {

		
		File file = new File("filename.txt");
		try {
			if(file.createNewFile()) {
				System.out.println("File created: "+ file.getName());
			}else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("Error in file creation");
			e.printStackTrace();
		}
	}
}
