/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.remotebuildexecution.v1alpha.model;

/**
 * An `EnvironmentVariable` is one variable to set in the running program's environment.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Remote Build Execution API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleDevtoolsRemoteexecutionV1testCommandEnvironmentVariable extends com.google.api.client.json.GenericJson {

  /**
   * The variable name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The variable value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String value;

  /**
   * The variable name.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The variable name.
   * @param name name or {@code null} for none
   */
  public GoogleDevtoolsRemoteexecutionV1testCommandEnvironmentVariable setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The variable value.
   * @return value or {@code null} for none
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * The variable value.
   * @param value value or {@code null} for none
   */
  public GoogleDevtoolsRemoteexecutionV1testCommandEnvironmentVariable setValue(java.lang.String value) {
    this.value = value;
    return this;
  }

  @Override
  public GoogleDevtoolsRemoteexecutionV1testCommandEnvironmentVariable set(String fieldName, Object value) {
    return (GoogleDevtoolsRemoteexecutionV1testCommandEnvironmentVariable) super.set(fieldName, value);
  }

  @Override
  public GoogleDevtoolsRemoteexecutionV1testCommandEnvironmentVariable clone() {
    return (GoogleDevtoolsRemoteexecutionV1testCommandEnvironmentVariable) super.clone();
  }

}
