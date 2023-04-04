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
public class PERSONA {
    
    //Atributos
    private String Nit;
    private String Nombre;
    private String Direccion;
    private int Telefono;
    private String Correo_Electronico;
    
    
    // Metodo Constructor
    public PERSONA(String nit, String nombre, String direccion, int telefono, String C_E)
    {
        this.Nit = nit;
        this.Nombre = nombre;
        this.Direccion = direccion;
        this.Telefono = telefono;
        this.Correo_Electronico = C_E;
    }
    
    // Metodos getters
    public String getNit()
    {
        return this.Nit;
    }
    
    public String getNombre()
    {
        return this.Nombre;
    }
    
     public String getDireccion()
    {
        return this.Direccion;
    }
     
      public int getTelefono()
    {
        return this.Telefono;
    }
      
      public String getC_E()
    {
        return this.Correo_Electronico;
    }
      
      
    //Metodos Setter  
    public void setNit(String NIT)
    {
        this.Nit = NIT;
    }
    
    public void setNombre(String NOMBRE)
    {
        this.Nombre = NOMBRE;
    }
    
    public void setDireccion(String DIRECCION)
    {
        this.Direccion = DIRECCION;
    }
    
    public void setTelefono(int TELEFONO)
    {
        this.Telefono = TELEFONO;
    }
    
    public void setC_E(String C_E)
    {
        this.Correo_Electronico = C_E;
    }
    
    //Metodo Ver Datos         
    public String imprimir()
    {
        return ("\nBienvenido "+ this.Nombre+" al seguro de vida el cual posee con numero de indentificación tributaria (NIT): "
                +this.Nit+", Dirección: "+this.Direccion+", numero celular: "+this.Telefono+"\ny correo electronico: "
                +this.Correo_Electronico+" para poder identicarse al momento de usar nuestro servicio");
    }
    
    
}
