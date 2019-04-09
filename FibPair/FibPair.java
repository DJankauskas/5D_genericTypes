/**
 * Use Pair to help calculate Fibonacci numbers.
 */

public class FibPair {
  public static void main(String[] commandLine) {
    System.out.println();

    // calculate next pair, Fibonacci-style
    nextText(8, 5, "[13,8]");
    nextText(3, 2, "[5,3]");

    /*
     * optional extra education: Fibonacci numbers recursively, and in linear time
     */
    oneFib( 0, 0); // base case
    oneFib( 1, 1); // smallest recursive case, or base case
    oneFib( 2, 1); // recursive case, sometimes smallest
    oneFib( 7, 13); // recursive case

    System.out.println( "no noticeable delay before...");
    oneFib( 46, 1836311903);
    /*
     * value from stackoverflow.com/questions/15065088/upper-limits-for-fibonnacci
     * but adjusted because they index from 1. Who ARE these people?
     */
  }

  /**
   * test nextPairAfter
   */
  private static void nextText(Integer bigger, Integer smaller, String expect) {
    Pair<Integer> lastPair = new Pair<>(bigger, smaller);

    System.out.println("The pair after "
        + lastPair
        + " is " + nextPairAfter(lastPair)
        + " ...expecting " + expect + System.lineSeparator());
  }

  /**
   * Calculate the next Fibonacci-style pair.
   * 
   * @return the pair after the given pair. In the new pair, the big number is the
   *         sum of the given pair the small number is the the old big number
   */
  private static Pair<Integer> nextPairAfter(Pair<Integer> lastPair) {
    return new Pair<>(lastPair.getFirst() + lastPair.getSecond(), lastPair.getFirst());
  }

  /**
   * test fib() optional extra education
   */
  private static void oneFib(int n, int expect) {
    System.out.println("Fib " + n + ": " + fib(n) + " ...expecting " + expect + System.lineSeparator());
  }

  /**
      Calculate a Fibonacci number recursively
      and in linear time.
      optional extra education
      
      @return the nth Fibonacci number
              n >= 0
     */
    private static Integer fib( int n) {
        Pair<Integer> pair = new Pair<>(1, 0);
        for(; n > 0; n--) {
          pair = nextPairAfter(pair);
        }
        return pair.getSecond();
    }
}
