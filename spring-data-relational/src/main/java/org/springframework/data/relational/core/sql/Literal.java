/*
 * Copyright 2019-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.relational.core.sql;

import org.springframework.lang.Nullable;

/**
 * Represents a literal.
 *
 * @author Mark Paluch
 * @since 1.1
 */
public class Literal<T> extends AbstractSegment implements Expression {

	private @Nullable T content;

	Literal(@Nullable T content) {
		this.content = content;
	}

	/**
	 * @return the content of the literal.
	 */
	@Nullable
	public T getContent() {
		return content;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {

		if (this.content == null) {
			return "NULL";
		}

		return content.toString();
	}
}
