package org.example;

/**
 *  Verifica di informatica 3di
 *  @author prof. Zanzottera Fabio
 *  @version 1.0-3di, 19/11/24
 */
public class Main {  
    /**
     * default constructor no usages
     */
    public Main() {};

    static final String cognome="Biroli"; // assegnare alla variabile il proprio cognome
    static final String nome="Lucia"; // assegnare alla variabile il proprio nome
    static final String currentDate="13/01/25";
    static final String classe="4EI";

    /**
     * Programma principale modificare solo dove indicato nei commenti
     * @param args non modificare questo parametro
     */
    public static void main(String[] args) {
        System.out.println(getIntestazione(cognome,nome)+"\n--------------------------");
        System.out.println("ESERCIZIO 1");
        System.out.println(somma(5,3));
        System.out.println("ESERCIZIO 2");
        System.out.println(isMaggiorenne(32));
        System.out.println("ESERCIZIO 3");
        System.out.println(isVocale('a'));
        System.out.println("ESERCIZIO 4");
        System.out.println(tipoTriangolo(3,3,3));
        System.out.println("ESERCIZIO 5");
        System.out.println(giornoSettimana(300));
        System.out.println("ESERCIZIO 6");
        System.out.println(ordineDecrescente(50,35));
        System.out.println("ESERCIZIO 7");
        System.out.println(giorniLumaca(5,2,15));
        System.out.println("ESERCIZIO 8");
        System.out.println(coordinatePunto(0,0,0,1,1,0));



    }

    /**
     * non modificare questo metodo
     * @param nome nome dello studente
     * @param cognome cognome dello studente
     * @return stringa intestazione
     */
    public static String getIntestazione(String nome, String cognome) {
        return "interrogazione Informatica "+classe+" parte scritta di "+cognome+" "+nome+" data: "+currentDate;
    }

    /**
     * Esercizio 1
     * sviluppare il metodo che restituisce la somma dei due parametri in ingresso
     * @param a addendo 1
     * @param b addendo 2
     * @return somma dei due addendi
     */
    public static int somma(int a,int b) {
        int risposta=0;
        risposta=a+b;
        return risposta;
    }

    /**
     * Esercizio 2
     * scrivere il codice che restituisca la stringa "maggiorenne" se il parametro età (age) indica che la persona ha compiuto i 18 anni,
     * altrimenti restituisca la stringa "minorenne"
     * @param age età della persona
     * @return "maggiorenne" o "minorenne"
     */
    public static String isMaggiorenne(int age) {
        String risposta="maggiorenne,minorenne";
        String[] magg=risposta.split(",");
         if(age>=18){
            return magg[0];
         }
         else{
            return magg[1];
         }
        
    }

    /**
     * ESERCIZIO 3
     * Scrivi un programma Java che verifica se un carattere è una vocale o una consonante.
     * @param carattere da controllare
     * @return vero se è una vocale, falso negli altri casi
     */
    public static boolean isVocale(char carattere) {
        boolean risposta=false;
        switch (carattere) {
            case 'a','A','e','E','i','I','o','O','u','U':
                risposta=true;
                break;
        }
        return risposta;
    }

    /**
     * ESERCIZIO 4
     * Scrivi un programma che data la lunghezza dei tre lati di un triangolo restituisca se questo è equilatero, isoscele o scaleno
     * @param lato1 lato triangolo
     * @param lato2 lato triangolo
     * @param lato3 lato triangolo
     * @return tipo triangolo
     */
    public static String tipoTriangolo(float lato1, float lato2, float lato3) {
        String risposta="equilatero,isoscele,scaleno";
        String[] r=risposta.split(",");
        double diferenza=0.0001;
        if(lato1-lato2<diferenza&&lato2-lato3<diferenza){
            System.out.print("il triangolo è ");
            return r[0];
        }
        else if(lato1-lato2<diferenza||lato2-lato3<diferenza||lato3-lato1<diferenza){
            System.out.print("il triangolo è ");
            return r[1];
        }
        else{
            System.out.print("il triangolo è ");
            return r[2];
        }
        
    }

    /**
     * ESERCIZIO 5
     * Scrivi un programma che restituisca il giorno della settimana dato il giorno dall'inizio dell'anno sapendo che il primo gennaio era lunedì
     * es. giorno=324 => martedì
     * @param giorno (int) giorno dell'anno
     * @return (String) nome del giorno della settimana
     */
    public static String giornoSettimana(int giorno) {
        String risposta="lunedì,martedì,mercoledì,giovedì,venerdì,sabato,domenica";
        String[] giornoSett=risposta.split(",");
        int numeroGiorno= 7%giorno;   //dividendo per sette il resto darà il giorno della settimana(es. resto 3 =mercoledì)
        return giornoSett[numeroGiorno-1];
    }

    /**
     * ESERCIZIO 6
     * Scrivi un programma che dati due valori fine e inizio tali che fine>inizio
     * restituisca una stringa contenente in ordine decrescente tutti i numeri tra fine e inizio (compresi) separati da una virgola
     * es. ordineDecrescente(100,98) => "100,99,98"
     * @param fine primo numero da stampare (più grande)
     * @param inizio ultimo numero da stampare (più piccolo)
     * @return stringa di numeri separati da una virgola
     */
    public static String ordineDecrescente(int fine, int inizio) {
        String risposta="";
        for(int i=fine; i>inizio;i--){  
            risposta=(risposta+i+",");

        }
        
        return risposta;
    }

    /**
     * ESERCIZIO 7
     * Una lumaca si trova alla base di un muro alto (float muro) metri.
     * Ogni giorno sale di (float sale) metri ma, durante la notte, scivola in giù di (float scende).
     * In quanti giorni la lumaca raggiungerà la cima del muro?
     * es: giorniLumaca(5,4,10) => 5
     * @param sale metri percorsi in salita di giorno dalla lumaca
     * @param scende metri persi in discesa durante la notte dalla lumaca
     * @param muro altezza del muro
     * @return giorni impiegati dalla lumaca a salire il muro
     */
    public static int giorniLumaca(float sale, float scende, float muro) {
        int risposta=0;
        int spostamento=0;
        while( spostamento<muro){
            spostamento+=sale;
            risposta++;
            if(spostamento>=muro){
                return risposta;
            }
            spostamento-=scende;
        }
        return risposta;
    }

    /**
     * ESERCIZIO 8
     * In un diagramma cartesiano, dati i vertici P1 P2 e P3 di un rettangolo con i lati paralleli/perpendicolari agli assi
     * calcolare le coordinate del punto P4 e stamparlo come stringa separando l'ascissa e l'ordinata con una virgola
     * es. P1(0,0), P2(0,2), P3(1,0) => coordinatePunto(0,0,0,2,1,0) => 1,2
     * @param x1 ascissa P1
     * @param y1 ordinata P1
     * @param x2 ascissa P2
     * @param y2 ordinata P2
     * @param x3 ascissa P3
     * @param y3 ordinata P3
     * @return ascissaP4,ordinataP4
     */

    public static String coordinatePunto(int x1, int y1, int x2, int y2,int x3,int y3) {
        String risposta="";
        if(x1!=x2&&x1!=x3);{
            if(y1==y2){
                risposta=(x1+","+y3);
            }
            else{
                risposta=(x1+","+y2);
            }
        }
        if(x2!=x1&&x2!=x3);{
            if(y2==y1){
                risposta=(x2+","+y1);
            }
            else{
                risposta=(x2+","+y3);
            }
        }
        if(x3!=x2&&x3!=x1);{
            if(y3==y2){
                risposta=(x3+","+y1);
            }
            else{
                risposta=(x3+","+y2);
            }
        }
        
        
        return risposta;
    }
}