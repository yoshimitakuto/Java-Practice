import java.util.Scanner;

public class prac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("数値を入力してください: ");
        String input = scanner.nextLine();

        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            char digit = input.charAt(i);

            // 各数字に対する条件に従って値を置き換え
            switch (digit) {
                case '0':
                    sum += 12;
                    break;
                case '1':
                    sum += 3;
                    break;
                case '2':
                    sum += 4;
                    break;
                case '3':
                    sum += 5;
                    break;
                case '4':
                    sum += 6;
                    break;
                case '5':
                    sum += 7;
                    break;
                case '6':
                    sum += 8;
                    break;
                case '7':
                    sum += 9;
                    break;
                case '8':
                    sum += 10;
                    break;
                case '9':
                    sum += 11;
                    break;
                default:
                    System.out.println("無効な数字が含まれています: " + digit);
            }
        }

        System.out.println("置き換え後の合計値: " + sum);
    }
}
