package Lab4;

/**
 * This class describe the characteristics of the furniture
 *
 * @version 1.0
 * @author Bets Dmytro
 */

public class Furniture{

    private final String name;
    private final String color;
    private final int height;
    private final int length;
    private final int width;

    /**
     * @param name furniture name
     * @param color furniture color
     * @param height furniture height
     * @param length furniture length
     * @param width furniture width
     */

    Furniture(String name, String color, int height, int length, int width)
    {
        this.name = name;
        this.color = color;
        this.height = height;
        this.length = length;
        this.width = width;
    }

    /**
     * @return name of the one furniture
     */

    public String getName(){
        return name;
    }

    /**
     * @return color of the one furniture
     */

    public String getColor(){
        return color;
    }

    /**
     * @return height of the one furniture
     */

    public int getHeight(){
        return height;
    }

    /**
     * @return length of the one furniture
     */

    public int getLength(){
        return length;
    }

    /**
     * @return width of the one furniture
     */

    public int getWidth(){
        return width;
    }

    /**
     * @return all characteristics of the object
     */

    public String getObject(){
        return "{\"" + getName() + "\", \"" + getColor() + "\", " + getHeight() +
                ", " + getLength() + ", " + getWidth() + "}";
    }


}
