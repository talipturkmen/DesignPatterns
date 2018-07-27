package com.amadeus.training.patterns.creational.builder.chain;

import com.amadeus.training.patterns.creational.builder.Builder;

import lombok.Data;

@Data
public class User {
	private String lastName;
	private String firstName;
	private String middleName;
	private String salutation;
	private String suffix;
	private String streetAddress;
	private String city;
	private String state;
	private boolean isFemale;
	private boolean isEmployed;
	private boolean isHomeOwner;

	public static class UserBuilder implements Builder<User> {
		private User user;

		public static UserBuilder create() {
			return new UserBuilder();
		}

		public UserBuilder() {
			user = new User();
		}

		public UserBuilder lastName(String newLastName) {
			user.lastName = newLastName;
			return this;
		}

		public UserBuilder firstName(String newFirstName) {
			user.firstName = newFirstName;
			return this;
		}

		public UserBuilder middleName(String newMiddleName) {
			user.middleName = newMiddleName;
			return this;
		}

		public UserBuilder salutation(String newSalutation) {
			user.salutation = newSalutation;
			return this;
		}

		public UserBuilder suffix(String newSuffix) {
			user.suffix = newSuffix;
			return this;
		}

		public UserBuilder streetAddress(String newStreetAddress) {
			user.streetAddress = newStreetAddress;
			return this;
		}

		public UserBuilder city(String newCity) {
			user.city = newCity;
			return this;
		}

		public UserBuilder state(String newState) {
			user.state = newState;
			return this;
		}

		public UserBuilder isFemale(boolean newIsFemale) {
			user.isFemale = newIsFemale;
			return this;
		}

		public UserBuilder isEmployed(boolean newIsEmployed) {
			user.isEmployed = newIsEmployed;
			return this;
		}

		public UserBuilder isHomeOwner(boolean newIsHomeOwner) {
			user.isHomeOwner = newIsHomeOwner;
			return this;
		}

		public User build() {
			return user;
		}
	}
}