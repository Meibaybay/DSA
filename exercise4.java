import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of names in the list: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] name = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            name[i] = scanner.nextLine();
        }
        System.out.print("Enter a name for searching: ");
        String searchName = scanner.nextLine();
        int position = -1;
        for (int i = 0; i < n; i++) {
            if (name[i].equals(searchName)) {
                position = i + 1;
                break;
            }
        }

        if (position != -1) {
            System.out.println("The position of " + searchName + " in the list is: " + position);
        } else {
            System.out.println(searchName + " does not appear in the list. Position: -1");
        }

    }
}

