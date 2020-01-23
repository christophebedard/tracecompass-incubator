/*******************************************************************************
 * Copyright (c) 2020 Geneviève Bastien
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

loadModule("/TraceCompassTest/Test")

function compute(value) {
    if (value % 2 == 0) {
        return value / 2;
    }
    return 3 * value + 1;
}

doLoopWithCallback(compute)