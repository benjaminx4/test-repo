public class Tester{
  public static boolean isPrime(int x){
    for (int i = 2; i < x; i++) if (x % i == 0) return false;
    return true;
  }

  public static int nthPrime(int n){
    int count = 0;
    for (int x = 2; n >= 0; x++){
      if (isPrime(x)){
        count = x;
        n--;
      }
    }
    return count;
  }

  public static void main(String[] args){
    int[] n = {0,20,40,60,67,80,100,123,999};
    int[] primes = {2,73,179,283,337,419,547,683,7919};
    for (int i = 0; i < n.length; i++){
      if (nthPrime(n[i]) == primes[i]) System.out.println("pass");
      else System.out.println("fail expected " + primes[i] + ", but value returned was " + nthPrime(n[i]));
    }
  }
}
