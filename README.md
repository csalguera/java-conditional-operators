## Conditional Operators

## Introduction

```
public class Reservation {
  int guestCount;
  int restaurantCapacity;
  boolean isRestaurantOpen;
  boolean isConfirmed;
  
  public Reservation(int count, int capacity, boolean open) {
    if (count < 1 || count > 8) {
      System.out.println("Invalid reservation!");
    }
    guestCount = count;
		restaurantCapacity = capacity;
		isRestaurantOpen = open;
  }  
  
  public void confirmReservation() {
    if (restaurantCapacity >= guestCount && isRestaurantOpen) {
      System.out.println("Reservation confirmed");
      isConfirmed = true;
    } else {
      System.out.println("Reservation denied");
			isConfirmed = false;
    }
  }
  
  public void informUser() {
    if (!isConfirmed) {
      System.out.println("Unable to confirm reservation, please contact restaurant.");
    } else {
      System.out.println("Please enjoy your meal!");
    }
  }
  
  public static void main(String[] args) {
    Reservation partyOfThree = new Reservation(3, 12, true);
    Reservation partyOfFour = new Reservation(4, 3, true);
    partyOfThree.confirmReservation();
    partyOfThree.informUser();
    partyOfFour.confirmReservation();
    partyOfFour.informUser();
  }
}
```

The text editor contains a `Reservation` class we’ll build in this lesson.

Note the different conditional statements and operators that we’re using to control the execution of the program.

Move on when you’re ready!

## Conditional-And: &&

```
public class Reservation {
  int guestCount;
  int restaurantCapacity;
  boolean isRestaurantOpen;
  boolean isConfirmed;
  
  public Reservation(int count, int capacity, boolean open) {
    guestCount = count;
		restaurantCapacity = capacity;
		isRestaurantOpen = open;
  }  
  
  public void confirmReservation() {
    /* 
     * Write conditional
     * ~~~~~~~~~~~~~~~~~
     * if restaurantCapacity is greater
     * or equal to guestCount
     * AND
     * the restaurant is open:
     * print "Reservation confirmed"
     * set isConfirmed to true
     * else:
     * print "Reservation denied"
     * set isConfirmed to false
     */
  }
  
  public void informUser() {
    System.out.println("Please enjoy your meal!");
  }
  
  public static void main(String[] args) {
    Reservation partyOfThree = new Reservation(3, 12, true);
    Reservation partyOfFour = new Reservation(4, 3, true);
    partyOfThree.confirmReservation();
    partyOfThree.informUser();
    partyOfFour.confirmReservation();
    partyOfFour.informUser();
  }
}
```

1. Our `Reservation` class has the method `confirmReservation()` which validates if a restaurant can accomodate a given reservation.

    We need to build the conditional logic into `confirmReservation()` using three instance variables:

    * `restaurantCapacity`
    * `guestCount`
    * `isRestaurantOpen`

    Use an `if-then-else` statement:

    If `restaurantCapacity` is greater than or equal to `guestCount` and the restaurant is open, print `"Reservation confirmed"` and set `isConfirmed` to `true`.

    `else` print `"Reservation denied"` and set `isConfirmed` to `false`.