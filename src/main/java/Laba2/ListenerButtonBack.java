package Laba2;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenerButtonBack implements ActionListener {
	
	private JFrame frame; // фрэйм который слушатель закроет при получении события
	
	// инициализация переменной frame
	public ListenerButtonBack(JFrame frame) {
		this.frame = frame;
	}
	
   @Override
   public void actionPerformed(ActionEvent arg0) {
	   frame.dispatchEvent(new WindowEvent(frame,WindowEvent.WINDOW_CLOSING));

   }
}
