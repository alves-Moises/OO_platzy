class Main {
    public static void main(String[] args){

        System.out.println("holA Mundo");
        Car car = new Car();
        car.license = "AMQ1213;";
        car.driver = "Andres Herrera";
        car.passegenger = 4;
        car.printDataCar();
        
        Car car2 = new Car();
        car2.license = "QWE4567";
        car2.driver = "Andrea Herera";
        car2.passegenger = 3;
        System.out.println("Car license: " + car2.license);
        car2.printDataCar();


    }
}