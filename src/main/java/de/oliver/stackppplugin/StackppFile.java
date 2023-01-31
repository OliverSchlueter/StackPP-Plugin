package de.oliver.stackppplugin;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;

import org.jetbrains.annotations.NotNull;

public class StackppFile extends PsiFileBase {

    public StackppFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, StackppLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return StackppFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "StackPP File";
    }

}
