package de.oliver.stackppplugin;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.intellij.sdk.language.parser.SimpleParser;
import org.intellij.sdk.language.psi.SimpleTypes;
import org.jetbrains.annotations.NotNull;

public class StackppParserDefinition implements ParserDefinition {

    public static final IFileElementType FILE = new IFileElementType(StackppLanguage.INSTANCE);

    @Override
    public @NotNull Lexer createLexer(Project project) {
        return new StackppLexerAdapter();
    }

    @Override
    public @NotNull TokenSet getCommentTokens() {
        return StackppTokenSets.COMMENTS;
    }

    @Override
    public @NotNull TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @Override
    public @NotNull PsiParser createParser(Project project) {
        return new SimpleParser();
    }

    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @Override
    public PsiFile createFile(@NotNull FileViewProvider viewProvider) {
        return new StackppFile(viewProvider);
    }

    @Override
    public PsiElement createElement(ASTNode node) {
        return SimpleTypes.Factory.createElement(node);
    }
}
