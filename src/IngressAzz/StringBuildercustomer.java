package IngressAzz;

public class StringBuildercustomer {

    public static void main(String[] args) {

        String text = "Hello, Java! How are you?";
        String[] words = text.split(" ");

        StringBuilder netice = new StringBuilder();

        for (int i = words.length-1; i >=0 ; i--) {
            String word = words[i].replaceAll("Java", "Ingress");
            word= word.replaceAll("!", " ");
            netice.append(word).append(" ");

        }
        netice.insert(0, "Welcome ");
        System.out.println(netice.toString().trim());


    }
}
