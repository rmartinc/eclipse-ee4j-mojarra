/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package com.sun.faces.config.beans;


/**
 * <p>Interface denoting a configuration bean that stores a
 * <code>listEntries</code> property.
 */

public interface ListEntriesHolder {


    // -------------------------------------------------------------- Properties


    /**
     * <p>Return the current <code>listEntries</code> object
     * for this configuration bean.</p>
     */
    public ListEntriesBean getListEntries();


    /**
     * <p>Set the current <code>listEntries</code> object
     * for this configuration bean.</p>
     *
     * @param listEntries The new <code>listEntries</code> object
     */
    public void setListEntries(ListEntriesBean listEntries);


}