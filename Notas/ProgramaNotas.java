import java.util.Scanner;

public class ProgramaNotas
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        NotaAmericana nota = new NotaAmericana();
        
        System.out.print("Digite a nota percentual: ");
        int percentual = entrada.nextInt();
        
        nota.setPercentul(percentual);
        
        System.out.println("Grau americano: " + nota.getGrau());
        System.out.println("Nota brasileira: " + nota.getNotaBrasileira());
        
        entrada.close();
    }
}
