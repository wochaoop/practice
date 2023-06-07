package com.IharaYuki.DontTrustMe;

public class PC {
    private int prise;
    private String band;
    private String form;

    public PC(int prise, String band, String form) {
        this.prise = prise;
        this.band = band;
        this.form = form;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    @Override
    public String toString() {
        return "PC{" +
                "prise=" + prise +
                ", band='" + band + '\'' +
                ", form='" + form + '\'' +
                '}';
    }
    public void Turnon(){
        System.out.println("on");
    }
    public void Run(){
        System.out.println("run");
    }
    public void Turnoff(){
        System.out.println("off");
    }

    public static void main(String[] args) {
        PC pc = new PC(999,"L","U");
        pc.Turnon();
        pc.Run();
        pc.Turnoff();
        System.out.println(pc);
    }
}

