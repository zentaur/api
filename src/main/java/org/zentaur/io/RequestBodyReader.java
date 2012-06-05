package org.zentaur.io;

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

import java.io.IOException;
import java.nio.ByteBuffer;

/**
 * {@link org.zentaur.http.Request} body are read by RequestBodyReader implementations.
 *
 * This class takes inspiration from <a href="http://sonatype.github.com/async-http-client/request.html">async-http-client</a>
 *
 * @param <T> an arbitrary returned type
 */
public interface RequestBodyReader<T>
{

    /**
     * Invoked as soon as some {@link org.zentaur.http.Request} body part are received.
     *
     * @param buffer the request body part
     * @throws IOException if any error occurs while reading the content body input stream
     */
    void onBodyPartReceived( ByteBuffer buffer )
        throws IOException;

    /**
     * Invoked as soon as all request body parts are terminated.
     *
     * @return The object has to be mapped by reading the buffers
     */
    T onComplete();

}
