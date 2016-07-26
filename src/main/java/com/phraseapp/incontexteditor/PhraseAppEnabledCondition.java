package com.phraseapp.incontexteditor;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import com.phraseapp.incontexteditor.PhraseAppConfiguration;

public class PhraseAppEnabledCondition implements Condition {

  public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
    return PhraseAppConfiguration.PHRASEAPP_ENABLED;
  }
}
