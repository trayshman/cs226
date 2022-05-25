/**
* Enumeration for abbreviations of month names.
*/
public enum MonthType{
  JAN (0),
  FEB (1),
  MAR (2),
  APR (3),
  MAY (4),
  JUN (5),
  JUL (6),
  AUG (7),
  SEP (8),
  OCT (9),
  NOV (10),
  DEC (11);

  private final int typeCode;

  private MonthType(int typeCode) {
    this.typeCode = typeCode;
  }

  /**
  * Returns the type code associated with the enum.
  *
  * @return The type code associated with the enum.
  */
  public int getTypeCode() { return typeCode; }
}
