/* Name: Phan Bảo Trân
 ID: ITDSIU21125
 Purpose: The Game class sets up the Battleship game environment by initializing a graphical window with Swing components and allowing the player to choose the AI difficulty level through a dialog box. It creates a GamePanel to manage the game logic and rendering and sets up key listeners to handle user input during the game. The different AI difficulty levels provide varying challenges to the player, enhancing the gameplay experience.
*/
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game implements KeyListener {
    public static void main(String[] args) {
        Game game = new Game();
    }

    private GamePanel gamePanel;

    public Game() {

        String[] options = new String[] {"Easy", "Medium", "Hard"};
        String message = "Easy will make moves entirely randomly,\nMedium will focus on areas where it finds ships,"
                + "\nand Hard will make smarter choices over Medium.";
        int difficultyChoice = JOptionPane.showOptionDialog(null, message,
                "Choose an AI Difficulty",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options, options[0]);

        JFrame frame = new JFrame("Battleship");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        gamePanel = new GamePanel(difficultyChoice);
        frame.getContentPane().add(gamePanel);

        frame.addKeyListener(this);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        gamePanel.handleInput(e.getKeyCode());
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}
}
