/*
 *                       ######
 *                       ######
 * ############    ####( ######  #####. ######  ############   ############
 * #############  #####( ######  #####. ######  #############  #############
 *        ######  #####( ######  #####. ######  #####  ######  #####  ######
 * ###### ######  #####( ######  #####. ######  #####  #####   #####  ######
 * ###### ######  #####( ######  #####. ######  #####          #####  ######
 * #############  #############  #############  #############  #####  ######
 *  ############   ############  #############   ############  #####  ######
 *                                      ######
 *                               #############
 *                               ############
 *
 * Adyen Java API Library
 *
 * Copyright (c) 2018 Adyen B.V.
 * This file is open source and available under the MIT license.
 * See the LICENSE file for more info.
 */
package com.adyen.model;


import java.io.IOException;
import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;


/**
 * ThreeDS2RequestData
 */
public class ThreeDS2RequestData {

    @SerializedName("authenticationOnly")
    private Boolean authenticationOnly = null;

    /**
     * Gets or Sets challengeIndicator
     */
    @JsonAdapter(ChallengeIndicatorEnum.Adapter.class)
    public enum ChallengeIndicatorEnum {

        NOPREFERENCE("noPreference"),
        REQUESTCHALLENGE("requestChallenge"),
        REQUESTNOCHALLENGE("requestNoChallenge");

        private String value;

        ChallengeIndicatorEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ChallengeIndicatorEnum fromValue(String text) {
            for (ChallengeIndicatorEnum b : ChallengeIndicatorEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<ChallengeIndicatorEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ChallengeIndicatorEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ChallengeIndicatorEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ChallengeIndicatorEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("challengeIndicator")
    private ChallengeIndicatorEnum challengeIndicator = null;

    @SerializedName("deviceChannel")
    private String deviceChannel = null;

    @SerializedName("deviceRenderOptions")
    private DeviceRenderOptions deviceRenderOptions = null;

    @SerializedName("notificationURL")
    private String notificationURL = null;

    @SerializedName("sdkAppID")
    private String sdkAppID = null;

    @SerializedName("sdkEncData")
    private String sdkEncData = null;

    @SerializedName("sdkEphemPubKey")
    private SDKEphemPubKey sdkEphemPubKey = null;

    @SerializedName("sdkMaxTimeout")
    private Integer sdkMaxTimeout = null;

    @SerializedName("sdkReferenceNumber")
    private String sdkReferenceNumber = null;

    @SerializedName("sdkTransID")
    private String sdkTransID = null;

    @SerializedName("threeDSCompInd")
    private String threeDSCompInd = null;

    @SerializedName("threeDSRequestorURL")
    private String threeDSRequestorURL = null;

    @Deprecated
    @SerializedName("threeDSServerTransID")
    private String threeDSServerTransID = null;

    @SerializedName("messageVersion")
    private String messageVersion = null;

    @SerializedName("threeDSRequestorID")
    private String threeDSRequestorID = null;

    @SerializedName("threeDSRequestorName")
    private String threeDSRequestorName = null;

    @SerializedName("acquirerBIN")
    private String acquirerBIN = null;

    @SerializedName("acquirerMerchantID")
    private String acquirerMerchantID = null;

    @SerializedName("mcc")
    private String mcc = null;

    public ThreeDS2RequestData authenticationOnly(Boolean authenticationOnly) {
        this.authenticationOnly = authenticationOnly;
        return this;
    }

    public Boolean isAuthenticationOnly() {
        return authenticationOnly;
    }

    public void setAuthenticationOnly(Boolean authenticationOnly) {
        this.authenticationOnly = authenticationOnly;
    }

    public ThreeDS2RequestData challengeIndicator(ChallengeIndicatorEnum challengeIndicator) {
        this.challengeIndicator = challengeIndicator;
        return this;
    }

    public ChallengeIndicatorEnum getChallengeIndicator() {
        return challengeIndicator;
    }

    public void setChallengeIndicator(ChallengeIndicatorEnum challengeIndicator) {
        this.challengeIndicator = challengeIndicator;
    }

    public ThreeDS2RequestData deviceChannel(String deviceChannel) {
        this.deviceChannel = deviceChannel;
        return this;
    }

    public String getDeviceChannel() {
        return deviceChannel;
    }

    public void setDeviceChannel(String deviceChannel) {
        this.deviceChannel = deviceChannel;
    }

    public ThreeDS2RequestData deviceRenderOptions(DeviceRenderOptions deviceRenderOptions) {
        this.deviceRenderOptions = deviceRenderOptions;
        return this;
    }

    public DeviceRenderOptions getDeviceRenderOptions() {
        return deviceRenderOptions;
    }

    public void setDeviceRenderOptions(DeviceRenderOptions deviceRenderOptions) {
        this.deviceRenderOptions = deviceRenderOptions;
    }

    public ThreeDS2RequestData notificationURL(String notificationURL) {
        this.notificationURL = notificationURL;
        return this;
    }

    public String getNotificationURL() {
        return notificationURL;
    }

    public void setNotificationURL(String notificationURL) {
        this.notificationURL = notificationURL;
    }

    public ThreeDS2RequestData sdkAppID(String sdkAppID) {
        this.sdkAppID = sdkAppID;
        return this;
    }

    public String getSdkAppID() {
        return sdkAppID;
    }

    public void setSdkAppID(String sdkAppID) {
        this.sdkAppID = sdkAppID;
    }

    public ThreeDS2RequestData sdkEncData(String sdkEncData) {
        this.sdkEncData = sdkEncData;
        return this;
    }

    public String getSdkEncData() {
        return sdkEncData;
    }

    public void setSdkEncData(String sdkEncData) {
        this.sdkEncData = sdkEncData;
    }

    public ThreeDS2RequestData sdkEphemPubKey(SDKEphemPubKey sdkEphemPubKey) {
        this.sdkEphemPubKey = sdkEphemPubKey;
        return this;
    }

    public SDKEphemPubKey getSdkEphemPubKey() {
        return sdkEphemPubKey;
    }

    public void setSdkEphemPubKey(SDKEphemPubKey sdkEphemPubKey) {
        this.sdkEphemPubKey = sdkEphemPubKey;
    }

    public ThreeDS2RequestData sdkMaxTimeout(Integer sdkMaxTimeout) {
        this.sdkMaxTimeout = sdkMaxTimeout;
        return this;
    }

    public Integer getSdkMaxTimeout() {
        return sdkMaxTimeout;
    }

    public void setSdkMaxTimeout(Integer sdkMaxTimeout) {
        this.sdkMaxTimeout = sdkMaxTimeout;
    }

    public ThreeDS2RequestData sdkReferenceNumber(String sdkReferenceNumber) {
        this.sdkReferenceNumber = sdkReferenceNumber;
        return this;
    }

    public String getSdkReferenceNumber() {
        return sdkReferenceNumber;
    }

    public void setSdkReferenceNumber(String sdkReferenceNumber) {
        this.sdkReferenceNumber = sdkReferenceNumber;
    }

    public ThreeDS2RequestData sdkTransID(String sdkTransID) {
        this.sdkTransID = sdkTransID;
        return this;
    }

    public String getSdkTransID() {
        return sdkTransID;
    }

    public void setSdkTransID(String sdkTransID) {
        this.sdkTransID = sdkTransID;
    }

    public ThreeDS2RequestData threeDSCompInd(String threeDSCompInd) {
        this.threeDSCompInd = threeDSCompInd;
        return this;
    }


    public String getThreeDSCompInd() {
        return threeDSCompInd;
    }

    public void setThreeDSCompInd(String threeDSCompInd) {
        this.threeDSCompInd = threeDSCompInd;
    }

    public ThreeDS2RequestData threeDSRequestorURL(String threeDSRequestorURL) {
        this.threeDSRequestorURL = threeDSRequestorURL;
        return this;
    }

    public String getThreeDSRequestorURL() {
        return threeDSRequestorURL;
    }

    public void setThreeDSRequestorURL(String threeDSRequestorURL) {
        this.threeDSRequestorURL = threeDSRequestorURL;
    }

    /**
     * @deprecated As of Checkout/Payments API version 41, this field is not used anymore.
     */
    @Deprecated
    public ThreeDS2RequestData threeDSServerTransID(String threeDSServerTransID) {
        this.threeDSServerTransID = threeDSServerTransID;
        return this;
    }

    /**
     * @deprecated As of Checkout/Payments API version 41, this field is not used anymore.
     */
    @Deprecated
    public String getThreeDSServerTransID() {
        return threeDSServerTransID;
    }

    /**
     * @deprecated As of Checkout/Payments API version 41, this field is not used anymore.
     */
    @Deprecated
    public void setThreeDSServerTransID(String threeDSServerTransID) {
        this.threeDSServerTransID = threeDSServerTransID;
    }

    /**
     * The messageVersion value indicating the 3D Secure 2 protocol version.
     * @return messageVersion
     */
    public String getMessageVersion() {
        return messageVersion;
    }

    public void setMessageVersion(String messageVersion) {
        this.messageVersion = messageVersion;
    }

    public ThreeDS2RequestData messageVersion(String messageVersion) {
        this.messageVersion = messageVersion;
        return this;
    }

    /**
     * Required for [authentication-only integration](https://docs.adyen.com/checkout/3d-secure-2/3ds2-checkout-authentication-only-integration) for Visa. Unique 3D Secure requestor identifier assigned by the Directory Server when you enrol for 3D Secure 2.
     * @return threeDSRequestorID
     */
    public String getThreeDSRequestorID() {
        return threeDSRequestorID;
    }

    public void setThreeDSRequestorID(String threeDSRequestorID) {
        this.threeDSRequestorID = threeDSRequestorID;
    }

    public ThreeDS2RequestData threeDSRequestorID(String threeDSRequestorID) {
        this.threeDSRequestorID = threeDSRequestorID;
        return this;
    }

    /**
     * Required for [authentication-only integration](https://docs.adyen.com/checkout/3d-secure-2/3ds2-checkout-authentication-only-integration) for Visa. Unique 3D Secure requestor name assigned by the Directory Server when you enrol for 3D Secure 2.
     * @return threeDSRequestorName
     */
    public String getThreeDSRequestorName() {
        return threeDSRequestorName;
    }

    public void setThreeDSRequestorName(String threeDSRequestorName) {
        this.threeDSRequestorName = threeDSRequestorName;
    }

    public ThreeDS2RequestData threeDSRequestorName(String threeDSRequestorName) {
        this.threeDSRequestorName = threeDSRequestorName;
        return this;
    }

    /**
     * Required for [authentication-only integration](https://docs.adyen.com/checkout/3d-secure-2/3ds2-checkout-authentication-only-integration). The acquiring BIN enrolled for 3D Secure 2. This string should match the value that you will use in the authorisation.
     * @return acquirerBIN
     */
    public String getAcquirerBIN() {
        return acquirerBIN;
    }

    public void setAcquirerBIN(String acquirerBIN) {
        this.acquirerBIN = acquirerBIN;
    }

    public ThreeDS2RequestData acquirerBIN(String acquirerBIN) {
        this.acquirerBIN = acquirerBIN;
        return this;
    }

    /**
     * Required for [authentication-only integration](https://docs.adyen.com/checkout/3d-secure-2/3ds2-checkout-authentication-only-integration). The merchantId that is enrolled for 3D Secure 2 by the merchant's acquirer. This string should match the value that you will use in the authorisation.
     * @return acquirerMerchantID
     */
    public String getAcquirerMerchantID() {
        return acquirerMerchantID;
    }

    public void setAcquirerMerchantID(String acquirerMerchantID) {
        this.acquirerMerchantID = acquirerMerchantID;
    }

    public ThreeDS2RequestData acquirerMerchantID(String acquirerMerchantID) {
        this.acquirerMerchantID = acquirerMerchantID;
        return this;
    }

    /**
     * Required for merchants that have been enrolled for 3DS2 by another party than Adyen, mostly [authentication-only integrations](https://docs.adyen.com/checkout/3d-secure-2/3ds2-checkout-authentication-only-integration). The mcc is a four-digit code with which the previously given acquirerMerchantID is registered at the scheme.
     * @return mcc
     */
    public String getMcc() {
        return mcc;
    }

    public void setMcc(String mcc) {
        this.mcc = mcc;
    }

    public ThreeDS2RequestData mcc(String mcc) {
        this.mcc = mcc;
        return this;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ThreeDS2RequestData threeDS2RequestData = (ThreeDS2RequestData) o;
        return Objects.equals(this.authenticationOnly, threeDS2RequestData.authenticationOnly)
                && Objects.equals(this.challengeIndicator, threeDS2RequestData.challengeIndicator)
                && Objects.equals(this.deviceChannel, threeDS2RequestData.deviceChannel)
                && Objects.equals(this.deviceRenderOptions, threeDS2RequestData.deviceRenderOptions)
                && Objects.equals(this.notificationURL, threeDS2RequestData.notificationURL)
                && Objects.equals(this.sdkAppID, threeDS2RequestData.sdkAppID)
                && Objects.equals(this.sdkEncData, threeDS2RequestData.sdkEncData)
                && Objects.equals(this.sdkEphemPubKey, threeDS2RequestData.sdkEphemPubKey)
                && Objects.equals(this.sdkMaxTimeout, threeDS2RequestData.sdkMaxTimeout)
                && Objects.equals(this.sdkReferenceNumber, threeDS2RequestData.sdkReferenceNumber)
                && Objects.equals(this.sdkTransID, threeDS2RequestData.sdkTransID)
                && Objects.equals(this.threeDSCompInd, threeDS2RequestData.threeDSCompInd)
                && Objects.equals(this.threeDSRequestorURL, threeDS2RequestData.threeDSRequestorURL)
                && Objects.equals(this.threeDSServerTransID, threeDS2RequestData.threeDSServerTransID)
                && Objects.equals(this.messageVersion, threeDS2RequestData.messageVersion)
                && Objects.equals(this.threeDSRequestorID, threeDS2RequestData.threeDSRequestorID)
                && Objects.equals(this.threeDSRequestorName, threeDS2RequestData.threeDSRequestorName)
                && Objects.equals(this.acquirerBIN, threeDS2RequestData.acquirerBIN)
                && Objects.equals(this.acquirerMerchantID, threeDS2RequestData.acquirerMerchantID)
                && Objects.equals(this.mcc, threeDS2RequestData.mcc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authenticationOnly,
                            challengeIndicator,
                            deviceChannel,
                            deviceRenderOptions,
                            notificationURL,
                            sdkAppID,
                            sdkEncData,
                            sdkEphemPubKey,
                            sdkMaxTimeout,
                            sdkReferenceNumber,
                            sdkTransID,
                            threeDSCompInd,
                            threeDSRequestorURL,
                            threeDSServerTransID,
                            messageVersion,
                            threeDSRequestorID,
                            threeDSRequestorName,
                            acquirerBIN,
                            acquirerMerchantID,
                            mcc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ThreeDS2RequestData {\n");

        sb.append("    authenticationOnly: ").append(toIndentedString(authenticationOnly)).append("\n");
        sb.append("    challengeIndicator: ").append(toIndentedString(challengeIndicator)).append("\n");
        sb.append("    deviceChannel: ").append(toIndentedString(deviceChannel)).append("\n");
        sb.append("    deviceRenderOptions: ").append(toIndentedString(deviceRenderOptions)).append("\n");
        sb.append("    notificationURL: ").append(toIndentedString(notificationURL)).append("\n");
        sb.append("    sdkAppID: ").append(toIndentedString(sdkAppID)).append("\n");
        sb.append("    sdkEncData: ").append(toIndentedString(sdkEncData)).append("\n");
        sb.append("    sdkEphemPubKey: ").append(toIndentedString(sdkEphemPubKey)).append("\n");
        sb.append("    sdkMaxTimeout: ").append(toIndentedString(sdkMaxTimeout)).append("\n");
        sb.append("    sdkReferenceNumber: ").append(toIndentedString(sdkReferenceNumber)).append("\n");
        sb.append("    sdkTransID: ").append(toIndentedString(sdkTransID)).append("\n");
        sb.append("    threeDSCompInd: ").append(toIndentedString(threeDSCompInd)).append("\n");
        sb.append("    threeDSRequestorURL: ").append(toIndentedString(threeDSRequestorURL)).append("\n");
        sb.append("    threeDSServerTransID: ").append(toIndentedString(threeDSServerTransID)).append("\n");
        sb.append("    messageVersion: ").append(toIndentedString(messageVersion)).append("\n");
        sb.append("    threeDSRequestorID: ").append(toIndentedString(threeDSRequestorID)).append("\n");
        sb.append("    threeDSRequestorName: ").append(toIndentedString(threeDSRequestorName)).append("\n");
        sb.append("    acquirerBIN: ").append(toIndentedString(acquirerBIN)).append("\n");
        sb.append("    acquirerMerchantID: ").append(toIndentedString(acquirerMerchantID)).append("\n");
        sb.append("    mcc: ").append(toIndentedString(mcc)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }


}



