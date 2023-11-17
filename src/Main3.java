import java.util.InputMismatchException;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        int x1 = 10, x2 = 0, res = 0;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("введите число");
            x2 = scanner.nextInt();
            res = x1 / x2;

            ///// ПОРЯДОК НАПИСАНИЯ ВАЖЕН  в первую очередь пишем отлавливаем исключение
            /////конкретных подклассов
            //в последнем  catch


        } catch (InputMismatchException e) {          //// e  - эксепшен
            System.out.println("вы ввели не число");
        } catch (ArithmeticException e) {
            System.out.println("деление на 0!");

        } catch (Exception e) {
            System.out.println("произошла иная непредвиденная ошибка");
            System.out.println(e);  //// е - exception -эксепшен

        }
        System.out.println("res=" + res);
    }
}
