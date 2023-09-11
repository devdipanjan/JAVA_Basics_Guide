//Also Known as Runtime Polymorphism 
 import java.util.Scanner;
public class RtMain {

 public static void main(String[] args) {
  
  //Dynamic Polymorphism
  
  Scanner scanner = new Scanner(System.in);
  Anima animal;
  
  System.out.println("What animal do you want?"); 
  System.out.print("(1=dog) or (2=cat): ");
  int choice = scanner.nextInt();
  
  if(choice==1) {
   animal = new Doge();
   animal.speak();
  }
  else if(choice==2) {
   animal = new Caat();
   animal.speak();
  }
  else {
   animal = new Anima();
   System.out.println("That choice was invalid");
   animal.speak();
  }
 }
}

