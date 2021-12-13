import java.util.ArrayList;
import java.util.Scanner;

public class lab4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов в массиве: ");
        int n = in.nextInt();

        ArrayList <Integer> list = new ArrayList<>();
        System.out.print("Введите элементы массива: ");
        for (int i = 0; i < n; i++) {
            int j = in.nextInt();
            list.add(j);
        }
        System.out.println("Массив до удаления элемента: ");
        for (Integer j : list) {
            System.out.print(j + " ");
        }
        System.out.println();

        System.out.print("Введите элемент, который хотите удалить: ");
        Integer x = in.nextInt();
        list.remove(x);

        System.out.println("Массив после удаления элемента: ");
        for (Integer j : list) {
            System.out.print(j + " ");
        }
        in.close();
    }
}
