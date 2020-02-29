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


### Követelménylista

|  Követelmény sorszáma | Követelmény megnevezése  | Követelményekről bővebben | 
|-----------------------|--------------------------|---------------------------|
|         K001          |YouTube-on elérhető zenék |         Követelmény specifikáció <br/> 1,2,5. fejezet     |
|         K002          |Lezárt képernyővel való működés|     Követelmény specifikáció <br/> 1,5. fejezet    |                       
|         K003          |Csak szükséges <br/> jogusultságok|     Követelmény specifikáció <br/> 1,5. fejezet         |                       
|         K004          |Reklám mentesség|     Követelmény specifikáció <br/> 1,5. fejezet      |                       
|         K005          |Ingyenes alkalmazás|     Követelmény specifikáció <br/> 1,2,5. fejezet      |                       
|         K006          |Ne legyen adatgyűjtés|    Követelmény specifikáció <br/> 1. fejezet      |                       


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
