package git.jd499.fmsquadbuilder;

public class PlayerBasicInfo {
  private final String name;
  private final int age;
  private final String nationality;
  private final String club;
  private final String position;
  private final String secondaryPosition;
  private final String mediaDescription;
  private final String personality;
  private final String height;
  private final String weight;
  private final String transferValue;
  private final String transferStatus;
  private final String askingPrice;
  private final String averageRating;
  private final String maxAP;
  private final String minWD;
  private final String maxWD;

  public PlayerBasicInfo(
      String name,
      int age,
      String nationality,
      String club,
      String position,
      String secondaryPosition,
      String mediaDescription,
      String personality,
      String height,
      String weight,
      String transferValue,
      String transferStatus,
      String askingPrice,
      String averageRating,
      String maxAP,
      String minWD,
      String maxWD) {
    this.name = name;
    this.age = age;
    this.nationality = nationality;
    this.club = club;
    this.position = position;
    this.secondaryPosition = secondaryPosition;
    this.mediaDescription = mediaDescription;
    this.personality = personality;
    this.height = height;
    this.weight = weight;
    this.transferValue = transferValue;
    this.transferStatus = transferStatus;
    this.askingPrice = askingPrice;
    this.averageRating = averageRating;
    this.maxAP = maxAP;
    this.minWD = minWD;
    this.maxWD = maxWD;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getNationality() {
    return nationality;
  }

  public String getClub() {
    return club;
  }

  public String getPosition() {
    return position;
  }

  public String getSecondaryPosition() {
    return secondaryPosition;
  }

  public String getMediaDescription() {
    return mediaDescription;
  }

  public String getPersonality() {
    return personality;
  }

  public String getHeight() {
    return height;
  }

  public String getWeight() {
    return weight;
  }

  public String getTransferValue() {
    return transferValue;
  }

  public String getTransferStatus() {
    return transferStatus;
  }

  public String getAskingPrice() {
    return askingPrice;
  }

  public String getAverageRating() {
    return averageRating;
  }

  public String getMaxAP() {
    return maxAP;
  }

  public String getMinWD() {
    return minWD;
  }

  public String getMaxWD() {
    return maxWD;
  }
}
