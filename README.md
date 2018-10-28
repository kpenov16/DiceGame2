# DiceGame2
CDIO part 2 - DiceGame2 

#################################
Krav: alle lige nu, 
vi skal undersøge hvilke beskeder
vi viser for hver kast fra 2 til 12  
#################################

Ikke funktionelle krav:
Man skal vise at man kan bruge klasser, 
relationer og GRASP.
Man skal kunne spille på maskinerne i databar på DTU
Ikke forsinkelser > 3 millisek
Spillet skal kunne "let"(det er ikke præcis nok) oversættes til andre sprog.
Man skal kunne "let"(det er ikke præcis nok) udskifte til andre terninger.
Spilleren skal kunne bruge sin pengebeholdning i andre spil.

Funktionelle krav:
Et spil mellem 2 spillere.
Spiller slår på skift med 2 terninger
Spiller får tal fra 2 til 12.
En spiller starter med 1000 kr i sin pengebeholdning.
En spiller vinder ved 3000 kr i sin pengebeholdning.
Spillerens pengebeholdning skal aldrig går i minus.

Spiller slår 2, får +250 i sin pengebeholdning og 
flytter til felt Tower og kan se beskeden 
“Du har fundet Tower og får 250 kr, du er rig!”

Spiller slår 3, får -100 i sin pengebeholdning og 
flytter til felt Crater og kan se beskeden 
“Du har fundet Crater og får -100 kr, du er ikke rig!”

Spiller slår 4, får +100 i sin pengebeholdning og 
flytter til felt Palace gates og kan se beskeden 
“Du har fundet Palace gates og får +100 kr, du er rig!”

Spiller slår 5, får -20 i sin pengebeholdning og 
flytter til felt Cold Desert og kan se beskeden 
“Du har fundet Cold Desert og får -20 kr, du er ikke rig!”

Spiller slår 6, får +180 i sin pengebeholdning og 
flytter til felt Walled city og kan se beskeden 
“Du har fundet Walled city og får +180 kr, du er rig!”

Spiller slår 7, får +0 i sin pengebeholdning og 
flytter til felt Monastery og kan se beskeden 
“Du har fundet Monastery og får +0 kr !”

Spiller slår 8, får -70 i sin pengebeholdning og 
flytter til felt Black cave og kan se beskeden 
“Du har fundet Black cave og får -70 kr, du er ikke rig!”

Spiller slår 9, får +60 i sin pengebeholdning og 
flytter til felt Huts in the mountain og kan se beskeden 
“Du har fundet Huts in the mountain og får +60 kr, du er rig!”

Spiller slår 10, får -80 i sin pengebeholdning og 
flytter til felt The Werewall og kan se beskeden 
“Du har fundet The Werewall in the mountain og får -80 kr, du er ikke rig!”

Spiller slår 11, får -50 i sin pengebeholdning og 
flytter til felt The pit og kan se beskeden 
“Du har fundet The pit in the mountain og får -50 kr, du er ikke rig!”

Spiller slår 12, får +650 i sin pengebeholdning og 
flytter til felt Goldmine og kan se beskeden 
“Du har fundet Goldmine in the mountain og får +650 kr, du er ikke rig!”

###################
Kode anbefelinger: copy paste
###################
- Lav en klasse Spiller der indeholder en spillers attributter og funktioner.
- Lav tilsvarende en klasse Konto der beskriver Spillerens pengebeholdning.
- Overvej hvilke typer attributterne i Spiller, samt i Konto skal have. Lav passende konstruktører.
- Lav passende get og set metoder.
- Lav passende toString metoder.
- Tilføj metoder til at indsætte og hæve penge på en Konto.
- Ændr nu Konto-klassen således at der ikke kan komme en negativ balance, ligeledes skal
metoderne fortælle om transaktionen er blevet gennemført ( Hint : brug statementet return
til at returnere denne information).
- Lav det spil kunden har bedt om med de klasser I nu har.
- Hvis I vælger at bruge GUI’en kan I evt. benytte metoderne i Bilag 1.
- Husk at skrive en oversigt over pakkerne og deres klasser - klassernes ansvarsområder og
evt. spændende funktioner.

