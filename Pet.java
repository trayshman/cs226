/**
* An interface defining the actions common to all virtual pets.
*
* @author Christine Reilly
*/
public interface Pet {

  /**
  * Returns the name of this pet.
  *
  * @return The name of this pet.
  */
  public String getName();

  /**
  * Returns an integer representing this pet's mood. A larger integer is a more
  * positive mood.
  *
  * @return An integer representation of this pet's mood.
  */
  public int getMood();

  /**
  * When this method is called, the pet receives attention.
  *
  * @param amount An integer representation of the amount of attention received by the pet.
  */
  public void receiveAttention(int amount);

  /**
  * Returns an integer representation of this pet's hunger level. A larger integer
  * represents a greater level of hunger.
  *
  * @return An integer representation of this pet's hunger.
  */
  public int getHunger();

  /**
  * When this method is called, the pet receives food.
  *
  * @param amount An integer representation of the amount of food received by the pet.
  */
  public void receiveFood(int amount);

  /**
  * Returns true if the pet is in good health or false if the pet is in poor health.
  *
  * @return true if the pet is in good health or false if the pet is in poor health.
  */
  public boolean getHealth();

  /**
  * This method is called during every time step of the simulation. This method
  * updates the pet's state.
  */
  public void tick();
}
