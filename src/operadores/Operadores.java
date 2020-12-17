package operadores;

import java.util.Scanner;

public class Operadores {

    public static void main(String[] args) {

        System.out.println("Digite la cantida de dinero");
        Scanner dinero = new Scanner(System.in);
        double N = dinero.nextDouble();

        double G = N;
        double L = N / 2;
        double J = N / 4;

        System.out.println("Guillermo tiene" + G);
        System.out.println("Luis tiene     " + L);
        System.out.println("Juan tiene     " + J);

        double suma = G + L + J;

        System.out.println("\nEL TOTAL ES " + suma);

        //.................... OTRA FORMA DEFINIR ANTES VARIABLES.........
        // DEFINIENDO LAS VARIABLES
        double g, l, j, TOTAL;

        System.out.println("INTRODUZCA LA CANTIDAD DE DINERO");

        Scanner money = new Scanner(System.in);
        g = money.nextDouble();
        l = g / 2;
        j = (l+g) / 2;

        System.out.println("Guillermo tiene" + g);
        System.out.println("Luis tiene     " + l);
        System.out.println("Juan tiene     " + j);

        TOTAL = g + l + j;

        System.out.println("EL TOTAL ES " + TOTAL);

    }

}
