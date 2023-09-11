public class VehMain {

        public static void main(String[] args) {
            
            // inheritance = 	the process where one class acquires,
            //					the attributes and methods of another.
            
            Cart car = new Cart();
            
            car.go();
            
            Bicycle bike = new Bicycle();
            
            car.go();
            bike.stop();
            
            System.out.println(car.door);
            System.out.println(bike.pedals);
                    
        }
    }
