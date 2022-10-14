import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("This is a Quadratic Equation Calculator \n Choose what form your equation is in. \n 1. Vertex Form \n 2. Standard Form \n 3. Intercept Form");
    int formChoice = input.nextInt();

    if(formChoice == 1){
    //First ask for b, h, a, k
    System.out.println("Please enter the b, h, a, and k values in the order they are written in.");
    double input1 = input.nextInt();
    double input2 = input.nextInt();
    double input3 = input.nextInt();
    double input4 = input.nextInt();
    //Create a new equation
    quadmath equation1  = new quadmath(input1, input2, input3, input4);
    //Ask what user wants to solve
    System.out.println("Thank you, choose what you would like to solve for:");
    System.out.println("1. Vertex");
    System.out.println("2. Max/Min");
    System.out.println("3. Y-Intercept");
    System.out.println("4. Value");
    System.out.println("5. X-Intercepts");
    System.out.println("6. Convert Form");
    int choice = input.nextInt();

    if(choice == 1) {
      equation1.solveVertex();
    }else if(choice == 2){
      equation1.solveMaxMin();
    }else if(choice == 3){
      equation1.solveYInt();
    }else if(choice == 4){
      equation1.solveValue();
    }else if (choice == 5){
      equation1.solveXInt();
    }else if (choice == 6){
      System.out.println("You are currently in vertex form, choose what you would like to convert to: \n 1. Standard \n 2. Intercept");
      int formConvChoose = input.nextInt();
      if(formConvChoose == 1){
        equation1.vertexToStandard();
      }else if(formConvChoose == 2){
        equation1.vertexToIntercept();
      }else{
        System.out.println("Invalid Option");
      }
    }else{
      System.out.println("Invalid Option");
    }
    }else if (formChoice == 2){
      
    }else if (formChoice == 3){
      
    }else {
      System.out.println("Invalid Option");
    }
    
  }
}
