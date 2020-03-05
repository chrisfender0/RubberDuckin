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
		try {
			taskManager();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void taskManager() throws IOException {
		view.menuOptions();
		processUserInput();
	}
	
	private String getUserInput() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String userInput = br.readLine();
		br.close();
		return userInput;
	}
	
	private void processUserInput() throws IOException {
		int userInput = Integer.parseInt(getUserInput());
		switch (userInput) {
		case 1: {
			model.selectAllFromProduct();
			break;
		}
		case 2:{
			model.selectAllFromOrders();
			break;
		}
		case 3:{
			model.selectAllFromCustomers();
			break;
		}
		default: break;
			
		}
	}
	
}
