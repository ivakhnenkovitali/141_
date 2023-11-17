import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        int x1 = 10, x2 = 0, res = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число");
        x2 = scanner.nextInt();

        try {

            ////// try - блок будет выполнятся до первой исключительной ситуацией
            res = x1 / x2;
        } catch (ArithmeticException exception) {  ///// рабоает колько при исключительной ошибке


            /////выводит сообщение с которым был выдано исключение
            System.out.println(exception.getMessage());
            System.out.println("------------");
            /////toString() --доет о имени класса и пути к нему + поясняющее собщение
            System.out.println(exception);
            System.out.println("---------------");

            ///// printStackTrace() --- выводит информацию при помощи   System.err.println
            /// выводит информации о классе исключения + сообщение+ детализация какая цепочка методов
            //// и в строках привела  к исключению

            exception.printStackTrace();


            System.out.println(" никто не запрещает писать исключение так");
            /////
            x2 = 1; /////в случае ввода 0 -----  переприсвоим на 1 -----

        }finally {
            System.out.println("finally  работает в любой ситуации");  //// не обязательно
        }



        System.out.println("res = " +res);

    }
}
