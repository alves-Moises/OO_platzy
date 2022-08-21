from car import Car

class UberVan(Car):
    typeCarAccepted = []
    seatsMaterial = []

    def __init__(self, license, driver, typeCarAcepted, seatsMaterial):
        super().__init__(license, driver)
        self.typeCarAccepted = typeCarAcepted
        self.seatsMaterial = seatsMaterial