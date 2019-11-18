public class FindingPrimeNumber {

  public static boolean find(Double num){
    boolean aux = true;

      for(double i = 2; i < num; i++){

        if(num % i == 0){
          aux = false;
          break;
        }
      }
    return aux;
  }
}
