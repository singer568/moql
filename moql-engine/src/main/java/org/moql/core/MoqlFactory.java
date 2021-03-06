/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.moql.core;

import org.moql.Filter;
import org.moql.MoqlException;
import org.moql.Selector;
import org.moql.SelectorDefinition;
import org.moql.metadata.ColumnMetadata;
import org.moql.metadata.ConditionMetadata;

/**
 * 
 * @author Tang Tadin
 *
 */
public interface MoqlFactory {
	
	Selector createSelector(SelectorDefinition selectorDefinition) throws MoqlException;
	
	Filter createFilter(ConditionMetadata conditionMetadata) throws MoqlException;
	
	Column createColumn(ColumnMetadata columnMetadata, boolean justUsed4Order) throws MoqlException;
}
