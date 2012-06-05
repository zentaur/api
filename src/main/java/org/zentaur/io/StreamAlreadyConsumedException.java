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

/**
 * Exception designed for cases where users intend to consume the HTTP request stream
 * that has been already consumed by reading the {@code application/x-www-form-urlencoded}
 * request.
 */
public final class StreamAlreadyConsumedException
    extends IOException
{

    private static final long serialVersionUID = 1L;

    /**
     * Creates a new Exception instance.
     */
    public StreamAlreadyConsumedException()
    {
        super();
    }

}
