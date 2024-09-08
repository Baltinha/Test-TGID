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
    //Classe para moldar uma Empresa
    private  int num;
    private  double saldo;
    private  String CNPJ;
    private  double taxa;
    
    public int getNum ()
    {
        //pegar o valor do numero da empresa
        return this.num;
    }
    public String getCNPJ ()
    {
        //pegar o valor do CNPJ
        return this.CNPJ;
    }
    public Empresas(int num, String CNPJ,double taxa,int saldo)
    {
        //passagem de valores para a montagem da empresa
       this.num = num;
       this.saldo = saldo;
       this.CNPJ = CNPJ;
       this.taxa = taxa;
    }
    
    public void printEmpresa(){
        System.out.println("\tEmpresas");
        System.out.println("ID da Empresa: "+ num);
        System.out.println("Saldo atual:" + saldo);
        System.out.println("CNPJ: " + (CNPJ.substring(0, 2) + "." + CNPJ.substring(2, 5) + "." +
      CNPJ.substring(5, 8) + "." + CNPJ.substring(8, 12) + "-" +
      CNPJ.substring(12, 14)));
        
    }
    public void sacar(double valor){
        if (saldo < valor) {
            System.out.println("Saldo da empresa e isuficiente para saque!");
            return;
        }
        
        saldo -=valor-taxa;
        System.out.println("Saque bem sucedido no valor: R$"+valor+" com taxa: R$"+taxa);
 
    }

    public  void depositar(double valor)
    {     
        saldo +=valor;
        System.out.println("desposito no valor: R$"+ valor); 
    }



}
