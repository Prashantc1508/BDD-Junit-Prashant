import java.util.ArrayList;
import java.util.List;

public class testIris {

    public static void main(String[] args){

        //find all possible substrings of a String in java “abb”
        String name = "abb";

        System.out.println("All substrings of \"" + name + "\":");
        for (int i = 0; i < name.length(); i++) {
            for (int j = i + 1; j <= name.length(); j++) {
                System.out.println(name.substring(i, j));
            }
        }
    }
}
