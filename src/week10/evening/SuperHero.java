package week10.evening;

import java.util.ArrayList;

public class SuperHero {

    private String superHeroName;
    private String realName;
    private String universe;
    private ArrayList<String> powers;

    public SuperHero(String superHeroName, String realName, ArrayList<String> powers) {
        this.superHeroName = superHeroName;
        this.realName = realName;
        this.universe = getClass().getSimpleName().replace("Hero", "");
        this.powers = new ArrayList<>(powers);
    }

    public void protect(){
        System.out.print(superHeroName + " is protecting");
    }

    public String getSuperHeroName() {
        return superHeroName;
    }

    public void setSuperHeroName(String superHeroName) {
        this.superHeroName = superHeroName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getUniverse() {
        return universe;
    }

    public void setUniverse(String universe) {
        this.universe = universe;
    }

    public ArrayList<String> getPowers() {
        return powers;
    }

    public void setPowers(ArrayList<String> powers) {
        this.powers = powers;
    }

    @Override
    public String toString() {
        return  getClass().getSimpleName() + "{" +
                "superHeroName='" + superHeroName + '\'' +
                ", realName='" + realName + '\'' +
                ", universe='" + universe + '\'' +
                ", powers=" + powers +
                '}';
    }
}
/*
SuperHero [inheritance, overriding, constructors, super]

    Create a class SuperHero

        declare these instance variables:
            super hero name, real name, universe, powers (ArrayList of String)
            make the universe ( universe is referring who makes the movie)

        create a constructor to initialize all the variables

        create an instance method:
            protect() - print $super_hero protecting

        override the toString method

 */