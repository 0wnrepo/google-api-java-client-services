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
 * Available structured data fields for the item.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ItemStructuredData extends com.google.api.client.json.GenericJson {

  /**
   * Hashing value provided by the API caller. This can be used with the items.push method to
   * calculate modified state. The maximum length is 2048 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String hash;

  /**
   * The structured data object that should conform to a registered object definition in the schema
   * for the data source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("object")
  private StructuredDataObject object__;

  /**
   * Hashing value provided by the API caller. This can be used with the items.push method to
   * calculate modified state. The maximum length is 2048 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getHash() {
    return hash;
  }

  /**
   * Hashing value provided by the API caller. This can be used with the items.push method to
   * calculate modified state. The maximum length is 2048 characters.
   * @param hash hash or {@code null} for none
   */
  public ItemStructuredData setHash(java.lang.String hash) {
    this.hash = hash;
    return this;
  }

  /**
   * The structured data object that should conform to a registered object definition in the schema
   * for the data source.
   * @return value or {@code null} for none
   */
  public StructuredDataObject getObject() {
    return object__;
  }

  /**
   * The structured data object that should conform to a registered object definition in the schema
   * for the data source.
   * @param object__ object__ or {@code null} for none
   */
  public ItemStructuredData setObject(StructuredDataObject object__) {
    this.object__ = object__;
    return this;
  }

  @Override
  public ItemStructuredData set(String fieldName, Object value) {
    return (ItemStructuredData) super.set(fieldName, value);
  }

  @Override
  public ItemStructuredData clone() {
    return (ItemStructuredData) super.clone();
  }

}
