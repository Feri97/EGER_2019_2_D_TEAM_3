# Követelmény specifikáció

### Bevezetés

A hordozható zenelejátszás ma már általános dolognak számit, mégis nem is olyan régóta van velünk ez, mint gondolnánk. 1979-ben jelent meg az első, széleskörben elterjedt, kereskedelmi forgalomra szánt hordozható zenelejátszó, ami magnókazettát (angolul: Compact Casette) játszott le. Ez volt a Sony Walkman-je, ami akkor megreformálta az akkori zenehalgatási szokásokat. A 80-as évek tehát a walkman és a magnókazetták korszaka volt, a 90-es évekre a Walkman utódja, a Diskman és az általa lejátszott cd lemezek vették át az uralmatt a hordozható lejátszók területén. 

2000-es évek a digitális lejátszók korszaka lett aminek éllovasa az ipod volt. Ezek többsége már nem csak zene hanem videó lejátszásra is alkalmazasak voltak. Illetve az eddigi 10-20 zene szám helyett már több száz zenét lehetett tárolni egyetlen lejátszón.

A 2010-es évekre a digitális zenelejátszók jobbára eltüntek, ugyanis ezek szerepét átvették szép fokozatosan az okostelefonok amiket sok egyéb más mellett digitális lejátszóként is használható, ezzel kiváltva, az eddigieket. Ebben az évtizedben, a mobilinternet elérhetőségének és sebességének javulásával,elérhetővé vált az hogy nem kell feltétlenül több száz zenét az eszközön offline tárolni, hanem azokat internetről streamelve, közel kiváló minőségben lehessen hallgatni.

### Jelenlegi helyzet
A mai világban streaming szolgáltatások, legyen szó filmes/sororzatos vagy zenei szolgáltatásokról, jelentősen formálják a jelenlegi médiafogysztási szokásokat.

Streaming szolgáltatások, mi esetünkben a zenei streamingek, a felhasználók szempontjából, erőforrásilag és anyagilag egy gazdaságos megoldás, ugyanis erőforrás szempontjából nem foglalnak tárhelyet az adott zenék, mivel ezek egy távoli szerveren találhatóak, anyagilag pedig egy teljesértékü album, legyen az digitálisan vagy fizikálisan beszerzett, árának majdhogynem a feléből több ezer zeneszám érhető el. 

A jelenleg elérhető, nagyobb zenei streamer szolgáltatások  (Spotify, Apple Music, Deezer, Tidal) többnyire fizetős szolgáltatások, amiket különböző konstrukciókban lehet előfizetni. Lehet havi vagy éves szolgáltatás fizetés szempontjából, illetve családi vagy sima használandó eszközök szempontjából. 

Persze némelyik szolgáltatást lehet, ingyenesen használni, de ezért cserébe néhány funkció ami a fizetős változatban alap, nem elérhető, illetve két zeneszám között hangosreklámok játszódnak le.

A mi célunk egy olyan zenelejátszó/streaming létrehozása, ami ingyenesen minden a youtube-on megtalálható zeneszám elérését biztositja, olyan funkciókkal, ami a többi hasonló szolgáltatásnál csak és kizárólag előfizetés ellenében érhető el.


### Vágyálom rendszer

A projektünk célja egy olyan alkalmazás létrehozása, amelyel könnyen tudunk you tube zenei videók linkeit tárolni,és ezeken keresztül képesek vagyunk ezeket csak zenéként lejátszani. Evvel arra törekedve, hogy olyan alkalmazást kínáljunk, ami kikapcsolódást és szórakoztatást nyújt a 
felhasználóknak.

Mivel manapság már mindenki megengedheti magának, hogy okostelefonja legyen, ezért a programunkat úgy fejlesztjük, hogy az elérhető legyen a legtöbb mobilos platformon.

Az alkalmazás elindításakor a kezdőlap fogad minket ahol egy bevezetőt olvashatunk el. Innen tovább tudunk lépni az információkra illetve a bejelentkezésre. A Bejelentkezést követően feltöltés és lejátszás oldalak is elérhetőek. Ezek az oldalak könnyen kezelhetőek és látványos felülettel rendelkeznek, hogy felkeltsék a felhasználó érdeklődését. A feltöltésnél előadó nevet, album nevet, megjelenési évet, a zene 
youtube linkjét, és egy rövismertetőt kell hozzáadni az adott zenéhez.

A későbbiekben attól függően, hogy mennyire lesz sikeres a projektünk, a következő fejlesztéseket szeretnénk végrehajtani.


### Jelenlegi üzleti folyamatok

A jelenleg ismert zenehallgatásra alkalmas oldalak sokaknak megfelelőek, mégis számos kompromisszummal járnak, ugyanis a legtöbbjük nem engedi a lezárt képernyővel történő zenehallgatást, illetve nem csak zenék feltöltésére szolgál, ennek köszönhetően a töltési idő is tovább tart. 

A másik kompromisszum az, hogy reklámokkal bombázzák a felhasználókat így elkerülve azt, hogy fizetni kelljen a szolgáltatásokért. Ez egy régóta bevett szokás, mégis ugyanazt a reklámot végignézni újra és újra, egy idő után riasztó lehet. Ezért is javasolt egy olyan weboldalt készíteni, amely nem zavarja a felhasználót és rontja el a szórakozását a kéretlen reklámokkal. 

Különböző méretű, viszonylag kevés helyet foglaló reklám felületekkel biztosítható a bevétel és az, hogy a legkisebb mértékben zavarjuk a felhasználót szórakozásában. 


### Igényelt üzleti folyamatok

A megrendelő véleménye az, hogy egy leegyszerűsített, a youtube videok csak és kizárólag hangként lejátszását szolgáló weboldal nagyon sikeres lehet. Követelménye, hogy a reklámok ne zavarják a felhasználókat és a lehető legvisszafogottabbak legyenek.

Konvertálás és lejátszás:
Szüksége van egy saját lejátszóra, de hogy legyen mit lejátszani, előtte az adott linken szereplő youtube videót konvertálni kell ahoz, hogy
csak hangként le lehessen játszani.

Linktárolás:
A felhasználó képes legyen elmenteni a kedvenc zenéinek a linkjeit tárolni. Ehez felhasználókezelés szükséges.

Modell:
Kezdőoldal 	-> Bejelentkezés -> Sikeres bejelentkezés 	-> Lejátszás
								-> Feltöltés
		-> Ismertető
		-> Elérhetőségek


### Követelménylista

|  Követelmény sorszáma | Követelmény megnevezése  | Követelményekről bővebben | 
|-----------------------|--------------------------|---------------------------|
|         K001          |YouTube-on elérhető zenék |         1,2,5 fejezet     |
|         K002          |Lezárt képernyővel való működés|     1,5 fejezet    |                       
|         K003          |Csak szükséges <br/> jogusultságok|     1,5 fejezet         |                       
|         K004          |Reklám mentesség|     1,5 fejezet      |                       
|         K005          |Ingyenes alkalmazás|     1,2,5 fejezet      |                       
|         K006          |Ne legyen adatgyűjtés|     1 fejezet      |                       

