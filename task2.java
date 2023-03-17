//Реализуйте очередь с помощью LinkedList со следующими методами:
//enqueue() - помещает элемент в конец очереди,
//dequeue() - возвращает первый элемент из очереди и удаляет его,
//first() - возвращает первый элемент из очереди, не удаляя.

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        LinkedList<String> linked_list = new LinkedList<>(Arrays.asList("1", "2", "5", "6", "3", "8", "10"));
        System.out.println(linked_list);
        System.out.println();
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите индекс элемента для его переноса в конец очереди: ");
        boolean flag;
        if (flag = iScanner.hasNextInt() == true) {
            int n = iScanner.nextInt();
            System.out.println(enenqueue(linked_list, n - 1));
        }
        else System.out.println("Введен некорректный индекс элемента");
        System.out.println(dequeue(linked_list));
        System.out.println(first(linked_list));
    }

    public static LinkedList enenqueue(LinkedList list, int n) { //enqueue() - помещает элемент в конец очереди,
        if (n < list.size()) {
            String temp = (String) list.get(n);
            list.remove(n);
            list.add(temp);
        } else System.out.println("Некорректный индекс");

        return list;
    }

    public static String dequeue(LinkedList list) { //dequeue() - возвращает первый элемент из очереди и удаляет его,
        if (list.size() > 0) {
            String out = (String) list.getFirst();
            list.remove(0);
            System.out.printf("Первый элемент в очереди, который удалили из листа: ");
            return out;
        } else {
            return "Лист пустой";
        }
    }

    public static String first(LinkedList list) { //first() - возвращает первый элемент из очереди, не удаляя.
        //list.getFirst();
        String out = (String) list.get(0);
        System.out.printf("Первый элемент в очереди: ");
        return out;
    }
}
