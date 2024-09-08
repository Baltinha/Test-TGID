/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.test.tgid;

import java.util.Scanner;
import MeuPacote.ValidaCPF;
import MeuPacote.ValidaCNPJ;
import MeuPacote.Empresas;

/**
 *
 * @author nomed
 */
public class TestTGID {

    static int index = 0;
    static Empresas[] empresas = new Empresas[5];
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        SistemaInicial();

    }

    public static void SistemaInicial() {
        System.out.println("\tCliente digite 1");
        System.out.println("\tEmpresa digite 2");
        System.out.println("\tMostrar Empresas digeite 3");
        System.out.println("\tFechar digeite 4");
        System.out.print("Opcao: ");
        int sistema = ler.nextInt();
        Sistema(sistema);

    }

    public static void SistemaCliente() {

        System.out.println("\t Escolha a opcao desejada");
        System.out.println("1 - Sacar");
        System.out.println("2 - Depositar");
        System.out.println("3 - Voltar\n");
        System.out.print("Opcao: ");

    }

    public static void escolheOpcao(int opcao) {
        //Opção do Cliente para usar na Empresa
        switch (opcao) {
            case 1:
                //Opção do Cliente para Sacar dinheiro da empresa com taxa
                System.out.println("Digite o CNPJ da empresa que deseja sacar? ");
                String tempCNPJ = ler.next();
                Empresas empresaTemp = selecionaEmpresa(tempCNPJ);
                if (empresaTemp == null) {
                    System.out.println("Nao existe uma empresa com o CNPJ ecolhido!");
                    escolheOpcao(1);
                }
                System.out.println("Quanto voce quer sacar? ");
                double saque = ler.nextDouble();
                empresaTemp.sacar(saque);
                break;
            case 2:
                //Opção do Cliente para depositar na empresa
                System.out.println("Digite o CNPJ da empresa que deseja depositar?");
                tempCNPJ = ler.next();
                empresaTemp = selecionaEmpresa(tempCNPJ);
                if (empresaTemp == null) {
                    System.out.println("Não existe uma empresa com o CNPJ ecolhido!");
                    escolheOpcao(2);
                }
                System.out.println("Quanto voce quer depositar? ");
                double deposito = ler.nextDouble();
                empresaTemp.depositar(deposito);
                break;
            case 3:
                //volta pra o inicio do programa
                SistemaInicial();
                break;
            default:
                System.out.println("Opção inválida");
        }
        SistemaInicial();
    }

    public static void Sistema(int sistema) {

        int num, saldo;
        String CPF;
        String CNPJ;
        float taxa;

        switch (sistema) {
            case 1:
                System.out.println("Informe o CPF: ");
                CPF = ler.next();
                if (ValidaCPF.isCPF(CPF) == true) {
                    SistemaCliente();
                    int clienteTemp = ler.nextInt();
                    escolheOpcao(clienteTemp);
                } else {
                    System.out.printf("Erro, CPF invalido !!!\n");
                }

                break;
            case 2:

                System.out.println("Informe o CNPJ: ");
                CNPJ = ler.next();
                if (ValidaCNPJ.isCNPJ(CNPJ) == true) {
                    System.out.println("Informe o ID da empresa: ");
                    num = ler.nextInt();
                    System.out.println("Infome a taxa: ");
                    taxa = ler.nextFloat();
                    System.out.println("Infome a saldo: ");
                    saldo = ler.nextInt();

                    FazerEmpresas(num, CNPJ, taxa, saldo);
                    System.out.println("Quer colocar mais uma empresa");
                    System.out.print(" 1 pra sim e 2 pra nao: ");
                    int empresasTemp = ler.nextInt();
                    if (empresasTemp == 1) {
                        Sistema(2);
                    } else {
                        SistemaInicial();
                    }
                } else {
                    System.out.printf("Erro, CNPJ invalido !!!\n");
                }
                break;
            case 3:
                //Mostra todas as impresas cadatradas no sistema
                for (Empresas empresa : empresas) {
                    if (empresas[0] == null) {
                        System.out.println("Nao existem empresas cadastradas!");
                        break;
                    }
                    if (empresa == null) {
                        return;
                    }
                    empresa.printEmpresa();
                }

                break;
            default:
                System.out.println("Opção inválida");
        }
        //volta pra o inicio
        SistemaInicial();
    }

    public static void adicionarEmpresa(Empresas empresa) {
        if (index < 5) {
            empresas[index] = empresa;
            index = index + 1;
        }
    }

    public static void FazerEmpresas(int num, String CNPJ, float taxa, int saldo) {
        Empresas novaEmpresa = new Empresas(num, CNPJ, taxa, saldo);
        adicionarEmpresa(novaEmpresa);

    }

    public static Empresas selecionaEmpresa(String CNPJ) {

        Empresas empresaSelecionada = null;
        for (int i = 0; i < empresas.length; i++) {

            if (empresas[i] != null && empresas[i].getCNPJ().equals(CNPJ)) {
                empresaSelecionada = empresas[i];
                return empresaSelecionada;

            }
        }
        return empresaSelecionada;
    }
}
