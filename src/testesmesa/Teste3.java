package testesmesa;

public class Teste3 {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int c = 15;

        for(int i = 0; a < 10 && c > 5; i++){
            a += i;
            c -= b + i;
            i++;
        }

        System.out.println(a);
    }
}
