package th.ac.cdti.rottenpotatoes;

/** FizzBuzz kata for L1: Fizz for multiples of 3, Buzz for 5, FizzBuzz for 15, else the number. */
public final class FizzBuzz {
  private FizzBuzz() {}

  /** Returns "Fizz", "Buzz", "FizzBuzz" or the number itself as text. */
  public static String of(int n) {
    if (n % 15 == 0) {
      return "FizzBuzz";
    }
    if (n % 3 == 0) {
      return "Fizz";
    }
    if (n % 5 == 0) {
      return "Buzz";
    }
    return Integer.toString(n);
  }
}
