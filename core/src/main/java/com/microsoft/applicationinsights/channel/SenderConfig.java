package com.microsoft.applicationinsights.channel;

public class SenderConfig {

    public static final String defaultEndpointUrl = "https://dc.services.visualstudio.com/v2/track";
    public static final int defaultMaxBatchCount = 100;
    public static final int defaultMaxBatchIntervalMs = 15 * 1000; // 15 seconds
    public static final boolean defaultDisableTelemetry = false;

    /**
     * The url to which payloads will be sent
     */
    public String endpointUrl;

    /**
     * The maximum size of a batch in bytes
     */
    public int maxBatchCount;

    /**
     * The maximum interval allowed between calls to batchInvoke
     */
    public int maxBatchIntervalMs; // 15 seconds

    /**
     * The master off switch.  Do not send any data if set to TRUE
     */
    public boolean disableTelemetry;

    /**
     * The platform specific internal logging mechanism
     */
    public ILoggingInternal internalLogger;

    /**
     * Constructs a new instance of the sender config
     */
    public SenderConfig() {
        this.endpointUrl = SenderConfig.defaultEndpointUrl;
        this.maxBatchCount = SenderConfig.defaultMaxBatchCount;
        this.maxBatchIntervalMs = SenderConfig.defaultMaxBatchIntervalMs;
        this.disableTelemetry = SenderConfig.defaultDisableTelemetry;
    }
}