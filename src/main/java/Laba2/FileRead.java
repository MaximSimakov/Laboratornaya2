package Laba2;

import java.io.FileReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class FileRead {

	private Scanner scanner;
	
	private StringBuilder builder;
	
	public FileRead(String path) {
		try {
			builder = new StringBuilder();
			scanner = new Scanner(new FileReader(path));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Файл не найден", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void readFile() {
		while(scanner.hasNext()) {
			builder.append(scanner.nextLine()).append("\n");
		}
	}
	
	public String getString() {
		return builder.toString();
	}
	
}
