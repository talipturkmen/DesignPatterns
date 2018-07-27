package com.amadeus.training.patterns.rot;

import java.util.Scanner;

/**
 * 
 * @author durrah
 *
 */
public class KeyboardCopier {
	void copy() {
		try (Scanner sc = new Scanner(System.in)) {
			while (sc.hasNext()) {
				String read = sc.nextLine();
				System.out.println(read);
			}
		}
	}
}
