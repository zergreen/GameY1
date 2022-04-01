import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ResetProcess {
    int scoreInt = 0;
    int roundInt = 0;
    int blockInt = 2;

    public ResetProcess() throws IOException {
        updateBlock();
        updateRound();
        updateScore();
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
}
