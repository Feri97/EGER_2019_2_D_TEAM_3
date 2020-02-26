# Funkcionális Specifikáció


### Áttekintés

A hordozható zenelejátszás mára már hétköznapi dolognak számit, mégis nem is olyan régóta van velünk, mint azt gondolnánk. 1979-ben jelent meg az első, széleskörben elterjedt, kereskedelmi forgalomra szánt hordozható zenelejátszó, ami magnókazetta (angolul: Compact Casette) lejátszására volt alkamas. Ez volt a Sony Walkman-je, ami akkor megreformálta az akkori zenehalgatási szokásokat. A 80-as évek tehát a walkman és a magnókazetták korszaka volt, a 90-es évekre a Walkman utódja, a Diskman és az általa lejátszott cd lemezek vették át az uralmatt a hordozható lejátszók területén. 

2000-es évek a digitális lejátszók évtizede lett aminek éllovasa az ipod volt. Ezek többsége már nem csak zene hanem videó lejátszásra is alkalmazasak voltak. Illetve megnőtt a tárolási kapacitás is, aminek köszönthetően az eddigi 10-20 zene szám helyett már több száz zenét lehetett tárolni egyetlen lejátszón.

A 2010-es évekre a digitális zenelejátszók jobbára eltüntek, ugyanis ezek szerepét átvették szép fokozatosan az okostelefonok amiket sok egyéb más mellett digitális lejátszóként is használható, ezzel kiváltva, az eddigieket. Ebben az évtizedben, a mobilinternet elérhetőségének és sebességének javulásával,elérhetővé vált az hogy nem kell feltétlenül több száz zenét az eszközön offline tárolni, hanem azokat internetről streamelve, közel kiváló minőségben lehessen hallgatni.

### A rendszer célja, és nem céljai
A rendszer alapvető célja egy olyan mobilos alkalmazás, amely segítségével, a felhasználó, képes az adott videó alól, kinyerni a hanganyagot, és ezt képes lejátszani, a telefon kijelzőjének ébren tartása nélkül. 
Az alkalmazás, nem gyűjt semmi féle adatot a felhasználóról, egy pár jogosultságra van szüksége, hogy a lezárt képernyő alatt is tovább legyen képes működni az alkalmazás. Az alkalmazás nem tartalmaz reklámokat, valamint nem rendelkezik semmilyen nemű költséggel, teljesen ingyenes. 
Nem célja az alkalmazásnak, hogy a userek által használt különböző készülékekről, információt gyűjtsön, továbbá az alkalmazás tökéletes futása érdekében nélkülözhetetlen jogosultságok mellett, más egyéb nem szükséges jogosultságokat kérni.


### Jelenlegi helyzet

A mai világban streaming szolgáltatások, legyen szó itt mozgóképes vagy zenei szolgáltatásokról, jelentősen formálják a jelenlegi médiafogysztási szokásokat.

Streaming szolgáltatások, mi esetünkben a zenei streamingek, a felhasználók szempontjából, hardveres szempontból és anyagilag egy gazdaságos megoldás, ugyanis erőforrás szempontjából nem foglalnak tárhelyet az adott zenék, mivel ezek egy távoli szerveren találhatóak, anyagilag pedig egy teljesértékü album, legyen az digitálisan vagy fizikálisan beszerzett, árának majdhogynem a feléből vagy akár ingyen, több ezer zeneszám érhető el. 

A jelenleg elérhető, nagyobb zenei streamer szolgáltatások  (Spotify, Apple Music, Deezer, Tidal) többnyire fizetős szolgáltatások, amiket különböző konstrukciókban lehet előfizetni. Lehet havi vagy éves szolgáltatás fizetés szempontjából, illetve családi vagy sima előfizetés a használandó eszközök száma szempontjából. 

Ha nem akarnánk zenei streamereken keresztül online zenéket hallgatni, akkor alternatívaként ott lehet számunkra a youtube. Bár a youtube elsődlegesen videók megosztására szolgál, több olyan videó fellelhető az oldalon, ahol vizuálisan egy kép van statikusan beállítva és alatt szól a zene. Sokan vannak olyanok, akik így hallgatnak az interneten zenét, de ennek a megoldásnak van egy pár hátulütője, főleg telefonon keresztül. Az egyik az, mikor az ember telefonon keresztül hallgatva zenét, a készüléknek folyamatosan feloldott állapotban kell lennie, ugyanis ha azt lezárjuk akkor a lejátszás abba marad. Vagy közben nem tudunk semmi mást csinálni a készüléken, ugyanis egyből megáll a lejátszás ha átváltunk egy másik app-ra.

Célunk egy olyan lejátszó alkalmazás létrehozása ami youtube-ról képes zenéket lejátszani úgy, hogy le lehessen zárni a telefont illetve alkalmazást váltani anélkül, hogy a lejátszás abba maradna.

### Vágyálomrendszer leírása

A projektünk célja egy olyan alkalmazás létrehozása, amelyel könnyen tudunk you tube zenei videók linkeit tárolni,és ezeken keresztül képesek vagyunk ezeket csak zenéként lejátszani. Evvel arra törekedve, hogy olyan alkalmazást kínáljunk, ami kikapcsolódást és szórakoztatást nyújt a felhasználóknak.

Mivel manapság már mindenki megengedheti magának, hogy okostelefonja legyen, ezért a programunkat úgy fejlesztjük, hogy az elérhető legyen a legtöbb mobilos platformon.

Az alkalmazás elindításakor a kezdőlap fogad minket ahol egy bevezetőt olvashatunk el. Innen tovább tudunk lépni az információkra illetve a bejelentkezésre. A Bejelentkezést követően feltöltés és lejátszás oldalak is elérhetőek. Ezek az oldalak könnyen kezelhetőek és látványos felülettel rendelkeznek, hogy felkeltsék a felhasználó érdeklődését. A feltöltésnél előadó nevet, album nevet, megjelenési évet, a zene youtube linkjét, és egy rövismertetőt kell hozzáadni az adott zenéhez.
A későbbiekben attól függően, hogy mennyire lesz sikeres a projektünk, a következő fejlesztéseket szeretnénk végrehajtani.

### Jelenlegi üzleti folyamatok

![JelenlegiDiagramm](/Pictures/JelenlegiDiagramm.png)

A jelenleg ismert zenehallgatásra alkalmas oldalak sokaknak megfelelőek, mégis számos kompromisszummal járnak, ugyanis a legtöbbjük nem engedi a lezárt képernyővel történő zenehallgatást, illetve nem csak zenék feltöltésére szolgál, ennek köszönhetően a töltési idő is tovább tart.

A másik kompromisszum az, hogy reklámokkal bombázzák a felhasználókat így elkerülve azt, hogy fizetni kelljen a szolgáltatásokért. Ez egy régóta bevett szokás, mégis ugyanazt a reklámot végig nézni újra és újra, egy idő után riasztó lehet. 

Ezért is javasolt egy olyan weboldalt készíteni, amely nem zavarja a felhasználót és rontja el a szórakozását a kéretlen reklámokkal.
Különböző méretű, viszonylag kevés helyet foglaló reklám felületekkel biztosítható a bevétel és az, hogy a legkisebb mértékben zavarjuk a felhasználót szórakozásában.

### Igényelt üzleti folyamatok

![Igényelt](/Pictures/IgenyeltDiagramm.png)

A megrendelő véleménye az, hogy egy leegyszerűsített, a youtube videok csak és kizárólag hangként lejátszását szolgáló weboldal nagyon sikeres lehet. Követelménye, hogy a reklámok ne zavarják a felhasználókat és a lehető legvisszafogottabbak legyenek.

Konvertálás és lejátszás: Szüksége van egy saját lejátszóra, de hogy legyen mit lejátszani, előtte az adott linken szereplő youtube videót konvertálni kell ahoz, hogy csak hangként le lehessen játszani.

Linktárolás: A felhasználó képes legyen elmenteni a kedvenc zenéinek a linkjeit tárolni. Ehez felhasználókezelés szükséges.
Modell: Kezdőoldal -> Bejelentkezés -> Sikeres bejelentkezés -> Lejátszás -> Feltöltés -> Ismertető -> Elérhetőségek

### Követelménylista

![KövetelményLista](/Pictures/kovetelmenylista.png)

### Használati esetek

A leggyakoribb használati eset, amikor a user egy zenét szeretne hallgatni, ami a YouTube videómegosztón elérhető, ilyenkor a user ahelyett, hogy felkeres egy streaming szolgáltatást a sok közül, áttanulmányozza a havidíj rendszerét, kiválasztja a számára alkalmas csomagot, beregisztrál, és ezen a fizetős platformon hallgatná a zenét, ehelyett egyszerűen csak megkeresi YouTube-on az általa hallgatni kívánt zenét, kimásolja az URL címét, majd beilleszti az általunk készített alkalmazásba, és máris hallgathatja zenét. Mindezek mellett, amennyiben lezárt képernyőt használná (tömegközlekedésen utazik, sportol, stb..), lehetősége legyen rá, azaz a zene lejátszása ne álljon meg amikor a képernyő lezárásra kerül.

![Használatiesetek](/Pictures/Usecases.png)

### Képernyőterv

![Képernyőterv](/Pictures/screen.png)

### Forgatókönyvek

A felhasználó zenét szeretne hallgatni, de nem rendelkezik semmi féle streaming szolgáltató fiókkal. 
Ellátogat a YouTube.com-ra, ahol kiválasztja a hallgatni kívánt zenét, majd egyéb tevékenység miatt lezárja a mobileszközének a kijelzőjét. Ebben a pillanatban a zene lejátszása szünetel. 
Vissza megy a YouTube-ra kimásolja az adott zene URL-jét, bemásolja az alkalmazásunkba, elindítja a zenét, az alkalmazásból, és hallgathatja a kívánt zenét, akár lezárt képernyővel is.

### Funkció – követelmény megfeleltetés

![KövetelményMegfeleltetés](/Pictures/kovetelmenylista.png)


### Fogalomszótár

Streaming: Egyidejű, vagy azonnali adatfolyam, általában tömörített multimédiás információ interneten keresztül való kézbesítése, 
amely a bináris számítógépes fájlformátumokhoz (például AVI) viszonyítva kevésbé célozza meg a videotartalom teljes hűségű visszaállítását, 
elsősorban az azonnaliságra összpontosít.

Admin: Az átlagos felhasználónál több mindenhez fér hozzá.
