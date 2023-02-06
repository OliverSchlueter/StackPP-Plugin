package de.oliver.stackppplugin;

import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.util.ProcessingContext;
import org.intellij.sdk.language.psi.SimpleTypes;
import org.jetbrains.annotations.NotNull;

public class StackppCompletionContributor extends CompletionContributor {

    public StackppCompletionContributor() {
            extend(CompletionType.BASIC, PlatformPatterns.psiElement(SimpleTypes.VALUE), new CompletionProvider<>() {
                    @Override
                    protected void addCompletions(@NotNull CompletionParameters parameters, @NotNull ProcessingContext context, @NotNull CompletionResultSet resultSet) {
                        resultSet.addElement(LookupElementBuilder.create("a").withTypeText("register for calculating"));
                        resultSet.addElement(LookupElementBuilder.create("b").withTypeText("register for calculating"));
                        resultSet.addElement(LookupElementBuilder.create("c").withTypeText("register for calculating"));
                        resultSet.addElement(LookupElementBuilder.create("d").withTypeText("register for calculating"));
                        resultSet.addElement(LookupElementBuilder.create("e").withTypeText("register for calculating"));
                        resultSet.addElement(LookupElementBuilder.create("f").withTypeText("register for calculating"));
                        resultSet.addElement(LookupElementBuilder.create("i").withTypeText("register for indexes"));
                        resultSet.addElement(LookupElementBuilder.create("j").withTypeText("register for indexes"));
                        resultSet.addElement(LookupElementBuilder.create("k").withTypeText("register for indexes"));
                        resultSet.addElement(LookupElementBuilder.create("f1").withTypeText("register for functions"));
                        resultSet.addElement(LookupElementBuilder.create("f2").withTypeText("register for functions"));
                        resultSet.addElement(LookupElementBuilder.create("f3").withTypeText("register for functions"));
                        resultSet.addElement(LookupElementBuilder.create("f4").withTypeText("register for functions"));
                        resultSet.addElement(LookupElementBuilder.create("f5").withTypeText("register for functions"));
                        resultSet.addElement(LookupElementBuilder.create("f6").withTypeText("register for functions"));
                        resultSet.addElement(LookupElementBuilder.create("f7").withTypeText("register for functions"));
                        resultSet.addElement(LookupElementBuilder.create("f8").withTypeText("register for functions"));
                    }
            });
            extend(CompletionType.BASIC, PlatformPatterns.psiElement(SimpleTypes.KEY), new CompletionProvider<>() {
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
                        resultSet.addElement(LookupElementBuilder.create("lshift").withTailText(" <reg> <val>").withTypeText("left shift bits"));
                        resultSet.addElement(LookupElementBuilder.create("rshift").withTailText(" <reg> <val>").withTypeText("right shift bits"));
                        resultSet.addElement(LookupElementBuilder.create("and").withTailText(" <reg> <val>").withTypeText("bitwise and operation"));
                        resultSet.addElement(LookupElementBuilder.create("or").withTailText(" <reg> <val>").withTypeText("bitwise or operation"));
                        resultSet.addElement(LookupElementBuilder.create("xor").withTailText(" <reg> <val>").withTypeText("bitwiese xor operation"));
                        resultSet.addElement(LookupElementBuilder.create("not").withTailText(" <reg>").withTypeText("bitwise not operation"));
                        resultSet.addElement(LookupElementBuilder.create("print").withTailText(" <reg>").withTypeText("prints the value of a register"));
                        resultSet.addElement(LookupElementBuilder.create("aprint").withTailText(" <val>").withTypeText("print ASCII character"));
                        resultSet.addElement(LookupElementBuilder.create("prints").withTypeText("print the values from the stack"));
                        resultSet.addElement(LookupElementBuilder.create("if").withTailText(" <val> <operator> <val>"));
                        resultSet.addElement(LookupElementBuilder.create("else"));
                        resultSet.addElement(LookupElementBuilder.create("while").withTailText(" <val> <operator> <val>"));
                        resultSet.addElement(LookupElementBuilder.create("function").withTailText(" <name>").withTypeText("creates a new function"));
                        resultSet.addElement(LookupElementBuilder.create("call").withTailText(" <function name>").withTypeText("executes the function"));
                        resultSet.addElement(LookupElementBuilder.create("continue").withTypeText("continues the most inner while-block"));
                        resultSet.addElement(LookupElementBuilder.create("break").withTypeText("ends the most inner while-block"));
                        resultSet.addElement(LookupElementBuilder.create("end").withTypeText("indicates the end of a if or while-block"));
                        resultSet.addElement(LookupElementBuilder.create("memget").withTailText(" <val>").withTypeText("reads memory at an address"));
                        resultSet.addElement(LookupElementBuilder.create("memset").withTailText(" <val> <val>").withTypeText("writes memory at an address"));
                        resultSet.addElement(LookupElementBuilder.create("malloc").withTailText(" <val>").withTypeText("allocate a chunk of memory"));
                        resultSet.addElement(LookupElementBuilder.create("free").withTailText(" <val>").withTypeText("frees a chunk of allocated memory"));
                        resultSet.addElement(LookupElementBuilder.create("memdump").withTypeText("prints the whole memory in a hexdump"));
                        resultSet.addElement(LookupElementBuilder.create("syscall").withTailText(" <val>").withTypeText("execute a system-call"));
                        resultSet.addElement(LookupElementBuilder.create("str").withTailText(" <string>").withTypeText("puts the string in memory"));
                        resultSet.addElement(LookupElementBuilder.create("throw").withTailText(" <val>").withTypeText("throws an exception"));
                        resultSet.addElement(LookupElementBuilder.create("inc").withTailText(" <reg>").withTypeText("increments the value by one"));
                        resultSet.addElement(LookupElementBuilder.create("dec").withTailText(" <reg>").withTypeText("decrements the value by one"));
                        resultSet.addElement(LookupElementBuilder.create("nop").withTypeText("no operation"));
                }
        });
    }

}
