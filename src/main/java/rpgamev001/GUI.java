package rpgamev001;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class GUI implements ActionListener {
// proměnné---------------------------------------------------------------

    private JTextField textfield;
    private JFrame frame;
    private JPanel panel;
    private JButton loadgame, newgame, con, back;
    private JLabel textlabel;
    public static String _name;
  

 // </proměnné---------------------------------------------------------------  
    public GUI() {

    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//methods ----------------------------------------------------------------   
    public void refreshAllContent(){
        frame.repaint();
        panel.repaint();
        frame.validate();
    }
   
    
    
    public void createWelcomeMenu() {
//vytvoří uživatelské rozhraní s talčítkem new game and load game 
        newgame = new JButton("New Game");
        loadgame = new JButton("Load Game");
        panel.add(newgame);
        panel.add(loadgame);
        newgame.setBounds(50, 60, 40, 20);
        loadgame.setBounds(50, 70, 40, 20);
        newgame.addActionListener(this);
       
    }
    public void createWindow(){
//vytvoří okno
        frame = new JFrame();
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(200, 200, 200, 200));
        panel.setLayout(new GridLayout(0, 1));
        frame.add(panel);
        //setup to max 
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("RPG GAME");
        frame.pack();
        frame.setVisible(true);       
 }
    public void setNameOfCharakter(){
        //dosazení jména do proměné
        Player myHero = new Player ();
        _name = textfield.getText();
        myHero.setName(_name);
    
    }
    public void createNameOfCharakterUI() {
//vytvoří uživatelské rozhraní pro vytvoření jména hráče
        newgame.setVisible(false);
        loadgame.setVisible(false);
        textlabel = new JLabel("Select your name");
        textfield = new JTextField();
        textlabel.setFont(new Font("Arial", Font.PLAIN, 30));
        textfield.setFont(new Font("Arial", Font.PLAIN, 30));
        textfield.setBounds(10, 10, 120, 25);
        textfield.setBounds(10, 20, 120, 25);
        panel.add(textlabel);
        panel.add(textfield);
        //continue button
        con = new JButton("Continue");
        panel.add(con);
        con.setVisible(true);
        con.setBounds(10, 30, 40, 20);
        con.addActionListener(this);
        con.setVisible(true);
        
        //button back
        back = new JButton("Go back to main menu");
        panel.add(back);
        back.setVisible(true);
        back.setBounds(10, 40, 40, 20);
        back.addActionListener(this);

    }      
// </methods ----------------------------------------------------------------
 
    
    
    
    
    
    
    
    
    
    

//setters and getters-----------------------------------------------------
    
//</setters and getters---------------------------------------------------
    
   
    
    
//IFELSEIFELSEIFELSEIFELSEIFELSEIFELSEIFELSEIFELSE  :D>>>>>>>>>>>>>>>>>>>>>>>>>>>>    

//what will heppen after button was clicked-------------------------------
    
    
    
    public void actionPerformed(ActionEvent e) {
        
        
//when NEW GAME is clicked----------------------------------------------------- 
        if (e.getSource() == newgame) {
            createNameOfCharakterUI();
            

                    
//when LOADGAME is clicked------------------------------------------------------------------------------             
        }else if (e.getSource() == loadgame){
            refreshAllContent();
                 
//when CONTINUE is clicked------------------------------------------------------------------------------          
        }
         else if (e.getSource() == con) {
             refreshAllContent();
        } 
//when BACK TO MAIN MENU is clicked----------------------------------------------------------------------------------
         else if (e.getSource() == back){
        refreshAllContent();
        createWelcomeMenu();
        }
    }
    
    
   // </what will heppen after button was clicked-------------------------------------------------------

    
    
    
    
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}
