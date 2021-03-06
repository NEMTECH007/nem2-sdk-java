/*
 * Copyright 2018 NEM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.nem.core.crypto;

/**
 * Exception that is used when a cryptographic operation fails.
 */
public class CryptoException extends RuntimeException {

    /**
     * Creates a new crypto exception.
     *
     * @param message The exception message.
     */
    public CryptoException(final String message) {
        super(message);
    }

    /**
     * Creates a new crypto exception.
     *
     * @param cause The exception cause.
     */
    public CryptoException(final Throwable cause) {
        super(cause);
    }

    /**
     * Creates a new crypto exception.
     *
     * @param message The exception message.
     * @param cause   The exception cause.
     */
    public CryptoException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
