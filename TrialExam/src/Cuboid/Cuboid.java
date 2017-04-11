package Cuboid;

/**
 * Created by georgezsiga on 4/11/17.
 */
public class Cuboid {
  int length, width, height;

  public Cuboid(int length, int width, int height) {
    this.length = length;
    this.width = width;
    this.height = height;
  }

  public double getSurface() {
  double surface = 2 * ((length * width) + (width * height) + (height * length));
  return surface;
  }

  // Create a class that represents a cuboid:
  // It should take its three dimensions as constructor parameters (numbers)
  // It should have a method called `getSurface` that returns the cuboid's surface
  // It should have a method called `getVolume` that returns the cuboid's volume
}
