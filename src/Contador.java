import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        System.out.println("Digite 2 números.");
        
        try (Scanner storage = new Scanner(System.in)) {
            System.out.print("Primeiro número: ");
            int n1 = storage.nextInt();
            System.out.print("Segundo número: ");
            int n2 = storage.nextInt();

            try{
                contagem(n1, n2);
            }catch(ParametrosInvalidosException e){
                e.printStackTrace();
            }
        }
    }

    static void contagem (int n1, int n2) throws ParametrosInvalidosException{
        if(n1 > n2){
            System.out.println("O primeiro número deve ser menor que o segundo");
            System.out.println(" ");
            throw new ParametrosInvalidosException();
        }else{
            int data = n2 - n1;

            for(int i = 1; i < data; i++){
                System.out.println(i);
            }
            System.out.println(data);
        }

        
    }
}
