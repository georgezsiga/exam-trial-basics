package Cuboid;

/**
 * Created by georgezsiga on 4/11/17.
 */
// Create a class that represents a cuboid:
// It should take its three dimensions as constructor parameters (numbers)
// It should have a method called `getSurface` that returns the cuboid's surface
// It should have a method called `getVolume` that returns the cuboid's volume
public class Cuboid {
  int length, width, height;

  public Cuboid(int length, int width, int height) {
    this.length = length;
    this.width = width;
    this.height = height;
  }

  public int getSurface() {
  int surface = 2 * ((length * width) + (width * height) + (height * length));
    System.out.println("The surface of the cuboid is: " + surface);
  return surface;
  }

  public int getVolume() {
    int volume = length * width * height;
    System.out.println("The volume of the cuboid is: " + volume);
    return volume;
  }

  public static void main(String[] args) {
    Cuboid cuboid = new Cuboid(4, 6, 7);
    cuboid.getSurface();
    cuboid.getVolume();
  }

}
