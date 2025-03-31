package memorygame;

/**
 * Excepción para erros que se poden producir cando se xeran as cartas do xogo
 *
 * @author Profe de programación
 */
public class GenerateCardsException extends Exception {

    /**
     * Construtor que crea unha excepción cunha mensaxe
     *
     * @param message Mensaxe da excepción
     */
    public GenerateCardsException(String message) {
        super(message);
    }

}
