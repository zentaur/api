package org.zentaur;

/*
 *   Copyright 2012 The Zentaur Server Project
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

import static java.lang.String.format;

/**
 * Base exception for the basic HTTP server.
 */
public abstract class SHSException
    extends Exception
{

    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new exception with the specified detail message
     *
     * @param messageTemplate a format string
     * @param args Arguments referenced by the format specifiers in the format string
     * @see String#format(String, Object...)
     */
    public SHSException( String messageTemplate, Object...args )
    {
        this( format( messageTemplate, args ), (Throwable) null );
    }

    /**
     * Constructs a new exception with the specified detail message and cause.
     *
     * @param message the detail message
     * @param cause current exception cause
     */
    public SHSException( String message, Throwable cause )
    {
        super( message, cause );
    }

}
