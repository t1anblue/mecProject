import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class GUI {

	private JFrame frame;
	private JTextField sentenceBox;
	private JTextField wordBox;
	private int buttonNav;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 750, 564);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		sentenceBox = new JTextField();
		sentenceBox.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
		sentenceBox.setBounds(0, 6, 750, 80);
		frame.getContentPane().add(sentenceBox);
		sentenceBox.setColumns(10);
		
		String sentence = new String("");
		String word = new String("");
		
		
		JButton gesture1 = new JButton("⬆️");
		gesture1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(buttonNav == 1)
					wordBox.setText(wordBox.getText()+",");
				if(buttonNav == 2)
					wordBox.setText(wordBox.getText()+"a");
				if(buttonNav == 3)
					wordBox.setText(wordBox.getText()+"d");
				if(buttonNav == 4)
					wordBox.setText(wordBox.getText()+"g");
				if(buttonNav == 5)
					wordBox.setText(wordBox.getText()+"j");
				if(buttonNav == 6)
					wordBox.setText(wordBox.getText()+"m");
				if(buttonNav == 7)
					wordBox.setText(wordBox.getText()+"p");
				if(buttonNav == 8)
					wordBox.setText(wordBox.getText()+"t");
				if(buttonNav == 9)
					wordBox.setText(wordBox.getText()+"w");
			}
		});
		gesture1.setBounds(6, 434, 75, 75);
		frame.getContentPane().add(gesture1);
		
		JButton gesture2 = new JButton("➡️");
		gesture2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(buttonNav == 1)
					wordBox.setText(wordBox.getText()+".");
				if(buttonNav == 2)
					wordBox.setText(wordBox.getText()+"b");
				if(buttonNav == 3)
					wordBox.setText(wordBox.getText()+"e");
				if(buttonNav == 4)
					wordBox.setText(wordBox.getText()+"h");
				if(buttonNav == 5)
					wordBox.setText(wordBox.getText()+"k");
				if(buttonNav == 6)
					wordBox.setText(wordBox.getText()+"n");
				if(buttonNav == 7)
					wordBox.setText(wordBox.getText()+"q");
				if(buttonNav == 8)
					wordBox.setText(wordBox.getText()+"u");
				if(buttonNav == 9)
					wordBox.setText(wordBox.getText()+"x");
			}
		});
		gesture2.setBounds(93, 434, 75, 75);
		frame.getContentPane().add(gesture2);
		
		JButton gesture3 = new JButton("⬇️");
		gesture3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(buttonNav == 1)
					wordBox.setText(wordBox.getText()+"?");
				if(buttonNav == 2)
					wordBox.setText(wordBox.getText()+"c");
				if(buttonNav == 3)
					wordBox.setText(wordBox.getText()+"f");
				if(buttonNav == 4)
					wordBox.setText(wordBox.getText()+"i");
				if(buttonNav == 5)
					wordBox.setText(wordBox.getText()+"l");
				if(buttonNav == 6)
					wordBox.setText(wordBox.getText()+"o");
				if(buttonNav == 7)
					wordBox.setText(wordBox.getText()+"r");
				if(buttonNav == 8)
					wordBox.setText(wordBox.getText()+"v");
				if(buttonNav == 9)
					wordBox.setText(wordBox.getText()+"y");
			}
		});
		gesture3.setBounds(180, 434, 75, 75);
		frame.getContentPane().add(gesture3);
		
		JButton gesture4 = new JButton("⬅️");
		gesture4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(buttonNav == 1)
					wordBox.setText(wordBox.getText()+"!");
				if(buttonNav == 2)
					wordBox.setText(wordBox.getText()+"");
				if(buttonNav == 3)
					wordBox.setText(wordBox.getText()+"");
				if(buttonNav == 4)
					wordBox.setText(wordBox.getText()+"");
				if(buttonNav == 5)
					wordBox.setText(wordBox.getText()+"");
				if(buttonNav == 6)
					wordBox.setText(wordBox.getText()+"");
				if(buttonNav == 7)
					wordBox.setText(wordBox.getText()+"s");
				if(buttonNav == 8)
					wordBox.setText(wordBox.getText()+"");
				if(buttonNav == 9)
					wordBox.setText(wordBox.getText()+"z");
			}
		});
		gesture4.setBounds(267, 434, 75, 75);
		frame.getContentPane().add(gesture4);
		
		JButton ltrBtn1 = new JButton(", . ? !");
		ltrBtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonNav = 1;
			}
		});
		ltrBtn1.setBounds(350, 262, 117, 75);
		frame.getContentPane().add(ltrBtn1);
		
		JButton ltrBtn4 = new JButton("G H I");
		ltrBtn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonNav = 4;
			}
		});
		ltrBtn4.setBounds(350, 349, 117, 75);
		frame.getContentPane().add(ltrBtn4);
		
		JButton ltrBtn7 = new JButton("P Q R S");
		ltrBtn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonNav = 7;
			}
		});
		ltrBtn7.setBounds(350, 434, 117, 75);
		frame.getContentPane().add(ltrBtn7);
		
		JButton ltrBtn2 = new JButton("A B C");
		ltrBtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonNav = 2;
			}
		});
		ltrBtn2.setBounds(479, 262, 117, 75);
		frame.getContentPane().add(ltrBtn2);
		
		JButton ltrBtn5 = new JButton("J K L");
		ltrBtn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonNav = 5;
			}
		});
		ltrBtn5.setBounds(479, 349, 117, 75);
		frame.getContentPane().add(ltrBtn5);
		
		JButton ltrBtn8 = new JButton("T U V");
		ltrBtn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonNav = 8;
			}
		});
		ltrBtn8.setBounds(479, 434, 117, 75);
		frame.getContentPane().add(ltrBtn8);
		
		JButton ltrBtn3 = new JButton("D E F");
		ltrBtn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonNav = 3;
			}
		});
		ltrBtn3.setBounds(608, 262, 117, 75);
		frame.getContentPane().add(ltrBtn3);
		
		JButton ltrBtn6 = new JButton("M N O");
		ltrBtn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonNav = 6;
			}
		});
		ltrBtn6.setBounds(608, 349, 117, 75);
		frame.getContentPane().add(ltrBtn6);
		
		JButton ltrBtn9 = new JButton("W X Y Z");
		ltrBtn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonNav = 9;
			}
		});
		ltrBtn9.setBounds(608, 434, 117, 75);
		frame.getContentPane().add(ltrBtn9);
		
		JButton suggestion1 = new JButton("");
		suggestion1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wordBox.setText(suggestion1.getText());
			}
		});
		suggestion1.setBounds(0, 171, 150, 60);
		frame.getContentPane().add(suggestion1);
		
		JButton suggestion2 = new JButton("");
		suggestion2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wordBox.setText(suggestion2.getText());
			}
		});
		suggestion2.setBounds(150, 171, 150, 60);
		frame.getContentPane().add(suggestion2);
		
		JButton suggestion3 = new JButton("");
		suggestion3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wordBox.setText(suggestion3.getText());
			}
		});
		suggestion3.setBounds(300, 171, 150, 60);
		frame.getContentPane().add(suggestion3);
		
		JButton suggestion4 = new JButton("");
		suggestion4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wordBox.setText(suggestion4.getText());
			}
		});
		suggestion4.setBounds(450, 171, 150, 60);
		frame.getContentPane().add(suggestion4);
		
		JButton suggestion5 = new JButton("");
		suggestion5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wordBox.setText(suggestion5.getText());
			}
		});
		suggestion5.setBounds(600, 171, 150, 60);
		frame.getContentPane().add(suggestion5);
		
		wordBox = new JTextField();
		wordBox.getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void insertUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				warn();
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				warn();
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				warn();
			}
			public void warn() {
	    		autoComplete temp = new autoComplete();
	    		String[] suggestionList = temp.autofill(wordBox.getText());
	    		suggestion1.setText(suggestionList[0]);
	    		suggestion2.setText(suggestionList[1]);
	    		suggestion3.setText(suggestionList[2]);
	    		suggestion4.setText(suggestionList[3]);
	    		suggestion5.setText(suggestionList[4]);
	    	}
		});
		wordBox.setBounds(0, 113, 750, 50);
		frame.getContentPane().add(wordBox);
		wordBox.setColumns(10);
		
		JButton deleteBtn = new JButton("Delete");
		deleteBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wordBox.setText(wordBox.getText().substring(0, wordBox.getText().length() - 1));
			}
		});
		deleteBtn.setBounds(171, 262, 120, 75);
		frame.getContentPane().add(deleteBtn);
		
		JButton resetBtn = new JButton("Reset");
		resetBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wordBox.setText("");
				sentenceBox.setText("");
			}
		});
		resetBtn.setBounds(39, 349, 120, 75);
		frame.getContentPane().add(resetBtn);
		
		JButton spaceBtn = new JButton("Space");
		spaceBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String word,sentence;
				word = new String(wordBox.getText());
				sentence = new String(sentenceBox.getText());
				sentence = sentence + word + " ";
				sentenceBox.setText(sentence);
				wordBox.setText("");
			}
		});
		spaceBtn.setBounds(39, 262, 120, 75);
		frame.getContentPane().add(spaceBtn);
		
		JButton speakBtn = new JButton("Speak");
		speakBtn.setBounds(171, 349, 120, 75);
		speakBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//System.out.println(sentenceBox.getText());
				//wordBox.setText("hahaha");
				textToSpeech readLines = new textToSpeech(sentenceBox.getText()); 
				readLines.speech();
			}
		});
		frame.getContentPane().add(speakBtn);
	}
}
