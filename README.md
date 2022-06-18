# creditBancarInterfata
simulare credit bancar cu ajutorul interfetei
Se cere sa se creeze un program care simuleaza un sistem de credite bancare.
Se cer urmatoarele implementari.
1. O clasa ce defineste o persoana si datele acesteia:
-numele persoanei
-varsta persoanei
-CNP
-salariu net
2. O interfata numita "UnitateBancara" cu urmatoarele metode declarate:
- O metoda pentru a calcula cretitul. Metoda trebuie sa primeasca ca parametrul un obiect de tipul Persoana
- O metoda care va calcula dobanda creditului. Metoda trebuie sa primeasca ca parametrul un obiect de tipul Persoana

3. Se vor crea doua clase ce vor implementa interfata creata precedent.
a. Clasa BancaPentruLocuinte
- In aceasta banca creditul este salariul net al persoanei inmultit cu 100
- Dobanda creditului este de 5%
b. Clasa BancaPentruNevoiPersonale
- In aceasta banca creditul este salariul net al persoanei inmultit cu 10
- Dobanda creditului este de 8%

Atentie: Dobanda se va calcula din creditul total.

Cerinte: (Pentru aceasta creati o clasa separata "Main" unde veti scrie metoda main)
1.Se cere sa se declare un obiect de tipul UnitateBancara (Atentie doar declarati in prima faza)
2.Se cere sa se citeasca de la tastatura datele unei persoane corespunzator.
 a. Daca persoana are varsta mai mica decat 18 ani, se va afisa un mesaj "Persoana nu este eligibila pentru un credit" si se va iesi din program.
 b. Daca persoana are varsta cuprinsa intre 18 si 40 de ani unitatea bancara va fi una de tipul BancaPentruLocuinte.
 c. Daca persoana are varsta peste 40 de ani unitatea bancara va fi una de tipul BancaPentruNevoiPersonale.

Sa se calculeze si sa se afiseze limita maxima a creditului si dobanda persoanei in functie de criteriile de mai sus.


Pentru clase abstracte sa refceti problema de la interfete. In loc de interfata o sa folositi o clasa abstracta. (Explicati diferentele)
