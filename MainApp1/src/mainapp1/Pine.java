/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainapp1;

/**
 * clase "pine" con atributo "height" e un método "cut"
 *
 * @author ivan.fernandezguinde
 */
public class Pine {

    //creamos unnha variable
    private int height;

    /**
     * Este constructor asigna o valor que se lle da a height ao invocar a clase
     * "Pine"
     *
     * @param height
     */
    public Pine(int height) {
        this.height = height;
    }

    /**
     * Este método devolve o valor "height"
     *
     * @return height
     */
    public int getHeight() {
        return height;
    }

    /**
     * Este método permite modificar o valor de "height"
     *
     * @param height
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * neste método restámoslle a "heihgt" o valor que sexa introducido
     *
     * @param a
     */
    public void cut(int a) {
        height -= a;
    }

}
