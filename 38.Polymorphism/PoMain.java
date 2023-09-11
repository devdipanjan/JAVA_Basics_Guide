public class PoMain {

        public static void main(String[] args) {
            
            // polymorphism = 	greek word for poly-"many", morph-"form"
            //					The ability of an object to identify as more than one type
            
            Carc car = new Carc();
            Bike bicycle = new Bike();
            Boat boat = new Boat();
            
            Vehicles[] racers = {car,bicycle,boat};
            
            for(Vehicles x : racers) {
                x.go();
            }
            
        }
    }
