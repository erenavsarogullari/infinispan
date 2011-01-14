/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2000 - 2011, Red Hat Middleware LLC, and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.infinispan.util.hash;

import java.lang.UnsupportedOperationException;

/**
 * Interface that governs implementations
 * 
 * @author Manik Surtani
 * @author Patrick McFarland
 * @see MurmurHash2
 */

public abstract interface Hash {
   /**
    * Hashes a byte array efficiently.
    * 
    * @param payload a byte array to hash
    * @return a hash code for the byte array
    */
   int hash(byte[] payload);

   /**
    * An incremental version of the hash function, that spreads a pre-calculated
    * hash code, such as one derived from {@link Object#hashCode()}.
    * 
    * @param hashcode an object's hashcode
    * @return a spread and hashed version of the hashcode
    */
   int hash(int hashcode);

   /**
    * A helper that calculates the hashcode of an object, choosing the optimal
    * mechanism of hash calculation after considering the type of the object
    * (byte array, String or Object).
    * 
    * @param o object to hash
    * @return a hashcode
    */
   int hash(Object o);
}
