package com.vti.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOStreamUtils {
	public static String read(String path) throws IOException {
		File file = new File("D:\\vti_mentor\\Java\\data-move.txt");
		FileInputStream fileInputStream = new FileInputStream(file);
		String value = "";

		try {
			if (!file.exists()) {
				file.createNewFile();
			}

			byte[] bs = new byte[1024];

			do {
				int length = fileInputStream.read(bs);
				if (length == -1) {
					break;
				}
				value += new String(bs, 0, length);

			} while (true);
		} finally {
			fileInputStream.close();
		}

		return value;
	}

	public static void write(String path, String content, boolean append) throws IOException {
		File fileCopy = new File(path);
		FileOutputStream fileOutputStream = new FileOutputStream(fileCopy, append);
		try {
			fileOutputStream.write(content.getBytes());
		} finally {
			fileOutputStream.close();
		}
	}

}
