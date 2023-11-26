/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package epd7_ej2;

/**
 *
 * @author mark3
 */
public class Antimundo {
    private String nombre;
    private int repeticiones;

    public Antimundo(int repeticiones) {
        this.nombre = "ADIOS MUNDO...";
        if(repeticiones < 0) {
            this.repeticiones = 1;
        }
        else {
            this.repeticiones = repeticiones;
        }
    }
    
    public Antimundo() {
        this.nombre = "ADIOS MUNDO...";
        this.repeticiones = 1;
    }

    public String getNombre() {
        return nombre;
    }
    
    public int getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }
    
    
    
    public void escribir(){
        for(int i = 0; i < this.repeticiones; i++) {
            System.out.println(this.nombre + "\n");
        }
    }
}
