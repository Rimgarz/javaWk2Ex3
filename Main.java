class Main {
  public static void main(String[] args) {
    
    Colour myRed = new Colour(255,0,0);
    Colour myBlue = new Colour("blue");

    myRed.colourValue();
    myBlue.lighter();
    myRed.darker();

    

  }
}