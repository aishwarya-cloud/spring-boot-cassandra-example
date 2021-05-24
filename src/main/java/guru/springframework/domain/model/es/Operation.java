package guru.springframework.domain.model.es;

public enum Operation {
  INDEX("INDEX"),
  UPDATE("UPDATE"),
  DELETE("DELETE");

  private String value;

  Operation(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
