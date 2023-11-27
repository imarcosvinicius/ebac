public class Sedan extends Car {

    public Sedan() {
        super("Honda", "Civic Type R");
    }


    @Override
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Tipo: Sedan");
    }
}