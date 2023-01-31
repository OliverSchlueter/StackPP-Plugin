package de.oliver.stackppplugin;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class StackppElementType extends IElementType {
    public StackppElementType(@NonNls @NotNull String debugName) {
        super(debugName, StackppLanguage.INSTANCE);
    }
}
