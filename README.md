# Java - Exam 1 

## Schreibe einen Primzahl-Checker (50 Punkte)

Schreib ein Programm, dass eine Zahl von der Konsole einliest und prüft ob es sich um eine Primzahl handelt oder nicht. 
Eine Primzahl ist eine Zahl, die nur durch sich selbst und 1 teilbar ist. 

Einige Beispiele:
11, 17, 37, 23, 89 sind Primzahlen. 
34, 66, 52 sind keine Primzahlen.

## Römische Zahlen (30 Punkte)

Schreibe ein Programm, dass eine positive Zahl zwischen 0 und 100 von der Konsole einliest und ihre Repräsentation im römischen Zahlensystem ausgibt. Im römischen Zahlensystem werden Zahlen als Summen dargestellt:

 I=1
 V=5
 X=10
 L=50
 C=100
 
 Einige Beispiele: 
 7 = VII
 8 = VIII
 9 = IX
 93 = XCIII

Einige Regeln für das Übersetzen 
* Zeichen dürfen maximal 3-mal nebeneinander verwendet werden (XXX = 30, III = 3)
* Steht eine kleinere Einheit vor einer größeren subtrathiert man diese (IV = 4 "eins vor fünf", XC = 90 "10 vor hundert")

## Programmauswertung (10 Punkte)

Wie sieht die Ausgabe dieses Programms aus? 

```java
int number = 12; 
System.out.println(number/5);   "2"
System.out.println(number/5.0);  "2.4"
number += 7;  
System.out.println(number); "19"
```

## Datentypen (5 Punkte)

Welche Datentypen kennst du? 
Gibt es Unterschiede bei der Verwendung zwischen einem `int` und einem `Integer`? 


Wahrheitswerte
boolean

ganzzahlige Werte:
byte
short 
int

Kommazahlen:
float
float
double

zeichen:
char

zeichenkette:
String

array

Integer:
int + Methoden z.B: leftshift, rightshift, vorzeichen, highest/lowest bit, string konvertierung, ....

## Scope (5 Punkte) 

Was ist der Scope einer Variable? 
Erkläre anhand eines kleinen Beispielprogramms.


"Lebenszeit/Anwendungsbereich einer Variable"


```java
public class Main {

 private static void liveGame(int[][] field, int[][] nextGen) {
        int aliveNeighbours;                    /*in der gesamten Methode sichtbar*/ 
        for (int i = 0; i < 10; i++) {          /*i start*/
            for (int j = 0; j < 10; j++) {      /*j start */
                aliveNeighbours = 0;
                for (int k = -1; k <= 1; k++) {  /*k start*/
                    for (int l = -1; l <= 1; l++) {  /*l start*/
                        try {
                            aliveNeighbours += field[i + k][j + l];

                        } catch (ArrayIndexOutOfBoundsException e) {

                        }
                    } /* l end*/
                } /*k end*/
                aliveNeighbours -= field[i][j];

                if ((field[i][j] == 1) && (aliveNeighbours < 2))
                    nextGen[i][j] = 0;
                else if ((field[i][j] == 1) && (aliveNeighbours > 3))
                    nextGen[i][j] = 0;
                else if ((field[i][j] == 0) && (aliveNeighbours == 3))
                    nextGen[i][j] = 1;
                else
                    nextGen[i][j] = field[i][j];
            } /* j ends */
        } /* i end */
    }
}
```
