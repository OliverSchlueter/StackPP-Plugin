package de.oliver.stackppplugin;

import com.intellij.lang.Language;

public class StackppLanguage extends Language {

    public static final StackppLanguage INSTANCE = new StackppLanguage();

    private static final String STACKPP_VERSION = "1.1.2";

    private StackppLanguage() {
        super("StackPP");
    }
}
