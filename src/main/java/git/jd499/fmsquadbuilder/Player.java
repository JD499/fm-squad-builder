package git.jd499.fmsquadbuilder;

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
    private final int salary;
    private final String transferValue;
    private final String transferStatus;
    private final int askingPrice;
    private final int averageRating;
    private final int maxAP;
    private final int minWD;
    private final int maxWD;
    public Player(String csvLine) {
        String[] data = csvLine.split(",");
        this.name = data[0];
        this.age = Integer.parseInt(data[1]);
        this.nationality = data[2];
        this.club = data[3];
        this.position = data[4];
        this.secondaryPosition = data[5];
        this.mediaDescription = data[6];
        this.personality = data[7];
        this.height = data[8];
        this.weight = data[9];
        this.acc = Integer.parseInt(data[10]);
        this.aer = Integer.parseInt(data[11]);
        this.agg = Integer.parseInt(data[12]);
        this.agi = Integer.parseInt(data[13]);
        this.ant = Integer.parseInt(data[14]);
        this.bal = Integer.parseInt(data[15]);
        this.bra = Integer.parseInt(data[16]);
        this.cmd = Integer.parseInt(data[17]);
        this.com = Integer.parseInt(data[18]);
        this.cmp = Integer.parseInt(data[19]);
        this.cnt = Integer.parseInt(data[20]);
        this.cor = Integer.parseInt(data[21]);
        this.cro = Integer.parseInt(data[22]);
        this.dec = Integer.parseInt(data[23]);
        this.det = Integer.parseInt(data[24]);
        this.dri = Integer.parseInt(data[25]);
        this.ecc = Integer.parseInt(data[26]);
        this.fin = Integer.parseInt(data[27]);
        this.fir = Integer.parseInt(data[28]);
        this.fla = Integer.parseInt(data[29]);
        this.fre = Integer.parseInt(data[30]);
        this.han = Integer.parseInt(data[31]);
        this.hea = Integer.parseInt(data[32]);
        this.jum = Integer.parseInt(data[33]);
        this.kic = Integer.parseInt(data[34]);
        this.ldr = Integer.parseInt(data[35]);
        this.lon = Integer.parseInt(data[36]);
        this.lth = Integer.parseInt(data[37]);
        this.mar = Integer.parseInt(data[38]);
        this.nat = Integer.parseInt(data[39]);
        this.otb = Integer.parseInt(data[40]);
        this.ovo = Integer.parseInt(data[41]);
        this.pac = Integer.parseInt(data[42]);
        this.pas = Integer.parseInt(data[43]);
        this.pen = Integer.parseInt(data[44]);
        this.pos = Integer.parseInt(data[45]);
        this.pun = Integer.parseInt(data[46]);
        this.ref = Integer.parseInt(data[47]);
        this.tro = Integer.parseInt(data[48]);
        this.sta = Integer.parseInt(data[49]);
        this.str = Integer.parseInt(data[50]);
        this.tck = Integer.parseInt(data[51]);
        this.tea = Integer.parseInt(data[52]);
        this.tec = Integer.parseInt(data[53]);
        this.thr = Integer.parseInt(data[54]);
        this.vis = Integer.parseInt(data[55]);
        this.wor = Integer.parseInt(data[56]);
        this.contractExpires = data[57];
        this.salary = Integer.parseInt(data[58]);
        this.transferValue = data[59];
        this.transferStatus = data[60];
        this.askingPrice = Integer.parseInt(data[61]);
        this.averageRating = Integer.parseInt(data[62]);
        this.maxAP = Integer.parseInt(data[63]);
        this.minWD = Integer.parseInt(data[64]);
        this.maxWD = Integer.parseInt(data[65]);
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

    public int getSalary() {
        return salary;
    }

    public String getTransferValue() {
        return transferValue;
    }

    public String getTransferStatus() {
        return transferStatus;
    }

    public int getAskingPrice() {
        return askingPrice;
    }

    public int getAverageRating() {
        return averageRating;
    }

    public int getMaxAP() {
        return maxAP;
    }

    public int getMinWD() {
        return minWD;
    }

    public int getMaxWD() {
        return maxWD;
    }
}