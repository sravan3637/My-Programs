package ch01_introduction;

/**
 * Chapter 1 Exercise 11:
 *      (Population projection) The U.S. Census Bureau projects population based on the following assumptions:
 *          - One birth every 7 seconds
 *          - One death every 13 seconds
 *          - One new immigrant every 45 seconds
 *      Write a program to display the population for each of the next five years.
 *      Assume the current population is 312,032,486 and one year has 365 days.
 *
 * Created by Sravan Kumar .
 */

public class Ex11_Population {

	public static void main(String[] args) {

		int years = 5;

		double birthRateInSeconds = 7;
		double deathRateInSeconds = 13;
		double immigrantRateInSeconds = 45;
		
		double currentPopulation = 312032486;

		double secondsPerYear = 60 * 60 * 24 * 365;
		
		double birthsPerYear = secondsPerYear / birthRateInSeconds;
		double deathsPerYear = secondsPerYear / deathRateInSeconds;
		double immigrantsPerYear = secondsPerYear / immigrantRateInSeconds;
		
		double secondsPerLeapYear = 60 * 60 * 24 * 366;
		
		double birthsPerLeapYear = secondsPerLeapYear / birthRateInSeconds;
		double deathsPerLeapYear = secondsPerLeapYear / deathRateInSeconds;
		double immigrantsPerLeapYear = secondsPerLeapYear / immigrantRateInSeconds;

		for (int i = 1; i <= years; i++) {

			if (!(i % 4 == 0)) {

				currentPopulation += birthsPerYear + immigrantsPerYear - deathsPerYear ;				

			}else {
				currentPopulation += birthsPerLeapYear + immigrantsPerLeapYear - deathsPerLeapYear ;				
			}

			System.out.println(" year " + i + " population is : " + (int)currentPopulation ) ;

		}

	}


}
