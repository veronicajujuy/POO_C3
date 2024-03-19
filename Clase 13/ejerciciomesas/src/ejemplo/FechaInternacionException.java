package ejemplo;

public class FechaInternacionException extends Exception{
    public FechaInternacionException(String message) {
        super(message);
    }

    // no es necesario pero lo dejo como un ejemplo que pueden seguir
    @Override
    public String toString() {
        return "se produjo la excepcion" + this.getClass().getName() + "\n"+
                "Mensaje: "+ this.getMessage();
    }
}
