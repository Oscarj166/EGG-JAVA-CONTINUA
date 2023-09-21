/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.Perro;
import java.util.ArrayList;
import java.util.Scanner;

public class PerroServicio {
  private ArrayList<Perro> perros = new ArrayList<>();

    public void guardarRazasPerros() {
        Scanner scanner = new Scanner(System.in);
        String razaPerro;

        do {
            System.out.print("Ingrese la raza del perro: ");
            razaPerro = scanner.nextLine();
            perros.add(new Perro(razaPerro));

            System.out.print("¿Desea agregar otra raza de perro? (s/n): ");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("n")) {
                break;
            }
        } while (true);
    }

    public String obtenerRazasPerros() {
        StringBuilder sb = new StringBuilder();
        for (Perro perro : perros) {
            sb.append(perro.getRaza()).append("\n");
        }
        return sb.toString();
    }
}
