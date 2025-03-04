package org.example;

public class CuentaBancaria {
        private String titular;
        private double saldo;
        private int Cuenta;
        private int contadorCuentas = 1009;

    public CuentaBancaria() {
    }

    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
        this.Cuenta = ++contadorCuentas;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getCuenta() {
        return Cuenta;
    }

    public void setCuenta(int cuenta) {
        Cuenta = cuenta;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                ", Cuenta=" + Cuenta +
                '}';
    }

    public void Depositar(double cantidad){
        if(cantidad > 0){
            saldo  +=  cantidad;
            System.out.println("Deposito realizado con exito: "+ cantidad);
        }else {
            System.out.println("la cantidad debe ser mayor que 0");
        }
    }

    public void retirar(double cantidad){
        if (cantidad > 0 && cantidad <= saldo){
            saldo -= cantidad;
            System.out.println("Retiro de manera exitosa :\n "+ cantidad);
            System.out.println("Tu saldo nuevo es: "+ saldo);
        }else {
            System.out.println("La cantidad a retirar excede el saldo actual");
        }
    }
    public void Informacion(){
            System.out.printf("\n Titular: "+ titular);
            System.out.println("\n Numero de cuenta: " + Cuenta);
            System.out.println("Saldo actual: $"+ saldo);

        }
}

