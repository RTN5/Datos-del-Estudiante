/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datosdelestudiante1;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Datosdelestudiante1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner objetivo=new Scanner(System.in);
        System.out.println("Ingrese nombre de la Universidad:");
        String nombreUniversidad = objetivo.nextLine();
        // Universidad de las Fuerzas Armadasa ESPE
        System.out.println("Ingrese departamento:");
        String departamento=objetivo.nextLine();
        // Mini departamenteo
        System.out.println("Ingrese la carrera:");
        String carrera=objetivo.nextLine();
        // ing. Automotriz
   
        System.out.println("Ingrese la materia:");
        String materia=objetivo.nextLine();
        // Programacion 
     
        System.out.println("Ingrese nombres del estudiante:");
        String nombreestudiante=objetivo.nextLine();
        
        System.out.println("Ingrese nivel educativo:");
        String niveleducativo=objetivo.nextLine();
        
        System.out.println("Ingrese numero de cedla:");
        String numerocedula=objetivo.nextLine();
        
        
        System.out.println("Ingrese pais:");
        String pais=objetivo.nextLine();
        
        System.out.println("Ingrese ciudad:");
        String ciudad=objetivo.nextLine();
        
        System.out.println("Ingrese canton:");
        String canton=objetivo.nextLine();
        
        System.out.println("Ingrese provincia:");
        String provincia=objetivo.nextLine();
        
        System.out.println("Ingrese ID");
        String ID=objetivo.nextLine();
        
        System.out.println("Ingrese sexo:");
        String sexo=objetivo.nextLine();

        
    }
    
}
