package guru.springframework.domain.model.es;

public enum Type {
  ASSET("asset");

  private String value;

  Type(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
