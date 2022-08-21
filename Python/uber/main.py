from car import Car

if __name__ == "__main__":
    car = Car()
    car.license = "AMS234"
    car.driver = "ANdreas"
    print(vars(car))

    car2 = Car()
    car2.license = "QWE566"
    car2.driver = "Matha"

    print(vars(car2))