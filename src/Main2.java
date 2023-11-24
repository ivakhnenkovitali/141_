import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int x1 = 10, x2 = 0, res = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число");
        x2 = scanner.nextInt();




        try {
            res = x1 / x2;

            /////отлавливать исключение можно через переменную суперкласса
            ////можно отлавливать исключение можно через переменную  спуперкласа
            /////кокда конкретное исключение можно котороые скорее всего здесь могут


        } catch (Exception e) {    ////e --- exception эксепшен
            System.out.println(e.getMessage());
            System.out.println(e);
            e.printStackTrace();

        }
    }
}
