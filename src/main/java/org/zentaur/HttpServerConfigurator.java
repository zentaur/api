package org.zentaur;

import org.zentaur.http.Response.Status;

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
 * The Server configuration.
 *
 * It has been designed as interface so users are free to implement their proxies on
 * Properties, XML, JSON, YAML, ...
 */
public interface HttpServerConfigurator
{

    /**
     * Configure the host name or the textual representation of its IP address the server has to be bound.
     *
     * @param host the host name or the textual representation of its IP address.
     */
    void bindServerToHost( String host );

    /**
     * Configure the port number where binding the server.
     *
     * @param port the port number where binding the server.
     */
    void bindServerToPort( int port );

    /**
     * Configure the number of threads that will serve the HTTP requests.
     *
     * @param threads the number of threads that will serve the HTTP requests.
     */
    void serveRequestsWithThreads( int threads );

    /**
     * Configure the maximum number of seconds of life of HTTP Sessions.
     *
     * @param sessionMaxAge the maximum number of seconds of life of HTTP Sessions.
     */
    void sessionsHaveMagAge( int sessionMaxAge );

    /**
     * Configure the connections keep-alive timeout, in seconds.
     *
     * @param keepAliveTimeOut the connections keep-alive timeout, in seconds.
     */
    void keepAliveConnectionsHaveTimeout( int keepAliveTimeOut );

    /**
     * Starts binding a request path, can be expressed using the {@code web.xml} grammar,
     * to a {@link org.zentaur.http.RequestHandler}.
     *
     * @param path the path for handling calls.
     * @return the builder to associate a request dispatcher.
     */
    RequestHandlerBuilder serve( String path );

    /**
     * Allows defining the default response has to be shown when
     * replying to clients with specified status.
     *
     * @param status the status the server is replying to clients
     * @return the builder to associate a fixed file to the given status
     */
    DefaultResponseBuilder when( Status status );

}
