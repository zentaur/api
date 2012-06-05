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

import java.util.Date;
import java.util.UUID;

/**
 * Represents an HTTP user session, inspired by the
 * <a href="http://docs.oracle.com/javaee/5/api/javax/servlet/http/HttpSession.html">HttpSession</a>
 */
public interface Session
{

    /**
     * Returns the unique identifier assigned to this session.
     *
     * @return the unique identifier assigned to this session
     */
    UUID getId();

    /**
     * Returns the object bound with the specified name in this session, or null if no object is bound under the name.
     *
     * @param <A> the the attribute returned type
     * @param name a string specifying the name of the object
     * @return the object bound with the specified name in this session, or null if no object is bound under the name.
     */
    <A> A getAttribute( String name );

    /**
     * Removes the object bound with the specified name from this session.
     *
     * @param name the name of the object to remove from this session
     */
    void removeAttribute( String name );

    /**
     * Binds an object to this session, using the name specified.
     *
     * @param <A> the the attribute returned type
     * @param name the non-null name to which the object is bound
     * @param value the object to be bound
     */
    <A> void setAttribute( String name, A value );

    /**
     * Returns the time when this session was created.
     *
     * @return the time when this session was created.
     */
    Date getCreationTime();

    /**
     * Returns the last time the client sent a request associated with this session.
     *
     * @return the last time the client sent a request associated with this session.
     */
    Date getLastAccessedTime();

    /**
     * Marks the session is a new session or already existing one.
     *
     * @return true if the client does not yet know about the session or if the
     *         client chooses not to join the session.
     */
    boolean isNew();

}
