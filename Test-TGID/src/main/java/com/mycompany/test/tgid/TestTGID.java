/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test.tgid;

import java.util.Scanner;
import MeuPacote.ValidaCPF;
import MeuPacote.ValidaCNPJ;

/**
 *
 * @author nomed
 */
public class TestTGID {

    public static void main(String[] args) {
        int system;
        String CPF;
        String CNPJ;
        
        Scanner ler = new Scanner(System.in);
        System.out.println("Cliente 1digite 1 ou Empresa digite 2");

        system = ler.nextInt();

        switch (system) {
            case 1:
                System.out.println("Informe o CPF: ");
                CPF = ler.next();
                //Valida O CPF
                if (ValidaCPF.isCPF(CPF) == true)
                    //Clientes iram sacar e depositar pela empresas dependedo dos 
                    //saldos da empresa 
                    System.out.println("\t Escolha a opção desejada");
                    System.out.println("1 - Sacar");
                    System.out.println("2 - Depositar");
                    //System.out.printf("%s\n",ValidaCPF.imprimeCPF(CPF));
                //else System.out.printf("Erro, CPF invalido !!!\n");
                //CPF
                break;
            case 2:
                System.out.println("Informe o CNPJ: ");
                CNPJ = ler.next();
                //Valida O CPF
                if (ValidaCNPJ.isCNPJ(CNPJ) == true)
                    System.out.println("\t Escolha a opção desejada");
                    System.out.println("1 - Consultar Extrato");
                    System.out.println("2 - Sacar");
                    System.out.println("3 - Depositar");
                    //Empresas terão saldo vindo do sistema
                    //System.out.printf("%s\n", ValidaCNPJ.imprimeCNPJ(CNPJ));
                //CNPJ
                //else System.out.printf("Erro, CNPJ invalido !!!\n");
                break;
    }
}
}
