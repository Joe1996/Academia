package main;

import dao.DatabaseDAO;
import view.FrameLogin;

public class Main {

	public static void main(String[] args) {
		DatabaseDAO.createTables();
		
		FrameLogin frameLogin = new FrameLogin();
		frameLogin.setVisible(true);
		frameLogin.setLocationRelativeTo(null);
	}

}
