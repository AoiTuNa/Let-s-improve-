package game_Tetris;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;




public class PlayWindow extends JFrame{
	
	private JLabel statusbar;
	private int modcheck;
	
	PlayWindow(main_button parents){
		setTitle("Tetris2");
		modcheck = parents.getmod();
		statusbar = new JLabel(" 0");
	    add(statusbar, BorderLayout.SOUTH);
	    
	    
	    var board = new Board(this);
        add(board);
        board.start();
        
        
	    setSize(300, 600);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    setLocationRelativeTo(null);
	    
	    setVisible(true);
	}
	JLabel getStatusBar() {

	    return statusbar;
	}
	int getmod() {
		return modcheck;
	}
}
