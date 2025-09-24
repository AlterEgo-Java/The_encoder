import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userUnswear = scanner.nextLine();
        String[] SystemUnswear = userUnswear.split("");
        System.out.println(Arrays.toString(SystemUnswear));
    }
}