package com.ht08;

import java.util.Scanner;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Vector<Paciente> pacienteEmergencia = new Vector<>();
        VectorHeap pacientes = new VectorHeap();
        HospitalVectorQueue emergenciaVectorQueue;

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        boolean proceed = false;

        System.out.println("Bienvenido a sala de emergencias");
        while(opcion!=3) {
            System.out.println("¿Qué deseas realizar?");
            System.out.println("1. Ingresar pacientes con implementación 1 \n2. Ingresar pacientes con implementación 2");
            System.out.println("3. Salir");
            opcion = isNumberC(scanner);

            if(opcion>=1 && opcion<=2) {
                System.out.println("Ingrese el nombre del archivo con los pacientes en lista de espera");
                String nombreArchivo = scanner.nextLine();
                pacientes = new VectorHeap(FileManager.readFile(nombreArchivo));
                pacienteEmergencia = FileManager.readFile(nombreArchivo);
                if(!pacientes.isEmpty()) {
                    proceed = true;
                } else {
                    proceed = false;
                    System.out.println("El archivo de texto se encuentra vacío");
                }
            }

            if(proceed == true) {
                int count = 0;
                int pacientesInicial  = pacientes.size();
                boolean input = true;
                int opcionContinue = 0;
                switch (opcion) {
                    case 1: // Implementación con VectorQueue
                        emergenciaVectorQueue = new HospitalVectorQueue(pacientes);
                        while (count < pacientesInicial && input == true) {
                            Paciente atendiendo = emergenciaVectorQueue.siguientePaciente();
                            System.out.println(atendiendo);
                            count++;

                        }
                        break;
                    case 2: // Implementacion con Java Collection Framework
                        HospitalPriorityQueue hosp = new HospitalPriorityQueue(pacienteEmergencia);
                        while (count < pacientesInicial && input == true) {
                            Paciente atendiendo = hosp.siguientePaciente();
                            System.out.println(atendiendo);
                            count++;
                        }
                        break;
                    default: System.out.println("Opción no válida. Nos vemos pronto"); break;
                }
            } else System.err.println("Su archivo no fue encontrado. Asegurese de ingresar el nombre del archivo y extension");
        }
        scanner.close();
    }
    public static int isNumberC(Scanner scanner) {
        boolean correct=false;
        int num = 0;
        while(correct==false) {
            try{
                num = Integer.parseInt(scanner.nextLine());
                correct=true;
            } catch(NumberFormatException e) {
                System.out.println("Ingrese una opción valida");
            }
        }
        return num;
    }
}
