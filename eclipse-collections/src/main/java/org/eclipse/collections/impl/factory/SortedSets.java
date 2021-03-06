/*
 * Copyright (c) 2015 Goldman Sachs.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v. 1.0 which accompany this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 */

package org.eclipse.collections.impl.factory;

import org.eclipse.collections.api.factory.set.sorted.ImmutableSortedSetFactory;
import org.eclipse.collections.api.factory.set.sorted.MutableSortedSetFactory;
import org.eclipse.collections.impl.set.sorted.immutable.ImmutableSortedSetFactoryImpl;
import org.eclipse.collections.impl.set.sorted.mutable.MutableSortedSetFactoryImpl;

@SuppressWarnings("ConstantNamingConvention")
public final class SortedSets
{
    public static final ImmutableSortedSetFactory immutable = new ImmutableSortedSetFactoryImpl();
    public static final MutableSortedSetFactory mutable = new MutableSortedSetFactoryImpl();

    private SortedSets()
    {
        throw new AssertionError("Suppress default constructor for noninstantiability");
    }
}
