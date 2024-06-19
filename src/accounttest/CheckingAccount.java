/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accounttest;

/**
 *
 * @author Aluno
 */
public class CheckingAccount {
    
    String Name = "Teste";
    String balance = "Teste";
    
    public void withdraw(double valor) {
        int saldo; 
        saldo = 1; 
        
        if (valor < 0) {
            System.out.println("Aviso: Valor de retirada não pode ser negativo.");
        } else if (valor > saldo) {
            System.out.println("Aviso: Saldo insuficiente para a retirada.");
        } else {
            saldo -= valor;
            System.out.println("Retirada de $" + valor + " realizada com sucesso.");
            System.out.println( saldo + "Novo saldo: $" );
        }
    }
}
