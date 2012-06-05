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

import java.io.IOException;
import java.util.List;

import org.zentaur.collections.MultiValued;
import org.zentaur.io.RequestBodyReader;

/**
 * HTTP Request representation.
 */
public interface Request
{

    /**
     * HTTP method representation.
     */
    public enum Method
    {

        /**
         * The {@code OPTIONS} method.
         */
        OPTIONS,
        /**
         * The {@code GET} method.
         */
        GET,
        /**
         * The {@code HEAD} method.
         */
        HEAD,
        /**
         * The {@code POST} method.
         */
        POST,
        /**
         * The {@code PUT} method.
         */
        PUT,
        /**
         * The {@code DELETE} method.
         */
        DELETE,
        /**
         * The {@code TRACE} method.
         */
        TRACE,
        /**
         * The {@code CONNECT} method.
         */
        CONNECT;

    }

    /**
     * Return the client host connected to the server.
     *
     * @return the client host connected to the server.
     */
    String getClientHost();

    /**
     * Return the server host.
     *
     * @return the server host.
     */
    String getServerHost();

    /**
     * Return the server port.
     *
     * @return the server port.
     */
    int getServerPort();

    /**
     * Returns the request path.
     *
     * @return the request path
     */
    String getPath();

    /**
     * Returns the HTTP method.
     *
     * @return the HTTP method.
     */
    Method getMethod();

    /**
     * Returns the protocol name.
     *
     * @return the protocol name.
     */
    String getProtocolName();

    /**
     * Returns the protocol version.
     *
     * @return the protocol version.
     */
    String getProtocolVersion();

    /**
     * Returns the HTTP headers.
     *
     * @return the HTTP headers.
     */
    MultiValued<String, String> getHeaders();

    /**
     * Returns the list of cookies sent by the client.
     *
     * @return the list of cookies sent by the client.
     */
    List<Cookie> getCookies();

    /**
     * Returns the Query String parameters, populated only if HTTP method is {@link Method#GET}.
     *
     * @return the Query String parameters
     */
    MultiValued<String, String> getQueryStringParameters();

    /**
     * Returns the parameters, populated only if HTTP method is {@link Method#POST}
     * and {@code Content-Type} is set to {@code application/x-www-form-urlencoded}.
     *
     * @return the parameters
     */
    MultiValued<String, String> getParameters();

    /**
     * Returns the current HTTP Session.
     *
     * @return the current HTTP Session.
     */
    Session getSession();

    /**
     * Returns the request body content length.
     *
     * @return the request body content length, {@code -1} if it is unknown.
     */
    long getContentLength();

    /**
     * Reads and converts the request body input stream.
     *
     * @param <T> the type the request body has to be bound to.
     * @param requestBodyReader the reader that transforms the request body in a custom type.
     * @return the request body input stream.
     * @throws IOException if any error occurs while opening the request body stream.
     */
    <T> T readRequestBody( RequestBodyReader<T> requestBodyReader )
        throws IOException;

}
