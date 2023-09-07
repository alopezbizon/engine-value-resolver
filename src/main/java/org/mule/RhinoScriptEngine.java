/*
 * Copyright 2023 Salesforce, Inc. All rights reserved.
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule;

import java.io.Reader;

import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptException;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;

public class RhinoScriptEngine implements ScriptEngine {

  // private final ScriptEngineValueResolver scriptEngineValueResolver;
  private final Context context;
  private final Scriptable scope;

  public RhinoScriptEngine() {
    // this.scriptEngineValueResolver = new ScriptEngineValueResolver();
    this.context = Context.enter();
    this.scope = context.initStandardObjects();
  }

  @Override
  public Object eval(String script, ScriptContext context) throws ScriptException {
    return null;
  }

  @Override
  public Object eval(Reader reader, ScriptContext context) throws ScriptException {
    return null;
  }

  @Override
  public Object eval(String script) throws ScriptException {
    // return this.scriptEngineValueResolver.eval(script);
    return this.context.evaluateString(scope, script, "Javascript", 1, null);
  }

  @Override
  public Object eval(Reader reader) throws ScriptException {
    return null;
  }

  @Override
  public Object eval(String script, Bindings n) throws ScriptException {
    return null;
  }

  @Override
  public Object eval(Reader reader, Bindings n) throws ScriptException {
    return null;
  }

  @Override
  public void put(String key, Object value) {
    // this.scriptEngineValueResolver.put(key, value);
    ScriptableObject.putProperty(scope, key, value);
  }

  @Override
  public Object get(String key) {
    return null;
  }

  @Override
  public Bindings getBindings(int scope) {
    return null;
  }

  @Override
  public void setBindings(Bindings bindings, int scope) {

  }

  @Override
  public Bindings createBindings() {
    return null;
  }

  @Override
  public ScriptContext getContext() {
    return null;
  }

  @Override
  public void setContext(ScriptContext context) {

  }

  @Override
  public ScriptEngineFactory getFactory() {
    return null;
  }

  public void release() {
    Context.exit();
    this.context.close();
  }
}
