public abstract class Car {
    protected String marca;
    protected String modelo;

    public Car(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public abstract void exibirInformacoes();

}