package de.htwg.se.PerangKolom.aview.GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.util.prefs.BackingStoreException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.OverlayLayout;

import org.apache.log4j.helpers.AbsoluteTimeDateFormat;

public class ButtonObject extends JFrame{

	private JPanel buttonPanel;
	private JPanel centrePanel;
	private JLabel valueOfCellLabel;
	private JButton buttonTop;
	private JButton buttonRight;
	private JButton buttonBottom;
	private JButton buttonLeft;
	
	private final int BUTTONWIDE = 45;
	private final int BUTTONHEIGHT = 10;
	
	public ButtonObject(int x, int y, String cellValue){
		
		this.buttonPanel = new JPanel();
		this.centrePanel = new JPanel();
		this.valueOfCellLabel = new JLabel(cellValue);
		this.buttonTop = new JButton("");
		this.buttonRight = new JButton("");
		this.buttonBottom = new JButton("");
		this.buttonLeft = new JButton("");
		buttonPanel.setLayout(null);


		
		buttonPanel.setBounds(x, y, 75, 75);
		buttonPanel.setOpaque(false);
		centrePanel.setBounds(10, 10, 50, 50);
		centrePanel.setBackground(Color.BLUE);
//		centrePanel.setOpaque(false); //sets the cell invisible
		
		
		/* add Buttons to panel */
		buttonPanel.add(buttonTop).setBounds(13, 0, BUTTONWIDE, BUTTONHEIGHT);
		buttonPanel.add(buttonRight).setBounds(60, 13, BUTTONHEIGHT, BUTTONWIDE);
		buttonPanel.add(buttonBottom).setBounds(13, 60, BUTTONWIDE, BUTTONHEIGHT);
		buttonPanel.add(buttonLeft).setBounds(0, 13, BUTTONHEIGHT, BUTTONWIDE);
		buttonPanel.add(centrePanel);
		centrePanel.add(valueOfCellLabel).setBounds(40, 45, 20, 20);
		valueOfCellLabel.setBackground(Color.BLUE);
		valueOfCellLabel.setForeground(Color.BLACK);
		valueOfCellLabel.setVisible(true);
//		valueOfCellLabel.setSize(20, 20);
		valueOfCellLabel.setOpaque(true);


		
	}
	 
	public JPanel getPanel(){
		
		return buttonPanel;
	}
	
}
