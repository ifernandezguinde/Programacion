package padelmanager.db;

import padelmanager.model.Player;

/**
 * Clase que implementa a persistencia dos xogadores
 * @author Profe de programacion
 */
public class PlayerDB {
    
    /**
     * Busca un xogador que teña o Id de usuario e contrasinal determinados
     * @param userId Id do usuario que se busca
     * @param pass Contrasinal do usuario que se busca
     * @return Obxecto que se corresponde co xogador, ou null se non existe un
     * xogador cos datos indicados
     */
    public static Player findByIdAndPassword(String userId, String pass) {
        // Obtemos do HashMap o elemento que teña como chave o id de usuario recibido
        Player p = PadelManagerDB.getPlayers().get(userId);
        
        // Se se obten un obxecto e ten o contrasinal recibido, devolvemolo
        // Se non, devolvemos null
        if ((p!=null) && (p.getPassword().equals(pass))) {
            return p;
        } else {
            return null;
        }
    }
}
