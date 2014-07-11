package com.qubole.qds.sdk.java.client.retry;

import org.glassfish.jersey.client.ClientResponse;

/**
 * Functor to determine what is or isn't retry-able
 */
public interface RetryPolicy
{
    /**
     * Return true if the given arguments require a retry
     *
     * @param response the client response (might be null)
     * @param exception any exception (might be null)
     * @return true/false
     */
    public boolean shouldBeRetried(ClientResponse response, Throwable exception);
}
