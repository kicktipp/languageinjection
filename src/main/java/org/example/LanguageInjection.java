package org.example;

import org.intellij.lang.annotations.Language;

public class LanguageInjection {

    public void withHTML(@Language("HTML") String html) {
        System.out.println("Hello HTML!");
    }
}