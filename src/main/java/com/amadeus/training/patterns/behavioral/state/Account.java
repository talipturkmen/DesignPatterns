/*
 * © 2018 Copyright Amadeus Unauthorized use and disclosure strictly forbidden.
 */
package com.amadeus.training.patterns.behavioral.state;

/**
 * @author mohamd.dorra
 *
 */
public class Account {
	private State state;

	private String name;

	/**
	 * Gets the value of name
	 * 
	 * @return the name field of {@link Account#name}
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the {@link Account#name} property.
	 *
	 * @param name the {@link Account#name} instance representing object.
	 */
	public void setName(String name) {
		this.changeName(name);
	}

	/**
	 * 
	 */
	public Account() {
		state = new Pending(this);
	}

	/**
	 * Sets the {@link Account#state} property.
	 *
	 * @param currentState the {@link Account#state} instance representing object.
	 */
	public void setState(State currentState) {
		this.state = currentState;
	}

	/**
	 * Gets the value of state
	 * 
	 * @return the state field of {@link Account#state}
	 */
	public State getState() {
		return state;
	}

	void create() {
		state.create();
	}

	void activate() {
		state.activate();
	}

	void deactivate() {
		state.deactivate();
	}

	void block() {
		state.block();
	}

	void changeName(String name) {
		state.changeName(name);
	}

	void sendMail(String anyMail) {
		state.sendMail(anyMail);
	}

}
