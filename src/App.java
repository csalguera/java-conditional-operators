public class App {
  public static void main(String[] args) {
    /*
     * -------------------------------------
     * Introduction to Conditional Operators
     * -------------------------------------
     * 
     * Java includes operators that only use boolean values
     * 
     * These conditional operators help simplify expressions containing complex boolean relationships by reducing multiple boolean values to a single value: true or false
     * 
     * If we want to run a code block if multiple conditions are true, we use the AND operator: &&
     * If we want to run a code block if at least one condition is true, we use the OR operator: ||
     * We can produce the opposite value by using the NOT operator: ! (also referred to as the Bang operator)
     */

    /*
     * -------------------
     * Conditional-And: &&
     * -------------------
     * 
     * Let's return to our studen enrollment program
     * 
     * We've added an additional requirement: not only must students have the prerequisite, but their tuition must be paid off as well
     * 
     * We have two conditions that must be true before we enroll the student
     * Here's two ways to write the code:
     */
    
    boolean tuitionPaid = true;
    boolean hasPrerequisites = true;

    // nested if statements:
    if (tuitionPaid) {
      if (hasPrerequisites) {
        // enroll student
      }
    }

    // AND operator:
    if (tuitionPaid && hasPrerequisites) {
      // enroll student
    }

    /*
     * ------------------
     * Conditional-OR: ||
     * ------------------
     * 
     * The requirements of our enrollment program have changed again
     * 
     * Certain courses have prerequisites that are satisfied by multiple courses
     * 
     * As long as students have taken at least one prerequisite, they should be allowed to enroll
     * 
     * Here are two way to write the code:
     */

    boolean hasAlgebraPrerequisite = true;
    boolean hasGeometryPrerequisite = true;

    // separate if statements:
    if (hasAlgebraPrerequisite) {
      // Enroll in course
    }

    if (hasGeometryPrerequisite) {
      // Enroll in course
    }

    // OR operator:
    if (hasAlgebraPrerequisite || hasGeometryPrerequisite) {
      // Enroll student
    }

    /*
     * --------------
     * Logical NOT: !
     * --------------
     * 
     * The unary operator NOT, !, works on a single value
     * 
     * This operator evaluates to the opposite boolean to which it's applied
     * 
     * NOT is useful for expressin our intent clearly in programs
     * 
     * For example, sometimes we need the opposite behavior of an if-then: run a code block only if the condition is false
     */

    hasPrerequisites = false;

    // if-then-else
    if (hasPrerequisites) {
      // do nothing
    } else {
      System.out.println("Must complete prerequisite course!");
    }

    /*
     * This code block works as intended but the truthy statement is completely void of code
     * The logical NOT operator helps clean up our code
     */

    // if-then
    if (!hasPrerequisites) {
      System.out.println("Must complete prerequisite course!");
    }

    /*
     * -------------------------------
     * Combining Conditional Operators
     * -------------------------------
     * 
     * We have the ability to expand our boolean expressions by using multiple conditional operators in a single expression.
     * 
     * For example:
     */

    boolean foo = true && !(false || !true);

    /*
     * The order of evaluation when it comes to conditional operators is as follows:
     * 
     * 1. Parentheses
     * 2. NOT - !
     * 3. AND - &&
     * 4. OR - ||
     */
    
    foo = true && !(false || !true);
    //* !true = false
    foo = true && !(false || false);
    //* false || false = false
    foo = true && !false;
    //* !false = true
    foo = true && true;
    //* true && true = true
    foo = true;

    /*
     * ------
     * Review
     * ------
     */
  }
}