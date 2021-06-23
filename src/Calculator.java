

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.BorderFactory;
import javax.swing.border.Border;



public class Calculator extends JFrame{
    
    JFrame frame = new JFrame();
    ImageIcon image = new ImageIcon("images/logo.jpg");    
    JPanel jpl = new JPanel();
    JTextArea jta = new JTextArea();
    BorderLayout bdr = new BorderLayout();
    
    JButton btn1 = new JButton("%");
    JButton btn2 = new JButton("CE");
    JButton btn3 = new JButton("DEL");
    JButton btn4 = new JButton("/");
    
    JButton btn5 = new JButton("7");
    JButton btn6 = new JButton("8");
    JButton btn7 = new JButton("9");
    JButton btn8 = new JButton("*");
    
    JButton btn9 = new JButton("4");
    JButton btn10 = new JButton("5");
    JButton btn11 = new JButton("6");
    JButton btn12 = new JButton("-");
    
    JButton btn13 = new JButton("1");
    JButton btn14 = new JButton("2");
    JButton btn15 = new JButton("3");
    JButton btn16 = new JButton("+");
    
    JButton btn17 = new JButton("Sqrt");
    JButton btn18 = new JButton("0");
    JButton btn19 = new JButton(".");
    JButton btn20 = new JButton("=");
   
    Font myFont = new Font("Arial",Font.BOLD,50);
    Font myFont1 = new Font("Arial",Font.BOLD,22);
    Border brd = BorderFactory.createLineBorder(Color.BLACK);
    
    String strnum1 = "";
    String strnum2 = "";
    String strtot = "";
    
    float num1 = 0;
    float num2 = 0;
    float total = 0;
    
    String[] statement;
   
    
    public Calculator(){ //Constructor
        
        frame.setTitle("Calculator");
        frame.setSize(438,560);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setIconImage(image.getImage());
        
        jpl.setSize(436,560);
        jpl.setLayout(null);
        jpl.setBackground(new Color(42, 45, 46));
        
        
        frame.add(jpl);
        
        jta.setBounds(2, 40, 416, 110);
        jta.setBorder(brd);
        jta.setFont(myFont);
        jta.setBackground(new Color(42, 45, 46));
        jta.setForeground(Color.WHITE);
        jpl.add(jta);
       
        
        
        btn1.setBounds(4, 194, 100, 60);
        btn1.setBackground(new Color(38, 40, 41));
        btn1.setForeground(Color.WHITE);
        btn1.setFont(myFont1); 
        
        btn1.addActionListener(new ActionListener(){ 
            @Override
            public void actionPerformed(ActionEvent e){  
              jta.append("%");
            }
        });
       
        jpl.add(btn1);
        
        
        btn2.setBounds(108, 194, 100, 60);
        btn2.setBackground(new Color(38, 40, 41));
        btn2.setForeground(Color.WHITE);
        btn2.setFont(myFont1);
        
        btn2.addActionListener(new ActionListener(){ 
           @Override
            public void actionPerformed(ActionEvent e){  
              jta.setText(null);
            }
        });
        jpl.add(btn2);
        
        btn3.setBounds(212, 194, 100, 60);
        btn3.setBackground(new Color(38, 40, 41));
        btn3.setForeground(Color.WHITE);
        btn3.setFont(myFont1);
        btn3.addActionListener(new ActionListener(){ 
            @Override
            public void actionPerformed(ActionEvent e){  
              String s = jta.getText();
              jta.setText("");
              for(int i = 0; i<s.length()-1; i++)
              jta.setText(jta.getText()+s.charAt(i));
            }
        });
        jpl.add(btn3);
        
        btn4.setBounds(316, 194, 100, 60);
        btn4.setBackground(new Color(38, 40, 41));
        btn4.setForeground(Color.WHITE);
        btn4.setFont(myFont1);
        btn4.addActionListener(new ActionListener(){ 
            @Override
            public void actionPerformed(ActionEvent e){  
              jta.append("/");
            }
        });
        jpl.add(btn4);
        
        
        btn5.setBounds(4, 258, 100, 60); 
        btn5.setBackground(new Color(27, 28, 28));
        btn5.setForeground(Color.WHITE);
        btn5.setFont(myFont1);
        btn5.addActionListener(new ActionListener(){ 
            @Override
            public void actionPerformed(ActionEvent e){  
              jta.append("7");
            }
        });
        jpl.add(btn5);
        
        btn6.setBounds(108, 258, 100, 60); 
        btn6.setBackground(new Color(27, 28, 28));
        btn6.setForeground(Color.WHITE);
        btn6.setFont(myFont1);
        btn6.addActionListener(new ActionListener(){ 
            @Override
            public void actionPerformed(ActionEvent e){  
              jta.append("8");
            }
        });
        jpl.add(btn6);
        
        btn7.setBounds(212, 258, 100, 60); 
        btn7.setBackground(new Color(27, 28, 28));
        btn7.setForeground(Color.WHITE);
        btn7.setFont(myFont1);
        btn7.addActionListener(new ActionListener(){ 
            @Override
            public void actionPerformed(ActionEvent e){  
              jta.append("9");
            }
        });
        jpl.add(btn7);
        
        btn8.setBounds(316, 258, 100, 60);  
        btn8.setBackground(new Color(38, 40, 41));
        btn8.setForeground(Color.WHITE);
        btn8.setFont(myFont1);
        btn8.addActionListener(new ActionListener(){ 
            @Override
            public void actionPerformed(ActionEvent e){  
              jta.append("*");
            }
        });
        jpl.add(btn8);
        
        
        btn9.setBounds(4, 322, 100, 60);
        btn9.setBackground(new Color(27, 28, 28));
        btn9.setForeground(Color.WHITE);
        btn9.setFont(myFont1);
        btn9.addActionListener(new ActionListener(){ 
            @Override
            public void actionPerformed(ActionEvent e){  
              jta.append("4");
            }
        });
        jpl.add(btn9);
        
        btn10.setBounds(108, 322, 100, 60);
        btn10.setBackground(new Color(27, 28, 28));
        btn10.setForeground(Color.WHITE);
        btn10.setFont(myFont1);
        btn10.addActionListener(new ActionListener(){ 
            @Override
            public void actionPerformed(ActionEvent e){  
              jta.append("5");
            }
        });
        jpl.add(btn10);
        
        btn11.setBounds(212, 322, 100, 60);
        btn11.setBackground(new Color(27, 28, 28));
        btn11.setForeground(Color.WHITE);
        btn11.setFont(myFont1);
        btn11.addActionListener(new ActionListener(){ 
            @Override
            public void actionPerformed(ActionEvent e){  
              jta.append("6");
            }
        });
        jpl.add(btn11);
        
        btn12.setBounds(316, 322, 100, 60);
        btn12.setBackground(new Color(38, 40, 41));
        btn12.setForeground(Color.WHITE);
        btn12.setFont(myFont1);
        btn12.addActionListener(new ActionListener(){ 
            @Override
            public void actionPerformed(ActionEvent e){  
              jta.append("-");
            }
        });
        jpl.add(btn12);
        
        
        btn13.setBounds(4, 386, 100, 60);
        btn13.setBackground(new Color(27, 28, 28));
        btn13.setForeground(Color.WHITE);
        btn13.setFont(myFont1);
        btn13.addActionListener(new ActionListener(){ 
            @Override
            public void actionPerformed(ActionEvent e){  
              jta.append("1");
            }
        });
        jpl.add(btn13);
        
        btn14.setBounds(108, 386, 100, 60);
        btn14.setBackground(new Color(27, 28, 28));
        btn14.setForeground(Color.WHITE);
        btn14.setFont(myFont1);
        btn14.addActionListener(new ActionListener(){ 
            @Override
            public void actionPerformed(ActionEvent e){  
              jta.append("2");
            }
        });
        jpl.add(btn14);
        
        btn15.setBounds(212, 386, 100, 60);
        btn15.setBackground(new Color(27, 28, 28));
        btn15.setForeground(Color.WHITE);
        btn15.setFont(myFont1);
        btn15.addActionListener(new ActionListener(){ 
            @Override
            public void actionPerformed(ActionEvent e){  
              jta.append("3");
            }
        });
        jpl.add(btn15);
        
        btn16.setBounds(316, 386, 100, 60);
        btn16.setBackground(new Color(38, 40, 41));
        btn16.setForeground(Color.WHITE);
        btn16.setFont(myFont1);
        btn16.addActionListener(new ActionListener(){ 
            @Override
            public void actionPerformed(ActionEvent e){  
              jta.append("+");
            }
        });
        jpl.add(btn16);
        
        
        btn17.setBounds(4, 450, 100, 60);
        btn17.setBackground(new Color(27, 28, 28));
        btn17.setForeground(Color.WHITE);
        btn17.setFont(myFont1);
        btn17.addActionListener(new ActionListener(){ 
            @Override
            public void actionPerformed(ActionEvent e){  
              jta.append("Sqrt");
            }
        });
        jpl.add(btn17);
        
        btn18.setBounds(108, 450, 100, 60);
        btn18.setBackground(new Color(27, 28, 28));
        btn18.setForeground(Color.WHITE);
        btn18.setFont(myFont1);
        btn18.addActionListener(new ActionListener(){ 
            @Override
            public void actionPerformed(ActionEvent e){  
              jta.append("0");
            }
        });
        jpl.add(btn18);
        
        btn19.setBounds(212, 450, 100, 60);
        btn19.setBackground(new Color(27, 28, 28));
        btn19.setForeground(Color.WHITE);
        btn19.setFont(myFont1);
        btn19.addActionListener(new ActionListener(){ 
            @Override
            public void actionPerformed(ActionEvent e){  
              jta.append(".");
            }
        });
        jpl.add(btn19);
        
        btn20.setBounds(316, 450, 100, 60);
        btn20.setBackground(new Color(38, 40, 41));
        btn20.setForeground(Color.WHITE);
        btn20.setFont(myFont1);
        btn20.addActionListener(new ActionListener(){ 
            @Override
            public void actionPerformed(ActionEvent e){  
              if(jta.getText().contains("+")){                  
                  statement = jta.getText().split("\\+");
                          
                          strnum1 = statement[0];
                          strnum2 = statement[1];
                          
                          num1 = Float.parseFloat(strnum1);
                          num2 = Float.parseFloat(strnum2);
                          
                          total = num1 + num2;
                          
                          strtot = Float.toString(total);
                          jta.setText(strtot);
              }
              
              if(jta.getText().contains("-")){                  
                  statement = jta.getText().split("\\-");
                          
                          strnum1 = statement[0];
                          strnum2 = statement[1];
                          
                          num1 = Float.parseFloat(strnum1);
                          num2 = Float.parseFloat(strnum2);
                          
                          total = num1 - num2;
                          
                          strtot = Float.toString(total);
                          jta.setText(strtot);
              }
              
               if(jta.getText().contains("*")){                  
                  statement = jta.getText().split("\\*");
                          
                          strnum1 = statement[0];
                          strnum2 = statement[1];
                          
                          num1 = Float.parseFloat(strnum1);
                          num2 = Float.parseFloat(strnum2);
                          
                          total = num1 * num2;
                          
                          strtot = Float.toString(total);
                          jta.setText(strtot);
              }
               
                if(jta.getText().contains("/")){                  
                  statement = jta.getText().split("\\/");
                          
                          strnum1 = statement[0];
                          strnum2 = statement[1];
                          
                          num1 = Float.parseFloat(strnum1);
                          num2 = Float.parseFloat(strnum2);
                          
                          total = num1 / num2;
                          
                          strtot = Float.toString(total);
                          jta.setText(strtot);
              }
                
                if(jta.getText().contains("Sqrt")){                  
                  statement = jta.getText().split("\\Sqrt");
                          
                          strnum1 = statement[0];
                          strnum2 = statement[1];
                          
                          num1 = Float.parseFloat(strnum1);
                          num2 = Float.parseFloat(strnum2);
                          
                          total = num1 / 100;
                          total = num1 * num2/100;
                         
                          
                          strtot = Float.toString(total);
                          jta.setText(strtot);
              }
            }
        });
        jpl.add(btn20);
        
        
        

    }
    public static void main(String[] args) {
        Calculator cal = new Calculator();
    }
}
