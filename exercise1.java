import java.util.Scanner;
public class exercise1 {
    public static void main (String [] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        int count = 0;
        for (int i = 0; i<name.length(); i++){
            if(name.charAt(i) != ' ') {
                count++;
            }
        }
        System.out.println("The number of characters:" + count);
    }
}
