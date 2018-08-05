package Bonuses;

//        var planets = [
//        'Mercury',
//        'Venus',
//        'Earth',
//        'Mars',
//        'Jupiter',
//        'Saturn',
//        'Uranus',
//        'Neptune'
//        ];

//         * TODO:
//         * Read each console log below, and write some javascript code to perform
//         * the step that it describes
//         */
//
//        console.log('Adding "The Sun" to the beginning of the planets array.');
//        console.log(planets);
//
//        console.log('Adding "Pluto" to the end of the planets array.');
//        console.log(planets);
//
//        console.log('Removing "The Sun" from the beginning of the planets array.');
//        console.log(planets);
//
//        console.log('Removing "Pluto" from the end of the planets array.');
//        console.log(planets);
//
//        console.log('Finding and logging the index of "Earth" in the planets array.');
//
//        console.log("Reversing the order of the planets array.");
//        console.log(planets);
//
//        console.log("Sorting the planets array.");
//        console.log(planets);
//        })();


//
//        var planetsString = "Mercury|Venus|Earth|Mars|Jupiter|Saturn|Uranus|Neptune";
//        var planetsArray;
//        /**
//         * TODO:
//         * Convert planetsString to an array, and save it in a variable named
//         * planetsArray.
//         * console.log planetsArray to check your work
//         */
//        // console.log(planetsArray);
//        /**
//         * TODO:
//         * Create a string with <br> tags between each planet. console.log() your
//         * results. Why might this be useful?
//         *
//         * BONUS:
//         * Create another string that would display your planets in an undordered
//         * list. You will need an opening AND closing <ul> tags around the entire
//         * string, and <li> tags around each planet.


//        'Mercury',
//        'Venus',
//        'Earth',
//        'Mars',
//        'Jupiter',
//        'Saturn',
//        'Uranus',
//        'Neptune'
//        ];
//         */
//
//        })();

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Planet {


    public ArrayList<String> sortList(ArrayList<String>input){
        Collections.sort(input);
        return input;
    }

    public static void main(String[] args){

         ArrayList<String> planets = new ArrayList<>(Arrays.asList("Mercury", "Venus", "Earth",
                "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"));


            planets.add(0,"Sun");
            planets.add(9, "Pluto");
//            planets.remove("Sun");
//            planets.remove(0);

//        System.out.println(planets.indexOf("Earth"));
//        Collections.reverse(planets);

//        for (int i = planets.size()-1; i >= 0; i--){
//            System.out.println(planets.get(i));
//        }

        System.out.println("");

        System.out.println(planets);

        for (String planet: planets){
         System.out.println(planet);
        }

        System.out.println();


    }

}
