public class Main {

    public static void main(String[] args) {

        ListaCarros<Carro> carros = new ListaCarros<>();

        carros.adicionarCarro(new Toyota("Corolla", 2023));
        carros.adicionarCarro(new Honda("Civic Type R", 2023));

        carros.listarCarros();

    }

}