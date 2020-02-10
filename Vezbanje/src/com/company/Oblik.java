package com.company;

public abstract class Oblik implements Comparable<Oblik>,Print {
private String boja;

    public Oblik(String boja) {
        this.boja = boja;
    }
    public abstract double zapremina();
    public abstract double povrsina();

    @Override
    public String toString() {
        return "Boja oblika " + boja;
    }

    public String getBoja() {
        return boja;
    }

    public boolean equals(Object other){
        if(other==null || !(other instanceof Oblik))
            return false;
        Oblik otherOblik= (Oblik) other;
        if(this.boja.equals(otherOblik.getBoja()) && this.zapremina()==otherOblik.zapremina()){
            return true;
        }else{
            return false;
        }

    }
    public int compareTo(Oblik o) {
        return (int) (this.zapremina()-o.zapremina());
    }
    public String toPrint(){
        return "\tClass:" + this.getClass() + "\n" +
                "\tHashCode: " + this.hashCode() + "\n" +
                "\ttoString: " + this.toString();
    }
}



