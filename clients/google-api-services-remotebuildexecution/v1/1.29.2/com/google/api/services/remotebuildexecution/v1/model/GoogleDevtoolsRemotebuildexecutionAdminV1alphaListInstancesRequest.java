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

package com.google.api.services.remotebuildexecution.v1.model;

/**
 * Model definition for GoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesRequest.
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
public final class GoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesRequest extends com.google.api.client.json.GenericJson {

  /**
   * Resource name of the project. Format: `projects/[PROJECT_ID]`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String parent;

  /**
   * Resource name of the project. Format: `projects/[PROJECT_ID]`.
   * @return value or {@code null} for none
   */
  public java.lang.String getParent() {
    return parent;
  }

  /**
   * Resource name of the project. Format: `projects/[PROJECT_ID]`.
   * @param parent parent or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesRequest setParent(java.lang.String parent) {
    this.parent = parent;
    return this;
  }

  @Override
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesRequest set(String fieldName, Object value) {
    return (GoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesRequest clone() {
    return (GoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesRequest) super.clone();
  }

}
