package de.oliver.stackppplugin;

import com.intellij.lang.Language;

public class StackppLanguage extends Language {

    public static final StackppLanguage INSTANCE = new StackppLanguage();
    private StackppLanguage() {
        super("StackPP");
    }
}
