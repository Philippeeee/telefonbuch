String name01 = "Adam Apfel";
String name02 = "Bernd Birne";
String name03 = "Christoph Ce";

String number01 = "9586 88697";
String number02 = "9495 95968";
String number03 = "8596 74859";


void setup(){
size(400, 400);


}


void draw (){

background(255);
fill(0);
textSize(24);
text("Telefonbuch:", 20, 40);
textSize(10);
text(name01 + ": " + number01, 20, 80);
text(name02 + ": " + number02, 20,100);
text(name03 + ": " + number03, 20, 120);
}
