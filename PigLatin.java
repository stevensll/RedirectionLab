public class PigLatin {
    public static void main(String[] args) {
        /*
        System.out.println(pigLatinSimple("DaVId"));
        System.out.println(pigLatinSimple("aaron"));
        System.out.println(pigLatinSimple(".@#!"));
        */
        System.out.println(pigLatin("the"));
        System.out.println(pigLatin("grade"));
        System.err.println(pigLatin("wrote"));
        System.err.println(pigLatin("emu"));
        System.err.println(pigLatin("z"));
        System.err.println(pigLatin("a"));



    }
    public static String pigLatinSimple(String s){
        String newS = "";
        char first = s.charAt(0);
        if(first == 'a'|| first == 'e'|| first == 'i'|| first == 'o'||first == 'u'){
            newS = s + "hay";
        } else {
            newS = s.substring(1, s.length()) + s.charAt(0) + "ay";
        }
        return newS.toLowerCase();
    }
    public static String pigLatin(String s){
        String newS = "";
        String Digraphs [] = new String[]{"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
        if(s.length() > 1){
            String firstTwo = s.substring(0,2);
            for (String digraph : Digraphs){
                if(firstTwo.equals(digraph)){
                    newS = s.substring(2,s.length()) + firstTwo + "ay";
                }
            }
            if (newS.equals("")) newS = pigLatinSimple(s);
        } else {
            newS = pigLatinSimple(s);
        }
        return newS.toLowerCase();
    }


}
