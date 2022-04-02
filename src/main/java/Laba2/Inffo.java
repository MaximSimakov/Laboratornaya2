package Laba2;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;





public class Inffo extends JFrame { 

	private JFrame frame;

	private JPanel panel4;
	private JPanel panel5;
	private JPanel panel6;
	private JPanel panel7;
	private JPanel panel8;
	private JPanel panel9;
	

	public Inffo(FileRead reader, String Name1,String Name2,String Name3,String Name4, String text) {
		
		frame = new JFrame("Информация о студентах");
		panel4 = new JPanel();
		panel5 = new JPanel();
		panel6 = new JPanel();
		panel7 = new JPanel();
		panel8 = new JPanel();
		panel9 = new JPanel();
		
		JPanel panelName =new JPanel(); 
		
		frame.setBounds(500,400,400,300);
		frame.setResizable(false); // фиксированный размер окна
		panelName.setLayout(new BoxLayout (panelName , BoxLayout.PAGE_AXIS));
		
				
		frame.add(panelName);
		JLabel nam1 = new JLabel();
		JLabel nam2 = new JLabel();
		JLabel nam3 = new JLabel();
		JLabel nam4 = new JLabel();
		JLabel nam5 = new JLabel();
		JLabel nam6 = new JLabel();
		
		nam1.setText(Name1);
		nam2.setText(Name2);
		nam3.setText(Name3);
		nam4.setText(Name4);
		nam5.setText(text);
		nam6.setText(reader.getString());
		
	 
		 JButton button_back = new JButton("Назад"); 
		 // добавляем кнопку
	   	 button_back.setBounds(270,200,100,40);
	     ActionListener actionListenerback = new ListenerButtonBack(frame); //создаем слушатель
	   	 button_back.addActionListener(actionListenerback); // добавляем слушатель к кнопке
		
	   	panelName.add(panel4);
	   	panelName.add(panel5);
	   	panelName.add(panel6);
	   	panelName.add(panel7);
	   	panelName.add(panel8);
	   	panelName.add(panel9);
	   	
	   	panel4.add(nam5);
	   	panel4.add(nam1);
	 	panel5.add(nam2);
	 	panel6.add(nam3);
	 	panel7.add(nam4);
	 	panel7.add(nam6);
	 	
	 	
	 	
		panel8.add(button_back);
		
		frame.setVisible(true);
		
		
	}
    
	
}
