import java.util.Random;


/**
* An interface defining the actions common to all Rock pets.
*
* @author Ryan Jones
*/
public class Rock implements Pet{
  /** The name of the pet rock */
  private String name;
  /** The amount of hunger the pet has */
  private int hunger;
  /** The amount of mood points the pet has */
  private int mood;
  /** The amount of erosion points the pet has */
  private int erosion;
  /** The pet's health, can be good or bad */
  private boolean health;



  /**
  * Constructs a Rock pet object.
  *
  * @param nm The pet's name.
  * @param hg The pet's hunger level.
  * @param md The pet's mood level.
  * @param er The pet's erosion level.
  */
  public Rock (String nm, int hg, int md, int er){
    this.name=nm;
    this.hunger=hg;
    this.mood=md;
    this.erosion=er;
    boolean health = true;
  }

  /**
  * Returns the pet name.
  *
  * @return The name of the pet.
  */
  public String getName(){
    return this.name;
  }

  /**
  * Returns the pet's level of hunger.
  *
  * @return The pet's level of hunger.
  */
  public int getHunger(){
    return this.hunger;
  }

  /**
  * Returns the pet's mood level.
  *
  * @return The pet's mood level.
  */
  public int getMood(){
    return this.mood;
  }

  /**
  * Returns the pet's erosion level.
  *
  * @return The pet's erosion level.
  */
  public int getErosion(){
    return this.erosion;
  }

  /**
  * When this method is called the pet receives attention, increasing their mood level.
  * @param amount The amount that mood is increased.
  */
  public void receiveAttention(int amount){
    this.mood+=amount;
  }

  /**
  * When this method is called the pet is fed, decreasing their hunger level.
  * @param amount The amount hunger is decreased.
  */
  public void receiveFood(int amount){
    this.hunger-=amount;
  }

  /**
  * When this method is called the pet receives minerals, decreasing their erosion level.
  * @param amount The amount that erosion is decreased.
  */
  public void fortify(int amount){
    this.erosion-=amount;
  }

  /**
  * When this method is called at the end of every round, pet's hunger and erosion increase by 1
  * and mood decreases by 1. There is a 20% chance all will change by 5 rather than 1, and
  * a 10% chance none of the factors will change at all.
  */
  public void tick(){
    Random r = new Random();

    int randNum = r.nextInt(10);

    if (randNum==1 || randNum==7){
      this.mood-=5;
      this.hunger+=5;
      this.erosion+=5;
    }
    if (randNum==3){
      this.mood-=0;
      this.hunger+=0;
      this.erosion+=0;
    }
    else{
      this.mood-=1;
      this.hunger+=1;
      this.erosion+=1;
    }
  }

  /**
  * Returns if the pet's health is good or not. As long as mood is 5 or greater, and hunger
  * and erosion are each 5 or lower, pet health will be good.
  * @return Returns true or false to pet having good health.
  */
  public boolean getHealth(){
    if (mood>=5 && erosion<=5 && hunger<=5){
      return true;
    }
    else{
      return false;
    }
  }
}
