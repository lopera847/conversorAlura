import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conversor conversor = new Conversor();

        while (true) {
            System.out.println("Selecciona una opción:");
            System.out.println("1. Dólar a Peso Argentino");
            System.out.println("2. Peso Argentino a Dólar");
            System.out.println("3. Dólar a Real Brasileño");
            System.out.println("4. Peso Brasileño a Dólar");
            System.out.println("5. Dólar a Peso Colombiano");
            System.out.println("6. Peso Colombiano a Dólar");
            System.out.println("7. Salir");

            int opcion = scanner.nextInt();
            if (opcion == 7) {
                System.out.println("¡Hasta luego!");
                break;
            } else if (opcion < 1 || opcion > 6) {
                System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
                continue;
            }

            System.out.println("Ingresa el monto a convertir:");
            double monto = scanner.nextDouble();

            switch (opcion) {
                case 1:
                    conversor.convertirDolarAPesoArgentino(monto);
                    break;
                case 2:
                    conversor.convertirPesoArgentinoADolar(monto);
                    break;
                case 3:
                    conversor.convertirDolarARealBrasileño(monto);
                    break;
                case 4:
                    conversor.convertirPesoBrasileñoADolar(monto);
                    break;
                case 5:
                    conversor.convertirDolarAPesoColombiano(monto);
                    break;
                case 6:
                    conversor.convertirPesoColombianoADolar(monto);
                    break;
            }
        }
        scanner.close();
    }
}

