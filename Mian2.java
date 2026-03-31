import java.util.Scanner;

class PalavraChave {
    private String texto;
    private int valor;

    public PalavraChave(String texto, int valor) {
        this.texto = texto;
        this.valor = valor;
    }

    public String getTexto() {
        return texto;
    }

    public int getValor() {
        return valor;
    }
    
}
class Dicionario {
    private PalavraChave[] palavras;
    private int i;

    public Dicionario(int tamanho) {
        this.palavras = new PalavraChave[tamanho];
        this.i = 0;
    }
 
    public void adicionarPalavra(String texto, int valor) {
        this.palavras[i] = new PalavraChave(texto, valor);
        this.i++;
    }

    public int consultarValor(String textoBuscado) {
        for (int i = 0; i < this.i; i++) {
            if (this.palavras[i].getTexto().equals(textoBuscado)) {
                return this.palavras[i].getValor();
            }
        }
        return 0; 
    }
}

public class Mian2 {
 
 public static Scanner LER = new Scanner(System.in);

public static void main(String[] args) {
        int m = LER.nextInt();
        int n = LER.nextInt();

        Dicionario dicionario = new Dicionario(m);

        for (int i = 0; i < m; i++) {
            String palavra = LER.next();
            int valor = LER.nextInt();
            dicionario.adicionarPalavra(palavra, valor);
        }

        for (int i = 0; i < n; i++) {
            int salarioTotal = 0;

          
            while (true) {
                String palavraLida = LER.next();
                if (palavraLida.equals(".")) {
                    break;
                }
                salarioTotal += dicionario.consultarValor(palavraLida);
            }
            System.out.println(salarioTotal);
        }

    }
}
