/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import modelo.Pet;
import modelo.Student;
import modelo.Subject;
import persistence.HogwartsCharacterDB;
import persistence.SubjectDB;
import view.HogwartsView;
import view.TextAppHogwarts;

/**
 *  é a controladora que xestiona as funcionalidades que permite a aplicación.
 * @author ivan.fernandezguinde
 */
public class HogwartsController {
    private HogwartsView view;

    /**
     * constructor da clase que inicializa o atributo hogwartsView como un novo 
     * obxecto da clase TextAppHogwarts
     */
    public HogwartsController() {
        this.view = new TextAppHogwarts(this);
    }
    
    /**
     * inicia a aplicación, chamando ao método "setCharacters" da vista para 
     * establecer a lista das personaxes que se obterá de "HogwartsCharacterDB",
     * e ao método "showMenu". En caso de que se produza unha 
     * "UnderConstructionException" se mostrará unha mensaxe ao usuario, 
     * chamando ao método "showUnderConstructionMessage" da vista, para indicar 
     * que a operación "mostrar o menú inicial" está en construcción.
     */
    public void initApp() {
        view.setCharacters(HogwartsCharacterDB.getCharacters());
        
    }
    
    /**
     * obtén a personaxe que ten o código recibido como parámetro (usando a clase
     * "HogwartsCharacterDB") e chama ao método "showCharacterData" da vista 
     * para mostrar os seus datos ao usuario. En caso de que se produza unha 
     * "UnderConstructionException" se mostrará unha mensaxe ao usuario, chamando
     * ao método "showUnderConstructionMessage" da vista, para indicar que a 
     * operación "mostrar os datos dunha personaxe" está en construcción.
     * @param hogwartsCode 
     */
    public void showCharacterData(String hogwartsCode) {
        
    }
    
    /**
     * obtén a materia que ten o código recibido como parámetro (usando a clase 
     * "SubjectDB") e chama ao método "showSubjectData" da vista para mostrar os
     * seus datos ao usuario. En caso de que se produza unha 
     * "UnderConstructionException" se mostrará unha mensaxe ao usuario, chamando
     * ao método "showUnderConstructionMessage" da vista, para indicar que a 
     * operación "mostrar os datos dunha materia" está en construcción
     * @param subjectCode 
     */
    public void showsubjectData(String subjectCode) {
        
    }
    
    /**
 * Carga os datos de exemplo para o funcionamento da aplicación
 */
public void loadSampleData() {
    // Creamos uns alumnos e uns profesores
    Student harry = new Student("Harry Potter", "Cicatriz en forma de raio na fronte",
            "A-1992-0001", "Griffindor", new Pet("Curuxa", "Hedwig", 3), "Buscador", 3);
    Student hermione = new Student("Hermione Granger", "Moi observadora e boa estudante",
            "A-1992-0002", "Griffindor", new Pet("Gata", "Crookshanks", 2), "", 3);
    Student draco = new Student("Draco Malfoy", "Inimigo de Harry Potter",
            "A-1992-0004", "Slytherin", null, "Buscador", 3);
    Teacher dumbledore = new Teacher("Albus Dumbledore", "Longa barba", "P-001",
            "", new Pet("Fénix", "Fawkes", 150), "500 anos de experiencia na maxia");
    Teacher minerva = new Teacher("Minerva McGonagall",
            "Moi estrita", "P-002", "Griffindor", null, "Experta en feitizos");
    Teacher snape = new Teacher("Severus Snape", "Apariencia escura", "P-003",
            "Slytherin", null, "Experto en maxia negra");
     
    // Creamos unhas materias
    Subject trans4 = new Subject("MM-401", "Transformacións 4", 4, minerva);
    trans4.getStudents().add(harry);
    trans4.getStudents().add(hermione);
    trans4.getStudents().add(draco);
    Subject pot4 = new Subject("MM-402", "Pocións 4", 4, snape);

    // Engadimos os alumnos e profes ás personaxes de Howgwarts
    HogwartsCharacterDB.getHogwartsCharacters().add(harry);
    HogwartsCharacterDB.getHogwartsCharacters().add(hermione);
    HogwartsCharacterDB.getHogwartsCharacters().add(draco);
    HogwartsCharacterDB.getHogwartsCharacters().add(dumbledore);
    HogwartsCharacterDB.getHogwartsCharacters().add(minerva);
    HogwartsCharacterDB.getHogwartsCharacters().add(snape);
        
    // Engadimos as materias á lista de materias de Hogwarts
    SubjectDB.getSubjects().add(trans4);
    SubjectDB.getSubjects().add(pot4);
}
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
