class LightWeightCar extends Car implements Moveable {
    @Override
    void open() {
        System.out.println("Car is opened");
    }
    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}

