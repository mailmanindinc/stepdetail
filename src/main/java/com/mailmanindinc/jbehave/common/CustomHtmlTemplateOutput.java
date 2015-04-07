package com.mailmanindinc.jbehave.common;

import java.io.File;

import org.jbehave.core.configuration.Keywords;
import org.jbehave.core.reporters.FreemarkerProcessor;
import org.jbehave.core.reporters.TemplateProcessor;

/**
 * A templateable output that generates HTML. By default it uses
 * {@link FreemarkerProcessor} and template path <b>ftl/jbehave-html-output.ftl</b>,
 * but custom processors based on other templating systems can be provided and/or 
 * other template paths can be configured.
 */
public class CustomHtmlTemplateOutput extends CustomTemplateableOutput {

    public CustomHtmlTemplateOutput(File file, Keywords keywords) {
        super(file, keywords, new FreemarkerProcessor(), "ftl/custom-html-output.ftl");
    }

    public CustomHtmlTemplateOutput(File file, Keywords keywords, TemplateProcessor processor, String templatePath) {
        super(file, keywords, processor, templatePath);
    }

}
