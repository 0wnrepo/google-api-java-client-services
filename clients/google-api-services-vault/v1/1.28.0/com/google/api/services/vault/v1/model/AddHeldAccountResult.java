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

package com.google.api.services.vault.v1.model;

/**
 * A status detailing the status of each account creation, and the HeldAccount, if successful.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the G Suite Vault API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AddHeldAccountResult extends com.google.api.client.json.GenericJson {

  /**
   * If present, this account was successfully created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HeldAccount account;

  /**
   * This represents the success status. If failed, check message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Status status;

  /**
   * If present, this account was successfully created.
   * @return value or {@code null} for none
   */
  public HeldAccount getAccount() {
    return account;
  }

  /**
   * If present, this account was successfully created.
   * @param account account or {@code null} for none
   */
  public AddHeldAccountResult setAccount(HeldAccount account) {
    this.account = account;
    return this;
  }

  /**
   * This represents the success status. If failed, check message.
   * @return value or {@code null} for none
   */
  public Status getStatus() {
    return status;
  }

  /**
   * This represents the success status. If failed, check message.
   * @param status status or {@code null} for none
   */
  public AddHeldAccountResult setStatus(Status status) {
    this.status = status;
    return this;
  }

  @Override
  public AddHeldAccountResult set(String fieldName, Object value) {
    return (AddHeldAccountResult) super.set(fieldName, value);
  }

  @Override
  public AddHeldAccountResult clone() {
    return (AddHeldAccountResult) super.clone();
  }

}