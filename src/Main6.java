public class Main6 {
    public static void main(String[] args) {

        int[] arr1 = {4, 5, 6, 7};
        int[] arr2 = {};
        int[] arr3 = null;

        System.out.println("arr1: " + arrayAvg(arr1));
        System.out.println("arr2: " + arrayAvg(arr2));
        System.out.println("arr3: " + arrayAvg(arr3));

    }
/////пример обработки иключений внутри метода
    ////не всегда удобна если метод возврощает какое либо значение или результат


    public static int arrayAvg(int[] arr) {
        int avg = 0;
        try {
            for (int elem : arr) {
                avg += elem;



            }
            avg /= arr.length;
        } catch (NullPointerException e) {
            System.out.println("массив null");
        } catch (ArithmeticException e) {
            System.out.println("деление на 0");
        }
        return avg;
    }

}
