public abstract class Carro {
    private String modelo;
    private Integer ano;

    public Carro(String modelo, Integer ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Modelo: " + modelo
                + ", ano: " + ano;
    }
}
