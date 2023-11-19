import java.util.ArrayList;
import java.util.List;

public class AreaComercial {

    private List<Cliente> listaClientes = new ArrayList<Cliente>();

    public List<Cliente> mostrarClientes() {
        return listaClientes;
    }

    public void agregarClientes(Cliente cliente) {
        this.listaClientes.add(cliente);
    }

    /*public void modificarClientes(Cliente cliente) {
        this.listaClientes. = cliente;
    }*/
}
