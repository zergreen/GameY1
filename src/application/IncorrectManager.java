import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IncorrectManager {
    String round;
    String block;
    int roundInt;
    int blockInt;

    public IncorrectManager() throws IOException {
        systemRound();

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

    public void systemBlock() throws IOException {
        readBlock();
        blockInt = Integer.parseInt(block);
        blockInt += 2;
        updateBlock();
    }
}