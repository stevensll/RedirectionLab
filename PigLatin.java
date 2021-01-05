public class PigLatin {
    public static void main(String[] args) {
        
    }
    public static String pigLatinSimple(String s){
        String newS = "";
        char first = s.charAt(0);
        if(first == 'a'|| first == 'e'|| first == 'i'|| first == 'o'||first == 'u'){
            newS = s.toLowerCase() + "hay";
        } else {
            s = s.substring(1, s.length()) + s.charAt(0) + "ay";
        }
        return newS;
    }
}
