import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length...: ");
        int size = input.nextInt();
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter values...:");

        for (int i =  0; i < size; i++) {
            list.add(input.nextInt());
        }
        System.out.println(sum(list));
        System.out.println(sub(list));
        System.out.println(multi(list));
    }

    public static Integer sum(List<Integer> list) {
        Integer sum = 0;

        for (Integer x : list) {
            sum += x;
        }

        return sum;
    }

    public static Integer sub(List<Integer> list) {
        Integer sub = list.get(0)-list.get(1);
        return sub;
    }

    public static Integer div(List<Integer> list){
        Integer div = 0;
        int a = list.get(0);
        int b= list.get(1);

        if(b==0)
            return -1;
        else
            div = a/b;

        return div;
    }
    public static Integer multi(List<Integer> list) {
        Integer multi=1;

        for (Integer x : list) {
            multi *= x;
        }

        return multi;
    }
}
