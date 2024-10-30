/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pen;

/**
 * escribe palabras ou non segundo a cantidade de tinta que teña
 * @author ivan
 */
public class Pen {
    private int ink = 30;

    /**
     * define un valor para pen
     */
    public Pen() {
    }

    /**
     * devolve o valor de ink
     * @return 
     */
    public int getInk() {
        return ink;
    }

    /**
     * modifica o valor de ink
     * @param ink 
     */
    public void setInk(int ink) {
        this.ink = ink;
    }
    
    
    public void write(int palabras) {
        if (ink>=palabras) {
            ink -= palabras;
            System.out.println("escribironse " +palabras+ " palabras"); 
        } else {
            System.out.println("non queda tinta suficiente");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pen pen = new Pen();
        
        // escribimos 20, 15 e 6 palabras invocando o método write
        pen.write(20);
        pen.write(15);
        pen.write(6);
  
    }
    
}
