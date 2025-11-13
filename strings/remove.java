package strings;

public class remove {
    public static void main(String[] args) {
        String s="take12% *&u ^$#forward";
       StringBuilder result = new StringBuilder();
        for(char c:s.toCharArray()){
if (Character.isLetter(c)){
    result.append(c);
}
        }
        System.out.println(result.toString());

    }
}
