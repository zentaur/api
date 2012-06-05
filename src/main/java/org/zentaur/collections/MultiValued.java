package org.zentaur.collections;

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

import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

/**
 * A MultiValued is a read-only data structure where multiple values are associated to the same key.
 *
 * @param <K> the type of keys maintained by this data structure.
 * @param <V> the type of mapped values.
 */
public interface MultiValued<K, V>
{

    /**
     * Verifies the input key is contained in the collection.
     *
     * @param key the non null key to check
     * @return true if the key is found, false otherwise
     */
    boolean contains( K key );

    /**
     * Returns the first associated value to the given key, if found, null otherwise.
     *
     * @param key the non null key for which retrieve the value
     * @return the first associated value to the given key, if found, null otherwise.
     */
    V getFirstValue( K key );

    /**
     * Returns an unmodifiable list with all the associated values to the given key, if found, null otherwise.
     *
     * @param key the non null key for which retrieve the values
     * @return an unmodifiable list with all the associated values to the given key, if found, null otherwise.
     */
    List<V> getValues( K key );

    /**
     * Returns an unmodifiable set containing all the stored keys.
     *
     * @return an unmodifiable set all the stored keys.
     */
    Set<K> getAllKeys();

    /**
     * Returns an unmodifiable iterable instance over all stored entries.
     *
     * @return an unmodifiable iterable instance over all stored entries.
     */
    Iterable<Entry<K, List<V>>> getAllEntries();

}
