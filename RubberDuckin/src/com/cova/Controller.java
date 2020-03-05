package com.cova;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Controller {
	
	private Model model;
	private View view;
	
	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
		taskManager();
	}
	
	private void taskManager() {
		view.menuOptions();
	}
	
	private String getUserInput() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String userInput = br.readLine();
		br.close();
		return userInput;
	}
	
}
