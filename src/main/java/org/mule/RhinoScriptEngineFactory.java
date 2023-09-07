/*
 * Copyright 2023 Salesforce, Inc. All rights reserved.
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule;

import java.util.Collections;
import java.util.List;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;

public class RhinoScriptEngineFactory implements ScriptEngineFactory {

  @Override
  public String getEngineName() {
    return "rhino";
  }

  @Override
  public String getEngineVersion() {
    return "1.0.0";
  }

  @Override
  public List<String> getExtensions() {
    return Collections.emptyList();
  }

  @Override
  public List<String> getMimeTypes() {
    return Collections.emptyList();
  }

  @Override
  public List<String> getNames() {
    return Collections.singletonList("rhino");
  }

  @Override
  public String getLanguageName() {
    return null;
  }

  @Override
  public String getLanguageVersion() {
    return null;
  }

  @Override
  public Object getParameter(String key) {
    return null;
  }

  @Override
  public String getMethodCallSyntax(String obj, String m, String... args) {
    return null;
  }

  @Override
  public String getOutputStatement(String toDisplay) {
    return null;
  }

  @Override
  public String getProgram(String... statements) {
    return null;
  }

  @Override
  public ScriptEngine getScriptEngine() {
    return new RhinoScriptEngine();
  }
}
