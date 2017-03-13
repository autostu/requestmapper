package com.viartemev.requestmapper.annotations.spring;

import com.intellij.psi.PsiAnnotation;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiMethod;
import com.viartemev.requestmapper.RequestMappingItem;

import java.util.Collections;
import java.util.List;

public class PutMapping extends RequestMapping {
    private static final String METHOD = "PUT";

    public PutMapping(PsiAnnotation psiAnnotation, PsiElement psiElement) {
        super(psiAnnotation, psiElement);
    }

    @Override
    public List<RequestMappingItem> values() {
        if (psiElement instanceof PsiMethod) {
            return fetchRequestMappingItem(psiAnnotation, (PsiMethod) psiElement, METHOD);
        }
        return Collections.emptyList();
    }

}