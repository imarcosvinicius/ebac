class SUV extends Car {

    public SUV() {
        super("Toyota", "RAV4");
    }


    @Override
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Tipo: SUV");
    }
}