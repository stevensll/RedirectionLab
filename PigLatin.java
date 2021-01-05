import java.util.*;
public class PigLatin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            Scanner line  = new Scanner(in.nextLine());
            while (line.hasNext()){
                System.out.print(pigLatinBest(line.next()));
                if (line.hasNext()) System.out.print(" ");
            }
            System.out.println();
        }
        in.close();
    }
    public static String pigLatinSimple(String s){
        String newS = "";
        String lowS = s.toLowerCase();
        char first = lowS.charAt(0);
        if(first == 'a'|| first == 'e'|| first == 'i'|| first == 'o'||first == 'u'){
            newS = s + "hay";
        } else {
            newS = lowS.substring(1, lowS.length()) + lowS.charAt(0) + "ay";
        }
        return newS;
    }
    public static String pigLatin(String s){
        String newS = "";
        String Digraphs [] = new String[]{"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
        if(s.length() > 1){
            String firstTwo = s.substring(0,2).toLowerCase();
            for (String digraph : Digraphs){
                if(firstTwo.equals(digraph)){
                    newS = s.substring(2,s.length()).toLowerCase() + firstTwo + "ay";
                }
            }
            if (newS.equals("")) newS = pigLatinSimple(s);
        } else {
            newS = pigLatinSimple(s);
        }
        return newS;
    }

    public static String pigLatinBest(String s){
        String newS = "";
        char last = s.charAt(s.length()-1);
        if(!(Character.isLetter(s.charAt(0)))) newS = s;
         else if (!Character.isLetter(last) && !Character.isDigit(last)){
            String temp = s.substring(0, s.length()-1);
            newS = pigLatin(temp) + last;
        }else newS = pigLatin(s); 
        return newS.toLowerCase();
    }
}
