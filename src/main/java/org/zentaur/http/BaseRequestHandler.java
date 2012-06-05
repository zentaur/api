package org.zentaur.http;

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

import static org.zentaur.http.Response.Status.METHOD_NOT_ALLOWED;

import java.io.IOException;

/**
 * Provides an abstract class to be subclassed to create
 * an HTTP handler.
 *
 * This class is inspired from HttpServlet.
 *
 * A subclass should override at least one method, usually one of:
 *
 * <ul>
 * <li><code>options</code>, for HTTP OPTIONS requests</li>
 * <li><code>get</code>, for HTTP GET requests</li>
 * <li><code>head</code>, for HTTP HEAD requests</li>
 * <li><code>post</code>, for HTTP POST requests</li>
 * <li><code>put</code>, for HTTP PUT requests</li>
 * <li><code>delete</code>, for HTTP DELETE requests</li>
 * <li><code>trace</code>, for HTTP TRACE requests</li>
 * <li><code>connect</code>, for HTTP CONNECT requests</li>
 * </ul>
 */
public abstract class BaseRequestHandler
    implements RequestHandler
{

    /**
     * {@inheritDoc}
     */
    public final void handle( Request request, Response response )
        throws IOException
    {
        switch ( request.getMethod() )
        {
            case OPTIONS:
                options( request, response );
                break;

            case GET:
                get( request, response );
                break;

            case HEAD:
                head( request, response );
                break;

            case POST:
                post( request, response );
                break;

            case PUT:
                put( request, response );
                break;

            case DELETE:
                delete( request, response );
                break;

            case TRACE:
                trace( request, response );
                break;

            case CONNECT:
                connect( request, response );
                break;
        }
    }

    /**
     * HTTP OPTIONS request.
     *
     * @param request the HTTP request
     * @param response the HTTP response
     * @throws IOException if any error occurs while HTTP negotiation
     */
    protected void options( Request request, Response response )
        throws IOException
    {
        notAllowed( response );
    }

    /**
     * HTTP GET request.
     *
     * @param request the HTTP request
     * @param response the HTTP response
     * @throws IOException if any error occurs while HTTP negotiation
     */
    protected void get( Request request, Response response )
        throws IOException
    {
        notAllowed( response );
    }

    /**
     * HTTP HEAD request.
     *
     * @param request the HTTP request
     * @param response the HTTP response
     * @throws IOException if any error occurs while HTTP negotiation
     */
    protected void head( Request request, Response response )
        throws IOException
    {
        notAllowed( response );
    }

    /**
     * HTTP POST request.
     *
     * @param request the HTTP request
     * @param response the HTTP response
     * @throws IOException if any error occurs while HTTP negotiation
     */
    protected void post( Request request, Response response )
        throws IOException
    {
        notAllowed( response );
    }

    /**
     * HTTP PUT request.
     *
     * @param request the HTTP request
     * @param response the HTTP response
     * @throws IOException if any error occurs while HTTP negotiation
     */
    protected void put( Request request, Response response )
        throws IOException
    {
        notAllowed( response );
    }

    /**
     * HTTP DELETE request.
     *
     * @param request the HTTP request
     * @param response the HTTP response
     * @throws IOException if any error occurs while HTTP negotiation
     */
    protected void delete( Request request, Response response )
        throws IOException
    {
        notAllowed( response );
    }

    /**
     * HTTP TRACE request.
     *
     * @param request the HTTP request
     * @param response the HTTP response
     * @throws IOException if any error occurs while HTTP negotiation
     */
    protected void trace( Request request, Response response )
        throws IOException
    {
        notAllowed( response );
    }

    /**
     * HTTP CONNECT request.
     *
     * @param request the HTTP request
     * @param response the HTTP response
     * @throws IOException if any error occurs while HTTP negotiation
     */
    protected void connect( Request request, Response response )
        throws IOException
    {
        notAllowed( response );
    }

    /**
     * Initializes the status of the response as METHOD_NOT_ALLOWED
     *
     * @param response the HTTP response
     */
    private void notAllowed( Response response )
    {
        response.setStatus( METHOD_NOT_ALLOWED );
    }

}
