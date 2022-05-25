



public class LunarLander{
  private int altitude;
  private int velocity;
  private int fuel;
  private int gravity;
  private int thrust;
  private int safeLanding;
  private int count;

	public LunarLander(int nAltitude, int nVelocity, int nFuel, int nGravity, int nThrust, int nSafeLanding){ // constructor
		this.altitude=nAltitude;
		this.velocity=nVelocity;
    this.fuel=nFuel;
    this.gravity=nGravity;
		this.thrust=nThrust;
		this.safeLanding=nSafeLanding;
	}

	public int getAltitude(){
		return this.altitude;
	}
	public int getVelocity(){
		return this.velocity;
	}
	public int getFuel(){
		return this.fuel;
	}
	public int getSafeLanding(){
		return this.safeLanding;
	}
	public void thrust(){
    this.count+=1;
	}
	public void tick(){
		//updates variables
    this.velocity+=this.gravity;

    if(this.fuel>=1){
      if(this.fuel>=this.count){ // if I have enough fuel
        this.velocity-=this.thrust*this.count;
      }
      else{
        this.count=this.fuel; //count is set to the amount of remaining fuel
        this.velocity-=this.thrust*this.count; // and then the thrust activates
      }
    }


    this.altitude-=this.velocity;
    if (this.altitude<1){
      this.altitude=0;
    }

    this.fuel-=this.count;
    if (this.fuel<1){
      this.fuel=0;
    }
  this.count=0;
	}
}
