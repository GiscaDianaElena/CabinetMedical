# CabinetMedical

Laborator 3 -> Exercitiu

Sa se proiecteze un sistem de alimente.
 
Avem clasele Aliment -> Carne, Lapte, Cereale.
Avem niste Categorii: LACTATE, PAINE, MEZELURI.
 
Alimentele au urmatoarele campuri: pret, data expirare, ingrediente, calorii, tip aliment.
Alimentul carne are 1.05 calorii, laptele are 3.05 si cerealele 2.56. 
 
Folositi cat mai mult poo, sa aveti un singur fisier pentru o singura clasa, sa tineti cont de incapsulare (campuri private), sa aveti constructori, getters, setters (se genereaza automat din intelij).
 
1) Proiectati clasele.
2) Faceti o lista in Main cu cateva alimente. (Folositi List.of(...) pentru a face o lista, sau List<Aliment> alimente = new ArrayList<>(); si folositi alimente.add(obiect)) -> pentru a avea acces la metoda alimente.stream() )
3) Sortati folosind stream() dupa numarul de calorii.
