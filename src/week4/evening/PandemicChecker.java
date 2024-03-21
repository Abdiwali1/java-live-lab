package week4.evening;

public class PandemicChecker {
    public static void main(String[] args) {

        int year = 2024;

        String result = "";

        if (year > 0 && year <= 2024) {

            if (year >= 1346 && year <= 1353) {
                result = "The Black Death";
            } else if (year >= 1665 && year <= 1666) {
                result = "Great Plague of London";
            } else if (year >= 1770 && year <= 1772) {
                result = "Russian plague";
            } else if (year >= 1889 && year <= 1890) {
                result = "Flu pandemic";
            } else if (year == 1916) {
                result = "American polio epidemic";
            } else if (year >= 1918 && year <= 1920) {
                result = "Spanish Flu";
            } else if (year >= 2009 && year <= 2010) {
                result = "H1N1 Swine Flu pandemic";
            } else if (year >= 2014 && year <= 2016) {
                result = "West African Ebola epidemic";
            } else if (year >= 2020 && year <= 2021) {
                result = "COVID-19";
            } else {
                result = "No pandemic in " + year;
            }

           // result = year >= 1346 && year <= 1353 ? "The Black Death" : year >= 1665 && year <= 1666 ? "Great Plague of London" : year >= 1770 && year <= 1666 ? "Russian plague" ...;

        } else {
            result = "Sorry " + year + " is not a valid year";
        }

        System.out.println(result);

        int x = 1;
        x += 2; // x = x + 2

        x++;
        x++;

    }
}

/*
Pandemic Checker [nested if, multibranch, operators]

    Create a program that will define a year. Determine if there was a pandemic in that year. Before checking for pandemics also verify the given year is a valid year value.
        a valid year is a year in the range of: 0 > year < 2024
            -> if the given year is not valid do not check anything else and print:
                    sorry $given_year is not a valid year

        if a valid year is given check the ranges and output the pandemic if there was any

    Use this data for years that had a pandemic:
        1346-1353: The Black Death
        1665-1666: Great Plague of London
        1770-1772: Russian plague
        1889-1890: Flu pandemic
        1916: American polio epidemic
        1918-1920: Spanish Flu
        2009-2010: H1N1 Swine Flu pandemic
        2014-2016: West African Ebola epidemic
        2020-2021: COVID-19
        Any year not in those ranges: No Pandemic in $given_year
 */