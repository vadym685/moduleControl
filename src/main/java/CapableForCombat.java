public interface CapableForCombat {

    Boolean canFight() throws UserException;

    Subordinates canReport() throws UserException;
}
