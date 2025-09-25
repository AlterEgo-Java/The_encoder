import java.util.Scanner;

public class Cypher {


    public static void userInterface() throws InterruptedException {
        boolean appEnd = false;
        Scanner scanner = new Scanner(System.in);
        String userAnswear;
        Thread.sleep(1000);
        System.out.println("======Класс шифра запущен=====");

        while (!appEnd) {
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

    private static void  encrypt(String userAnswear) {
        String[][] keyMass = {
                {"А", "Б", "В", "Г", "Д", "Е", "Ё", "Ж", "З", "И", "Й", "К", "Л", "М", "Н", "О", "П", "Р", "С", "Т", "У", "Ф", "Х", "Ц", "Ч", "Ш", "Щ", "ъ", "Ы", "Ь", "Э", "Ю", "Я", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ".", " ", ",", "!", "?"},
                {"Г", "Д", "Е", "Ё", "Ж", "З", "И", "Й", "К", "Л", "М", "Н", "О", "П", "Р", "С", "Т", "У", "Ф", "Х", "Ц", "Ч", "Ш", "Щ", "ъ", "Ы", "Ь", "Э", "Ю", "Я", "А", "Б", "В", "3", "4", "5", "6", "7", "8", "9", "0", "1", "2", "/", "#", "*", "%", "@"}
        };
        String[] massForCrypt = userAnswear.split("");
        String[] massForUnswear = new String[massForCrypt.length];

        for (int i = 0; i < massForCrypt.length; i++) {
            for (int x = 0; x < keyMass[0].length; x++) {
                if (massForCrypt[i].equalsIgnoreCase(keyMass[0][x])) {
                    char checkletter = massForCrypt[i].charAt(0);
                    if (Character.isUpperCase(checkletter)) {
                        massForUnswear[i] = keyMass[1][x];
                    }else{
                        massForUnswear[i]= keyMass[1][x].toLowerCase();
                    }

                }
            }
        }
       String systemUnswear = "";
        for (String s : massForUnswear) {
            systemUnswear = systemUnswear.concat(s);
        }
        System.out.println(systemUnswear);

    }
}
