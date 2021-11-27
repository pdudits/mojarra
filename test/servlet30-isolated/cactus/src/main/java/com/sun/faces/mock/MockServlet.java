/*
 * Copyright (c) 2017, 2018 Oracle and/or its affiliates. All rights reserved.
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

/*
 * $Id: MockServlet.java,v 1.1 2005/10/18 17:48:03 edburns Exp $
 */



package com.sun.faces.mock;


import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


/**
 * <p>Mock <strong>Servlet</strong> for unit tests.</p>
 */

public class MockServlet implements Servlet {


    public MockServlet() {
    }


    public MockServlet(ServletConfig config) throws ServletException {
        init(config);
    }


    private ServletConfig config;


    public void destroy() {
    }


    public ServletConfig getServletConfig() {
        return (this.config);
    }


    public String getServletInfo() {
        return ("MockServlet");
    }


    public void init(ServletConfig config) throws ServletException {
        this.config = config;
    }



    public void service(ServletRequest request, ServletResponse response)
        throws IOException, ServletException {
        throw new UnsupportedOperationException();
    }


}