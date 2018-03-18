/**
 * Homework 2.1
 * 
 * This is driver class which tests the functionality of other classes. Mainly
 * it is used to create the objects from another class, fill up the values and 
 * finally prints the results of printing.
 * 
 * @author Sabin Bhandari 30000374
 * @author Shikhat Karkee 30000394
 * @author Temirlan Ulugbek uulu 30000294
 * @author Zihan Qi 30000612
 * 
 * @date 15/03/2018
 */
package bhandari.hw02.core.implementation;
import bhandari.hw02.core.implementation.MovieSorter;

public class Main {
	public static void main(String[] args) {
		/**
		 * Copied from the homework pdf.
		 */
		final Movie[] MOVIES = {
			new Movie("Star Wars", 1977, 8.8),
			new Movie("Shawshank Redemption, The", 1994, 9.0),
			new Movie("Pulp Fiction", 1994, 8.6),
			new Movie("Titanic", 1997, 7.2),
			new Movie("Star Wars: Episode V - The Empire Strikes Back", 1980, 8.6),
			new Movie("Usual Suspects, The", 1995, 8.7),
			new Movie("Schindler''s List", 1993, 8.8),
			new Movie("Saving Private Ryan", 1998, 8.5),
			new Movie("Braveheart", 1995, 8.3),
			new Movie("American Beauty", 1999, 8.8),
			new Movie("Raiders of the Lost Ark", 1981, 8.6),
			new Movie("Godfather, The", 1972, 9.0),
			new Movie("Star Wars: Episode VI - Return of the Jedi", 1983, 8.0),
			new Movie("Blade Runner", 1982, 8.3),
			new Movie("Silence of the Lambs, The", 1991, 8.5),
			new Movie("Forrest Gump", 1994, 7.8),
			new Movie("Star Wars: Episode I - The Phantom Menace", 1999, 7.3),
			new Movie("Sixth Sense, The", 1999, 8.5),
			new Movie("Independence Day", 1996, 6.0),
			new Movie("Terminator 2: Judgment Day", 1991, 7.9),
			new Movie("Se7en", 1995, 8.1),
			new Movie("Fargo", 1996, 8.2),
			new Movie("2001: A Space Odyssey", 1968, 8.3),
			new Movie("Aliens", 1986, 8.2),
			new Movie("Truman Show, The", 1998, 7.8),
			new Movie("Back to the Future", 1985, 7.8),
			new Movie("Casablanca", 1942, 8.8),
			new Movie("One Flew Over the Cuckoo''s Nest", 1975, 8.7),
			new Movie("Good Will Hunting", 1997, 7.9),
			new Movie("Fifth Element, The", 1997, 7.0),
			new Movie("Twelve Monkeys", 1995, 7.8)
		};
		/** CCreating an object sortMOvie		 */
		MovieSorter sortMovie = new MovieSorter();
		
		/** Calling the method sortByTitle to sort the titles and print the results */
		System.out.println("        -------  Sorting Movies By Title ------");
		sortMovie.sortByTitle(MOVIES);
		for (int i=0; i<MOVIES.length; i++){
			System.out.println(MOVIES[i].resultString(i+1));
		}
		/** Calling the method sortByYear to sort the year and print the results */
		System.out.println("\n\n        -------  Sorting Movies By Year ------");
		sortMovie.sortByYear(MOVIES);
		for (int i=0; i<MOVIES.length; i++){
			System.out.println(MOVIES[i].resultString(i+1));
		}
		/** Calling the method sortByScore to sort the scores and print the results */
		System.out.println("\n\n        -------  Sorting Movies By Score ------");
		sortMovie.sortByScore(MOVIES);
		for (int i=0; i<MOVIES.length; i++){
			System.out.println(MOVIES[i].resultString(i+1));
		}
	}

}
