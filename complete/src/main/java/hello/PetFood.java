package hello;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PetFood {
  @JsonProperty("brand_name")
  private String brandName;

  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }
}
