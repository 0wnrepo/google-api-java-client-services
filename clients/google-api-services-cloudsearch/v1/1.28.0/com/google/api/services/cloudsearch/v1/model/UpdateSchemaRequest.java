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

package com.google.api.services.cloudsearch.v1.model;

/**
 * Model definition for UpdateSchemaRequest.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UpdateSchemaRequest extends com.google.api.client.json.GenericJson {

  /**
   * Common debug options.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DebugOptions debugOptions;

  /**
   * The new schema for the source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Schema schema;

  /**
   * If true, the request will be validated without side effects.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean validateOnly;

  /**
   * Common debug options.
   * @return value or {@code null} for none
   */
  public DebugOptions getDebugOptions() {
    return debugOptions;
  }

  /**
   * Common debug options.
   * @param debugOptions debugOptions or {@code null} for none
   */
  public UpdateSchemaRequest setDebugOptions(DebugOptions debugOptions) {
    this.debugOptions = debugOptions;
    return this;
  }

  /**
   * The new schema for the source.
   * @return value or {@code null} for none
   */
  public Schema getSchema() {
    return schema;
  }

  /**
   * The new schema for the source.
   * @param schema schema or {@code null} for none
   */
  public UpdateSchemaRequest setSchema(Schema schema) {
    this.schema = schema;
    return this;
  }

  /**
   * If true, the request will be validated without side effects.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getValidateOnly() {
    return validateOnly;
  }

  /**
   * If true, the request will be validated without side effects.
   * @param validateOnly validateOnly or {@code null} for none
   */
  public UpdateSchemaRequest setValidateOnly(java.lang.Boolean validateOnly) {
    this.validateOnly = validateOnly;
    return this;
  }

  @Override
  public UpdateSchemaRequest set(String fieldName, Object value) {
    return (UpdateSchemaRequest) super.set(fieldName, value);
  }

  @Override
  public UpdateSchemaRequest clone() {
    return (UpdateSchemaRequest) super.clone();
  }

}