import java.util.Scanner;

class Main {  
  public static void main(String args[]) { 
    Scanner ler = new Scanner(System.in);

    float temp = 0, tempF, tempK;
    System.out.println("Digite a temperaura em C");
    temp = ler.nextFloat();
    tempF = (temp*9/5)+32;
    tempK = (temp + 273);
    System.out.println(temp);
    System.out.println(tempF);
    System.out.println(tempK);
    
  } 
}
