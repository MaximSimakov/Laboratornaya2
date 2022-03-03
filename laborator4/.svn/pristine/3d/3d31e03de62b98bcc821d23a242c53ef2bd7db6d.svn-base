
package Laba2;

import java.awt.event.*;

import javax.swing.JButton;



// класс реализующий слушатель (ожидания нажатия кнопки)
public class ListenerButton implements ActionListener {
	private String name1 = "Рогова Анастасия Александровна  20130509";
	private String name2 = "Шайхутдинов Тимур Маратович  20130088";
	private String name3="Асьянов Арслан Аликович 20130824";
	private String name4= "Симаков Максим Владимирович 20130336";
	private String text = "Subversion and Eclipse and Mantis";
	 
	private FileRead reader;
	
	public ListenerButton(FileRead reader) {
		this.reader = reader;
	}
	
	
	@Override // ключевое слово, которое позволяет в дочернем классе заново создать реализацию метода родительского класса
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		 new Inffo(reader, name1,name2,name3,name4,text);
	}

	}
