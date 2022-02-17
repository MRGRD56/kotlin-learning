package com.mrgrd56.app.utils;

import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class TextAnalyzer {
    private static final Pattern WORDS_REGEX = Pattern.compile("\\b[\\w-'’]+\\b");

    public static Map<String, Integer> countWords(String text) {
        var matcher = WORDS_REGEX.matcher(text);

        var matches = new ArrayList<String>();

        while (matcher.find()) {
            matches.add(matcher.group());
        }

        return matches.stream()
                .collect(Collectors.groupingBy(match -> match),
                        Collectors.mapping(group -> group));
    }
}
