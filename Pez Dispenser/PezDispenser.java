public class PezDispenser {
  public final int MAX_PEZ =12;
  private String mCharacterName;
  private int mPezCount;
  
  //constructor
  public PezDispenser(String characterName){
    mCharacterName = characterName;
    mPezCount = 0;
  }
  
  public boolean dispense(){
    boolean wasDispensed = false;
    if(!isEmpty()){
      mPezCount--;
      wasDispensed = true;
    }
    return wasDispensed;
  }
  
  public boolean isEmpty(){
    return mPezCount == 0;
  }
  
  public void load(){
   load(MAX_PEZ);
  }
  
  public void load(int pezAmount){
   int newAmount = mPezCount + pezAmount;
    if(newAmount > MAX_Pez){
      throw new IllegalArgumentException("To Many PEZ!!!");
    }
    mPezCount = newAmount;
  }
  
  public String getCharacterName() {
    return mCharacterName;
  }
}