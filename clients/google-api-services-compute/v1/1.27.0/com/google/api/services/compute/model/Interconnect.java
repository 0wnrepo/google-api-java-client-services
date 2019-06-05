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

package com.google.api.services.compute.model;

/**
 * Represents an Interconnects resource. The Interconnects resource is a dedicated connection
 * between Google's network and your on-premises network. For more information, see the  Dedicated
 * overview page. (== resource_for v1.interconnects ==) (== resource_for beta.interconnects ==)
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Interconnect extends com.google.api.client.json.GenericJson {

  /**
   * Administrative status of the interconnect. When this is set to true, the Interconnect is
   * functional and can carry traffic. When set to false, no packets can be carried over the
   * interconnect and no BGP routes are exchanged over it. By default, the status is set to true.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean adminEnabled;

  /**
   * [Output Only] A list of CircuitInfo objects, that describe the individual circuits in this LAG.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<InterconnectCircuitInfo> circuitInfos;

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationTimestamp;

  /**
   * Customer name, to put in the Letter of Authorization as the party authorized to request a
   * crossconnect.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customerName;

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * [Output Only] A list of outages expected for this Interconnect.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<InterconnectOutageNotification> expectedOutages;

  /**
   * [Output Only] IP address configured on the Google side of the Interconnect link. This can be
   * used only for ping tests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String googleIpAddress;

  /**
   * [Output Only] Google reference ID to be used when raising support tickets with Google or
   * otherwise to debug backend connectivity issues.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String googleReferenceId;

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * [Output Only] A list of the URLs of all InterconnectAttachments configured to use this
   * Interconnect.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> interconnectAttachments;

  /**
   * Type of interconnect, which can take one of the following values: - PARTNER: A partner-managed
   * interconnection shared between customers though a partner.  - DEDICATED: A dedicated physical
   * interconnection with the customer. Note that a value IT_PRIVATE has been deprecated in favor of
   * DEDICATED.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String interconnectType;

  /**
   * [Output Only] Type of the resource. Always compute#interconnect for interconnects.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Type of link requested, which can take one of the following values: -
   * LINK_TYPE_ETHERNET_10G_LR: A 10G Ethernet with LR optics  - LINK_TYPE_ETHERNET_100G_LR: A 100G
   * Ethernet with LR optics. Note that this field indicates the speed of each of the links in the
   * bundle, not the speed of the entire bundle.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String linkType;

  /**
   * URL of the InterconnectLocation object that represents where this connection is to be
   * provisioned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String location;

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Email address to contact the customer NOC for operations and maintenance notifications
   * regarding this Interconnect. If specified, this will be used for notifications in addition to
   * all other forms described, such as Stackdriver logs alerting and Cloud Notifications.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nocContactEmail;

  /**
   * [Output Only] The current status of this Interconnect's functionality, which can take one of
   * the following values: - OS_ACTIVE: A valid Interconnect, which is turned up and is ready to
   * use. Attachments may be provisioned on this Interconnect.  - OS_UNPROVISIONED: An Interconnect
   * that has not completed turnup. No attachments may be provisioned on this Interconnect.  -
   * OS_UNDER_MAINTENANCE: An Interconnect that is undergoing internal maintenance. No attachments
   * may be provisioned or updated on this Interconnect.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String operationalStatus;

  /**
   * [Output Only] IP address configured on the customer side of the Interconnect link. The customer
   * should configure this IP address during turnup when prompted by Google NOC. This can be used
   * only for ping tests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String peerIpAddress;

  /**
   * [Output Only] Number of links actually provisioned in this interconnect.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer provisionedLinkCount;

  /**
   * Target number of physical links in the link bundle, as requested by the customer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer requestedLinkCount;

  /**
   * [Output Only] Server-defined URL for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * [Output Only] The current state of Interconnect functionality, which can take one of the
   * following values: - ACTIVE: The Interconnect is valid, turned up and ready to use. Attachments
   * may be provisioned on this Interconnect.  - UNPROVISIONED: The Interconnect has not completed
   * turnup. No attachments may be provisioned on this Interconnect.  - UNDER_MAINTENANCE: The
   * Interconnect is undergoing internal maintenance. No attachments may be provisioned or updated
   * on this Interconnect.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Administrative status of the interconnect. When this is set to true, the Interconnect is
   * functional and can carry traffic. When set to false, no packets can be carried over the
   * interconnect and no BGP routes are exchanged over it. By default, the status is set to true.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAdminEnabled() {
    return adminEnabled;
  }

  /**
   * Administrative status of the interconnect. When this is set to true, the Interconnect is
   * functional and can carry traffic. When set to false, no packets can be carried over the
   * interconnect and no BGP routes are exchanged over it. By default, the status is set to true.
   * @param adminEnabled adminEnabled or {@code null} for none
   */
  public Interconnect setAdminEnabled(java.lang.Boolean adminEnabled) {
    this.adminEnabled = adminEnabled;
    return this;
  }

  /**
   * [Output Only] A list of CircuitInfo objects, that describe the individual circuits in this LAG.
   * @return value or {@code null} for none
   */
  public java.util.List<InterconnectCircuitInfo> getCircuitInfos() {
    return circuitInfos;
  }

  /**
   * [Output Only] A list of CircuitInfo objects, that describe the individual circuits in this LAG.
   * @param circuitInfos circuitInfos or {@code null} for none
   */
  public Interconnect setCircuitInfos(java.util.List<InterconnectCircuitInfo> circuitInfos) {
    this.circuitInfos = circuitInfos;
    return this;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @param creationTimestamp creationTimestamp or {@code null} for none
   */
  public Interconnect setCreationTimestamp(java.lang.String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * Customer name, to put in the Letter of Authorization as the party authorized to request a
   * crossconnect.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomerName() {
    return customerName;
  }

  /**
   * Customer name, to put in the Letter of Authorization as the party authorized to request a
   * crossconnect.
   * @param customerName customerName or {@code null} for none
   */
  public Interconnect setCustomerName(java.lang.String customerName) {
    this.customerName = customerName;
    return this;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @param description description or {@code null} for none
   */
  public Interconnect setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * [Output Only] A list of outages expected for this Interconnect.
   * @return value or {@code null} for none
   */
  public java.util.List<InterconnectOutageNotification> getExpectedOutages() {
    return expectedOutages;
  }

  /**
   * [Output Only] A list of outages expected for this Interconnect.
   * @param expectedOutages expectedOutages or {@code null} for none
   */
  public Interconnect setExpectedOutages(java.util.List<InterconnectOutageNotification> expectedOutages) {
    this.expectedOutages = expectedOutages;
    return this;
  }

  /**
   * [Output Only] IP address configured on the Google side of the Interconnect link. This can be
   * used only for ping tests.
   * @return value or {@code null} for none
   */
  public java.lang.String getGoogleIpAddress() {
    return googleIpAddress;
  }

  /**
   * [Output Only] IP address configured on the Google side of the Interconnect link. This can be
   * used only for ping tests.
   * @param googleIpAddress googleIpAddress or {@code null} for none
   */
  public Interconnect setGoogleIpAddress(java.lang.String googleIpAddress) {
    this.googleIpAddress = googleIpAddress;
    return this;
  }

  /**
   * [Output Only] Google reference ID to be used when raising support tickets with Google or
   * otherwise to debug backend connectivity issues.
   * @return value or {@code null} for none
   */
  public java.lang.String getGoogleReferenceId() {
    return googleReferenceId;
  }

  /**
   * [Output Only] Google reference ID to be used when raising support tickets with Google or
   * otherwise to debug backend connectivity issues.
   * @param googleReferenceId googleReferenceId or {@code null} for none
   */
  public Interconnect setGoogleReferenceId(java.lang.String googleReferenceId) {
    this.googleReferenceId = googleReferenceId;
    return this;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getId() {
    return id;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @param id id or {@code null} for none
   */
  public Interconnect setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * [Output Only] A list of the URLs of all InterconnectAttachments configured to use this
   * Interconnect.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getInterconnectAttachments() {
    return interconnectAttachments;
  }

  /**
   * [Output Only] A list of the URLs of all InterconnectAttachments configured to use this
   * Interconnect.
   * @param interconnectAttachments interconnectAttachments or {@code null} for none
   */
  public Interconnect setInterconnectAttachments(java.util.List<java.lang.String> interconnectAttachments) {
    this.interconnectAttachments = interconnectAttachments;
    return this;
  }

  /**
   * Type of interconnect, which can take one of the following values: - PARTNER: A partner-managed
   * interconnection shared between customers though a partner.  - DEDICATED: A dedicated physical
   * interconnection with the customer. Note that a value IT_PRIVATE has been deprecated in favor of
   * DEDICATED.
   * @return value or {@code null} for none
   */
  public java.lang.String getInterconnectType() {
    return interconnectType;
  }

  /**
   * Type of interconnect, which can take one of the following values: - PARTNER: A partner-managed
   * interconnection shared between customers though a partner.  - DEDICATED: A dedicated physical
   * interconnection with the customer. Note that a value IT_PRIVATE has been deprecated in favor of
   * DEDICATED.
   * @param interconnectType interconnectType or {@code null} for none
   */
  public Interconnect setInterconnectType(java.lang.String interconnectType) {
    this.interconnectType = interconnectType;
    return this;
  }

  /**
   * [Output Only] Type of the resource. Always compute#interconnect for interconnects.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] Type of the resource. Always compute#interconnect for interconnects.
   * @param kind kind or {@code null} for none
   */
  public Interconnect setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Type of link requested, which can take one of the following values: -
   * LINK_TYPE_ETHERNET_10G_LR: A 10G Ethernet with LR optics  - LINK_TYPE_ETHERNET_100G_LR: A 100G
   * Ethernet with LR optics. Note that this field indicates the speed of each of the links in the
   * bundle, not the speed of the entire bundle.
   * @return value or {@code null} for none
   */
  public java.lang.String getLinkType() {
    return linkType;
  }

  /**
   * Type of link requested, which can take one of the following values: -
   * LINK_TYPE_ETHERNET_10G_LR: A 10G Ethernet with LR optics  - LINK_TYPE_ETHERNET_100G_LR: A 100G
   * Ethernet with LR optics. Note that this field indicates the speed of each of the links in the
   * bundle, not the speed of the entire bundle.
   * @param linkType linkType or {@code null} for none
   */
  public Interconnect setLinkType(java.lang.String linkType) {
    this.linkType = linkType;
    return this;
  }

  /**
   * URL of the InterconnectLocation object that represents where this connection is to be
   * provisioned.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocation() {
    return location;
  }

  /**
   * URL of the InterconnectLocation object that represents where this connection is to be
   * provisioned.
   * @param location location or {@code null} for none
   */
  public Interconnect setLocation(java.lang.String location) {
    this.location = location;
    return this;
  }

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * @param name name or {@code null} for none
   */
  public Interconnect setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Email address to contact the customer NOC for operations and maintenance notifications
   * regarding this Interconnect. If specified, this will be used for notifications in addition to
   * all other forms described, such as Stackdriver logs alerting and Cloud Notifications.
   * @return value or {@code null} for none
   */
  public java.lang.String getNocContactEmail() {
    return nocContactEmail;
  }

  /**
   * Email address to contact the customer NOC for operations and maintenance notifications
   * regarding this Interconnect. If specified, this will be used for notifications in addition to
   * all other forms described, such as Stackdriver logs alerting and Cloud Notifications.
   * @param nocContactEmail nocContactEmail or {@code null} for none
   */
  public Interconnect setNocContactEmail(java.lang.String nocContactEmail) {
    this.nocContactEmail = nocContactEmail;
    return this;
  }

  /**
   * [Output Only] The current status of this Interconnect's functionality, which can take one of
   * the following values: - OS_ACTIVE: A valid Interconnect, which is turned up and is ready to
   * use. Attachments may be provisioned on this Interconnect.  - OS_UNPROVISIONED: An Interconnect
   * that has not completed turnup. No attachments may be provisioned on this Interconnect.  -
   * OS_UNDER_MAINTENANCE: An Interconnect that is undergoing internal maintenance. No attachments
   * may be provisioned or updated on this Interconnect.
   * @return value or {@code null} for none
   */
  public java.lang.String getOperationalStatus() {
    return operationalStatus;
  }

  /**
   * [Output Only] The current status of this Interconnect's functionality, which can take one of
   * the following values: - OS_ACTIVE: A valid Interconnect, which is turned up and is ready to
   * use. Attachments may be provisioned on this Interconnect.  - OS_UNPROVISIONED: An Interconnect
   * that has not completed turnup. No attachments may be provisioned on this Interconnect.  -
   * OS_UNDER_MAINTENANCE: An Interconnect that is undergoing internal maintenance. No attachments
   * may be provisioned or updated on this Interconnect.
   * @param operationalStatus operationalStatus or {@code null} for none
   */
  public Interconnect setOperationalStatus(java.lang.String operationalStatus) {
    this.operationalStatus = operationalStatus;
    return this;
  }

  /**
   * [Output Only] IP address configured on the customer side of the Interconnect link. The customer
   * should configure this IP address during turnup when prompted by Google NOC. This can be used
   * only for ping tests.
   * @return value or {@code null} for none
   */
  public java.lang.String getPeerIpAddress() {
    return peerIpAddress;
  }

  /**
   * [Output Only] IP address configured on the customer side of the Interconnect link. The customer
   * should configure this IP address during turnup when prompted by Google NOC. This can be used
   * only for ping tests.
   * @param peerIpAddress peerIpAddress or {@code null} for none
   */
  public Interconnect setPeerIpAddress(java.lang.String peerIpAddress) {
    this.peerIpAddress = peerIpAddress;
    return this;
  }

  /**
   * [Output Only] Number of links actually provisioned in this interconnect.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getProvisionedLinkCount() {
    return provisionedLinkCount;
  }

  /**
   * [Output Only] Number of links actually provisioned in this interconnect.
   * @param provisionedLinkCount provisionedLinkCount or {@code null} for none
   */
  public Interconnect setProvisionedLinkCount(java.lang.Integer provisionedLinkCount) {
    this.provisionedLinkCount = provisionedLinkCount;
    return this;
  }

  /**
   * Target number of physical links in the link bundle, as requested by the customer.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRequestedLinkCount() {
    return requestedLinkCount;
  }

  /**
   * Target number of physical links in the link bundle, as requested by the customer.
   * @param requestedLinkCount requestedLinkCount or {@code null} for none
   */
  public Interconnect setRequestedLinkCount(java.lang.Integer requestedLinkCount) {
    this.requestedLinkCount = requestedLinkCount;
    return this;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public Interconnect setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * [Output Only] The current state of Interconnect functionality, which can take one of the
   * following values: - ACTIVE: The Interconnect is valid, turned up and ready to use. Attachments
   * may be provisioned on this Interconnect.  - UNPROVISIONED: The Interconnect has not completed
   * turnup. No attachments may be provisioned on this Interconnect.  - UNDER_MAINTENANCE: The
   * Interconnect is undergoing internal maintenance. No attachments may be provisioned or updated
   * on this Interconnect.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * [Output Only] The current state of Interconnect functionality, which can take one of the
   * following values: - ACTIVE: The Interconnect is valid, turned up and ready to use. Attachments
   * may be provisioned on this Interconnect.  - UNPROVISIONED: The Interconnect has not completed
   * turnup. No attachments may be provisioned on this Interconnect.  - UNDER_MAINTENANCE: The
   * Interconnect is undergoing internal maintenance. No attachments may be provisioned or updated
   * on this Interconnect.
   * @param state state or {@code null} for none
   */
  public Interconnect setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public Interconnect set(String fieldName, Object value) {
    return (Interconnect) super.set(fieldName, value);
  }

  @Override
  public Interconnect clone() {
    return (Interconnect) super.clone();
  }

}
