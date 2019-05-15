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

package com.google.api.services.games.model;

/**
 * This is a JSON template for a third party player list response.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Game Services API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PlayerListResponse extends com.google.api.client.json.GenericJson {

  /**
   * The players.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Player> items;

  static {
    // hack to force ProGuard to consider Player used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Player.class);
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#playerListResponse.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Token corresponding to the next page of results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The players.
   * @return value or {@code null} for none
   */
  public java.util.List<Player> getItems() {
    return items;
  }

  /**
   * The players.
   * @param items items or {@code null} for none
   */
  public PlayerListResponse setItems(java.util.List<Player> items) {
    this.items = items;
    return this;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#playerListResponse.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#playerListResponse.
   * @param kind kind or {@code null} for none
   */
  public PlayerListResponse setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Token corresponding to the next page of results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Token corresponding to the next page of results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public PlayerListResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public PlayerListResponse set(String fieldName, Object value) {
    return (PlayerListResponse) super.set(fieldName, value);
  }

  @Override
  public PlayerListResponse clone() {
    return (PlayerListResponse) super.clone();
  }

}