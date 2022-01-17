import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;


public class CashWindow implements ActionListener {

    static Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
    JButton startBtn,backBtn,exitBtn;
    JLabel mainTitle;
    JFrame frame;
    int width=(int)d.getWidth();
    int height=(int)d.getHeight();
    JPanel startPanel,mainPanel;

public CashWindow(){

    frame=new JFrame("Project Cash Machine");
    frame.setSize(560,560);
    frame.setLayout(null);
    frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
}

public void startPanel(){
    
    startPanel=new JPanel();
    startPanel.setLayout(null);
    startPanel.setBackground(new Color(39,27,80));
    startPanel.setBounds(0, 0, width, height);
    
    mainTitle = new JLabel("Project cash Machine");
    mainTitle.setFont(new Font("Times New Roman",Font.BOLD,25));
    mainTitle.setBounds(600,20, 250, 200);
    mainTitle.setForeground(new Color(125,255,70));
    mainTitle.setLocation(550,125);

    exitBtn=new JButton("EXIT");
    exitBtn.setVisible(true);
    exitBtn.setBounds(800,350,100,100);
    startPanel.add(exitBtn);
    exitBtn.addActionListener(e->frame.dispose());

    startBtn=new JButton("Start");
    startBtn.setVisible(true);
    startBtn.setBounds(400, 350, 100, 100);
    startPanel.add(startBtn);
    startBtn.addActionListener(this);
    
    startPanel.add(mainTitle);   
    frame.add(startPanel);
  }
public void mainPanel(){
  
    mainPanel=new JPanel();
    mainPanel.setLayout(null);
    mainPanel.setBackground(new Color(39,27,80));
    mainPanel.setBounds(0, 0, width, height);
    
    backBtn=new JButton("Back");
    backBtn.setVisible(true);
    backBtn.setBounds(50, 50, 100, 100);
    
    mainPanel.add(backBtn);
    backBtn.addActionListener(this);
    frame.add(mainPanel);
    }

public  void clearFrame(JPanel panel){
    frame.remove(panel);
    frame.repaint();
    
    }
 
public void actionPerformed(ActionEvent e){
    if(e.getSource()==backBtn){
        clearFrame(mainPanel);
        startPanel();
            }
    if(e.getSource()==startBtn){
        clearFrame(startPanel);
        mainPanel();
           }   
    }
    
public void addMainPanel(){
    
    }
}
