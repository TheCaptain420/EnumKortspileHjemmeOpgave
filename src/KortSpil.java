public class KortSpil {

    //Opretter enums. Det er hvad den udskriver når man eks. printer: Rank.ace = "ace".
    public enum Rank {
         ace, two, three, four, five, six, seven, eight, nine, ten, jack, queen, king;
    }

        public static void main(String[] args) {
            // Her opretter vi nye variabler og definere dem som enum værdierne. Gør programmet mere overskueligt.
            Rank highcard = Rank.ace;
            Rank facecard = Rank.king;
            Rank card1 = Rank.four;
            Rank card2 = Rank.eight;

            //Printer del 3.
            System.out.println("A Blackjack hand: " + highcard + " and " + facecard + ".");

            //Opdeler opgaverne lidt.
            System.out.println(" ");

            //Gør så computeren kan læse værdierne af card1 og card2
            int card1Val = 4;
            int card2Val = 8;

            //Printer del 5.
            System.out.println("A two card hand: " + card1 + " and " + card2 + ".");
            System.out.println("Hand value: " + (card1Val + card2Val) + ".");

        }
}
