import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CorrectManager {
    String score;
    String round;
    String block;
    int scoreInt;
    int roundInt;
    int blockInt;

    public CorrectManager() throws IOException {
        systemRound();
        systemScore();
    }

    public void readScore() {
        try (BufferedReader br = new BufferedReader(new FileReader(new File("u.score.txt")))) {
            String textScore = null;
            while ((textScore = br.readLine()) != null) {
                score = textScore;
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void readRound() {
        try (BufferedReader br = new BufferedReader(new FileReader(new File("u.round.txt")))) {
            String textRound = null;
            while ((textRound = br.readLine()) != null) {
                round = textRound;
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void readBlock() {
        try (BufferedReader br = new BufferedReader(new FileReader(new File("u.block.txt")))) {
            String textBlock = null;
            while ((textBlock = br.readLine()) != null) {
                block = textBlock;
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void updateScore() throws IOException {
        File myFile = new File("C:/Program Files/Game/src/application", "u.score.txt");
        myFile.createNewFile();
        BufferedWriter output = new BufferedWriter(new FileWriter(myFile));
        output.write("" + scoreInt);
        output.close();
    }

    public void updateRound() throws IOException {
        File myFile = new File("C:/Program Files/Game/src/application", "u.round.txt");
        myFile.createNewFile();
        BufferedWriter output = new BufferedWriter(new FileWriter(myFile));
        output.write("" + roundInt);
        output.close();
    }

    public void updateBlock() throws IOException {
        File myFile = new File("C:/Program Files/Game/src/application", "u.block.txt");
        myFile.createNewFile();
        BufferedWriter output = new BufferedWriter(new FileWriter(myFile));
        output.write("" + blockInt);
        output.close();
    }

    public void systemRound() throws IOException {
        readRound();
        roundInt = Integer.parseInt(round);
        roundInt += 1;
        if (roundInt == 5 && blockInt <= 6) {
            roundInt = 0;
            systemBlock();
        }
        updateRound();
    }

    public void systemScore() throws IOException {
        readScore();
        scoreInt = Integer.parseInt(score);
        scoreInt += 10;
        updateScore();
    }

    public void systemBlock() throws IOException {
        readBlock();
        blockInt = Integer.parseInt(block);
        blockInt += 2;
        updateBlock();
    }
}