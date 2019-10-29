/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Manu Portolés
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        boolean permisoOK;

        try {

            System.out.print("Permiso de circulación ...: ");

            
            permisoOK = SCN.nextBoolean();

            System.out.printf("%s%s%n", "Permiso de circulación ...: ", permisoOK);

        } catch (Exception e) {

            System.out.println("ERROR: Entrada incorrecta");

        } finally {

            SCN.nextLine();
        }

    }

}
