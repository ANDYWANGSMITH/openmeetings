/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License") +  you may not use this file except in compliance
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
package org.apache.openmeetings.rdc;

import java.awt.event.KeyEvent;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestKeyCodesNumber {
	private static final Logger log = LoggerFactory.getLogger(TestKeyCodesNumber.class);

	@Test
	public void testKeyCodes() {
		try {

			for (int i = 1; i < 600; i++) {

				String charText = KeyEvent.getKeyText(i);

				log.debug("ERROR " + i + " " + charText);

			}

		} catch (Exception err) {
			log.error("[testKeyCodes]", err);
		}

	}

}
