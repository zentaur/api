package org.zentaur.lang;

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

import static java.lang.String.format;

/**
 * Code inspired from <a href="http://docs.guava-libraries.googlecode.com/git/javadoc/com/google/common/base/Preconditions.html">Google Guava</a>
 */
public final class Preconditions
{

    /**
     * Hidden constructor, this class must not be instantiated.
     */
    private Preconditions()
    {
        // do nothing
    }

    /**
     * Ensures the truth of an expression involving one or more parameters to the
     * calling method.
     *
     * @param expression a boolean expression
     * @param errorMessageTemplate a template for the exception message should the
     *     check fail. The message is formed by replacing each {@code %s}
     *     placeholder in the template with an argument. These are matched by
     *     position - the first {@code %s} gets {@code errorMessageArgs[0]}, etc.
     *     Unmatched arguments will be appended to the formatted message in square
     *     braces. Unmatched placeholders will be left as-is.
     * @param errorMessageArgs the arguments to be substituted into the message
     *     template. Arguments are converted to strings using
     *     {@link String#valueOf(Object)}.
     */
    public static void checkArgument( boolean expression, String errorMessageTemplate, Object... errorMessageArgs )
    {
        if ( !expression )
        {
            throw new IllegalArgumentException( format( errorMessageTemplate, errorMessageArgs ) );
        }
    }

    /**
     * Ensures the truth of an expression involving the state of the calling
     * instance, but not involving any parameters to the calling method.
     *
     * @param expression a boolean expression
     * @param errorMessageTemplate a template for the exception message should the
     *     check fail. The message is formed by replacing each {@code %s}
     *     placeholder in the template with an argument. These are matched by
     *     position - the first {@code %s} gets {@code errorMessageArgs[0]}, etc.
     *     Unmatched arguments will be appended to the formatted message in square
     *     braces. Unmatched placeholders will be left as-is.
     * @param errorMessageArgs the arguments to be substituted into the message template.
     */
    public static void checkState( boolean expression, String errorMessageTemplate, Object... errorMessageArgs )
    {
        if ( !expression )
        {
            throw new IllegalStateException( format( errorMessageTemplate, errorMessageArgs ) );
        }
    }

}
