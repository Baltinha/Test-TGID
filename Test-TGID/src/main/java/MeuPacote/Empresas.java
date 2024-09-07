/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MeuPacote;

/**
 *
 * @author nomed
 */
public class Empresas {
    
    private static int num;
    private  static int saldo;
    private static String CNPJ;
    private static float taxa;
    
    public Empresas(int num, String CNPJ,float taxa,int saldo)
    {
       this.num = num;
       this.saldo = saldo;
       this.CNPJ = CNPJ;
       this.taxa = taxa;
    }
    
    public  void printEmpresa(){
        System.out.println("\tEmpresas");
        System.out.println("Numero da Empresa: "+ num);
        System.out.println("Saldo atual:" + saldo);
        System.out.println("CNPJ: " + (CNPJ.substring(0, 2) + "." + CNPJ.substring(2, 5) + "." +
      CNPJ.substring(5, 8) + "." + CNPJ.substring(8, 12) + "-" +
      CNPJ.substring(12, 14)));
        
    }
    public void sacar(double valor){
    /*if(valor < 0){
      System.out.println("Não é possível sacar um valor negativo!\n");
    }
    else
    {
      if(saldo >= valor){
          saldo -= valor;
          System.out.println("Sacado: " + valor);
          System.out.println("Novo saldo: " + saldo + "\n");
      } else {
          System.out.println("Saldo insuficiente. Faça um depósito\n");
      }
    }*/
}

    public void depositar(double valor)
    {
        /*if(valor < 0){
            System.out.println("Não é possível depositar um valor negativo!\n");
        }
        else
        {
        saldo += valor;
            System.out.println("Depositado: " + valor);
            System.out.println("Novo saldo: " + saldo + "\n");
        }*/
    }

            public static void exibeMenuConta() {

        System.out.println("\t Escolha a opcao desejada");
        System.out.println("1 - Consultar Extrato");
        System.out.println("2 - Sacar");
        System.out.println("3 - Depositar");
        System.out.println("4 - Voltar\n");
        System.out.print("Opcao: ");

    }
    public static void escolheOpcao(int opcao){

            switch( opcao ){
                case 1:    
                    //extrato();
                    
                        break;
                case 2: 
                    System.out.println("Saque");


                case 3:
                    System.out.println("deposito");


                case 4:
                    //TestTGID.exibeMenu();
                        break;
                default:
                        System.out.println("Opção inválida");
            }
    }
}
