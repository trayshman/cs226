/**
* An interface defining the actions common to all Rock owners.
*
* @author Ryan Jones
*/

public class RockOwner implements Owner{
  /** The amount of food the owner has */
  private int food;

  /** The amount of time the owner has */
  private int time;

  /** The amount of minerals the owner has */
  private int minerals;

  /** The Rock pet the owner has */
  private Rock pet;


  /**
  * Constructs a Rock owner object.
  *
  * @param fd The amount of food the owner has.
  * @param tm The amount of time the owner has.
  * @param mn The amount of minerals the owner has.
  * @param pt The rock pet the owner has.
  */
  public RockOwner (int fd, int tm, int mn, Rock pt){
    this.food=fd;
    this.time=tm;
    this.minerals=mn;
    this.pet=pt;

  }

  /**
  * Returns the amount of food the owner has.
  *
  * @return The amount of food the owner has.
  */
  public int getFoodLevel(){
    return this.food;
  }

  /**
  * Returns the amount of time the owner has.
  *
  * @return The amount of time the owner has.
  */
  public int getTimeLevel(){
    return this.time;
  }

  /**
  * Returns the amount of minerals the owner has.
  *
  * @return The amount of minerals the owner has.
  */
  public int getMineralLevel(){
    return this.minerals;
  }

  /**
  * When this method is called the owner feeds their pet. The owner cannot feed
  * the pet more food than the owner has. In that case, feeds the total amount of food the owner has.
  * @param amount The amount of food to be fed to the pet.
  */
  public void feedPet(int amount){
    if(amount<=this.food){
      this.food-=amount;
      pet.receiveFood(amount);
    }
    else{
      pet.receiveFood(this.food);
      this.food-=this.food;
    }

  }

  /**
  * When this method is called the owner plays with their pet. The owner cannot spend
  * more time than the owner has. In that case, spends the total amount of time the owner has.
  * @param amount The amount of time to be given to the pet.
  */
  public void giveAttention(int amount){
    if(amount<=this.time){
      this.time-=amount;
      pet.receiveAttention(amount);
    }
    else{
      pet.receiveAttention(this.time);
      this.time-=this.time;
    }

  }

  /**
  * When this method is called the owner gives minerals to their pet. The owner cannot spend
  * more minerals than the owner has. In that case, spends the total amount of minerals the owner has.
  * @param amount The amount of minerals to be given to the pet.
  */
  public void giveMinerals(int amount){
    if(amount<=this.minerals){
      this.minerals-=amount;
      pet.fortify(amount);
    }
    else{
      pet.fortify(this.minerals);
      this.minerals-=this.minerals;

    }
  }

  /**
  * When this method is called at the end of every round, updates owner 1 more food point, time point
  * and mineral point.
  */
  public void tick(){
    this.food+=1;
    this.time+=1;
    this.minerals+=1;
  }
}
