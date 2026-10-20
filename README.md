# Växthotellet Greenest

Studielösning till den bifogade individuella uppgiften.

## Kör i IntelliJ

Skapa ett vanligt Java-projekt med JDK 17. Kopiera samtliga tio filer från src till projektets src-mapp utan package-rader. Ersätt eventuell befintlig Main.java. Kör Main.main. Dialogrutorna kräver ett grafiskt skrivbord.

## Kör via terminal med installerad JDK

```sh
javac -encoding UTF-8 -d out src/*.java
java -cp out Main
```

## Beteende

Skriv Igge, Laura, Meatloaf eller Olof. Stora/små bokstäver och vanliga blanksteg runt namnet hanteras. Tomt eller okänt namn ger ett felmeddelande. Avbryt eller krysset i inmatningsrutan avslutar.

Förväntat per dag: Igge 0,02 liter mineralvatten; Laura 2,50 liter kranvatten; Meatloaf 0,24 liter proteindryck; Olof 0,50 liter kranvatten.

## Struktur

Main startar. GreenestApp hanterar dialoger. PlantHotel lagrar och söker. Plant samlar namn och höjd och implementerar Waterable. Palm, Cactus och CarnivorousPlant innehåller sina regler. LiquidType är en enum. Texts samlar gemensamma textkonstanter.

