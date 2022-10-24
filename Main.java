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
    Quadmath equation  = new Quadmath(input1, input2, input3, input4);
    //Ask what user wants to solve
    System.out.println("Thank you, choose what you would like to solve for:");
    System.out.println("1. Vertex");
    System.out.println("2. Max/Min");
    System.out.println("3. Y-Intercept");
    System.out.println("4. Value");
    System.out.println("5. X-Intercepts");
    System.out.println("6. All of the above");
    System.out.println("7. Convert Form");
    int choice = input.nextInt();

    if(choice == 1) {
      equation.solveVertexAsVertex();
    }else if(choice == 2){
      equation.solveMaxMinAsVertex();
    }else if(choice == 3){
      equation.solveYIntAsVertex();
    }else if(choice == 4){
      equation.solveValueAsVertex();
    }else if (choice == 5){
      equation.solveXIntAsVertex();
    }else if (choice ==6){
      equation.solveVertexAsVertex();
      equation.solveMaxMinAsVertex();
      equation.solveYIntAsVertex();
      equation.solveValueAsVertex();
      equation.solveXIntAsVertex();
    }else if (choice == 7){
      System.out.println("You are currently in vertex form, choose what you would like to convert to: \n 1. Standard \n 2. Intercept");
      int formConvChoose = input.nextInt();
      if(formConvChoose == 1){
        equation.vertexToStandard();
      }else if(formConvChoose == 2){
        equation.vertexToIntercept();
      }else{
        System.out.println("Invalid Option");
      }
    }else{
      System.out.println("Invalid Option");
    }
    }
    
    //STANDARD FORM

    else if (formChoice == 2){
      //First ask for a, b, c
    System.out.println("Please enter the a, b, and c values in the order they are written in.");
    double input1 = input.nextInt();
    double input2 = input.nextInt();
    double input3 = input.nextInt();
    //Create an equation
    Quadmath equation = new Quadmath(input1, input2, input3);
    //Ask what user wants to solve
    System.out.println("Thank you, choose what you would like to solve for:");
    System.out.println("1. Vertex");
    System.out.println("2. Max/Min");
    System.out.println("3. Y-Intercept");
    System.out.println("4. Value");
    System.out.println("5. X-Intercepts");
    System.out.println("6. All of the above");
    System.out.println("7. Convert Form");
    int choice = input.nextInt();
    if(choice == 1){
      equation.solveVertexAsStandard();
    }else if(choice == 2){
      equation.solveMaxMinAsStandard();
    }else if(choice == 3){
      equation.solveYIntAsStandard();
    }else if(choice == 4){
      equation.solveValueAsStandard();
    }else if(choice == 5){
      equation.solveXIntAsStandard();
    }else if(choice == 6){
      equation.solveVertexAsStandard();
      equation.solveMaxMinAsVertex();
      equation.solveYIntAsVertex();
      equation.solveValueAsStandard();
      equation.solveXIntAsStandard();
    }else if(choice == 7){  
      System.out.println("You are currently in Standard form; Choose what form you would like to convert to: \n 1. Vertex \n 2. Intercept");
      int formConvChoose = input.nextInt();
      if(formConvChoose == 1 ){
        //convert to vertex form
        
      }else if(formConvChoose == 2){
        //convert to intercept form
      }
    }
  
  }
  
  //INTERCEPT FORM!

  else if (formChoice == 3){
      
    }else {
      System.out.println("Invalid Option");
    }
    
  }
}
