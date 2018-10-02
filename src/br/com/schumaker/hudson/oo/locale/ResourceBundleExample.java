package br.com.schumaker.hudson.oo.locale;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author hudson.schumaker
 */
public class ResourceBundleExample {

    public static void main(String[] args) {
        Locale enEn = new Locale("en", "En");
        Locale deDe = new Locale("de", "De");
        Locale frFr = new Locale("fr", "Fr");
        Locale ptBr = new Locale("pt", "Br");
        ResourceBundle bundle = ResourceBundle.getBundle("LabelsBundle", deDe);
        System.out.println(bundle.getString("s2"));
        
        bundle = ResourceBundle.getBundle("LabelsBundle",frFr);
        System.out.println(bundle.getString("s2"));
        
        bundle = ResourceBundle.getBundle("LabelsBundle",enEn);
        System.out.println(bundle.getString("s2"));
        
        bundle = ResourceBundle.getBundle("LabelsBundle",ptBr);
        System.out.println(bundle.getString("s2"));
    }
}
