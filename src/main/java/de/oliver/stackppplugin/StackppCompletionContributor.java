package de.oliver.stackppplugin;

import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.util.ProcessingContext;
import org.intellij.sdk.language.psi.SimpleTypes;
import org.jetbrains.annotations.NotNull;

public class StackppCompletionContributor extends CompletionContributor {

    public StackppCompletionContributor() {
        extend(CompletionType.BASIC, PlatformPatterns.psiElement(SimpleTypes.KEY),
                new CompletionProvider<>() {
                    @Override
                    protected void addCompletions(@NotNull CompletionParameters parameters, @NotNull ProcessingContext context, @NotNull CompletionResultSet resultSet) {
                            resultSet.addElement(LookupElementBuilder.create("move").withTailText(" <val> <reg>"));
                            resultSet.addElement(LookupElementBuilder.create("push"));
                            resultSet.addElement(LookupElementBuilder.create("pop"));
                            resultSet.addElement(LookupElementBuilder.create("add"));
                            resultSet.addElement(LookupElementBuilder.create("subtract"));
                            resultSet.addElement(LookupElementBuilder.create("multiply"));
                            resultSet.addElement(LookupElementBuilder.create("divide"));
                            resultSet.addElement(LookupElementBuilder.create("modulo"));
                            resultSet.addElement(LookupElementBuilder.create("lshift"));
                            resultSet.addElement(LookupElementBuilder.create("rshift"));
                            resultSet.addElement(LookupElementBuilder.create("and"));
                            resultSet.addElement(LookupElementBuilder.create("or"));
                            resultSet.addElement(LookupElementBuilder.create("xor"));
                            resultSet.addElement(LookupElementBuilder.create("not"));
                            resultSet.addElement(LookupElementBuilder.create("print"));
                            resultSet.addElement(LookupElementBuilder.create("aprint"));
                            resultSet.addElement(LookupElementBuilder.create("prints"));
                            resultSet.addElement(LookupElementBuilder.create("if"));
                            resultSet.addElement(LookupElementBuilder.create("else"));
                            resultSet.addElement(LookupElementBuilder.create("while"));
                            resultSet.addElement(LookupElementBuilder.create("function"));
                            resultSet.addElement(LookupElementBuilder.create("call"));
                            resultSet.addElement(LookupElementBuilder.create("continue"));
                            resultSet.addElement(LookupElementBuilder.create("break"));
                            resultSet.addElement(LookupElementBuilder.create("end"));
                            resultSet.addElement(LookupElementBuilder.create("memget"));
                            resultSet.addElement(LookupElementBuilder.create("memset"));
                            resultSet.addElement(LookupElementBuilder.create("malloc"));
                            resultSet.addElement(LookupElementBuilder.create("free"));
                            resultSet.addElement(LookupElementBuilder.create("memdump"));
                            resultSet.addElement(LookupElementBuilder.create("syscall"));
                            resultSet.addElement(LookupElementBuilder.create("str"));
                            resultSet.addElement(LookupElementBuilder.create("throw"));
                    }
                }
        );
    }

}
