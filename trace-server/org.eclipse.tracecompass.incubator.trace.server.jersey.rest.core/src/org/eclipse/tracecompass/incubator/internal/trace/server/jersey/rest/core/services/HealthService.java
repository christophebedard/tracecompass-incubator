/**********************************************************************
 * Copyright (c) 2021 École Polytechnique de Montréal
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License 2.0 which
 * accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 **********************************************************************/

package org.eclipse.tracecompass.incubator.internal.trace.server.jersey.rest.core.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.common.collect.ImmutableMap;

/**
 * Service to query the health status of the server
 *
 * @author Geneviève Bastien
 */
@Path("/health")
public class HealthService {

    private static final String STATUS_KEY = "status"; //$NON-NLS-1$
    private static final String UP_VALUE = "UP"; //$NON-NLS-1$

    /**
     * Getter for the health status
     *
     * @return The set of opened experiments
     */
    @GET
    @Produces({ MediaType.APPLICATION_JSON })
    public Response getHealthStatus() {
        // If the server can answer this call, it is up!!
        return Response.ok(ImmutableMap.of(STATUS_KEY, UP_VALUE)).build();
    }

}
