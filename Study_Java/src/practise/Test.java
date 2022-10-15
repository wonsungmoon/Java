package src.practise;

public class Test {
    public static void main(String[] args){
        class Ramen{
        }
        class Water{
        }
        class Pot{
            Ramen ramen;
            Water water;
            boolean boil = false;
            boolean sauce = false;
            public Pot(Ramen ramen, Water water) {
                this.ramen = ramen;
                this.water = water;
            }
            public void addSauce() {
                this.sauce = true;
            }
        }
        Ramen ramen = new Ramen();
        Water water = new Water();
        Pot pot = new Pot(ramen,water);
        if(pot.boil != true) {
            System.out.println("기다린다.");
        }
        pot.addSauce();
        if(pot.sauce != true) {
            System.out.println("기다린다.");
        }
        System.out.println("맛있게 먹는다");
    }
}
