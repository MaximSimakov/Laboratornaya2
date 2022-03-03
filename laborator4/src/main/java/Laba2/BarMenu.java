package Laba2;
import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

import java.awt.FlowLayout;
import java.awt.event.*;
public class BarMenu {
	 BarMenu(JFrame GUI, JPanel panel1, JLabel imgLabel,String str1,String str2,String str3,String str4, FileRead reader) {
			JMenuBar menuBar = new JMenuBar(); //�������� ��������
			JMenu menu=new JMenu(str1); // �������� ������ � ����������
			JMenu menu1 = new JMenu(str2);
			JMenuItem imageItem = new JMenuItem(str3);
			JMenuItem exitMenu=new JMenuItem(str4);// �������� ������ ��� ����������� �� �����
		menu.add(imageItem);
	    menu.add(exitMenu);//���������� ������� ������ ����
	    ActionListener actionListener2 = new ListenerButton2(); //������� ���������
		exitMenu.addActionListener(actionListener2); // ��������� ��������� � ������

	  
	    imageItem.addActionListener(new ActionListener() {
	    	@Override
	          public void actionPerformed(ActionEvent e) {	    
	    		panel1.setLayout(new FlowLayout(FlowLayout.RIGHT));
	            panel1.add(imgLabel);
	            panel1.revalidate();
	    	} 
	    	});
	    
	    menu1.addMenuListener(new MenuListener() {

	        @Override
	        public void menuSelected(MenuEvent e) {
	        	reader.readFile();
	        }

	        @Override
	        public void menuDeselected(MenuEvent e) {  }

	        @Override
	        public void menuCanceled(MenuEvent e) { }
	    });
	    
	   GUI.setJMenuBar(menuBar);
	    menuBar.add(menu);
	    menuBar.add(menu1);
	    
	}
}