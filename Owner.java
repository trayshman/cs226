/**
* An interface defining actions common to all pet owners.
*
* @author Christine Reilly
*/
public interface Owner {

  /**
  * Returns the amount of pet food this owner has.
  *
  * @return An integer representation of the amount of pet food this owner has.
  */
  public int getFoodLevel();

  /**
  * Returns the amount of time this owner has available to give to their pet.
  *
  * @return An integer representation of the amount of time this owner has available to give to their pet.
  */
  public int getTimeLevel();

  /**
  * When this method is called the owner feeds their pet. The owner cannot feed
  * the pet more food than the owner has.
  *
  * @param amount An integer representation of the amount of food given to the pet.
  */
  public void feedPet(int amount);

  /**
  * When this method is called the owner gives attention to their pet. The owner
  * cannot give more attention than the amount of time the owner has available.
  *
  * @param amount An integer representation of the amount of time the owner gives attention.
  */
  public void giveAttention(int amount);

  /**
  * This method is called during every time step of the simulation. This method
  * updates the owner's state.
  */
  public void tick();

}
