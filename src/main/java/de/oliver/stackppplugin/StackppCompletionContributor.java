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
                            resultSet.addElement(LookupElementBuilder.create("move").withTailText(" <val> <reg>").withTypeText("moves a value into a register"));
                            resultSet.addElement(LookupElementBuilder.create("push").withTailText(" <val>").withTypeText("pushes a value onto the stack"));
                            resultSet.addElement(LookupElementBuilder.create("pop").withTailText(" <reg>").withTypeText("pops a value from the stack into a register"));
                            resultSet.addElement(LookupElementBuilder.create("add").withTailText(" <reg> <val>").withTypeText("adds the value to the register"));
                            resultSet.addElement(LookupElementBuilder.create("subtract").withTailText(" <reg> <val>").withTypeText("subtracts the value from the register"));
                            resultSet.addElement(LookupElementBuilder.create("multiply").withTailText(" <reg> <val>").withTypeText("multiples the value with the register"));
                            resultSet.addElement(LookupElementBuilder.create("divide").withTailText(" <reg> <val>").withTypeText("divides the value with the register"));
                            resultSet.addElement(LookupElementBuilder.create("modulo").withTailText(" <reg> <val>"));
                            resultSet.addElement(LookupElementBuilder.create("lshift").withTailText(" <reg> <val>"));
                            resultSet.addElement(LookupElementBuilder.create("rshift").withTailText(" <reg> <val>"));
                            resultSet.addElement(LookupElementBuilder.create("and").withTailText(" <reg> <val>"));
                            resultSet.addElement(LookupElementBuilder.create("or").withTailText(" <reg> <val>"));
                            resultSet.addElement(LookupElementBuilder.create("xor").withTailText(" <reg> <val>"));
                            resultSet.addElement(LookupElementBuilder.create("not").withTailText(" <reg>"));
                            resultSet.addElement(LookupElementBuilder.create("print").withTailText(" <reg>"));
                            resultSet.addElement(LookupElementBuilder.create("aprint").withTailText(" <val>"));
                            resultSet.addElement(LookupElementBuilder.create("prints"));
                            resultSet.addElement(LookupElementBuilder.create("if").withTailText(" <val> <operator> <val>"));
                            resultSet.addElement(LookupElementBuilder.create("else"));
                            resultSet.addElement(LookupElementBuilder.create("while").withTailText(" <val> <operator> <val>"));
                            resultSet.addElement(LookupElementBuilder.create("function").withTailText(" <name>"));
                            resultSet.addElement(LookupElementBuilder.create("call").withTailText(" <function name>"));
                            resultSet.addElement(LookupElementBuilder.create("continue"));
                            resultSet.addElement(LookupElementBuilder.create("break"));
                            resultSet.addElement(LookupElementBuilder.create("end"));
                            resultSet.addElement(LookupElementBuilder.create("memget").withTailText(" <val>"));
                            resultSet.addElement(LookupElementBuilder.create("memset").withTailText(" <val> <val>"));
                            resultSet.addElement(LookupElementBuilder.create("malloc").withTailText(" <val>"));
                            resultSet.addElement(LookupElementBuilder.create("free").withTailText(" <val>"));
                            resultSet.addElement(LookupElementBuilder.create("memdump"));
                            resultSet.addElement(LookupElementBuilder.create("syscall").withTailText(" <val>"));
                            resultSet.addElement(LookupElementBuilder.create("str").withTailText(" <string>"));
                            resultSet.addElement(LookupElementBuilder.create("throw").withTailText(" <val>"));
                    }
                }
        );
    }

}
