package com.phraseapp.incontexteditor;

import com.phraseapp.incontexteditor.PhraseAppConfiguration;

public class PhraseAppJavascriptHeader {
    public String getHeader() {
        if(PhraseAppConfiguration.PHRASEAPP_ENABLED) {
            return new StringBuilder()
                .append("window.PHRASEAPP_CONFIG = {\n")
                .append("  projectId: '"+PhraseAppConfiguration.PHRASEAPP_PROJECT_ID+"'\n")
                .append("};\n")
                .append("(function() {\n")
                .append("    var phraseapp = document.createElement('script'); phraseapp.type = 'text/javascript'; phraseapp.async = true;\n")
                .append("    phraseapp.src = ['https://', 'phraseapp.com/assets/in-context-editor/2.0/app.js?', new Date().getTime()].join('');\n")
                .append("    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(phraseapp, s);\n")
                .append("})();\n")
                .toString();
        } else {
            return "";
        }
    }
}
