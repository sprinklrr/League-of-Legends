/*import java.util.*;

class Tribe extends Ability {
  protected boolean freeze;
  
  public Freljord(String abilityName, double attack, double magic, boolean frozen) {
    super(abilityName, attack, magic);
    freeze = frozen;
    
  }
   

  public boolean autoEmpower(Ability auto) {
    Random randomGen = new Random();
    int freezeNum = randomGen.nextInt(100);
    
    if (freezeNum < 20) {
      freeze = true;
    }
    else {
      freeze = false;
    }
    
    return freeze;
  }
}
*/