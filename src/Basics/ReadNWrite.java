package Basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadNWrite {

	public static void main(String[] args) throws IOException {

		FileInputStream fis=new FileInputStream("C:/Users/Roshan Kumar Gupta/workspace/JavaProgramsPractise/src/Basics/config.properties");
		Properties prop=new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("name"));
		
		prop.setProperty("cool", "Roshan");
		System.out.println(prop.getProperty("cool"));
		
		FileOutputStream fr = new FileOutputStream("C:/Users/Roshan Kumar Gupta/workspace/JavaProgramsPractise/src/Basics/config.properties");
        prop.store(fr, "Properties");
        fr.close();

	}

}
