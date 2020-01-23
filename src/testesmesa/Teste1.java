package testesmesa;

public class Teste1 {
    public static void main(String[] args) {
        int j = 0;

        for(int i = 0; i < 3; i++){
            j++;
            i+=j;

            System.out.println(i);
        }

        System.out.println(j);
    }
}
