package Problem3;

public class MovieAction extends Movie {

    private int lateFeePerDayInDollar = 5;

    public MovieAction(String rating, String title) {
        // homework
        super(rating, title);
        // tip: use the 'super' keyword
    }

    public MovieAction(MovieAction anotherMovie) {
        // homework
        super(anotherMovie);
        // tip: use the 'super' keyword
    }

    @Override
    public int getLateFeeInDollar() {
        return lateFeePerDayInDollar;
    }

    @Override
    public int calcLateFees(int numOfDaysPastDue) {
        // homework
        return numOfDaysPastDue * 5;
    }
}
