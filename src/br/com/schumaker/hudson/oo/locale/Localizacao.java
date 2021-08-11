package br.com.schumaker.hudson.oo.locale;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author hudson schumaker
 */
public class Localizacao {

    //https://www.oracle.com/technetwork/java/javase/java8locales-2095355.html
    public Localizacao() {
    }

    public static void main(String[] args) {
        Locale ptBR = new Locale("pt", "BR"); //Locale para o Brasil
        Locale enCA = new Locale("en", "CA"); //locale canada ingles
        Locale frCA = new Locale("fr", "CA"); //locale canada frances
        Locale deDe = new Locale("de", "DE"); //locale canada alemanha
        locale(ptBR);
        locale(enCA);
        locale(frCA);
        locale(deDe);
    }
    
    public static void locale(Locale x){
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, x);
        System.out.println(dateFormat.format(new Date()));

        DateFormat timeFormat = DateFormat.getTimeInstance(DateFormat.MEDIUM, x);
        System.out.println(timeFormat.format(new Date()));

        NumberFormat numberFormat = NumberFormat.getNumberInstance(x); //para números
        System.out.println(numberFormat.format(13.23));

        NumberFormat moedaFormat = NumberFormat.getCurrencyInstance(x);  //para moedas
        System.out.println(moedaFormat.format(13.23));
    }
    
     private String formatTotal(double value) {
        return String.format(Locale.GERMAN, "%,.2f", value);
    }
}
