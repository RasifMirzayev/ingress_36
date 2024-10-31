package Lesson15;


public class box {

    int height;
    int weight;
    int lenght;

    public box(int height) {
        this(height, 2);
    }

    public box(int height, int weight) {
        this(height, weight, 3);
    }

    public box(int height, int weight, int lenght) {
        this.height = height;
        this.weight = weight;
        this.lenght = lenght;
    }

    public static void main(String[] args) {
        box box = new box(2);
        System.out.println(box.height);
        System.out.println(box.weight);
        System.out.println(box.lenght);
    }

}





