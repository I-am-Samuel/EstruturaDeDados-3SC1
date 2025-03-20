package simplesmente;

import java.util.Scanner;
import dados.Item;

public class TestarListaSimples {

    static ListaSimples lista = new ListaSimples();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            System.out.print("Digite o dado: ");
            int dado = scanner.nextInt();
            lista.inserirUltimo(new Item(dado));
        }
        System.out.print(lista);
    }
}