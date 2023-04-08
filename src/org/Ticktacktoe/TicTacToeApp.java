package org.Ticktacktoe;

/**
 *	Main class here we do implement the UI of the game, the main method also
 *@author codeio 
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

public class TicTacToeApp extends JFrame {

	private static final long serialVersionUID = 1L;
	public static int i = 1;
	String player;
	Board board = new Board();
	String[] b = board.getBoard();

	public TicTacToeApp() {

		super("TickTackToe");

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}

		JPanel boardJPanel = new JPanel(), dataJPanel = new JPanel();

		boardJPanel.setBackground(new Color(192, 192, 192));
		dataJPanel.setBackground(Color.WHITE);

		boardJPanel.setLayout(new GridLayout(3, 3, 10, 10));
		dataJPanel.setLayout(new GridLayout(1, 1, 20, 10));

		dataJPanel.setBorder(new LineBorder(Color.WHITE, 20));
		JButton button0 = new JButton("*");
		JButton button1 = new JButton("*");
		JButton button2 = new JButton("*");
		JButton button3 = new JButton("*");
		JButton button4 = new JButton("*");
		JButton button5 = new JButton("*");
		JButton button6 = new JButton("*");
		JButton button7 = new JButton("*");
		JButton button8 = new JButton("*");
		boardJPanel.add(button0);
		boardJPanel.add(button1);
		boardJPanel.add(button2);
		boardJPanel.add(button3);
		boardJPanel.add(button4);
		boardJPanel.add(button5);
		boardJPanel.add(button6);
		boardJPanel.add(button7);
		boardJPanel.add(button8);

		add(boardJPanel);
		add(dataJPanel, BorderLayout.SOUTH);

		JTextField gameResultTextField = new JTextField();

		JButton newGameButton = new JButton("New Game");

		dataJPanel.add(gameResultTextField, BorderLayout.EAST);
		dataJPanel.add(newGameButton);
		setMinimumSize(new Dimension(300, 400));
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(true);
		setVisible(true);

		button0.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				button0.setText(player);
				button0.setEnabled(false);
				b[0] = player;
				i++;
				checkGame(gameResultTextField);
			}

		});
		button8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				button8.setText(player);
				button8.setEnabled(false);
				b[8] = player;
				i++;
				checkGame(gameResultTextField);
			}

		});
		button7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				button7.setText(player);
				button7.setEnabled(false);
				b[7] = player;
				i++;
				checkGame(gameResultTextField);
			}

		});
		button6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				button6.setText(player);
				button6.setEnabled(false);
				b[6] = player;
				i++;
				checkGame(gameResultTextField);
			}

		});
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				button1.setText(player);
				button1.setEnabled(false);
				b[1] = player;
				i++;
				checkGame(gameResultTextField);

			}

		});
		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				button2.setText(player);
				button2.setEnabled(false);
				b[2] = player;
				i++;
				checkGame(gameResultTextField);

			}

		});
		button3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				button3.setText(player);
				button3.setEnabled(false);
				b[3] = player;
				i++;
				checkGame(gameResultTextField);

			}

		});
		button4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				button4.setText(player);
				button4.setEnabled(false);
				b[4] = player;
				i++;
				checkGame(gameResultTextField);

			}

		});
		button5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				button5.setText(player);
				button5.setEnabled(false);
				b[5] = player;
				i++;
				checkGame(gameResultTextField);

			}

		});

		newGameButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				button0.setText("*");
				button0.setEnabled(true);
				button1.setText("*");
				button1.setEnabled(true);
				button2.setText("*");
				button2.setEnabled(true);
				button3.setText("*");
				button3.setEnabled(true);
				button4.setText("*");
				button4.setEnabled(true);
				button5.setText("*");
				button5.setEnabled(true);
				button6.setText("*");
				button6.setEnabled(true);
				button7.setText("*");
				button7.setEnabled(true);
				button8.setText("*");
				button8.setEnabled(true);
				i = 1;
				int j = 0;

				while (j < 9) {
					b[j] = "" + j;
					j++;
				}
				EvaluateGame.setStatus("");
				gameResultTextField.setText(EvaluateGame.status);

			}
		});

		checkGame(gameResultTextField);

	}

	public void checkGame(JTextField gameResultTextField) {
		EvaluateGame.evaluateGame(i, b);
		player = EvaluateGame.getPlayer();
		gameResultTextField.setText(EvaluateGame.status);
	}

	public static void main(String[] args) {
		new TicTacToeApp();

	}
}
