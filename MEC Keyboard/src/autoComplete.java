import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JWindow;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.border.LineBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.io.*;
import java.util.*;


public class autoComplete
{
	String[] autofill(String userInput)
		{
		String[] suggestion = new String[5];
		Scanner sc = new Scanner (System.in);
		String tempString;
		int i, j;
		int userInput_Length;
		int tempString_Length;
		boolean equalString;
		System.out.print(">>>");		
		try
		{
			Scanner inFile = new Scanner (new FileReader("src/20k.txt"));
			tempString = inFile.next();


    		char[] userInput_Array = userInput.toCharArray();
    		char[] tempString_Array;
    		i = 0;
    		while( !(i >= 5 || tempString.equals("$$$$")) )
    		{
    			equalString = true;
    			tempString = inFile.next();
    			tempString_Array = tempString.toCharArray();
    			userInput_Length = userInput_Array.length;
    			tempString_Length = tempString_Array.length;
    			if (userInput_Length <= tempString_Length)
    			{
    				for (j = 0; j < userInput_Length; j++)
    				{
    					if (userInput_Array[j] != tempString_Array[j])
    					{
    						equalString = false;
    					}
    				}

    				if (equalString)
    				{
    					suggestion[i] = tempString;
    					i++;
    				}
    			}

    		}
	
		}
		catch (FileNotFoundException ex){};

		System.out.println("the user input is " + userInput);
		/*
		System.out.println("the suggestions are");
		for(j = 0; j < 5; j++)
		{
			if (suggestion[j] != null)		
				System.out.println(suggestion[j]);	
			else
				System.out.println("");
		}
		*/
		return suggestion;
	}
}
