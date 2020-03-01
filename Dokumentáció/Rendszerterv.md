# Rendszerterv

### A rendszer célja
Rendszerünk célja, hogy a Követelmény és Funkcionális specifikációban meghatározott megrendelői folyamatok megvalósuljanak.
Egy okostelefonokon elérhető online zenelejátszó, ami használhatóságban, megjelenésben és funkcióit tekintve,a megrendelő
kívánságainak eleget téve feltudja vennni a versenyt napjaink legjobb online zenelejátszó alkalmazásaival. Az alkalmazásnak
szüksége lesz egy YouTube linkre ami segitségével letudja játszani a videó alatt lévő hangot. A program képes lesz a zenék
lejátszására a telefon képernyőjének ébrentartása nélkül. A rendszert bárki elfogja tudni érni és az alkalmazás összes funkcióját
kivétel nélkül minden felhasználó teljesen ingyen használhatja.

### Projektterv
Projekten dolgozók listája:
 
![ProjektenDolgozók](/Pictures/AlkalmazasonDolgozok.png)

A projekt menedzseléséért felelős csapat:

![ProjektenDolgozók](/Pictures/Managers.png)

|  Dátum | Tevékenység  |  
|-----------------------|--------------------------|
|    2020.02.03-02.29   | Dokumentációk elkészítése és véglegesítése | 
|         2020.02.29-         |Fejlesztés megkezdése|
|         2020.02.29-         |Unit tesztek| 
|                |Alpha teszt|
|                |Béta teszt|
|         2020.05.12         |Projekt átadása|


### Jelenlegi üzleti folyamatok

![JelenlegiDiagramm](/Pictures/JelenlegiDiagramm.png)

A jelenleg ismert zenehallgatásra alkalmas oldalak sokaknak megfelelőek, mégis számos kompromisszummal járnak, ugyanis a legtöbbjük nem engedi a lezárt képernyővel történő zenehallgatást, illetve nem csak zenék feltöltésére szolgál, ennek köszönhetően a töltési idő is tovább tart.

A másik kompromisszum az, hogy reklámokkal bombázzák a felhasználókat így elkerülve azt, hogy fizetni kelljen a szolgáltatásokért. Ez egy régóta bevett szokás, mégis ugyanazt a reklámot végig nézni újra és újra, egy idő után riasztó lehet. 

Ezért is javasolt egy olyan weboldalt készíteni, amely nem zavarja a felhasználót és rontja el a szórakozását a kéretlen reklámokkal.
Különböző méretű, viszonylag kevés helyet foglaló reklám felületekkel biztosítható a bevétel és az, hogy a legkisebb mértékben zavarjuk a felhasználót szórakozásában.


### Igényelt üzleti folyamatok

![Igényelt](/Pictures/IgenyeltDiagramm.png)

A megrendelő véleménye az, hogy egy leegyszerűsített, a youtube videok csak és kizárólag hangként lejátszását szolgáló weboldal nagyon sikeres lehet. Követelménye, hogy a reklámok ne zavarják a felhasználókat és a lehető legvisszafogottabbak legyenek.

Konvertálás és lejátszás: Szüksége van egy saját lejátszóra, de hogy legyen mit lejátszani, előtte az adott linken szereplő youtube videót konvertálni kell ahoz, hogy csak hangként lehessen lejátszani.

Linktárolás: A felhasználó képes legyen elmenteni a kedvenc zenéinek a linkjeit tárolni. Ehez felhasználókezelés szükséges.



### Követelménylista

|  Követelmény sorszáma | Követelmény megnevezése  | Követelményekről bővebben | 
|-----------------------|--------------------------|---------------------------|
|         K001          |YouTube-on elérhető zenék |         Követelmény specifikáció <br/> 1,2,5. fejezet     |
|         K002          |Lezárt képernyővel való működés|     Követelmény specifikáció <br/> 1,5. fejezet    |                       
|         K003          |Csak szükséges <br/> jogusultságok|     Követelmény specifikáció <br/> 1,5. fejezet         |                       
|         K004          |Reklám mentesség|     Követelmény specifikáció <br/> 1,5. fejezet      |                       
|         K005          |Ingyenes alkalmazás|     Követelmény specifikáció <br/> 1,2,5. fejezet      |                       
|         K006          |Ne legyen adatgyűjtés|    Követelmény specifikáció <br/> 1. fejezet      |                       


### Absztrakciós modell

A program működése során a felhasználó egy féle szerepkörben figyelhető meg. A felhasználó képes zenét játszani, amit a link
alapján megadott videóból konvertál át a videó. A kapott zenéket képesek vagyunk lejátszási listába gyűjteni, illetve ezeket
lejátszani lezárt képernyőnél is.

### Adatbázis terv

![Adatbázis terv](/Pictures/dbdiagram.png)

Music tábla

| Mező név | Tipus/hossz | Kötelező | Érték/validáció | Kulcs | Megj. |
|----------|-------------|----------|-----------------|-------|-------|
| Id | INT | Igen | Auto-increment | PK| |
| name | VARCHAR(200) | Igen | | |
| ytlink | VARCHAR(200) | Igen| | |

Music megszorítások

| Azonosító | Tábla 1 | Mező 1 | Tábla 2 | Mező 2 | Megj. |
|-----------|---------|--------|---------|--------|-------|
| Music_PK | Music | Id | | | |

Playlist tábla

| Mező név | Tipus/hossz | Kötelező | Érték/validáció | Kulcs | Megj. |
|----------|-------------|----------|-----------------|-------|-------|
| Id | INT | Igen | Auto-increment | PK | |
| musicid | INT | Igen | | FK | | 

Playlist megszorítások

| Azonosító | Tábla 1 | Mező 1 | Tábla 2 | Mező 2 | Megj. |
|-----------|---------|--------|---------|--------|-------|
| Playlist_PK | Playlist | Id | | | |
| Musicid_FK | Playlist | Id | Music | Id | |


### Implementációs terv

Az alkalmazás felületét és a mögötte rejlő logikát  AndroidStudio-val szeretnénk megvalósítani, azon belül is Java nyelven. Igyekszünk a felhasználó számára csak a működéshez feltétlenül szükséges mezőket, gombokat megjeleníteni, nem célunk, hogy kezelhetetlennek tűnjön az alkalmazás. A linkek tárolására szükségünk lesz egy adatbázisra, az SQLite nevű adatbázist fogjuk használni a szükséges dolgok tárolására, nem egy nagy hatalmas globális adatbázis lesz, hanem minden készüléknek külön-külön adatbázisa lesz.

### Teszt terv

- Alpha teszt:
	- Az alpha tesztet a fejlesztők végzik, amelyben a rendszer összeomlását próbálják elérni remélhetőleg sikertelenül. Amennyiben 
	felderítenek egy hibát jelentést írnak róla, majd javítják.
	- Az alpha teszt során külön tesztelni kell a fontosabb funkciókat, mintpedig: A link tartalmának beolvasása, az adott videó kovertálása, illetve annak lejátszása, linkek elmentése lejátszási listába

- Beta teszt:
    - Az alpha tesztet követően a felhasználók elvégzik a béta tesztet, melynek során a programban maradt súlyosabb hibák felderítésre kerülnek, majd a fejlesztők javítják őket.
	- A teszt során a stabilitás, letisztultság növelése a cél.
    - (A tesztekről naplót kell készíteni, amely alapján esetleges hibáknál kitölthető a hibajelentő.)

###  Telepítési terv

Az alkamazás telepítéséhez kell android operációs rendszert futtató okostelefon, illetve egy fejlesztési időszakban egy PC. Utobbira azért van szükség, mert a fejlesztés alatt áló alkalmazást, fejlesztőkörnyzettel lehet föltelepíteni a készülékre. A fejlésztés után, mint más 
nem play áruház-béli alkalmazást lehet telepíteni az eszközön, feltéve ha engedélyezve van az, hogy a nem play áruházból való alkalmazást is lehesssen telepíteni az eszközre.

### Fizikai környezet.

Kliens:

    Eszköz1
	    
        Eszköz: Okostelefon

	    Operációs rendszer: API15 Android 4.0.3+ IceCreamSandwich
	
        Szükséges applikációk: Google Play Áruház
	
        Konfiguráció: Nem specifikus.
    
    Eszköz2

        Eszköz: Tablet

	    Operációs rendszer: API15 Android 4.0.3+ IceCreamSandwich
	
        Szükséges applikációk: Google Play Áruház
	
        Konfiguráció: Nem specifikus.


### Karbantartási terv

A szoftveren a későbbiekben nem kell nagyobb karbantartásokat elvégezni. Az esetleges karbantartások
a következőből állhatnak:

    - Tesztelés frissebb verziójú android használatával. Hiba észlelése esetén azok javítása.

    - Esetleges YouTube változtatásokra való reagálás.

    - Igény esetén új funkciók hozzáadása.