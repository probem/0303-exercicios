package testesmesa;

public class Teste4 {
    public static void main(String[] args) {
        int a = 0;
        int b = 5;

        for(int i = 0; i < 40; i++){
            a += fazer(i);
            i += a + b++;
        }

        System.out.println(a);
    }

    private static int fazer(int x){
        return x + 5;
    }
}
