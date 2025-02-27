public class P2Q3 {
    public static void main(String[] args) throws Exception { 
        System.out.printf("%-10s %-20s %-15s %-10s\n\n", "Celcius","Ferenheit","Ferenheit","Celcius");
  
        for(double i = 0; i <=50 ;i+=10){
            System.out.printf("%-10.1f %-20.4f %-15.1f %-10.4f\n", (double)i ,celciusToFehrenheit(i),(double)(i+50));
        }
  } 
  public static double celciusToFehrenheit(double celcius){
    return(celcius * 9/5) + 32;
  }

  public static double fehrenheitToCelcius(double fehrenheit){
    return(fehrenheit - 32) + 5/9;
  }
}
