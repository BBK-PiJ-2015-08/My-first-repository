/**
 * Your class must have:
 • one and only one static variable, an int called spyCount.
 • an instance variable of type int for the spy’s ID.
 • a constructor method that receives the ID of the spy as an argument, increases spyCount(int) by one, and
 prints on the screen the ID of this spy plus the total number of spies so far.
 • a die() method that prints on the screen “Spy XX has been detected and eliminated” (where XX is the spy’s
 ID), decrements the spy counter and prints on the screen the total number of spies so far.
 • a main method in which several objects of class Spy are created and some of them killed (their method die()
 is called).
 Observe how the static variable is accessed by different objects both to increment and to decrement it.
 */
public class Spy {
    private static int spyCount = 0;
    private int spyID;

    public Spy(int spyID) {
        spyCount++;
        this.spyID = spyID;
        System.out.println("Spy's ID number is " + spyID);
        System.out.println("Total number of spies is now " + spyCount);
    }
    public static int getNumberOfSpies() {
        return spyCount;
    }

    public void die() {
        System.out.println("Spy " + spyID + " has been detected and eliminated");
        spyCount--;
        System.out.println("Only " + spyCount + " spies now remain");
    }

    public static void main(String[] args) {
        Spy spy1 = new Spy(1);
        Spy spy2 = new Spy(2);
        Spy spy3 = new Spy(3);
        spy1.die();
        spy2.die();
        Spy spy4 = new Spy(4);
        Spy spy5 = new Spy(5);
        spy3.die();
    }
}