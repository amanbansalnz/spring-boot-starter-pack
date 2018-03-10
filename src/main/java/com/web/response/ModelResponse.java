package com.web.response;

public class ModelResponse {
    private boolean healthy;

    public ModelResponse(boolean healthy) {
        this.healthy = healthy;
    }

    public boolean isHealthy() {
        return healthy;
    }
}
