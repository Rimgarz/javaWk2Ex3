public class Colour {
    
    int red;
    int green;
    int  blue;

    public Colour(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public Colour(String colourString){
        this.red = 0;
        this.green = 0;
        this.blue = 0;

        switch(colourString){
            case "black":
                this.red = 0;
                this.green = 0;
                this.blue = 0;
                break;
            
            case "red":
                this.red = 255;
                this.green = 0;
                this.blue = 0;
                break;
            case "green":
                this.red = 0;
                this.green = 255;
                this.blue = 0;
                break;
            case "blue":
                this.red = 0;
                this.green = 0;
                this.blue = 255;
                break;
            case "white":
                this.red = 255;
                this.green = 255;
                this.blue = 255;

        }
    }
    public void darker() {
        this.red *= 0.8;
        if (this.red == 0) this.red = 0;
        this.green *= 0.8;
        if (this.green == 0) this.green = 0;
        this.blue *= 0.8;
        if (this.blue == 0) this.blue = 0;
    }

    public void lighter() {
        this.red *= 1.2;
        if (this.red > 255) this.red = 255;
        this.green *= 1.2;
        if (this.green > 255) this.green = 255;
        this.blue *= 1.2;
        if (this.blue > 255) this.blue = 255;
    }

    public void colourValue(){
        System.out.println(red + green + blue);
    }

}
