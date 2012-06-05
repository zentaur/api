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

/**
 * An Simple Server implementation able to serve
 */
public interface HttpServer
{

    /**
     * Statuses that the Server can assume.
     */
    public static enum Status
    {

        /**
         * Marks the server has been initialized.
         */
        INITIALIZED,

        /**
         * The server is currently running.
         */
        RUNNING,

        /**
         * The server is not serving requests.
         */
        STOPPED;

    }

    /**
     * Initializes the current server.
     *
     * @param serverConfiguration the server configuration
     * @throws InitException if any error occurs while starting up.
     */
    void init( HttpServerConfiguration serverConfiguration )
        throws InitException;

    /**
     * Starts the current server instance.
     *
     * @throws RunException if any fatal error occurs while running.
     */
    void start()
        throws RunException;

    /**
     * Stops the current server execution.
     *
     * @throws ShutdownException if any error occurs while shutting down.
     */
    void stop()
        throws ShutdownException;

    /**
     * Returns the current server status.
     *
     * @return the current server status.
     */
    Status getStatus();

}
