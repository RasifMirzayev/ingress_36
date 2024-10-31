package IngressEdu;

import java.util.Arrays;
import java.util.ArrayList;
public class Task1 {
    public static void main(String[] args) {
        String[] array = {"Yanvar", "Fevral","Mart","Aprel",};
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));

        arrayList.remove("Yanvar");
        arrayList.remove(arrayList.size()-1);
        arrayList.set(0,"Aprel" );
        System.out.println(arrayList);
        if (arrayList.contains("Fevral")) {
            System.out.println(arrayList.indexOf("Fevral"));
        }

        arrayList.clear();
        System.out.println(arrayList);
    }
}