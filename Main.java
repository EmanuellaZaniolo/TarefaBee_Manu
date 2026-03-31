import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Menina {
 
    private Set<Integer> cartasu;

    public Menina() {
        this.cartasu = new HashSet<>();
    }

    public void adicionarCarta(int carta) {
        this.cartasu.add(carta);
    }

    public Set<Integer> getCartas() {
        return this.cartasu;
    }

    public int contarCartasParaTroca(Menina outraMenina) {
        int cartast = 0;
        for (Integer carta : this.cartasu) {
            if (!outraMenina.getCartas().contains(carta)) {
                cartast++;
            }
        }
        return cartast;
    }
}
   

public class Main {
    
       public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
 
        while (true) {
            int qtdA = scanner.nextInt();
            int qtdB = scanner.nextInt();
            if (qtdA == 0 && qtdB == 0) {
                break;
            }
            Menina a = new Menina();
            Menina b = new Menina();

            for (int i = 0; i < qtdA; i++) {
                a.adicionarCarta(scanner.nextInt());
            }

            for (int i = 0; i < qtdB; i++) {
                b.adicionarCarta(scanner.nextInt());
            }

            int exclusivasAlice = a.contarCartasParaTroca(b);
            int exclusivasBeatriz = b.contarCartasParaTroca(a);

            int maxTrocas = Math.min(exclusivasAlice, exclusivasBeatriz);

            System.out.println(maxTrocas);
        }
        
    
    }
}