package git.jd499.fmsquadbuilder;

import org.apache.commons.csv.CSVRecord;

public class Player {
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
    private final int acc;
    private final int aer;
    private final int agg;
    private final int agi;
    private final int ant;
    private final int bal;
    private final int bra;
    private final int cmd;
    private final int com;
    private final int cmp;
    private final int cnt;
    private final int cor;
    private final int cro;
    private final int dec;
    private final int det;
    private final int dri;
    private final int ecc;
    private final int fin;
    private final int fir;
    private final int fla;
    private final int fre;
    private final int han;
    private final int hea;
    private final int jum;
    private final int kic;
    private final int ldr;
    private final int lon;
    private final int lth;
    private final int mar;
    private final int nat;
    private final int otb;
    private final int ovo;
    private final int pac;
    private final int pas;
    private final int pen;
    private final int pos;
    private final int pun;
    private final int ref;
    private final int tro;
    private final int sta;
    private final int str;
    private final int tck;
    private final int tea;
    private final int tec;
    private final int thr;
    private final int vis;
    private final int wor;
    private final String contractExpires;
    private final String salary;
    private final String transferValue;
    private final String transferStatus;
    private final String askingPrice;
    private final String averageRating;
    private final String maxAP;
    private final String minWD;
    private final String maxWD;


    public Player(CSVRecord record) {
        this.name = record.get("Name");
        this.age = Integer.parseInt(record.get("Age"));
        this.nationality = record.get("Nat");
        this.club = record.get("Club");
        this.position = record.get("Position");
        this.secondaryPosition = record.get("Sec. Position");
        this.mediaDescription = record.get("Media Description");
        this.personality = record.get("Personality");
        this.height = record.get("Height");
        this.weight = record.get("Weight");
        this.acc = Integer.parseInt(record.get("Acc"));
        this.aer = Integer.parseInt(record.get("Aer"));
        this.agg = Integer.parseInt(record.get("Agg"));
        this.agi = Integer.parseInt(record.get("Agi"));
        this.ant = Integer.parseInt(record.get("Ant"));
        this.bal = Integer.parseInt(record.get("Bal"));
        this.bra = Integer.parseInt(record.get("Bra"));
        this.cmd = Integer.parseInt(record.get("Cmd"));
        this.com = Integer.parseInt(record.get("Com"));
        this.cmp = Integer.parseInt(record.get("Cmp"));
        this.cnt = Integer.parseInt(record.get("Cnt"));
        this.cor = Integer.parseInt(record.get("Cor"));
        this.cro = Integer.parseInt(record.get("Cro"));
        this.dec = Integer.parseInt(record.get("Dec"));
        this.det = Integer.parseInt(record.get("Det"));
        this.dri = Integer.parseInt(record.get("Dri"));
        this.ecc = Integer.parseInt(record.get("Ecc"));
        this.fin = Integer.parseInt(record.get("Fin"));
        this.fir = Integer.parseInt(record.get("Fir"));
        this.fla = Integer.parseInt(record.get("Fla"));
        this.fre = Integer.parseInt(record.get("Fre"));
        this.han = Integer.parseInt(record.get("Han"));
        this.hea = Integer.parseInt(record.get("Hea"));
        this.jum = Integer.parseInt(record.get("Jum"));
        this.kic = Integer.parseInt(record.get("Kic"));
        this.ldr = Integer.parseInt(record.get("Ldr"));
        this.lon = Integer.parseInt(record.get("Lon"));
        this.lth = Integer.parseInt(record.get("L Th"));
        this.mar = Integer.parseInt(record.get("Mar"));
        this.nat = Integer.parseInt(record.get("Nat"));
        this.otb = Integer.parseInt(record.get("OtB"));
        this.ovo = Integer.parseInt(record.get("1v1"));
        this.pac = Integer.parseInt(record.get("Pac"));
        this.pas = Integer.parseInt(record.get("Pas"));
        this.pen = Integer.parseInt(record.get("Pen"));
        this.pos = Integer.parseInt(record.get("Pos"));
        this.pun = Integer.parseInt(record.get("Pun"));
        this.ref = Integer.parseInt(record.get("Ref"));
        this.tro = Integer.parseInt(record.get("TRO"));
        this.sta = Integer.parseInt(record.get("Sta"));
        this.str = Integer.parseInt(record.get("Str"));
        this.tck = Integer.parseInt(record.get("Tck"));
        this.tea = Integer.parseInt(record.get("Tea"));
        this.tec = Integer.parseInt(record.get("Tec"));
        this.thr = Integer.parseInt(record.get("Thr"));
        this.vis = Integer.parseInt(record.get("Vis"));
        this.wor = Integer.parseInt(record.get("Wor"));
        this.contractExpires = record.get("Expires");
        this.salary = record.get("Salary");
        this.transferValue = record.get("Transfer Value");
        this.transferStatus = record.get("Transfer Status");
        this.askingPrice = record.get("Asking Price");
        this.averageRating = record.get("Av Rat");
        this.maxAP = record.get("Max AP");
        this.minWD = record.get("Min WD");
        this.maxWD = record.get("Max WD");
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

    public int getAcc() {
        return acc;
    }

    public int getAer() {
        return aer;
    }

    public int getAgg() {
        return agg;
    }

    public int getAgi() {
        return agi;
    }

    public int getAnt() {
        return ant;
    }

    public int getBal() {
        return bal;
    }

    public int getBra() {
        return bra;
    }

    public int getCmd() {
        return cmd;
    }

    public int getCom() {
        return com;
    }

    public int getCmp() {
        return cmp;
    }

    public int getCnt() {
        return cnt;
    }

    public int getCor() {
        return cor;
    }

    public int getCro() {
        return cro;
    }

    public int getDec() {
        return dec;
    }

    public int getDet() {
        return det;
    }

    public int getDri() {
        return dri;
    }

    public int getEcc() {
        return ecc;
    }

    public int getFin() {
        return fin;
    }

    public int getFir() {
        return fir;
    }

    public int getFla() {
        return fla;
    }

    public int getFre() {
        return fre;
    }

    public int getHan() {
        return han;
    }

    public int getHea() {
        return hea;
    }

    public int getJum() {
        return jum;
    }

    public int getKic() {
        return kic;
    }

    public int getLdr() {
        return ldr;
    }

    public int getLon() {
        return lon;
    }

    public int getLth() {
        return lth;
    }

    public int getMar() {
        return mar;
    }

    public int getNat() {
        return nat;
    }

    public int getOtb() {
        return otb;
    }

    public int getOvo() {
        return ovo;
    }

    public int getPac() {
        return pac;
    }

    public int getPas() {
        return pas;
    }

    public int getPen() {
        return pen;
    }

    public int getPos() {
        return pos;
    }

    public int getPun() {
        return pun;
    }

    public int getRef() {
        return ref;
    }

    public int getTro() {
        return tro;
    }

    public int getSta() {
        return sta;
    }

    public int getStr() {
        return str;
    }

    public int getTck() {
        return tck;
    }

    public int getTea() {
        return tea;
    }

    public int getTec() {
        return tec;
    }

    public int getThr() {
        return thr;
    }

    public int getVis() {
        return vis;
    }

    public int getWor() {
        return wor;
    }

    public String getContractExpires() {
        return contractExpires;
    }

    public String getSalary() {
        return salary;
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