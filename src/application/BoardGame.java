import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class BoardGame extends JFrame {
    JButton[] buttons = new JButton[64];
    JPanel centerPanel = new JPanel();
    JLabel scoreLabel = new JLabel();
    JPanel mainPanel = new JPanel();
    JFrame boardGame = new JFrame();
    JPanel topPanel = new JPanel();
    int block;
    int area;

    public BoardGame() {
        connectComposition();
    }

    public void setLabel() {
        scoreLabel.setHorizontalAlignment(JLabel.CENTER);
        Font font = new Font("", Font.BOLD, 20);
        scoreLabel.setFont(font);
    }

    public void readBlock() {
        try (BufferedReader br = new BufferedReader(new FileReader(new File("u.block.txt")))) {
            String textBlock = null;
            while ((textBlock = br.readLine()) != null) {
                block = Integer.parseInt(textBlock);
                area = block * block;
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void setBoardGame() {
        for (int i = 0; i < area; i++) {
            buttons[i] = new JButton();
            centerPanel.add(buttons[i]);
        }
    }

    public void readScore() {
        try (BufferedReader br = new BufferedReader(new FileReader(new File("u.score.txt")))) {
            String textScore = null;
            while ((textScore = br.readLine()) != null) {
                scoreLabel.setText("Score: " + textScore);

            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void setLayout() {
        centerPanel.setLayout(new GridLayout(block, block));
        mainPanel.setLayout(new BorderLayout());
        topPanel.setLayout(new BorderLayout());
    }

    public void setPanel() {
        topPanel.add(scoreLabel, BorderLayout.CENTER);
        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(centerPanel, BorderLayout.CENTER);
        boardGame.add(mainPanel);
    }

    public void setFrame() {
        Image img = new ImageIcon(this.getClass().getResource("Graphics/icon/icon.png")).getImage();
        boardGame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        boardGame.setExtendedState(MAXIMIZED_BOTH);
        boardGame.setLocationRelativeTo(null);
        boardGame.setResizable(false);
        boardGame.setTitle("Click It");
        boardGame.setIconImage(img);
        boardGame.setVisible(true);
    }

    public void connectComposition() {
        readBlock();
        readScore();
        setBoardGame();
        setLabel();
        setLayout();
        setPanel();
        setFrame();
    }
}