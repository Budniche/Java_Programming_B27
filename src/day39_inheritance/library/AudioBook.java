package day39_inheritance.library;

public class AudioBook extends Book{

    String narrator;
    double duration;

}

// AudioBook is a Book

//How many instance variables does AudioBook objects have acccess to?
// > it has 6 from the super class
// > plus 2 form its class, so total of 8