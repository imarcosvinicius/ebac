public class SedanFactory implements IFactory {
    @Override
    public Car createCar() {
        return new Sedan();
    }
}