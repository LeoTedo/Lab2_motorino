# Lab2_motorino
Esempio di  classe Motorino con i seguenti attibuti:

colore: una stringa indicante il colore del motorino,

velocità: un numero con la virgola indicante la velocità in Km/h che possiede il motorino,

tipo: una stringa indicante la marca e il modello del motorini esempio: (Piaggio Scarabeo), 

antifurto: un boolean che indica se è stato inserito l’antifurto (valore iniziale FALSE).

Caratterisctiche:

•	Il costruttore ha come parametri una stringa per il colore, una stringa per il tipo, un numero con la virgola per la velocità ed assegna opportunamente i valori dei parametri agli attributi.

•	Il metodo getVelocità restituisce la velocità del motorino.

•	Il metodo accelera che ha come parametro un numero con la virgola indicante i Km/h che si vogliono aggiungere alla velocità.  Il metodo verifica il valore dell’attributo antifurto e, se è FALSE aggiunge il valore del parametro all’attributo velocità, altrimenti non fa nulla.

•	Il metodo inserisciAntifurto che assegna un valore TRUE all’attributo antifurto.
