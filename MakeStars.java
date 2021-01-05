import java.util.*;
import java.io.*;
public class MakeStars{
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(args[0]);
        Scanner input = new Scanner(file);
        while (input.hasNextLine()){
            String line = input.nextLine();
            String lineStarred = ""; 
            for(int i = 0; i<line.length();i++){
                char c = line.charAt(i);
                if (c != ' '){
                    c = '*';
                }
                lineStarred+=c;
            }
            System.out.println(lineStarred);
        }        
    }
}