import java.util.Scanner;
class Quadmath {
  private double b;
  private double h;
  private double a;
  private double k;
  private double c;

  Scanner input = new Scanner(System.in);
 
  public Quadmath(double bAsk, double hAsk, double aAsk, double kAsk) {
    b = bAsk;
    h = hAsk;
    a = aAsk;
    k = kAsk;
  } 
  public Quadmath(double aAsk, double bAsk, double cAsk) {
    a = aAsk;
    b = bAsk;
    c = cAsk;
  }

  public void solveVertexAsVertex(){
     System.out.println("The vertex is ("+ h + "," + k + ")");
  }
  public void solveVertexAsStandard(){
    double x = -b/(2*a);
    System.out.println("The Vertex is (" + x + " , " + Math.pow(a*x,2)+(b*x)+c + ")");
  }
  
  public void solveMaxMinAsVertex(){
    System.out.println("The Max/Min is y = " + k);
  }
  public void solveMaxMinAsStandard(){
    double x = -b/(2*a);
    System.out.println("The Max/Min is y = " + Math.pow(a*x,2)+(b*x)+c);
  }
  
  public void solveYIntAsVertex(){
    double yInt = a * Math.pow((b * (0 + h)), 2) + k;
    System.out.println("The Y-Intercept is (0.0," + yInt + ")");
  }
  public void solveYIntAsStandard(){
    System.out.println("The Y-Intercept is " + c);
  }
  
  public void solveValueAsVertex(){
    System.out.println("Enter X: ");
    double valueX = input.nextInt();
    System.out.println("Y is equal to: " + (a * Math.pow((b * (valueX + h)), 2) + k));
  }
  public void solveValueAsStandard(){
    System.out.println("Enter X: ");
    double valueX = input.nextDouble();
    System.out.println("Y is equal to: " + Math.pow(a*valueX, 2) + (b*valueX) + (c));
  }
  public void solveXIntAsVertex(){
    double d = ((a*h*2) * (a*h*2))-4*a*(a*h*h+k);
    
    if(d<0){
      if(d<0){
        System.out.println("There are no x-intercepts");
      }else if(d==0){
        System.out.println("There is one x-intercept x = " + -(a*h*2)+Math.sqrt(d)/(2*a));
      }else if(d>0){
        System.out.println("There are two x-intercepts, x = " + (-(a*h*2)+Math.sqrt(d)/(2*a)) + " and x = " + (-(a*h*2)-Math.sqrt(d)/(2*a)));
      }
    }else if(d==0){
      System.out.println("There is one x-intercept x = " + -(a*h*2)+Math.sqrt(d)/(2*a));
    }else if(d>0){
      System.out.println("There are two x-intercepts, x = " + (-(a*h*2)+Math.sqrt(d)/(2*a)) + " and x = " + (-(a*h*2)-Math.sqrt(d)/(2*a)));
    }
  }
  public void solveXIntAsStandard(){
    double d = Math.sqrt(Math.pow(b,2)-(4*a*c));
    
    if(d<0){
      System.out.println("There are no x-intercepts");
    }else if(d == 0){
      System.out.println("The x-intercept is x = " + -b/(2*a));
    }else if(d > 0){
      System.out.println("The x-intercepts are x = " + (-b+Math.sqrt(Math.pow(b,2)-(4*a*c))/(2*a)) + "and x = " + (-b-Math.sqrt(Math.pow(b,2) - (4*a*c))/(2*a)));
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
