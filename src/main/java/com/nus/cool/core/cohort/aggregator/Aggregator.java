/*
 * Copyright 2021 Cool Squad Team
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.nus.cool.core.cohort.aggregator;

import com.nus.cool.core.io.storevector.InputVector;
import java.util.BitSet;

/**
 * Calculate the users behavior metric after they are born. The 
 * interface is special designed for cohort query. Each iteration
 * processes events of a single user after he/she is born.
 */
public interface Aggregator {

  void init(InputVector metricVec, InputVector eventDayVec, int maxAges, int from, int to,
      int ageDivider);

  void processUser(BitSet hitBV, int sinceDay, int start, int end, long[] row);
}
