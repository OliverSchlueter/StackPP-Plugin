package de.oliver.stackppplugin;

import com.intellij.lang.Language;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class StackppLanguage extends Language {

    public static final StackppLanguage INSTANCE = new StackppLanguage();
    private StackppLanguage() {
        super("StackPP");
    }
}
