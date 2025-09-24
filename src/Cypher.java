import java.util.Scanner;

public class Cypher {

    public String userAnswear;
    private String SystemAnsear;

    public static void userInterface() throws InterruptedException {
        boolean appEnd = false;
        Scanner scanner = new Scanner(System.in);
        String userAnswear;
        Thread.sleep(1000);
        System.out.println("======Класс шифра запущен=====");

        while (appEnd != true) {


            Thread.sleep(1500);
            System.out.println("Введите цифру для выбора действия!");
            System.out.println("1. Зашифровать текст 2. Расшифровать текст");
            System.out.println("3. Выйти");

            userAnswear = scanner.nextLine();
            switch (userAnswear) {
                case "1":
                    System.out.println("Введите текст для шифрования");
                    userAnswear = scanner.nextLine();
                    encrypt(userAnswear);
                break;
                    case "2":
                        System.out.println("error");
                        break;
                case "3":
                    appEnd = true;
                    break;
            }
        }
    }
    private static String encrypt(String userAnswear) {
        String[][] keyMass = {
                {"А", "Б", "В", "Г", "Д", "Е", "Ё", "Ж", "З", "И", "Й", "К", "Л", "М", "Н", "О", "П", "Р", "С", "Т", "У", "Ф", "Х", "Ц", "Ч", "Ш", "Щ", "ъ", "Ы", "Ь", "Э", "Ю", "Я", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ".", " ", ",", "!", "?"},
                {"Г", "Д", "Е", "Ё", "Ж", "З", "И", "Й", "К", "Л", "М", "Н", "О", "П", "Р", "С", "Т", "У", "Ф", "Х", "Ц", "Ч", "Ш", "Щ", "ъ", "Ы", "Ь", "Э", "Ю", "Я", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "А", "Б", "В", "/", "#", "*", "%", "@"}
        };
        String[] massForCrypt = userAnswear.split("");
        for (int i = 0; i < massForCrypt.length; i++) {
            System.out.println(massForCrypt[i]);
        }


        return "";

    }
}
