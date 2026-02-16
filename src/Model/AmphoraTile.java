package Model;

public class AmphoraTile  extends FindingTile{


    private String color; // blue, brown, red, green, yellow, purple

    /**
     * constructor
     * @param id to id
     * @param imagePath to path eikonas
     * @param color to xroma tou amphorea
     */
    public AmphoraTile(int id, String imagePath, String color) {
        super(id, imagePath);
        this.color = color;
    }

    /**
     * epistrefei to xroma tou amphorea
     * @return To xroma os string
     */
    @Override
    public String getColor() {
        return color;
    }
    
}
