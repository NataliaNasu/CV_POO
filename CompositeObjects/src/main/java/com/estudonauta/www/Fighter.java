package com.estudonauta.www;

public class Fighter {
    
    //Attributes
    private String name;
    private String nationality;
    private int age;
    private double height;
    private double weight;
    private String category;
    private int victory;
    private int defeat;
    private int draw;
    
    //Special Methods
    public Fighter(String name, String nationality, int age, double height, double weight, int victory, int defeat, int draw) {
        this.name = name;
        this.nationality = nationality;
        this.age = age;
        this.height = height;
        this.setWeight(weight);
        this.victory = victory;
        this.defeat = defeat;
        this.draw = draw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
        this.setCategory();
    }

    public String getCategory() {
        return category;
    }

    private void setCategory() {
        if (this.weight < 52.2) {
            this.category = "Invalid";
        } else if (this.weight < 70.3) {
            this.category = "Light";
        } else if (this.weight < 83.9) {
            this.category = "Medium";
        } else if (this.weight < 120.2){
            this.category = "Heavy";
        } else {
            this.category = "Invalid!";
        }
    }

    public int getVictory() {
        return victory;
    }

    public void setVictory(int victory) {
        this.victory = victory;
    }

    public int getDefeat() {
        return defeat;
    }

    public void setDefeat(int defeat) {
        this.defeat = defeat;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }
    
    //Métodos públicos
    public void presentation() {
        System.out.println("--------------------------------------" +
                "\nWe introduce the fighter " + this.getName() +
                "\nDirectly from " + this.getNationality() + ", "+
                "\nwith " + this.getAge() + " years old, " + this.getHeight() + "cm tall," +
                "\nand " + this.getWeight() + "Kg in weight. " +
                "\nAccumulated " + this.getVictory() + " victory(ies), \n" +
                this.getDefeat() + " defeat(s) and " + this.getDraw() + " draw(s).");
    }
    
    public void status() {
        System.out.println("---------------------------" +
                "\nFIGHTER: " + this.getName() +
                "\nIt´s a " + this.getCategory() + " weight" +
                "\nHave in your career: " +
                "\nVictories: " + this.getVictory() +
                "\nDefeats: " + this.getDefeat() +
                "\nDraws: " + this.getDraw());
    }

    public void winFight() {
        this.setVictory(this.getVictory() + 1);
    }
    
    public void loseFight() {
        this.setDefeat(this.getDefeat() + 1);
    }
    
    public void tieFight() {
        this.setDraw(this.getDraw() + 1);
    }
}