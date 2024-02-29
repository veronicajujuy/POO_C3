package banco;

public class Cliente {
    private String numeroCliente;
    private String apellido;
    private String dni;
    private String cuit;

    public Cliente(String numeroCliente, String apellido, String dni, String cuit) {
        this.numeroCliente = numeroCliente;
        this.apellido = apellido;
        this.dni = dni;
        this.cuit = cuit;
    }
}
