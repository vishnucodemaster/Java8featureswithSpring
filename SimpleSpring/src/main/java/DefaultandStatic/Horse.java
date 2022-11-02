package DefaultandStatic;


public interface Horse {
    
    // regular / default interface methods
    
    static int getHorsePower(int rpm, int torque) {
        return (rpm * torque) / 5252;
    }
    
  public static void main(String[] args) {
	  Horse.getHorsePower(2500, 480);
//static interface methods is to provide a simple mechanism that allows us to increase
//the degree of cohesion of a design by putting together 
	  //related methods in one single place without having to create an object.
  }
}
