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
 * Details for the tool used to call the API.
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
public final class BuildBazelRemoteExecutionV2ToolDetails extends com.google.api.client.json.GenericJson {

  /**
   * Name of the tool, e.g. bazel.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String toolName;

  /**
   * Version of the tool used for the request, e.g. 5.0.3.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String toolVersion;

  /**
   * Name of the tool, e.g. bazel.
   * @return value or {@code null} for none
   */
  public java.lang.String getToolName() {
    return toolName;
  }

  /**
   * Name of the tool, e.g. bazel.
   * @param toolName toolName or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2ToolDetails setToolName(java.lang.String toolName) {
    this.toolName = toolName;
    return this;
  }

  /**
   * Version of the tool used for the request, e.g. 5.0.3.
   * @return value or {@code null} for none
   */
  public java.lang.String getToolVersion() {
    return toolVersion;
  }

  /**
   * Version of the tool used for the request, e.g. 5.0.3.
   * @param toolVersion toolVersion or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2ToolDetails setToolVersion(java.lang.String toolVersion) {
    this.toolVersion = toolVersion;
    return this;
  }

  @Override
  public BuildBazelRemoteExecutionV2ToolDetails set(String fieldName, Object value) {
    return (BuildBazelRemoteExecutionV2ToolDetails) super.set(fieldName, value);
  }

  @Override
  public BuildBazelRemoteExecutionV2ToolDetails clone() {
    return (BuildBazelRemoteExecutionV2ToolDetails) super.clone();
  }

}
