package com.jeffjanes.funfacts;

import java.util.Random;

/**
 * Created by Jeff on 3/9/15.
 */
public class QuoteList {

    // Member variable (properties about the object)

    public String[] mQuotes = {
            "Start by doing what's necessary; then do what's possible; and suddenly you are doing the impossible.",
            "Perfection is not attainable, but if we chase perfection we can catch excellence.",
            "I can't change the direction of the wind, but I can adjust my sails to always reach my destination.",
            "Nothing is impossible, the word itself says 'I'm possible'!",
            "Try to be a rainbow in someone's cloud.",
            "Your work is going to fill a large part of your life, and the only way to be truly satisfied is to do what you believe is great work. And the only way to do great work is to love what you do. If you haven't found it yet, keep looking. Don't settle. As with all matters of the heart, you'll know when you find it.\n\n-Steve Jobs",
            "We know what we are, but know not what we may be.",
            "Put your heart, mind, and soul into even your smallest acts. This is the secret of success.",
            "Change your thoughts and you change your world.",
            "It is during our darkest moments that we must focus to see the light."};

    // Method (abilities: things the object can do)
    public String getQuote() {

        String quote = "";

        // Randomly select a quote
        Random randomGenerator = new Random(); //Construct a new Random number generator
        int randomNumber = randomGenerator.nextInt(mQuotes.length);

        quote = mQuotes[randomNumber];

        return quote;
    }
}
