package Practice;

public interface Pet {

    void feed();

    void play();

     /* pet the animal
     @return is animal happy */
    boolean pet();

    default void trick() {
        System.out.println("Does a trick.");
    }
}
