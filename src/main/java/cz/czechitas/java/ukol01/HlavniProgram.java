package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {

 public void start() {
  Turtle zofka = new Turtle();

  //TODO implementace domácího úkolu
  //presun na na zaciatok, dolava
       /*zofka.turnLeft(90);
        zofka.penUp();
        zofka.move(350);
        zofka.turnRight(90);
        zofka.penDown();

        //prasiatko

        nakresliPrasiatko(zofka);

        //presun doprava

        zofka.turnRight(60);
        zofka.penUp();
        zofka.move(140);

        //8uholnik
        zofka.turnLeft(90);
        zofka.move(100);

        nakresli8uholnik(zofka);

        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(200);
        zofka.turnLeft(90);
        zofka.move(400);
        zofka.turnLeft(90);
        zofka.move(150);

        //kruh
        nakresliKruh(zofka);

        zofka.turnLeft(144);
        zofka.penUp();
        zofka.move(200);
        zofka.turnLeft(150);
        zofka.move(100);

        //slniecko



     //CAST 3 domceky a prasiatko a CAST 4 MENO
        }*/
      //presun na zaciatok, vlavo
       zofka.turnLeft(90);
        zofka.penUp();
        zofka.move(350);
        zofka.turnRight(90);
        zofka.penDown();

        for (int i = 0; i < 5; i++) {
            nakresliDomcek(zofka);
        }

        //presun dole, dolava
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(210);
        zofka.turnRight(90);
        zofka.move(200);
        zofka.turnRight(90);
        zofka.penDown();

        nakresliDomcek(zofka);

        //presun dolava

        zofka.turnLeft(90);
        zofka.penUp();
        zofka.move(600);
        zofka.turnRight(90);
        zofka.penDown();

        nakresliPrasiatko(zofka);

        //presun dolava

        zofka.turnLeft(120);
        zofka.penUp();
        zofka.move(500);
        zofka.turnRight(90);
        zofka.penDown();

        nakresliDomcek(zofka);

  //presun dole

  zofka.turnRight(180);
  zofka.penUp();
  zofka.move(170);
  zofka.turnRight(180);
  zofka.penDown();

  //MENO


  //K

  pismenoK(zofka);

  //A

  pismenoA(zofka);

  //T
  pismenoT(zofka);

  //posun doprava
  zofka.turnRight(90);
  zofka.move(35);
  zofka.turnLeft(90);
  zofka.penDown();

  pismenoK(zofka);
  pismenoA(zofka);

  zofka.setLocation(160, 70);
  nakresliKruh(zofka);
  nakresliPaprsky(zofka);


 }


 private static void pismenoT(Turtle zofka) {
  zofka.move(100);
  zofka.turnLeft(90);
  zofka.move(50);
  zofka.turnRight(180);
  zofka.penUp();
  zofka.move(50);
  zofka.penDown();
  zofka.move(50);
  zofka.turnRight(180);
  zofka.penUp();
  zofka.move(50);
  zofka.turnLeft(90);
  zofka.move(100);
  zofka.turnLeft(90);
  zofka.penUp();
  zofka.move(50);
  zofka.turnLeft(90);
 }

 private static void pismenoA(Turtle zofka) {
  zofka.turnRight(30);
  zofka.move(110);
  zofka.turnRight(120);
  zofka.move(110);
  zofka.turnRight(120);
  zofka.penUp();
  zofka.move(100);
  zofka.turnRight(120);
  zofka.move(50);
  zofka.turnRight(60);
  zofka.penDown();
  zofka.move(50);
  zofka.turnRight(60);
  zofka.penUp();
  zofka.move(50);

  zofka.turnLeft(60);
  zofka.move(50);
  zofka.turnLeft(90);
  zofka.penDown();
 }

   private static void pismenoK(Turtle zofka) {
    zofka.move(100);
    zofka.turnRight(180);
    zofka.penUp();
    zofka.move(50);
    zofka.turnLeft(135);
    zofka.penDown();
    zofka.move(68);
    zofka.turnRight(180);
    zofka.penUp();
    zofka.move(68);
    zofka.penDown();
    zofka.turnLeft(90);
    zofka.move(68);
    zofka.penUp();
    zofka.turnLeft(45);
    zofka.move(50);
    zofka.turnLeft(90);
    zofka.penDown();
   }

    private static void nakresliDomcek(Turtle zofka) {
            for (int i = 0; i < 4; i++) {
                zofka.move(100);
                zofka.turnRight(90);
            }

            zofka.penUp();
            zofka.move(100);

            zofka.turnRight(30);
            zofka.penDown();
            zofka.move(100);
            zofka.turnRight(120);
            zofka.move(100);

            zofka.turnRight(30);
            zofka.penUp();
            zofka.move(100);

            zofka.turnLeft(90);
            zofka.penUp();
            zofka.move(100);
            zofka.turnLeft(90);
            zofka.penDown();
        }


    private void nakresliKruh(Turtle zofka) {
        zofka.penDown();
        for (int i = 0; i < 10; i++) {
            zofka.turnLeft(36);
            zofka.move(30);
        }
        zofka.penUp();
    }

    private void nakresliPaprsky(Turtle zofka) {
        zofka.penUp();
        for (int z = 0; z < 10; z++) {
            zofka.turnRight(90 - 36d / 2);
            zofka.penDown();
            zofka.move(30);
            zofka.penUp();
            zofka.turnLeft(180);
            zofka.move(30);
            zofka.turnRight(90 + 36d / 2);
            zofka.turnLeft(36);
            zofka.move(30);
        }
    }

    private static void nakresli8uholnik(Turtle zofka) {
        for (int i = 0; i <8; i++) {

            zofka.turnRight(45);
            zofka.penDown();
            zofka.move(80);
        }
    }

    private static void nakresliPrasiatko(Turtle zofka) {

        for (int i = 0; i <4; i++) {
            zofka.move(100);
            zofka.turnRight(90);
        }


        zofka.turnLeft(60);
        zofka.move(100);
        zofka.turnRight(120);
        zofka.move(100);

        zofka.turnRight(120);
        zofka.penUp();
        zofka.move(100);
        zofka.penDown();

        zofka.turnRight(30);
        zofka.move(50);
        zofka.penUp();
        zofka.turnLeft(120);
        zofka.move(50);
        zofka.turnLeft(120);
        zofka.penDown();
        zofka.move(50);

        zofka.turnRight(120);
        zofka.penUp();
        zofka.move(100);

        zofka.turnRight(60);
        zofka.penDown();
        zofka.move(50);
        zofka.penUp();
        zofka.turnRight(120);
        zofka.move(50);
        zofka.turnRight(120);
        zofka.penDown();
        zofka.move(50);
    }

 public static void main(String[] args) {
  new HlavniProgram().start();
 }

}




