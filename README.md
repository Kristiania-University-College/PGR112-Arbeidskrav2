# Informasjon om arbeidskrav 2 i PGR112 Vår 26

## Del 1: kodeleveranse - innleveringsfrist <2026-03-16 kl.23:59> 
## Del 2: kodereview - tidsfrist <2026-03-20 kl.23:59>


## Arbeidskrav 2: Gym

Arbeidskravet består av to deler. Du skal løse en oppgave, og du skal gi tilbakemelding til en medstudent.

Når du leverer din løsning MÅ du lever koden du har skrevet. Koden din skal være en løsning på oppgaven som er beskrevet nedenfor.
Du kan "pushe" (laste opp hitt) din løsning så ofte du vil underveis fram til tidsfristen er ut. 

 I tillegg KAN du levere en video der du forklarer løsningen din. Det er sterkt anbefalt. På eksamen skal du nemlig også lage videoer der du forklarer koden din. Det er derfor viktig at du trener på det underveis i emnet. Hvis du leverer med video, så kan du jo legge videoen inne i Canvas. Videoen skal ha en lengde på maksimalt 5 minutter.

Koden din skal ligge i form av java-filer i `src/main/java/assignment` folderen. 

Når du gir og mottar tilbakemelding vil det være følgende vurderingskriterier:

- Koden løser oppgaven på en hensiktsmessig måte.
- Koden er oversiktlig og ryddig.

For videoen (hvis video er inkludert i besvarelsen) er det godt å vite at det blir de følgende vurderingskriterier i eksamen som er viktige:

- Studenten forklarer hva koden gjør, og beskriver sentrale, relevante konsepter på en god måte.
- Studenten snakker fritt og viser at hen forstår koden, og ikke leser fra et manus.
- Skjermen viser koden tydelig, og studenten peker eller markerer relevante deler under forklaringen.
- Videoen har akseptabel lyd- og bildekvalitet og er på .mp4-format.
- Videoen inkluderer studentens ansikt som vises imens koden forklares.
- Videoen holder seg innenfor avtalt tidsramme (5 min).

---

## Oppgaven:

En engelsk gymlærer ved en barneskole i Norge har sett seg veldig lei på å ikke ha kontroll på sportsutstyret som benyttes i undervisningen. Hun planlegger derfor å få orden på dette. Prosjektet er i gang. I første omgang har hun prioritert å få kontroll på baller og bordtennisracketer. Disse blir stadig borte, og de trenger en del vedlikehold. Baller trenger stadig påfyll av luft, og bordtennisracketene trenger å få skiftet belegget på utsiden av racketen. Det er planlagt å innlemme flere typer sportsutstyr etter hvert.

Hun har nå gitt alle baller og bordtennisracketer en unik id (tegnet direkte på ballen/racketen). Hun har også fått satt inn noen skap der disse skal oppbevares. Hun har laget en liste (equipment.txt) som inneholder informasjon om alt sportsutstyret (ballene og bordtennisracketene). Sportsutstyret i gymlærerens system har en del felles egenskaper:

En unik id
En plassering som angir i hvilket skap ballen/racketen skal oppbevares
Informasjon om utstyret må erstattes (fordi det er ødelagt eller mistet)
For baller ønsker hun å lagre hva slags type ball det er snakk om (fot-, hånd-, basket- eller volleyball). Hun vil også vite om ballen trenger påfyll av mer luft – altså trenger å pumpes opp.

For bordtennisracketer ønsker hun å vite om racketen trenger å skifte belegg.

Som du ser av inventarlisten (`files/equipment.txt`), så er all denne informasjonen nå registrert i en fil. Her er et utdrag fra equipment.txt med forklaring til de ulike linjene i filen:

Ball → Hva slags type utstyr, i dette tilfellet er det snakk om en ball

12 → Id

Locker 1 → Hvor dette utstyret skal oppbevares

false → Om ballen må skiftes ut

Football → Hva slags type ball

true → Om ballen trenger mer luft

TableTennisRacket → Hva slags type utstyr, i dette tilfellet er det snakk om en bordtennisracket

16 → Id

Locker 5 → Hvor dette utstyret skal oppbevares

false → Om bordtennisracketen må skiftes ut

false → Om bordtennisracketen trenger nytt belegg

---

## Oppgave 1:

Lag en klasse `Inventory` som har som ansvar å kunne lese utstyr-informasjon fra fil `files/equipment.txt`. Ved lesing fra fil skal det opprettes objekter som representerer ballene og bordtennisracketene.

Klassen skal inkludere en public metode `returnAllEquipments()` som kan returnere objektene lest inn fra fil. Du må selv finne ut hvilke klasser du må lage for å kunne representere ballene og bordtennisracketene.

**Det er forventet at du benytter arv.**

Du vil trenge denne metoden som returnerer objektene (lest fra fil) i neste oppgave.

---

## Oppgave 2:

Lag en klasse `Maintenance` som tilbyr tre public metoder:

- `printBallsNeedingMoreAir()`: Metoden skal skrive ut informasjon om hvilke baller som trenger å pumpes opp.
  Du skal skrive ut informasjon som en oppføring i formatet
  "<_Objekt_> <_Id_> ... _need more air_",
  for eksempel: "Fotball 12, Basketball 33, ...  need more air"


- `printEquipmentNeedingToBeReplaced()`: Metoden skal skrive ut informasjon om hvilket utstyr som må erstattes.
  Du skal skrive ut informasjon som en oppføring i formatet
  "<_Objekt_> <_Id_> ... _need to be replaced_",
  for eksempel: "Handball 15, TableTennisRacket 17, ...  need to be replaced"


- `printTableTennisRacketsNeedingNewPad()`: Metoden skal skrive ut hvilke bordtennisracketer som må skifte belegg.
- Du skal skrive ut informasjon som en oppføring i formatet
  "<_Objekt_> <_Id_> ... _need new pad_",


Metodene skal bruke objektene lest inn fra fil for å utføre handlingen sin.

**Det er forventet at du benytter aggregering.**

Det er derfor forventet at du benytter klassen du lagde i oppgave 1 for å lese inn informasjon om utstyret før metodene kalles.


---

## Oppgave 3:

Lag en klasse `MaintenanceTest` med metoden `public void main()` som tester ut om klassen du lagde i oppgave 2 fungerer som tiltenkt. Programmet skal kalle på alle de tre metodene i samme rekkefølge som beskrevet i oppgave 2.

---

## Formkrav

I pull __request -> feedback__: Legg inn kommentar som beskriver ditt arbeid med oppgaven. Du kan også legge inn kommentarer i koden på den samme måten som du allerede gjorde i arbeidskrav 1.
- Hvordan startet du?
- Dukket det opp noen utfordringer underveis?
- Er det noen kjente begrensninger?
- Er det visse deler av løsningen din du gjerne vil ha tilbakemelding på?

Det er ikke et krav at løsningen din skal fungere 100 % riktig for å få godkjent.

Hvis du opplever vesentlige utfordringer og ikke klarer å komme i mål: Lever det du har fått til, og beskriv utfordringene dine. Da kan du få hjelp av en medstudent gjennom tilbakemelding.

---

## Info om oppgaven

> For å jobbe med oppgaven, skal du plassere koden din i denne `src/main/java/assignment`-mappen. 
> Det ligger en video i Canvas modul "Arbeidskrav" som viser hvordan du jobber med oppgaven og lagrer endringer i git og GitHub.
>  I `assignment`-mappen ligger det også en README-fil med detaljert oppgave-beskrivelse.

---

## Tips og teknisk informasjon

> Som hjelp har vi lagret tests for alle oppgavene. For at GitHub classroom klarer å utføre disse testene automatisk er det viktig at du skriver koden **nøyaktig slik** som det står i oppgave beskrivelsen - samt stor og småbokstaver og i **riktig mappe**

> Merk at testene er **kun tenkt som støtte**.
> Hver gang du pusher opp koden din, blir det kjørt testene i GitHub Classroom.


Lykke til!
