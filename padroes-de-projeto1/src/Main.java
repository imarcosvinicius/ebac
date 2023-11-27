public class Main {

    public static void main(String[] args) {

        IFactory factory = new SedanFactory();

        // Cria um carro
        Car car = factory.createCar();

        // Exibe as informações do carro
        car.exibirInformacoes();

        // Cria uma fábrica de SUVs
        factory = new SUVFactory();

        // Cria um carro
        car = factory.createCar();

        // Exibe as informações do carro
        car.exibirInformacoes();
    }

}