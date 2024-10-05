import java.util.Scanner;

public class calcularPotencias {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int desarrolloPotencia = 0;
        int resultadoPotencia;

        System.out.print("Ingrese por favor el número de la base");
        int numBase = scanner.nextInt();
        System.out.print("Ingrese por favor el número de la base");
        int numPotencia = scanner.nextInt();

        for (int i = 0; i<numPotencia; i++){
            desarrolloPotencia = numBase*numBase;
            resultadoPotencia = desarrolloPotencia+i;
        }

        System.out.println("El resultado es: "+resultadoPotencia);

        Scanner.close();

    }
    
}
