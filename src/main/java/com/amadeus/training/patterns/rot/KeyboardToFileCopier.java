package com.amadeus.training.patterns.rot;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class KeyboardToFileCopier {

	void copy() throws IOException {
		try (Scanner sc = new Scanner(System.in); Writer fr = new FileWriter(new File("./f.txt"))) {
			while (sc.hasNext()) {
				String read = sc.nextLine();
				fr.write(read);
				fr.write(System.lineSeparator());
			}
			fr.flush();
		}
	}
}
