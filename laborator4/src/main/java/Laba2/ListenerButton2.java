package Laba2;

import java.awt.event.*;

import javax.swing.JOptionPane;

// класс реализующий слушатель (ожидания нажатия кнопки)
public class ListenerButton2 implements ActionListener {

	@Override // ключевое слово, которое позволяет в дочернем классе заново создать реализацию метода родительского класса
	public void actionPerformed(ActionEvent arg0) {
		
		System.exit(1);
	
		
	}

	
}