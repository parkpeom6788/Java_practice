package model.main;

import java.io.IOException;

import model.console.ConsoleUI6Import;

public class TestConSoleUI {
	public static void main(String[] args) {
		try {
			new ConsoleUI6Import().execute();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}
}
