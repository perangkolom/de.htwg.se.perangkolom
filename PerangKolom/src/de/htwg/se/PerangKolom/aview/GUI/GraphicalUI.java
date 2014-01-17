package de.htwg.se.PerangKolom.aview.GUI;

import java.awt.BorderLayout;import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.OverlayLayout;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JButton;

import de.htwg.se.PerangKolom.controller.impl.PerangKolomController;

public class GraphicalUI extends JFrame {

	private JPanel contentPane;
	private JPanel PanelMenu;
	private JPanel PanelBackground;
	private JLabel label;
	private ImageIcon backgroundplay;
    private BufferedImage backgroundplaySmall;
//    HashMap<List<V> , ButtonObject> hashMapButton;
    
    
//    private final int = 
//    private JButton btnNewButton;

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
		setResizable(false);
		setBackground(new Color(0, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 507, 628);
		
		/* Hash-Map */
//		hashMapButton = new HashMap<Integer[], ButtonObject>();
		

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setSize(500, 600);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		PanelMenu = new JPanel();
		PanelMenu.setBounds(0, 0, 500, 100);
		contentPane.add(PanelMenu);
		PanelMenu.setLayout(null);
		
		PanelBackground = new JPanel();
		PanelBackground.setForeground(Color.BLACK);
		PanelBackground.setBounds(0, 100, 500, 500);
		contentPane.add(PanelBackground);
		
		PanelBackground.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {
			    int x=e.getX();
			    int y=e.getY();
			    System.out.println(x+","+y);//these co-ords are relative to the component
			}
		});
		
		/*******************************/

		backgroundplay = new ImageIcon("src/utilities/PerangKolomGameField.jpg");
		PanelBackground.setOpaque(false);
		
//		btnNewButton = new JButton("");
//		
//
//		btnNewButton.setContentAreaFilled(false);
//		btnNewButton.setBorderPainted(false);
//		btnNewButton.setBackground(Color.WHITE);
////		btnNewButton.setBorderPainted(false);
//		btnNewButton.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent arg0) {
//				System.out.println("Hallo, ich wurde gedrückt");
//				PanelBackground.setOpaque(true);
//				btnNewButton.setContentAreaFilled(true);
//				btnNewButton.setEnabled(false);
//				
//			}
//		});
		
		label = new JLabel();
		label.setBounds(297, 16, 0, 0);
		label.setIcon(backgroundplay);
//		label.add(btnNewButton).setBounds(46, 35, 45, 10);;

		
		/******* BUILD Cells ********/
		int counterX = 33;
		int counterY = 35;
		
		for(int j = 0; j < 7; j++){
			for(int i = 0; i < 7; i++){
				ButtonObject btnObject = new ButtonObject(counterX, counterY, "500");
				JPanel btnPanel = btnObject.getPanel();
				label.add(btnPanel);
//				hashMapButton.put(, btnObject);
				counterX += 60;
			}
			counterX = 33;
			counterY += 60; 
		}


			
//		
//		ButtonObject btnObject = new ButtonObject(33, 35, "500");
//		JPanel btnPanel = btnObject.getPanel();
//		label.add(btnPanel);
//		ButtonObject btnObject2 = new ButtonObject(93, 35, "400");
//		JPanel btnPanel2 = btnObject2.getPanel();
//		label.add(btnPanel2);
		
        /***********/
        
		PanelBackground.add(label);
		setVisible(true); 
		this.validate();
	}
}
