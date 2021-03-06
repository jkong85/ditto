/*
 * Copyright (c) 2017 Bosch Software Innovations GmbH.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/org/documents/epl-2.0/index.php
 *
 * Contributors:
 *    Bosch Software Innovations GmbH - initial contribution
 */
package org.eclipse.ditto.services.thingsearch.querymodel.expression;


import org.eclipse.ditto.services.thingsearch.querymodel.criteria.CriteriaFactory;
import org.eclipse.ditto.services.thingsearch.querymodel.expression.visitors.FieldExpressionVisitor;

/**
 * Field expression: Used to create criteria based on certain fields.
 *
 * @see CriteriaFactory
 */
public interface FieldExpression {

    /**
     * Evaluates this expression by a visitor.
     *
     * @param visitor The visitor to perform the evaluation.
     * @param <T> The result type.
     * @return The result of the evaluation.
     */
    <T> T accept(final FieldExpressionVisitor<T> visitor);
}
