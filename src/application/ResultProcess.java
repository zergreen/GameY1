import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ResultProcess {
    String block;
    String score;
    int scoreInt;

    public ResultProcess() {
        readBlock();
        readScore();
        if (block.equals("10")) {
            resultOutput();
            delay(1000000);
        }
    }

    public void delay(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public void readBlock() {
        try (BufferedReader br = new BufferedReader(new FileReader(new File("u.block.txt")))) {
            String textRound = null;
            while ((textRound = br.readLine()) != null) {
                block = textRound;
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void readScore() {
        try (BufferedReader br = new BufferedReader(new FileReader(new File("u.score.txt")))) {
            String textRound = null;
            while ((textRound = br.readLine()) != null) {
                score = textRound;
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void resultOutput() {
        scoreInt = Integer.parseInt(score);
        if (block.equals("10")) {
            System.out.println("*************************************************************************");
            System.out.println("                       Health examination results                        ");
            System.out.println("*************************************************************************");
            System.out.println(" $ Conditions for the assessment");
            System.out.println(" Score < 60  : Poor health");
            System.out.println(" Score < 120 : Normal health");
            System.out.println(" Score >= 120 : Good health");
            System.out.println("*************************************************************************");
            System.out.print("Your score is " + score + " || ");
            if (scoreInt < 60) {
                System.out.println("Poor health!");
            } else if (scoreInt < 120) {
                System.out.println("Normal health!");
            } else {
                System.out.println("Good health!");
            }
            System.out.println("*************************************************************************");
        }
    }
}