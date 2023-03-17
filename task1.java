//1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void),
//который вернет “перевернутый” список.
import java.util.Arrays;
import java.util.LinkedList;

public class task1 {
    public static void main(String[] args) {
        LinkedList<String> linked_list = new LinkedList<>(Arrays.asList("1", "2", "5", "6", "3", "8", "10"));

        System.out.println(reverse(linked_list));
    }

    public static LinkedList reverse(LinkedList<String> list){
        for (int i = list.size(); i >= 0; i--) {
            list.add(i, list.getFirst());
            list.remove(list.getFirst());
        }
    return list;
    }
}

