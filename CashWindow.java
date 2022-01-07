import javax.swing.*;
import java.awt.*;

public class CashWindow  {

    static Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
    JButton button,backButton;
    JLabel title;
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

public void addPanel(){
    startPanel=new JPanel();
    startPanel.setLayout(null);
    startPanel.setBackground(new Color(39,27,80));
    startPanel.setBounds(0, 0, width, height);
    
    title = new JLabel("Project cash Machine");
    title.setFont(new Font("Times New Roman",Font.BOLD,25));
    title.setBounds(600,20, 250, 200);
    title.setForeground(new Color(125,255,70));
    title.setLocation(550,125);

    button=new JButton("Start");
    button.setVisible(true);
    button.setBounds(50, 50, 100, 100);
    startPanel.add(button);
    button.addActionListener(e->removePanel());
    
    startPanel.add(title);   
    frame.add(startPanel);
  }
public void removePanel(){
    frame.remove(startPanel);
    frame.repaint();

    mainPanel=new JPanel();
    mainPanel.setLayout(null);
    mainPanel.setBackground(new Color(39,27,80));
    mainPanel.setBounds(0, 0, width, height);
    
    backButton=new JButton("Back");
    backButton.setVisible(true);
    backButton.setBounds(50, 50, 100, 100);
    
    mainPanel.add(backButton);

    backButton.addActionListener(e->frame.remove(startPanel));
    frame.add(mainPanel);
    }

public void addActionListener(){
     
}
}
