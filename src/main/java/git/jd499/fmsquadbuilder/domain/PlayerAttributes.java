package git.jd499.fmsquadbuilder.domain;

public record PlayerAttributes(
    int acc,
    int aer,
    int agg,
    int agi,
    int ant,
    int bal,
    int bra,
    int cmd,
    int com,
    int cmp,
    int cnt,
    int cor,
    int cro,
    int dec,
    int det,
    int dri,
    int ecc,
    int fin,
    int fir,
    int fla,
    int fre,
    int han,
    int hea,
    int jum,
    int kic,
    int ldr,
    int lon,
    int lth,
    int mar,
    int nat,
    int otb,
    int ovo,
    int pac,
    int pas,
    int pen,
    int pos,
    int pun,
    int ref,
    int tro,
    int sta,
    int str,
    int tck,
    int tea,
    int tec,
    int thr,
    int vis,
    int wor) {

  // method gets the attribute value for the given attribute name
  public double getAttribute(String attribute) {

    return switch (attribute) {
      case "acc" -> this.acc();
      case "aer" -> this.aer();
      case "agg" -> this.agg();
      case "agi" -> this.agi();
      case "ant" -> this.ant();
      case "bal" -> this.bal();
      case "bra" -> this.bra();
      case "cmd" -> this.cmd();
      case "com" -> this.com();
      case "cmp" -> this.cmp();
      case "cnt" -> this.cnt();
      case "cor" -> this.cor();
      case "cro" -> this.cro();
      case "dec" -> this.dec();
      case "det" -> this.det();
      case "dri" -> this.dri();
      case "ecc" -> this.ecc();
      case "fin" -> this.fin();
      case "fir" -> this.fir();
      case "fla" -> this.fla();
      case "fre" -> this.fre();
      case "han" -> this.han();
      case "hea" -> this.hea();
      case "jum" -> this.jum();
      case "kic" -> this.kic();
      case "ldr" -> this.ldr();
      case "lon" -> this.lon();
      case "lth" -> this.lth();
      case "mar" -> this.mar();
      case "nat" -> this.nat();
      case "otb" -> this.otb();
      case "ovo" -> this.ovo();
      case "pac" -> this.pac();
      case "pas" -> this.pas();
      case "pen" -> this.pen();
      case "pos" -> this.pos();
      case "pun" -> this.pun();
      case "ref" -> this.ref();
      case "tro" -> this.tro();
      case "sta" -> this.sta();
      case "str" -> this.str();
      case "tck" -> this.tck();
      case "tea" -> this.tea();
      case "tec" -> this.tec();
      case "thr" -> this.thr();
      case "vis" -> this.vis();
      case "wor" -> this.wor();
      default -> 0.0;
    };
  }
}
