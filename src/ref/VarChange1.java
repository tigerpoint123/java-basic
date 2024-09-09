package ref;

public class VarChange1 {
    public static void main(String[] args) {

        int a = 10;
        int b = a;

        a = 20; // b는 여전히 10

        System.out.println(a);

        b = 30;
    }
}
