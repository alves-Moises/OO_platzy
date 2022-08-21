<?php
require_once('account.php');
class Car {

    public $id;
    public $license;
    public $driver;
    protected $passenger; // Es importante que esta propiedad esté marcada como protected

    public function __construct($license, $driver){
        $this->license = $license;
        $this->driver = $driver;
    }

    public function printDataCar() {
        echo "
            Licencia: $this->license 
            Driver: {$this->driver->name} 
            Número de pasajeros: $this->passenger
        ";
    }
 
    public function getPassenger() {
        return $this->passenger;
    }

    public function setPassenger($passenger) {
        if ($passenger == 4) {
            $his->passenger = $passenger;
        }
        else {
            echo "Necessitas asignar 4 passageros";
        }
    }
}
?>