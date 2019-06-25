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
 * Instance conceptually encapsulates all Remote Build Execution resources for remote builds. An
 * instance consists of storage and compute resources (for example, `ContentAddressableStorage`,
 * `ActionCache`, `WorkerPools`) used for running remote builds. All Remote Build Execution API
 * calls are scoped to an instance.
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
public final class GoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance extends com.google.api.client.json.GenericJson {

  /**
   * The location is a GCP region. Currently only `us-central1` is supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String location;

  /**
   * Output only. Whether stack driver logging is enabled for the instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean loggingEnabled;

  /**
   * Output only. Instance resource name formatted as:
   * `projects/[PROJECT_ID]/instances/[INSTANCE_ID]`. Name should not be populated when creating an
   * instance since it is provided in the `instance_id` field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. State of the instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * The location is a GCP region. Currently only `us-central1` is supported.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocation() {
    return location;
  }

  /**
   * The location is a GCP region. Currently only `us-central1` is supported.
   * @param location location or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance setLocation(java.lang.String location) {
    this.location = location;
    return this;
  }

  /**
   * Output only. Whether stack driver logging is enabled for the instance.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getLoggingEnabled() {
    return loggingEnabled;
  }

  /**
   * Output only. Whether stack driver logging is enabled for the instance.
   * @param loggingEnabled loggingEnabled or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance setLoggingEnabled(java.lang.Boolean loggingEnabled) {
    this.loggingEnabled = loggingEnabled;
    return this;
  }

  /**
   * Output only. Instance resource name formatted as:
   * `projects/[PROJECT_ID]/instances/[INSTANCE_ID]`. Name should not be populated when creating an
   * instance since it is provided in the `instance_id` field.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. Instance resource name formatted as:
   * `projects/[PROJECT_ID]/instances/[INSTANCE_ID]`. Name should not be populated when creating an
   * instance since it is provided in the `instance_id` field.
   * @param name name or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. State of the instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. State of the instance.
   * @param state state or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance set(String fieldName, Object value) {
    return (GoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance) super.set(fieldName, value);
  }

  @Override
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance clone() {
    return (GoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance) super.clone();
  }

}
