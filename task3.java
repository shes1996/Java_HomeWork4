//В калькулятор добавьте возможность отменить последнюю операцию.
//***Дополнительно*** каскадная отмена - отмена нескольких операций

import java.util.Scanner;
import java.util.Stack;

public class task3 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(); //хранилище результатов
        Scanner num1 = new Scanner(System.in);
        Scanner act = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);

        System.out.printf("enter the number (ex: 5):  ");
        while (num1.hasNextInt() != true) {
            System.out.println("Incorrect number");
            num1 = new Scanner(System.in);
        }
        int x = num1.nextInt();

        System.out.printf("enter the action +, -, *, / or mod: ");
        String action = act.nextLine();

        System.out.printf("enter the number (ex: 5): ");
        while (num2.hasNextInt() != true) {
            System.out.println("Incorrect number");
            num2 = new Scanner(System.in);
        }
        int y = num2.nextInt();
        System.out.println("result:");
        System.out.println(calc(x, y, action, stack));

        while (true) {
            Scanner act2 = new Scanner(System.in);
            Scanner num3 = new Scanner(System.in);
            System.out.printf("enter the action +, -, *, / or mod. Enter 'stop' to exit. Enter 'cansel' to cansel. ");
            String action2 = act2.nextLine();
            if (action2.contains("+") || action2.contains("-") || action2.contains("mod") || action2.contains("/") || action2.contains("*")) {
                System.out.println("enter the number (ex: 5): ");
                int z = num3.nextInt();
                System.out.println(calc(stack.get(stack.size() - 1), z, action2, stack));
                System.out.println(stack);
                System.out.println("result:");
                System.out.println(stack.get(stack.size() - 1));
            } else if (action2.contains("cansel") & stack.size() > 1) {
                System.out.printf("enter the action +, -, *, / or mod. Enter 'cansel' to cansel. Enter 'stop' to exit. ");
                String action3 = act2.nextLine();
                stack.pop();
                System.out.println("enter the number (ex: 5): ");
                int z = num3.nextInt();
                System.out.println("result:");
                System.out.println(calc(stack.pop(), z, action3, stack));

            } else if (action2.contains("stop")) {
                break;
            }
        }
    }

    public static Integer calc(int x, int y, String action, Stack stack) {
        int out = 0;
        if (action.contains("+")) {
            out = x + y;
        } else if (action.contains("-")) {
            out = x - y;
        } else if (action.contains("*")) {
            out = x * y;
        } else if (action.contains("/")) {
            out = x / y;
        } else if (action.contains("mod")) {
            out = x % y;
        }

        stack.push(out);
        return out;

    }
}
