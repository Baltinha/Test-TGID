/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MeuPacote;

/**
 *
 * @author nomed
 */
import java.util.InputMismatchException;

public class ValidaCNPJ {

  public static boolean isCNPJ(String CNPJ) {
// considera-se erro CNPJ's formados por uma sequencia de numeros iguais
    if (CNPJ.equals("00000000000000") || CNPJ.equals("11111111111111") ||
        CNPJ.equals("22222222222222") || CNPJ.equals("33333333333333") ||
        CNPJ.equals("44444444444444") || CNPJ.equals("55555555555555") ||
        CNPJ.equals("66666666666666") || CNPJ.equals("77777777777777") ||
        CNPJ.equals("88888888888888") || CNPJ.equals("99999999999999") ||
       (CNPJ.length() != 14))
       return(false);

    char dig13, dig14;
    int sm, i, r, numero, peso;

// "try" - protege o código para eventuais erros de conversao de tipo (int)
    try {
// Calculo do 1o. Digito Verificador
      sm = 0;
      peso = 2;
      for (i=11; i>=0; i--) {
// converte o i-ésimo caractere do CNPJ em um número:
        numero = (int)(CNPJ.charAt(i) - 48);
        sm = sm + (numero * peso);
        peso = peso + 1;
        if (peso == 10)
           peso = 2;
      }

      r = sm % 11;
      if ((r == 0) || (r == 1))
         dig13 = '0';
      else dig13 = (char)((11-r) + 48);

// Calculo do 2o. Digito Verificador
      sm = 0;
      peso = 2;
      for (i=12; i>=0; i--) {
        numero = (int)(CNPJ.charAt(i)- 48);
        sm = sm + (numero * peso);
        peso = peso + 1;
        if (peso == 10)
           peso = 2;
      }

      r = sm % 11;
      if ((r == 0) || (r == 1))
         dig14 = '0';
      else dig14 = (char)((11-r) + 48);

// Verifica se os dígitos calculados conferem com os dígitos informados.
      if ((dig13 == CNPJ.charAt(12)) && (dig14 == CNPJ.charAt(13)))
         return(true);
      else return(false);
    } catch (InputMismatchException erro) {
        return(false);
    }
  }

  public static String imprimeCNPJ(String CNPJ) {
// máscara do CNPJ: 99.999.999.9999-99
    return(CNPJ.substring(0, 2) + "." + CNPJ.substring(2, 5) + "." +
      CNPJ.substring(5, 8) + "." + CNPJ.substring(8, 12) + "-" +
      CNPJ.substring(12, 14));
  }
}
