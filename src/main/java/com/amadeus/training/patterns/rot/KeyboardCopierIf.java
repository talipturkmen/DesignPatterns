package com.amadeus.training.patterns.rot;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * @author durrah
 *
 */
public class KeyboardCopierIf {

	private boolean toFile;
	private FileWriter fr;

	public KeyboardCopierIf(boolean toFile) throws IOException {
		super();
		this.toFile = toFile;
		fr = new FileWriter(new File("./f.txt"));
	}

	void copy() throws IOException {
		try (Scanner sc = new Scanner(System.in)) {
			while (sc.hasNext()) {
				String read = sc.nextLine();
				if (toFile) {
					fr.write(read);
				} else
					System.out.println(read);
			}
		}
	}
}
