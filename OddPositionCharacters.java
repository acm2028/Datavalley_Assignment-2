import java.util.Scanner;
public class OddPositionCharacters {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        String text = sc.next();
        
        for (int i = 0; i < text.length(); i++) {
            if (i % 2 != 0 && text.charAt(i) != ' ') {
                System.out.print(text.charAt(i));
            }
        }
    }
}