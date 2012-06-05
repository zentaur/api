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

import java.util.Set;

/**
 * In memory representation of HTTP cookie.
 */
public interface Cookie
{

    /**
     * The cookie domain.
     *
     * @return the cookie domain
     */
    String getDomain();

    /**
     * The cookie name.
     *
     * @return the cookie name
     */
    String getName();

    /**
     * The cookie value.
     *
     * @return the cookie value.
     */
    String getValue();

    /**
     * The cookie path.
     *
     * @return the cookie path.
     */
    String getPath();

    /**
     * The cookie max age.
     *
     * @return the cookie max age.
     */
    int getMaxAge();

    /**
     * Flag to mark the cookie is secure.
     *
     * @return true, if the cookie is secure, false otherwise.
     */
    boolean isSecure();

    /**
     * The cookie ports.
     *
     * @return the cookie ports.
     */
    Set<Integer> getPorts();

}
