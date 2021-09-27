import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<String>();
        list1.add("Elif");

        List<String> list2 = new ArrayList<String>();
        list2.add("Rana");
        list2.add("Yılancı");

        List<String> join = new ArrayList<String>();
        join.addAll(list1);
        join.addAll(list2);

        System.out.println(join);
    }
}
