/* 
 * Copyright 2019 Manu Portolés.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java;

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