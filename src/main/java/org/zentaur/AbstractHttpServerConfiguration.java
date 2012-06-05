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

import static org.zentaur.lang.Preconditions.checkState;

import org.zentaur.http.Response.Status;

/**
 * An abstract RequestDispatcherConfiguration implementation that helps on dropping the
 * boilerplate code of repeating the binder variable reference when binding.
 */
public abstract class AbstractHttpServerConfiguration
    implements HttpServerConfiguration
{

    private HttpServerConfigurator configurator;

    /**
     * {@inheritDoc}
     */
    public final void configure( HttpServerConfigurator configurator )
    {
        checkState( this.configurator == null, "Re-entry not allowed!" );

        this.configurator = configurator;

        try
        {
            configure();
        }
        finally
        {
            this.configurator = null;
        }
    }

    /**
     * @see HttpServerConfiguration#configure(HttpServerConfigurator)
     */
    protected abstract void configure();

    /**
     * Configure the host name or the textual representation of its IP address the server has to be bound.
     *
     * @param host the host name or the textual representation of its IP address.
     * @see HttpServerConfigurator#bindServerToHost(String)
     */
    protected final void bindServerToHost( String host )
    {
        configurator.bindServerToHost( host );
    }

    /**
     * Configure the port number where binding the server.
     *
     * @param port the port number where binding the server.
     * @see HttpServerConfigurator#bindServerToPort(int)
     */
    protected final void bindServerToPort( int port )
    {
        configurator.bindServerToPort( port );
    }

    /**
     * Configure the number of threads that will serve the HTTP requests.
     *
     * @param threads the number of threads that will serve the HTTP requests.
     * @see HttpServerConfigurator#serveRequestsWithThreads(int)
     */
    protected final void serveRequestsWithThreads( int threads )
    {
        configurator.serveRequestsWithThreads( threads );
    }

    /**
     * Configure the maximum number of seconds of life of HTTP Sessions.
     *
     * @param sessionMaxAge the maximum number of seconds of life of HTTP Sessions.
     * @see HttpServerConfigurator#sessionsHaveMagAge(int)
     */
    protected final void sessionsHaveMagAge( int sessionMaxAge )
    {
        configurator.sessionsHaveMagAge( sessionMaxAge );
    }

    /**
     * Configure the connections keep-alive timeout, in seconds.
     *
     * @param keepAliveTimeOut the connections keep-alive timeout, in seconds.
     */
    protected final void keepAliveConnectionsHaveTimeout( int keepAliveTimeOut )
    {
        configurator.keepAliveConnectionsHaveTimeout( keepAliveTimeOut );
    }

    /**
     *Starts binding a request path, can be expressed using the {@code web.xml} grammar,
     * to a {@link org.zentaur.http.RequestHandler}.
     *
     * @param path the path for handling calls.
     * @return the builder to associate a request dispatcher
     * @see HttpServerConfigurator#serve(String)
     */
    protected final RequestHandlerBuilder serve( String path )
    {
        return configurator.serve( path );
    }

    /**
     *
     * Allows defining the default response has to be shown when
     * replying to clients with specified status.
     *
     * @param status the status the server is replying to clients
     * @return the builder to associate a fixed file to the given status
     */
    protected final DefaultResponseBuilder when( Status status )
    {
        return configurator.when( status );
    }

}
