package com.company.creatures;

public class FarmAnimal extends Animal implements Edbile{
    protected Boolean isLive = true ;
    public FarmAnimal(String species) {
        super(species);
    };

    public void beEaten()
    {
        if(!isLive)
        {
            System.out.println("Zwierze juz nie zyje...");
            return;
        }

        System.out.println("Zwierze zostalo zjedzone. :(");
        isLive = false;
    }

}
