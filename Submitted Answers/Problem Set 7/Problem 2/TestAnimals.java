public class TestAnimals 
{
    public static void main(String[] args) 
    {
        Fish d = new Fish();
        d.setName("Goldie");

        Cat c = new Cat("Kitty");

        Animal a = new Fish();  
        ((Fish)a).setName("Nemo");

        Animal e = new Spider(); 

        Pet p = new Cat("Garfield");
        
        System.out.println("Trying the methods:");
        d.walk();
        d.eat();
        d.play();
        System.out.println();

        c.walk();
        c.eat();
        c.play();
        System.out.println();

        a.walk();
        a.eat();
        ((Fish) a).play(); 
        System.out.println();

        e.walk();
        e.eat();
        System.out.println();
        
        System.out.println("Pet's name is: " + p.getName());
        p.play();
        System.out.println();

        System.out.println("Trying array of animals:");
        Animal[] animals = new Animal[3];
        animals[0] = new Fish();
        ((Fish) animals[0]).setName("Bubbles");
        animals[1] = new Cat("Tiger");
        animals[2] = new Spider();

        for (int i = 0; i < animals.length; i++) 
        {
            animals[i].walk();
            animals[i].eat();

            if (animals[i] instanceof Pet) 
            {
                Pet pet = (Pet) animals[i];
                pet.play();
            }

            System.out.println();
        }
    }
}
