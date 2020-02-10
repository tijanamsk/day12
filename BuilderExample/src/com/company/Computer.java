package com.company;

public class Computer {
    //klasa kompjuter koja ima obavezne parametre i opcione parametre
    private String CPU;
    private String RAM;
    private String HDD;

    //opcioni parametri-optional parameters
    private boolean isGraphicCardEnabled;
    private boolean isWifiEnabled;
    // ovde je bitno da postoji obavezni parametri i nekoliko opcionih
    // ovde se ne koristi klasicni konstruktor zbog mnogo parametra vec se koristi Builder klasa

    //pravimo gettere


    public String getCPU() {
        return CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public String getHDD() {
        return HDD;
    }

    public boolean isGraphicCardEnabled() {
        return isGraphicCardEnabled;
    }

    public boolean isWifiEnabled() {
        return isWifiEnabled;
    }
    private Computer(ComputerBuilder builder){
        this.CPU=builder.CPU;
        this.HDD=builder.HDD;
        this.RAM=builder.RAM;
        this.isGraphicCardEnabled=builder.isGraphicCardEnabled;
        this.isWifiEnabled=builder.isWifiEnabled;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", HDD='" + HDD + '\'' +
                ", isGraphicCardEnabled=" + isGraphicCardEnabled +
                ", isWifiEnabled=" + isWifiEnabled +
                '}';
    }

    //pravimo builder klasu to je pomocna klasa koja nam pomaze da napravimo objekat
    //Builder class
    public static class ComputerBuilder{
        // ova klasa uzima obavezne parametre
        private String CPU;
        private String RAM;
        private String HDD;
        //uzima i opcione parametre jer ona mora da ima sve parametre kao da se pravi konstruktor
        private boolean isGraphicCardEnabled;
        private boolean isWifiEnabled;
        //nakon toga konstruktor za builder with bare minimu just required params
        public ComputerBuilder(String CPU, String RAM,String HDD){
            this.CPU=CPU;
            this.RAM=RAM;
            this.HDD=HDD;
        }
        //dajemo dodatne metode kako bi mogli da napravimo fluent interface

        public ComputerBuilder setGraphicCard(boolean isGraphicCardEnabled){
            this.isGraphicCardEnabled=isGraphicCardEnabled;
            return this;
        }
        public ComputerBuilder setWifi(boolean isWifiEnabled){
            this.isWifiEnabled=isWifiEnabled;
            return this;
        }
        //all other optional parameters
        public Computer build(){
            return new Computer(this);
        }
    }
}
