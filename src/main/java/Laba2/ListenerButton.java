
package Laba2;

import java.awt.event.*;

import javax.swing.JButton;



// ����� ����������� ��������� (�������� ������� ������)
public class ListenerButton implements ActionListener {
	private String name1 = "������ ��������� �������������  20130509 02.04.2022 ";
	private String name2 = "����������� ����� ���������  20130088 02.04.2022";
	private String name3="������� ������ �������� 20130824 02.04.2022 19:17";
	private String name4= "������� ������ ������������ 20130336";
	private String text = "Subversion and Eclipse and Mantis";
	 
	private FileRead reader;
	
	public ListenerButton(FileRead reader) {
		this.reader = reader;
	}
	
	
	@Override // �������� �����, ������� ��������� � �������� ������ ������ ������� ���������� ������ ������������� ������
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		 new Inffo(reader, name1,name2,name3,name4,text);
	}

	}
