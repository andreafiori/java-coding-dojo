package com.algorithms.strings;

import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.Locale;
import java.util.regex.Pattern;

public class Slugifier
{
    /**
     * Transform string in slug format
     * 
     * @param input string to slugify
     * @return String
     */
    public static String toSlug(String input) {
        Pattern nonLatingRegEx = Pattern.compile("[^\\w-]");
        Pattern whitespaceRegEx = Pattern.compile("[\\s]");

        String nowhitespace = whitespaceRegEx.matcher(input).replaceAll("-");
        String normalized = Normalizer.normalize(nowhitespace, Form.NFD);
        String slug = nonLatingRegEx.matcher(normalized).replaceAll("");
        return slug.toLowerCase(Locale.ENGLISH);
    }
}
