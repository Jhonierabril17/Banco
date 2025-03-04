package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuentaSeleccionada = new CuentaBancaria();
        List<CuentaBancaria> ListaCuentas = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        boolean estado = true;
        while (estado){

            System.out.println("\nOpciones");
            System.out.println("\n1. Ingresar a una cuenta ");
            System.out.println("2. Crear una nueva Cuenta");
            int opc1 = sc.nextInt();

            switch (opc1) {

                case 1:
                System.out.println("\n Ingresa numero de la cuenta: ");
                int numeroCuenta = sc.nextInt();
                for (CuentaBancaria cuenta : ListaCuentas) {
                    if (cuenta.getCuenta() == numeroCuenta) {
                        cuentaSeleccionada = cuenta;
                        System.out.println("\n Opciones");
                        System.out.println("1. Depositar");
                        System.out.println("2. Retirar");
                        System.out.println("3. Informacion de la cuenta");
                        System.out.println("4. Salir");
                        int opc = sc.nextInt();
                        switch (opc) {
                            case 1:
                                System.out.println("Ingrese el monto a depositar: ");
                                double deposito = sc.nextDouble();
                                cuentaSeleccionada.Depositar(deposito);
                                break;
                            case 2:
                                System.out.println("Ingrese el monto a retirar: ");
                                double retirar = sc.nextDouble();
                                cuentaSeleccionada.retirar(retirar);
                                break;
                            case 3:
                                cuentaSeleccionada.Informacion();
                                break;
                            case 4:
                                estado = false;
                                System.out.println("Cerrando Programa...");
                                break;
                            default:
                                System.out.println("Opcion no valida");
                        }
                    } else {
                        System.out.println("No exite la cuenta, Seleccione una cuenta existente");
                    }
                }
                break;

                case 2:
                    System.out.println("\nIngrese el nombre del titular:");
                    String titular = sc.next();
                    System.out.println("Ingrese el saldo inicial:");
                    double saldoInicial = sc.nextDouble();

                    CuentaBancaria nuevaCuenta = new CuentaBancaria(titular, saldoInicial);
                    ListaCuentas.add(nuevaCuenta);
                    System.out.println("Cuenta creada con éxito.");
                    System.out.println("Su número de cuenta es: " + nuevaCuenta.getCuenta());
                    break;
            }
        }
    }
}