import java.util.Scanner;
class quadmath {
  private double b;
  private double h;
  private double a;
  private double k;

  Scanner input = new Scanner(System.in);

  public quadmath(double bAsk, double hAsk, double aAsk, double kAsk) {
    b = bAsk;
    h = hAsk;
    a = aAsk;
    k = kAsk;
  } 

  public void solveVertex(){
     System.out.println("The vertex is: " + "("+ h + "," + k + ")");
  }
  
  public void solveMaxMin(){
    System.out.println("The max/min is y = " + k);
  }
  
  public void solveYInt(){
    double yInt = a * Math.pow((b * (0 + h)), 2) + k;
    System.out.println("The Y-Intercept is (0.0," + yInt + ")");
  }
  
  public void solveValue(){
    System.out.println("Enter X: ");
    int valueX = input.nextInt();
    System.out.println();
    System.out.println("Y(" + valueX + ") is equal to: " + (a * Math.pow((b * (valueX + h)), 2) + k));
  }
  public void solveXInt(){
    double d = ((a*h*2) * (a*h*2))-4*a*(a*h*h+k);
    
    if(d<0){
      System.out.println("There are no x-intercepts");
    }else if(d==0){
      System.out.println("There is one x-intercept x = " + -(a*h*2)+Math.sqrt(d)/(2*a));
    }else if(d>0){
      System.out.println("There are two x-intercepts, x = " + (-(a*h*2)+Math.sqrt(d)/(2*a)) + " and x = " + (-(a*h*2)-Math.sqrt(d)/(2*a)));
    }
  }
  public void vertexToStandard(){
    System.out.println("The equation in standard form is: " + a + "X^2 + " + (a * h * 2) + "X + " + (a*h*h+k));
  }
  public void vertexToIntercept(){
    double d = ((a*h*2) * (a*h*2))-4*a*(a*h*h+k);
    if(d<0){
      System.out.println("The equation in intercept form is: " + a + "(X)(X)");
    } else if(d == 0){
      System.out.println("The equation in intercept form is " + a + "(X+" + (-(a*h*2)+Math.sqrt(d)/(2*a)) + ")(X)");
    } else if(d > 0){
      System.out.println("The equation in intercept form is " + a + "(X + " + (-(a*h*2)+Math.sqrt(d)/(2*a)) + ")(X + " + (-(a*h*2)-Math.sqrt(d)/(2*a)) + ")");
    }
    
  }
}
