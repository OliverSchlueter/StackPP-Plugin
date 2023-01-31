package de.oliver.stackppplugin;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class StackppTokenType extends IElementType {
    public StackppTokenType(@NonNls @NotNull String debugName) {
        super(debugName, StackppLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "StackppTokenType." + super.toString();
    }
}
