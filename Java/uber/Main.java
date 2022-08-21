class Main {
    public static void main(String[] args){

        System.out.println("holA Mundo");
        Car car = new Car("AMQ1213", new Account("Andres Herrera", "AMD123"));
        // car.license = "AMQ1213;";
        // car.driver = "Andres Herrera";
        // car.passegenger = 4;
        car.printDataCar();
        
        Car car2 = new Car("QWE456", new Account("Adrea", "ANDA789"));
        car2.license = "QWE4567";
        car2.passegenger = 3;
        System.out.println("Car license: " + car2.license);
        car2.printDataCar();


    }
}