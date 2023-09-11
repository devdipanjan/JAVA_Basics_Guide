public class TrMain {

        public static void main(String[] args) {
                
            TrGarage garage = new TrGarage();
            
            TrCar car1 = new TrCar("BMW");
            TrCar car2 = new TrCar("Tesla");
            
            garage.park(car1);
            garage.park(car2);
            
        }
    }
