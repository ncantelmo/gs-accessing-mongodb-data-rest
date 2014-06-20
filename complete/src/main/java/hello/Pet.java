package hello;

public class Pet {
  private String  nickname; 
  private PetFood food;

  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public PetFood getFood() {
    return food;
  }

  public void setFood(PetFood food) {
    this.food = food;
  }
}
