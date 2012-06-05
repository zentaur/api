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

/**
 * Simple Object-related utility methods.
 *
 * This class has been contributed to Apache Commons-Graph
 */
public final class Objects
{

    /**
     * Hidden constructor, this class cannot be instantiated directly.
     */
    private Objects()
    {
        // do nothing
    }

    /**
     * Computes a hashCode given the input objects.
     *
     * @param initialNonZeroOddNumber a non-zero, odd number used as the initial value.
     * @param multiplierNonZeroOddNumber a non-zero, odd number used as the multiplier.
     * @param objs the objects to compute hash code.
     * @return the computed hashCode.
     */
    public static int hash( int initialNonZeroOddNumber, int multiplierNonZeroOddNumber, Object...objs )
    {
        int result = initialNonZeroOddNumber;
        for ( Object obj : objs )
        {
            result = multiplierNonZeroOddNumber * result + ( obj != null ? obj.hashCode() : 0 );
        }
        return result;
    }

    /**
     * Verifies input objects are equal.
     *
     * @param <O> the object type under comparison
     * @param o1 the first argument to compare
     * @param o2 the second argument to compare
     * @return true, if the input arguments are equal, false otherwise.
     */
    public static <O> boolean eq( O o1, O o2 )
    {
        return o1 != null ? o1.equals( o2 ) : o2 == null;
    }

}
