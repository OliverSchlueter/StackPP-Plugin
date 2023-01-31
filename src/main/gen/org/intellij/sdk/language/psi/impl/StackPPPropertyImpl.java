// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.sdk.language.psi.SimpleTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.intellij.sdk.language.psi.*;

public class StackPPPropertyImpl extends ASTWrapperPsiElement implements StackPPProperty {

  public StackPPPropertyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull StackPPVisitor visitor) {
    visitor.visitProperty(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof StackPPVisitor) accept((StackPPVisitor)visitor);
    else super.accept(visitor);
  }

}
