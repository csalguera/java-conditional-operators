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

    // nested if statements
    if (tuitionPaid) {
      if (hasPrerequisites) {
        // enroll student
      }
    }

    // AND operator
    if (tuitionPaid && hasPrerequisites) {
      // enroll student
    }
  }
}