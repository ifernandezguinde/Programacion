package padelmanager.model;

/**
 * Clase que implementa un xogador de pádel
 * @author Profe de programación
 */
public class Player {
    // Atributos privados
    private String id;
    private String password;
    private String name;
    private double score;
    private double balance;

    // Métodos de acceso aos atributos. Omítese o Javadoc
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    /**
     * Crea un novo xogador
     * @param id Identificador do xogador, que non se pode repetir
     * @param password Contrasinal do xogador
     * @param name Nome real do xogador
     * @param score Puntuación que indica o nivel do xogador
     * @param balance Saldo en euros do xogador
     */
    public Player(String id, String password, String name, double score,
            double balance) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.score = score;
        this.balance = balance;
    }
}
