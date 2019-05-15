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

package com.google.api.services.run.v1alpha1.model;

/**
 * TriggerCondition contains state information for an Trigger.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TriggerCondition extends com.google.api.client.json.GenericJson {

  /**
   * Last time the condition transitioned from one status to another. +optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastTransitionTime;

  /**
   * Human readable message indicating details about the current status. +optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String message;

  /**
   * One-word CamelCase reason for the condition's current status. +optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reason;

  /**
   * Status of the condition, one of True, False, Unknown.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * Type of Trigger condition.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Last time the condition transitioned from one status to another. +optional
   * @return value or {@code null} for none
   */
  public String getLastTransitionTime() {
    return lastTransitionTime;
  }

  /**
   * Last time the condition transitioned from one status to another. +optional
   * @param lastTransitionTime lastTransitionTime or {@code null} for none
   */
  public TriggerCondition setLastTransitionTime(String lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

  /**
   * Human readable message indicating details about the current status. +optional
   * @return value or {@code null} for none
   */
  public java.lang.String getMessage() {
    return message;
  }

  /**
   * Human readable message indicating details about the current status. +optional
   * @param message message or {@code null} for none
   */
  public TriggerCondition setMessage(java.lang.String message) {
    this.message = message;
    return this;
  }

  /**
   * One-word CamelCase reason for the condition's current status. +optional
   * @return value or {@code null} for none
   */
  public java.lang.String getReason() {
    return reason;
  }

  /**
   * One-word CamelCase reason for the condition's current status. +optional
   * @param reason reason or {@code null} for none
   */
  public TriggerCondition setReason(java.lang.String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Status of the condition, one of True, False, Unknown.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * Status of the condition, one of True, False, Unknown.
   * @param status status or {@code null} for none
   */
  public TriggerCondition setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * Type of Trigger condition.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Type of Trigger condition.
   * @param type type or {@code null} for none
   */
  public TriggerCondition setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public TriggerCondition set(String fieldName, Object value) {
    return (TriggerCondition) super.set(fieldName, value);
  }

  @Override
  public TriggerCondition clone() {
    return (TriggerCondition) super.clone();
  }

}
