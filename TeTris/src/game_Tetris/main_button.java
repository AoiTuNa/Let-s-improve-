package game_Tetris;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class main_button extends JPanel
	implements ActionListener{
	private int modcheck;
	private JLabel statusbar2;
	
	
	public main_button(MainWindow parents) {
		initbutton(parents);
	}
	
	public void initbutton(MainWindow parents) {
		
		
		statusbar2 = parents.getStatusBar();
		maraton = new JButton("마라톤 모드");
		sprinter = new JButton("스프린터 모드");
		exitgame = new JButton("게임 종료");
		
		add(maraton);
		add(sprinter);
		add(exitgame);
		
		maraton.addActionListener(this);
		
		sprinter.addActionListener(this);
		
		exitgame.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		// TODO Auto-generated method stub
		
		if (source == maraton)
		{
			modcheck = 1;
			 new PlayWindow(this);
			 setVisible(false);
		}
			
		else if(source == sprinter) {
			modcheck = 2;
			new PlayWindow(this);
			 setVisible(false);
			
		}
			
		else if(source == exitgame) {System.exit(0);}
			
		
		
	}
	int getmod() {
		return modcheck;
	}
	
	private JButton maraton;
	private JButton sprinter;
	private JButton exitgame;


	
}
