package vtb.skripova;

public class Main {

    public static void main(String[] args) {
        //вывод массива на экран
        System.out.println("Первоначальный массив");
        int[] Arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i] + " ");
            }
        System.out.println(" ");
        System.out.println("Реверс массива");
        revers(Arr);
    }

    //метод реверса массива
    public static void revers(int[] mas) {
        for (int i = 0; i < mas.length/2; i++) {
            int x=mas[i];
            mas[i]=mas[mas.length-1-i];
            mas[mas.length-1-i]=x;
        }
        for (int i=0; i<mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
    }
}