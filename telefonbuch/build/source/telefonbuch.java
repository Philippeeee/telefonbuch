import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class telefonbuch extends PApplet {

String name01 = "Adam Apfel";
String name02 = "Bernd Birne";
String name03 = "Christoph Ce";

String number01 = "9586 88697";
String number02 = "9495 95968";
String number03 = "8596 74859";


public void setup(){



}


public void draw (){

background(255);
fill(0);
textSize(24);
text("Telefonbuch:", 20, 40);
textSize(10);
text(name01 + ":" + number01, 20, 80);
text(name02 + ":" + number02, 20,100);
text(name03 + ":" + number03, 20, 120);
}
  public void settings() { 
size(400, 400); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "telefonbuch" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
