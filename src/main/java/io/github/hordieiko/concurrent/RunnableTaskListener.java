package io.github.hordieiko.concurrent;

import java.util.function.Consumer;

/**
 * Runnable task listener.
 */
@FunctionalInterface
public interface RunnableTaskListener<U extends CancellableTask.CancellationReason> extends Consumer<RunnableCancellableFuture<?, U>> {
    /**
     * Defines the types of events that listeners can be subscribed to.
     */
    enum EventType {
        BEFORE_EXECUTE, AFTER_EXECUTE
    }
}
