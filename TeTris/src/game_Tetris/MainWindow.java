package game_Tetris;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class MainWindow extends JFrame
{  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel statusbar2;

	public MainWindow() {
	
	    initUI();
	}
	
	private void initUI() {
	
	    
		statusbar2 = new JLabel("여기는 메인화면 입니다.");
        add(statusbar2, BorderLayout.SOUTH);
	    Container contentPane = getContentPane();
	      contentPane.add(new main_button(this));
	
	    setTitle("Tetris");
	    setSize(200, 400);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    setLocationRelativeTo(null);
}

	JLabel getStatusBar() {

	    return statusbar2;
	}


public static void main(String[] args) {

    EventQueue.invokeLater(() -> {

        var game = new MainWindow();
        game.setVisible(true);
    });
}

}
