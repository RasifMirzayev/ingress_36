package IngressAzz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> sb = new ArrayList<>();
        List<String> sb1= new ArrayList<>();
        sb1.add("BMW");
        sb1.add("Mercedes");
        sb1.add("Volvo");

        sb.add("BMW");
        sb.add("Mercedes");
        sb.add("Volvo");
        System.out.println(sb.equals(sb1));

        System.out.println(sb);

        sb.set(2,"NolYeddi");
        sb.remove(1);
        System.out.println(sb);
        Collections.sort(sb);








    }
}
