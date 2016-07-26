package com.phraseapp.incontexteditor;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.NoSuchMessageException;

import com.phraseapp.incontexteditor.PhraseAppConfiguration;

import java.util.Locale;

public class PhraseAppMessageSource implements MessageSource {

    @Override
    public String getMessage(String code, Object[] args, String defaultMessage, Locale locale) {
        return getPhraseAppDecorated(code);
    }

    @Override
    public String getMessage(String code, Object[] args, Locale locale) throws NoSuchMessageException {
        return getPhraseAppDecorated(code);
    }

    @Override
    public String getMessage(MessageSourceResolvable resolvable, Locale locale) throws NoSuchMessageException {
        String[] codes = resolvable.getCodes();
        if (codes != null) {
            for (String code : codes) {
                return getPhraseAppDecorated(code);
            }
        }
        return "";
    }

    private String getPhraseAppDecorated(String code) {
        return new String(PhraseAppConfiguration.PHRASEAPP_PREFIX + "phrase_" + code + PhraseAppConfiguration.PHRASEAPP_SUFFIX);
    }
}
