/**
 * Copyright 2019 Pramati Prism, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.hyscale.commons.component;

import javax.annotation.PreDestroy;
import java.util.Collections;
import java.util.List;
@SuppressWarnings("java:S3740")
public class ExecutableComponentProvider {

	private List<ComponentInvoker> componentInvokers;

	public ExecutableComponentProvider(List<ComponentInvoker> componentInvokers) {
		this.componentInvokers = componentInvokers;
	}

	public List<ComponentInvoker> getComponentInvokers() {
		return Collections.unmodifiableList(componentInvokers);
	}

	@PreDestroy
	protected void cleanUp() {
		if (componentInvokers != null) {
			componentInvokers.clear();
			componentInvokers = null;
		}
	}
}
