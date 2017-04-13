package arraylistpessoa;

import java.io.IOException;
import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPessoa {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        ArrayList<PessoasContato> lista = new ArrayList<>();
        Metodos metodo1 = new Metodos ();
        
        while (true) {

            Metodos.menu();
            Integer opcao = scan.nextInt();

            switch (opcao) {
              
                case 1:
                   metodo1.Insercao();
                    break;
                case 2:
                    metodo1.edicao();
                    break;
                case 3:
                   metodo1.remocao();
                    break;
                case 4:
                    metodo1.impressao();
                    break;
                case 0:
                    
                    exit (0);break;
                    
                default : System.out.println ("\nOpcao Invalida");break;
                
            }

        }

    }

}
