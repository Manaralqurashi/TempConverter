/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author far7a
 */
public class TempConverter extends JFrame{
    private JButton calcButton;
    private JTextField celsiusTextField;
    private JLabel messageLabel;
    private JPanel panel;
    private final int WINDOW_WIDTH=320;
    private final int WINDOW_HEIGHT=100;
    
    public TempConverter(){
        
            setTitle("C to F Converter");

            setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            buildPanel();
            
            add(panel);
             
            setLocationRelativeTo(null);
            
            setVisible(true);
    }
    
    
    private void buildPanel(){
        
        messageLabel=new JLabel("Enter a temperature in Celsius");
        celsiusTextField =new JTextField(10);
        calcButton=new JButton("Calculate");
        calcButton.addActionListener(new CalcButtonListener());
        panel=new JPanel();
        
        panel.add(messageLabel);
        panel.add(celsiusTextField);
        panel.add(calcButton);
    }
    
    private class CalcButtonListener implements ActionListener
            {

                @Override
                public void actionPerformed(ActionEvent e) {
                 
                            String input;
                            double fahrenheit;
                            input=celsiusTextField.getText();
                            fahrenheit=(9.0/5)*Double.parseDouble(input)+32;
                            JOptionPane.showMessageDialog(null, input+ " Celsius is  "+fahrenheit+ " Fahrenheit");
                }
            }
    public static void main(String[] args) {
      new TempConverter();
        
    }
}
