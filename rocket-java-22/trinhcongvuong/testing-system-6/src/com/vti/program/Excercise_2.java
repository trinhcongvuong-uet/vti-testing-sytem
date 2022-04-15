package com.vti.program;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import com.vti.utils.IOStreamUtils;

public class Excercise_2 {
	public static void main(String[] args) throws IOException {
		String content = IOStreamUtils.read("D:\\vti_mentor\\Java\\data-move.txt");

		IOStreamUtils.write("D:\\vti_mentor\\Java\\data-copy.txt", content, true);

	}
}
