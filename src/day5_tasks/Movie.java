package day5_tasks;

public class Movie {
    public static void main(String[] args) {

        //declare the variables

        String name = "The Pale Blue Aye";
        String genre = "American mystery thriller";
        short duration = 2;
        int releaseDate = 2022;
        char rating = 'R';
        boolean isASequelsOrNot = false;
        boolean isOnDvd = false;
        int rottenTomatoes = 63;

        //assignment

        System.out.println("------Welcome to the Cinema------");
        System.out.println("Tonight we are streaming " + name + "which was released on " + releaseDate + "." + " \nThis " + genre + " movie got a " + rottenTomatoes + " rating on rotten Tomatoes." + "\nThe rating is " + rating + " and it runs for " + duration + " hours." + " \nThis is sequel? " + isASequelsOrNot + " and is on dvd? " + isOnDvd );











    }
}
