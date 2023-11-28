import java.util.ArrayList;
import java.util.List;

public class ListaCarros<Carro> {

    private final List<Carro> carros;

    public ListaCarros() {
        carros = new ArrayList<>();
    }

    public void adicionarCarro(Carro carro) {
        carros.add(carro);
    }

    public void listarCarros() {
        System.out.println(carros);
    }

}
