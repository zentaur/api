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
import java.nio.channels.WritableByteChannel;

/**
 * Response body are generated via ResponseBodyWriter implementations.
 */
public interface ResponseBodyWriter
{

    /**
     * Returns the mime type of the streamed response.
     *
     * @return the mime type of the streamed response.
     */
    String contentType();

    /**
     * Generates the body response into the target output stream.
     *
     * @param output the target output where body has to be generated
     * @throws IOException is any error occurs during the body generation
     */
    void write( WritableByteChannel output )
        throws IOException;

}
