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
    private static int saldo;
    private static String CNPJ;
    private static float taxa;
    
    public int getNum ()
    {
        return this.num;
    }
    public Empresas(int num, String CNPJ,float taxa,int saldo)
    {
       this.num = num;
       this.saldo = saldo;
       this.CNPJ = CNPJ;
       this.taxa = taxa;
    }
    
    public void printEmpresa(){
        System.out.println("\tEmpresas");
        System.out.println("Numero da Empresa: "+ num);
        System.out.println("Saldo atual:" + saldo);
        System.out.println("CNPJ: " + (CNPJ.substring(0, 2) + "." + CNPJ.substring(2, 5) + "." +
      CNPJ.substring(5, 8) + "." + CNPJ.substring(8, 12) + "-" +
      CNPJ.substring(12, 14)));
        
    }
    public void sacar(double valor){

}

    public void depositar(double valor)
    {

    }



}
