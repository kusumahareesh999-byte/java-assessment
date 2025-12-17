class HillStations
{

    void location()
    {
        System.out.println("Location is:");
    }

    void famousFor()
    {
        System.out.println("Famous for:");
    }
}

class Manali extends HillStations
{

    @Override
    void location()
    {
        System.out.println("Manali is in Himachal Pradesh");
    }

    @Override
    void famousFor()
    {
        System.out.println("It is Famous for Hadimba Temple and adventure sports");
    }
}

class Mussoorie extends HillStations
{

    @Override
    void location()
    {
        System.out.println("Mussoorie is in Uttarakhand");
    }

    @Override
    void famousFor()
    {
        System.out.println("It is Famous for education institutions");
    }
}

class Gulmarg extends HillStations
{

    @Override
    void location()
    {
        System.out.println("Gulmarg is in J&K");
    }

    @Override
    void famousFor()
    {
        System.out.println("It is Famous for skiing");
    }
}

public class AbstractionExample
{
    public static void main(String[] args)
    {

        HillStations h = new HillStations();
        h.location();
        h.famousFor();

        h = new Manali();
        h.location();
        h.famousFor();

        h = new Mussoorie();
        h.location();
        h.famousFor();

        h = new Gulmarg();
        h.location();
        h.famousFor();
    }
}
