/*
 * © 2018 Copyright Amadeus Unauthorized use and disclosure strictly forbidden.
 */
package com.amadeus.training.patterns.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

import com.amadeus.training.patterns.behavioral.observer.User.Gender;

/**
 * @author mohamd.dorra
 *
 */
public class ChartObserver implements Observer {
	int maleCount;
	int femaleCount;
	int privateGenderCount;
	int total;

	@Override
	public void update(Observable o, Object obj) {
		if (obj instanceof User) {
			User user = (User) obj;
			total++;
			if (user.gender == Gender.FEMALE)
				femaleCount++;
			if (user.gender == Gender.MALE)
				maleCount++;
			if (user.gender == Gender.PRIVATE)
				privateGenderCount++;

			System.out.println(String.format("Female ratio: %.2f", (float) femaleCount / total));
			System.out.println(String.format("Male ratio: %.2f", (float) maleCount / total));
			System.out.println(String.format("Private gender ratio: %.2f", (float) privateGenderCount / total));
		}
	}
}
