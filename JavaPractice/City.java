import java.util.List;

public class City{
    private String name;
    private List<Theatre>theatres;
    public City(String name,List<Theatre>theaters){
        this.name=name;
        this.theaters=theaters;
    }

    public String getName(){return name;}

}
