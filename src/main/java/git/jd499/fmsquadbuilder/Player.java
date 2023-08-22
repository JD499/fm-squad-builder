package git.jd499.fmsquadbuilder;

import org.apache.commons.csv.CSVRecord;

public class Player {

  private final PlayerBasicInfo basicInfo;
  private final PlayerAttributes attributes;
  private final PlayerContractInfo contractInfo;

  public Player(CSVRecord record) {

    this.basicInfo =
        new PlayerBasicInfo(
            record.get("Name"),
            Integer.parseInt(record.get("Age")),
            record.get("Nat"),
            record.get("Club"),
            record.get("Position"),
            record.get("Sec. Position"),
            record.get("Media Description"),
            record.get("Personality"),
            record.get("Height"),
            record.get("Weight"),
            record.get("Transfer Value"),
            record.get("Transfer Status"),
            record.get("Asking Price"),
            record.get("Av Rat"),
            record.get("Max AP"),
            record.get("Min WD"),
            record.get("Max WD"));

    this.attributes =
        new PlayerAttributes(
            Integer.parseInt(record.get("Acc")),
            Integer.parseInt(record.get("Aer")),
            Integer.parseInt(record.get("Agg")),
            Integer.parseInt(record.get("Agi")),
            Integer.parseInt(record.get("Ant")),
            Integer.parseInt(record.get("Bal")),
            Integer.parseInt(record.get("Bra")),
            Integer.parseInt(record.get("Cmd")),
            Integer.parseInt(record.get("Com")),
            Integer.parseInt(record.get("Cmp")),
            Integer.parseInt(record.get("Cnt")),
            Integer.parseInt(record.get("Cor")),
            Integer.parseInt(record.get("Cro")),
            Integer.parseInt(record.get("Dec")),
            Integer.parseInt(record.get("Det")),
            Integer.parseInt(record.get("Dri")),
            Integer.parseInt(record.get("Ecc")),
            Integer.parseInt(record.get("Fin")),
            Integer.parseInt(record.get("Fir")),
            Integer.parseInt(record.get("Fla")),
            Integer.parseInt(record.get("Fre")),
            Integer.parseInt(record.get("Han")),
            Integer.parseInt(record.get("Hea")),
            Integer.parseInt(record.get("Jum")),
            Integer.parseInt(record.get("Kic")),
            Integer.parseInt(record.get("Ldr")),
            Integer.parseInt(record.get("Lon")),
            Integer.parseInt(record.get("L Th")),
            Integer.parseInt(record.get("Mar")),
            Integer.parseInt(record.get("Nat")),
            Integer.parseInt(record.get("OtB")),
            Integer.parseInt(record.get("1v1")),
            Integer.parseInt(record.get("Pac")),
            Integer.parseInt(record.get("Pas")),
            Integer.parseInt(record.get("Pen")),
            Integer.parseInt(record.get("Pos")),
            Integer.parseInt(record.get("Pun")),
            Integer.parseInt(record.get("Ref")),
            Integer.parseInt(record.get("TRO")),
            Integer.parseInt(record.get("Sta")),
            Integer.parseInt(record.get("Str")),
            Integer.parseInt(record.get("Tck")),
            Integer.parseInt(record.get("Tea")),
            Integer.parseInt(record.get("Tec")),
            Integer.parseInt(record.get("Thr")),
            Integer.parseInt(record.get("Vis")),
            Integer.parseInt(record.get("Wor")));

    this.contractInfo = new PlayerContractInfo(record.get("Expires"), record.get("Salary"));
  }

  public PlayerBasicInfo getBasicInfo() {
    return basicInfo;
  }

  public PlayerAttributes getAttributes() {
    return attributes;
  }

  public PlayerContractInfo getContractInfo() {
    return contractInfo;
  }
}
