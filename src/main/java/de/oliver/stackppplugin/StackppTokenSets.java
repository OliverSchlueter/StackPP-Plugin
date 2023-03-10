package de.oliver.stackppplugin;

import com.intellij.psi.tree.TokenSet;
import org.intellij.sdk.language.psi.SimpleTypes;

public interface StackppTokenSets {

    TokenSet IDENTIFIERS = TokenSet.create(SimpleTypes.KEY);

    TokenSet COMMENTS = TokenSet.create(SimpleTypes.COMMENT);

}
