package rpgamev001;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class GUI implements ActionListener {

    private JTextField textfield;
    private JFrame frame;
    private JPanel panel;
    private JButton loadgame;
    private JButton newgame;
    private JTextArea textarea;
    private JButton con;

    public GUI() {
    }

    public void createWelcomeMenu() {
//vytvoří uřivatelské rozhraní s talčítkem new game and load game 
        newgame = new JButton("New Game");
        loadgame = new JButton("Load Game");
        frame = new JFrame();
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(200, 200, 200, 200));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(newgame);
        panel.add(loadgame);
        newgame.setBounds(50, 60, 40, 20);
        loadgame.setBounds(50, 70, 40, 20);
        newgame.addActionListener(this);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("RPG GAME");
        frame.pack();
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == newgame) {
            newgame.setVisible(false);
            loadgame.setVisible(false);
            textarea = new JTextArea("Select your name");
            textarea.setEditable(false);
            textfield = new JTextField();
            textfield.setBounds(10, 10, 120, 25);
            textfield.setBounds(10, 20, 120, 25);
            panel.add(textarea);
            panel.add(textfield);
            

        }
    }
}
