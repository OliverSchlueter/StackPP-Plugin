package de.oliver.stackppplugin;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.NlsContexts;
import com.intellij.openapi.util.NlsSafe;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class StackppFileType extends LanguageFileType {

    public static final StackppFileType INSTANCE = new StackppFileType();

    private StackppFileType(){
        super(StackppLanguage.INSTANCE);

    }

    @Override
    public @NonNls @NotNull String getName() {
        return "StackPP File";
    }

    @Override
    public @NlsContexts.Label @NotNull String getDescription() {
        return "Stack based programming language";
    }

    @Override
    public @NlsSafe @NotNull String getDefaultExtension() {
        return "spp";
    }

    @Override
    public Icon getIcon() {
        return StackppIcons.FILE;
    }
}
