import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import javax.sound.sampled.*;

public class Process extends BoardGame implements ActionListener {
    Random random = new Random();
    boolean loopOn = true;
    int target;

    public Process() {
        random();
        if (block == 2) {
            babySound("C:/Program Files/Game/src/application/Sound/Baby/Babycut.wav");
            babyDefault();
            babyAnimation();
        } else if (block == 4) {
            catSound("C:/Program Files/Game/src/application/Sound/Cat/Catcut.wav");
            catDefault();
            catAnimation();

        } else if (block == 6) {
            dogSound("C:/Program Files/Game/src/application/Sound/Dog/Dogcut.wav");
            dogDefault();
            dogAnimation();

        } else if (block == 8) {
            birdSound("C:/Program Files/Game/src/application/Sound/Bird/Duckcut.wav");
            birdDefault();
            birdAnimation();

        }
        addEvent();
    }

    public void random() {
        while (loopOn) {
            target = random.nextInt(area);
            if (target < area) {
                loopOn = false;
            }
        }
    }

    public void delay(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public void correctAction() {
        try {
            Runtime.getRuntime().exec("cmd /c CorrectAction.bat");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void incorrectAction() {
        try {
            Runtime.getRuntime().exec("cmd /c IncorrectAction.bat");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addEvent() {
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].addActionListener(this);
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttons[target]) {
            boardGame.dispose();
            correctAction();
            delay(1000);
            run();
        } else if (e.getSource() != buttons[target]) {
            boardGame.dispose();
            incorrectAction();
            delay(1000);
            run();
        }
    }

    public void run() {
        try {
            Runtime.getRuntime().exec("cmd /c run.bat");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // BABY
    public void babyDefault() {
        for (int i = 0; i < area; i++) {
            if (i != target) {
                buttons[i].setIcon(new ImageIcon("Graphics/baby/frame_00_delay-0.07s.png"));
            }
        }
    }

    public static void babySound(String filepath) {
        Clip music;
        try {
            File file = new File(filepath);
            AudioInputStream sound = AudioSystem.getAudioInputStream(file);
            music = AudioSystem.getClip();
            music.open(sound);
            music.start();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }

    public void babyAnimation() {
        buttons[target].setIcon(new ImageIcon("Graphics/baby/frame_00_delay-0.07s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/baby/frame_01_delay-0.06s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/baby/frame_02_delay-0.07s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/baby/frame_03_delay-0.07s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/baby/frame_04_delay-0.06s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/baby/frame_05_delay-0.07s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/baby/frame_06_delay-0.07s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/baby/frame_07_delay-0.06s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/baby/frame_08_delay-0.07s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/baby/frame_09_delay-0.07s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/baby/frame_10_delay-0.06s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/baby/frame_11_delay-0.07s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/baby/frame_12_delay-0.07s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/baby/frame_13_delay-0.06s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/baby/frame_14_delay-0.07s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/baby/frame_15_delay-0.07s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/baby/frame_16_delay-0.06s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/baby/frame_17_delay-0.07s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/baby/frame_18_delay-0.07s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/baby/frame_19_delay-0.06s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/baby/frame_20_delay-0.07s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/baby/frame_21_delay-0.07s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/baby/frame_22_delay-0.06s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/baby/frame_23_delay-0.07s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/baby/frame_24_delay-0.07s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/baby/frame_25_delay-0.06s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/baby/frame_26_delay-0.07s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/baby/frame_27_delay-0.07s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/baby/frame_28_delay-0.06s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/baby/frame_29_delay-0.07s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/baby/frame_30_delay-0.07s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/baby/frame_31_delay-0.06s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/baby/frame_32_delay-0.07s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/baby/frame_33_delay-0.07s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/baby/frame_34_delay-0.06s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/baby/frame_35_delay-0.07s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/baby/frame_36_delay-0.07s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/baby/frame_37_delay-0.06s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/baby/frame_38_delay-0.07s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/baby/frame_39_delay-0.07s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/baby/frame_40_delay-0.06s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/baby/frame_41_delay-0.07s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/baby/frame_00_delay-0.07s.png"));
    }

    // CAT
    public void catDefault() {
        for (int i = 0; i < area; i++) {
            if (i != target) {
                buttons[i].setIcon(new ImageIcon("Graphics/cat/frame_00_delay-007s.png"));
            }
        }
    }

    public static void catSound(String filepath) {
        Clip music;
        try {
            File file = new File(filepath);
            AudioInputStream sound = AudioSystem.getAudioInputStream(file);
            music = AudioSystem.getClip();
            music.open(sound);
            music.start();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }

    public void catAnimation() {
        buttons[target].setIcon(new ImageIcon("Graphics/cat/frame_00_delay-007s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/cat/frame_01_delay-006s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/cat/frame_02_delay-007s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/cat/frame_03_delay-007s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/cat/frame_04_delay-006s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/cat/frame_05_delay-007s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/cat/frame_06_delay-007s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/cat/frame_07_delay-006s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/cat/frame_08_delay-007s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/cat/frame_09_delay-007s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/cat/frame_10_delay-006s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/cat/frame_11_delay-007s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/cat/frame_12_delay-007s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/cat/frame_13_delay-006s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/cat/frame_14_delay-007s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/cat/frame_15_delay-007s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/cat/frame_16_delay-006s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/cat/frame_17_delay-007s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/cat/frame_18_delay-007s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/cat/frame_19_delay-006s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/cat/frame_20_delay-007s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/cat/frame_21_delay-007s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/cat/frame_22_delay-006s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/cat/frame_23_delay-007s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/cat/frame_24_delay-007s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/cat/frame_25_delay-006s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/cat/frame_26_delay-007s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/cat/frame_27_delay-007s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/cat/frame_28_delay-006s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/cat/frame_29_delay-007s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/cat/frame_30_delay-007s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/cat/frame_31_delay-006s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/cat/frame_32_delay-007s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/cat/frame_33_delay-007s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/cat/frame_34_delay-006s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/cat/frame_35_delay-007s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/cat/frame_36_delay-007s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/cat/frame_37_delay-006s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/cat/frame_38_delay-007s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/cat/frame_39_delay-007s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/cat/frame_40_delay-006s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/cat/frame_41_delay-007s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/cat/frame_42_delay-007s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/cat/frame_43_delay-006s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/cat/frame_44_delay-006s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/cat/frame_00_delay-007s.png"));
    }

    // DOG
    public void dogDefault() {
        for (int i = 0; i < area; i++) {
            if (i != target) {
                buttons[i].setIcon(new ImageIcon("Graphics/dog/frame_00_delay-003s.png"));
            }
        }
    }

    public static void dogSound(String filepath) {
        Clip music;
        try {
            File file = new File(filepath);
            AudioInputStream sound = AudioSystem.getAudioInputStream(file);
            music = AudioSystem.getClip();
            music.open(sound);
            music.start();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }

    public void dogAnimation() {
        buttons[target].setIcon(new ImageIcon("Graphics/dog/frame_00_delay-003s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/dog/frame_01_delay-003s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/dog/frame_02_delay-003s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/dog/frame_03_delay-003s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/dog/frame_04_delay-003s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/dog/frame_05_delay-003s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/dog/frame_06_delay-003s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/dog/frame_07_delay-003s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/dog/frame_08_delay-003s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/dog/frame_09_delay-003s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/dog/frame_10_delay-003s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/dog/frame_11_delay-003s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/dog/frame_12_delay-003s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/dog/frame_13_delay-003s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/dog/frame_14_delay-003s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/dog/frame_15_delay-003s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/dog/frame_16_delay-003s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/dog/frame_17_delay-003s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/dog/frame_18_delay-003s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/dog/frame_00_delay-003s.png"));
    }

    // BIRD
    public void birdDefault() {
        for (int i = 0; i < area; i++) {
            if (i != target) {
                buttons[i].setIcon(new ImageIcon("Graphics/bird/frame_00_delay-01s.png"));
            }
        }
    }

    public static void birdSound(String filepath) {
        Clip music;
        try {
            File file = new File(filepath);
            AudioInputStream sound = AudioSystem.getAudioInputStream(file);
            music = AudioSystem.getClip();
            music.open(sound);
            music.start();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }

    public void birdAnimation() {
        buttons[target].setIcon(new ImageIcon("Graphics/bird/frame_00_delay-01s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/bird/frame_01_delay-01s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/bird/frame_02_delay-01s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/bird/frame_03_delay-01s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/bird/frame_04_delay-01s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/bird/frame_05_delay-01s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/bird/frame_06_delay-01s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/bird/frame_07_delay-01s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/bird/frame_08_delay-01s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/bird/frame_09_delay-01s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/bird/frame_10_delay-01s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/bird/frame_11_delay-01s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/bird/frame_12_delay-01s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/bird/frame_13_delay-01s.png"));
        delay(10);
        buttons[target].setIcon(new ImageIcon("Graphics/bird/frame_00_delay-01s.png"));
    }
}