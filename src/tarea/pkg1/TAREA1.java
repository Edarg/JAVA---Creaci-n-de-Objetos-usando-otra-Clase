/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.pkg1;

/**
 *
 * @author EDDY
 */
public class TAREA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //primer objeto
        PERSONA registro = new PERSONA("5190-20-522","Eddy","Antigua Guatemala",58170218,"earguetar4@miumg.edu.gt");
        System.out.println(registro.imprimir());
        registro.setNit("5190-20-520");
        registro.getNit();
        System.out.println(registro.getNit());
        
        //segundo objeto
        PERSONA registro2 = new PERSONA("5190-20-201","Alextremo","zona 14",12345678,"alextremo@miumg.edu.gt");
        System.out.println(registro.imprimir());
        registro.setNit("5190-20-502");
        registro.getNit();
        System.out.println(registro.getNit());
        
        //tercer objeto
        PERSONA registro3 = new PERSONA("5190-20-100","TioBoyCris","zona 10",87654321,"TioBoyCris@miumg.edu.gt");
        System.out.println(registro.imprimir());
        registro.setNit("5190-20-102");
        registro.getNit();
        System.out.println(registro.getNit());
        
        //cuarto objeto
        PERSONA registro4 = new PERSONA("5190-20-60","Alessandro","Zona 2",45785326,"AlessPro2@miumg.edu.gt");
        System.out.println(registro.imprimir());
        registro.setNit("5190-20-61");
        registro.getNit();
        System.out.println(registro.getNit());
        
        //quinto objeto
        PERSONA registro5 = new PERSONA("5190-20-70","Tommy","Zona 10",29823474,"TommyPr12@miumg.edu.gt");
        System.out.println(registro.imprimir());
        registro.setNit("5190-20-81");
        registro.getNit();
        System.out.println(registro.getNit());
    }
    
}
