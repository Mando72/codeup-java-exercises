//Create an abstract class of MusicalInstrument that implements the Bonuses.Playable interface.
//
//        MusicalInstrument should have a constructor that sets the value of a private String field of instrumentClassification (include getter and setter)
//
//        The Bonuses.Playable interface contains the following method definitions:
//
//public void startMusic();
//public void stopMusic();
//
//        Create a Bonuses.Tuneable interface with the following method definitions:
//
//public void tuneInstrument();
//public void detuneInstrument();
//
//        Create a Bonuses.VolumeAdjustable interface with the following method definitions:
//
//public void volumeUp();
//public void volumeDown();
//
//        Create Piano and Sax classes that both extend from MusicInstrument and implement Bonuses.Tuneable and Bonuses.VolumeAdjustable
//
//        For both Piano and Sax classes, implement all needed methods by sout'ing out messages that make sense
//
//        The Piano class should also include a private int field of numberOfKeys (update your constructor and add a getter and setter)
//
//        The Sax class should also include a private int String field of saxType (update your constructor and add a getter and setter)
//
//        Create a MusicTest class with a main method to practice instantiating Piano and Sax objects of type Piano and Sax or the types of the Interfaces they implement. Add the following two methods to the MusicTest class to experiement with various instances of the Piano and Sax objects:
//
//public static void detuneRetune(Bonuses.Tuneable tuneableObj) {
//        tuneableObj.detuneInstrument();
//        tuneableObj.tuneInstrument();
//        }
//
//public static void makeTwoStaccatoSounds(Bonuses.VolumeAdjustable va) {
//        va.volumeUp();
//        va.volumeDown();
//        va.volumeUp();
//        va.volumeDown();
//        }



//
//abstract class MusicalInstruments implements {
//
//    public MusicalInstruments() {
//
//
//
//    }
//}
