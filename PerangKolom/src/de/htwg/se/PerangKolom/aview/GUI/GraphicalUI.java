package de.htwg.se.PerangKolom.aview.GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class GraphicalUI extends JFrame {

	private JPanel contentPane;
	
	private ImageIcon backgroundplay;
    private ImageIcon backgroundplaySmall;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GraphicalUI frame = new GraphicalUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GraphicalUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel PanelMenu = new JPanel();
		PanelMenu.setBounds(0, 0, 500, 100);
		contentPane.add(PanelMenu);
		
		JPanel PanelBackground = new JPanel();
		PanelBackground.setBounds(0, 0, 500, 500);
		contentPane.add(PanelBackground);
		
        backgroundplay = new ImageIcon(
                "/de.htwg.se.PerangKolom/src/utilities/PerangKolomGameField.jpg");
        
        //background.setIcon(backgroundplay);
	}

	

//    private void printBackGorund() {
//            JLabel background;
//            // background //
//
//            // Background //
//            final int backgroundxpos = 0;
//            final int backgroundypos = 0;
//            final int backgroundxsize = 500;
//            final int backgroundysize = 500;
//            final int gameSize = controller.getGameFieldSize();
//
//            background = new JLabel();
//            background.setBounds(backgroundxpos, backgroundypos, backgroundxsize,
//                            backgroundysize);
////            if (gameSize == NINE) {
////                    background.setIcon(backgroundplay);
////            } else if (gameSize == FIVE) {
////                    background.setIcon(backgroundplaySmall);
////            }
//
//           
//
//            if (controller.getNext().equals("white")) {
//                    whiteStatsBackground.setIcon(whiteStatsbackA);
//                    blackStatsBackground.setIcon(blackStatsback);
//            } else {
//                    blackStatsBackground.setIcon(blackStatsbackA);
//                    whiteStatsBackground.setIcon(whiteStatsback);
//            }
//    }
}
