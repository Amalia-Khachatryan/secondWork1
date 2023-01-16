public class Main {
    public static void main(String[] args) {

        int ticketPrice = 11518;
        int amountOfRubForOneBonusMile = 20;
        int freeMiles = ticketPrice / amountOfRubForOneBonusMile;

        System.out.println("Количество начисленных миль за купленный билет: " + freeMiles);

    }
}
