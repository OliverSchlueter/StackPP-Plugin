package de.oliver.stackppplugin;

import com.intellij.lexer.FlexAdapter;

public class StackppLexerAdapter extends FlexAdapter {

    public StackppLexerAdapter() {
        super(new SimpleLexer(null));
    }
}
