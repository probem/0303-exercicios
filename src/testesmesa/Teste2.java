package testesmesa;

public class Teste2 {
    public static void main(String[] args) {
        int a[] = {10, 20, 30};
        int i = 0;

        for(int b : a){
            i += b;
            b++;

            if(i % 2 == 0){
                i--;
            }
        }

        System.out.println(i);
    }
}
