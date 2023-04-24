public class Operators {
  public static void main(String[] args) {
    int a = 6;
    int b = 3;

    boolean ex1 = !(a == 7 && (b >= a || a != a));
    //* a != a
    //* 6 != 6 = false
    ex1 = !(a == 7 && (b >= a || false));
    //* b >= a
    //* 3 >= 6 = false
    ex1 = !(a == 7 && (false || false));
    //* false || false = false
    ex1 = !(a == 7 && false);
    //* a == 7
    //* 6 == 7 = false
    ex1 = !(false && false);
    //* false && false = false
    ex1 = !false;
    //* !false = true
    ex1 = true;
    // System.out.println(ex1);

    boolean ex2 = a == b || !(b > 3);
    //* b > 3
    //* 3 > 3 = false
    ex2 = a == b || !false;
    //* !false = true
    ex2 = a == b || true;
    //* a == b
    //* 6 == 3 = false
    ex2 = false || true;
    //* false || true = true
    ex2 = true;
    // System.out.println(ex2);
    
    boolean ex3 = !(b <= a && b != a + b);
    //* b =! a + b
    //* 3 =! 6 + 3
    //* 3 =! 9 = true
    ex3 = !(b <= a && true);
    //* b <= a
    //* 3 <= 6 = true
    ex3 = !(true && true);
    //* true && true = true
    ex3 = !true;
    //* !true = false
    ex3 = false;
    // System.out.println(ex3);
  }
}