public class SUVFactory implements IFactory {

    @Override
    public Car createCar() {
        return new SUV();
    }
}