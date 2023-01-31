// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import de.oliver.stackppplugin.StackppElementType;
import de.oliver.stackppplugin.StackppTokenType;
import org.intellij.sdk.language.psi.impl.*;

public interface SimpleTypes {

  IElementType PROPERTY = new StackppElementType("PROPERTY");

  IElementType ARGUMENT = new StackppTokenType("ARGUMENT");
  IElementType COMMENT = new StackppTokenType("COMMENT");
  IElementType CRLF = new StackppTokenType("CRLF");
  IElementType IDENTIFIER = new StackppTokenType("IDENTIFIER");
  IElementType SEPARATOR = new StackppTokenType("SEPARATOR");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == PROPERTY) {
        return new StackPPPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
