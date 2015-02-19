/**
 * Copyright (C) 2015 Orion Health (Orchestral Development Ltd)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package xbdd.report.assertions;

import static org.assertj.core.util.Objects.areEqual;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.internal.Iterables;

import xbdd.it.report.FeatureSummary;
import xbdd.it.report.ScenarioSummary;

/**
 * {@link FeatureSummary} specific assertions - Generated by CustomAssertionGenerator.
 */
public class FeatureSummaryAssert extends AbstractAssert<FeatureSummaryAssert, FeatureSummary> {

	/**
	 * Creates a new <code>{@link FeatureSummaryAssert}</code> to make assertions on actual FeatureSummary.
	 *
	 * @param actual the FeatureSummary we want to make assertions on.
	 */
	public FeatureSummaryAssert(final FeatureSummary actual) {
		super(actual, FeatureSummaryAssert.class);
	}

	/**
	 * An entry point for FeatureSummaryAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
	 * With a static import, one can write directly: <code>assertThat(myFeatureSummary)</code> and get specific assertion with code
	 * completion.
	 *
	 * @param actual the FeatureSummary we want to make assertions on.
	 * @return a new <code>{@link FeatureSummaryAssert}</code>
	 */
	public static FeatureSummaryAssert assertThat(final FeatureSummary actual) {
		return new FeatureSummaryAssert(actual);
	}

	/**
	 * Verifies that the actual FeatureSummary's description is equal to the given one.
	 *
	 * @param description the given description to compare the actual FeatureSummary's description to.
	 * @return this assertion object.
	 * @throws AssertionError - if the actual FeatureSummary's description is not equal to the given one.
	 */
	public FeatureSummaryAssert hasDescription(final String description) {
		// check that actual FeatureSummary we want to make assertions on is not null.
		isNotNull();

		// overrides the default error message with a more explicit one
		final String assertjErrorMessage = "\nExpected description of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

		// null safe check
		final String actualDescription = this.actual.getDescription();
		if (!areEqual(actualDescription, description)) {
			failWithMessage(assertjErrorMessage, this.actual, description, actualDescription);
		}

		// return the current assertion for method chaining
		return this;
	}

	/**
	 * Verifies that the actual FeatureSummary's result is equal to the given one.
	 *
	 * @param result the given result to compare the actual FeatureSummary's result to.
	 * @return this assertion object.
	 * @throws AssertionError - if the actual FeatureSummary's result is not equal to the given one.
	 */
	public FeatureSummaryAssert hasResult(final String result) {
		// check that actual FeatureSummary we want to make assertions on is not null.
		isNotNull();

		// overrides the default error message with a more explicit one
		final String assertjErrorMessage = "\nExpected result of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

		// null safe check
		final String actualResult = this.actual.getResult();
		if (!areEqual(actualResult, result)) {
			failWithMessage(assertjErrorMessage, this.actual, result, actualResult);
		}

		// return the current assertion for method chaining
		return this;
	}

	/**
	 * Verifies that the actual FeatureSummary's scenarios contains the given ScenarioSummary elements.
	 *
	 * @param scenarios the given elements that should be contained in actual FeatureSummary's scenarios.
	 * @return this assertion object.
	 * @throws AssertionError if the actual FeatureSummary's scenarios does not contain all given ScenarioSummary elements.
	 */
	public FeatureSummaryAssert hasScenarios(final ScenarioSummary... scenarios) {
		// check that actual FeatureSummary we want to make assertions on is not null.
		isNotNull();

		// check that given ScenarioSummary varargs is not null.
		if (scenarios == null) {
			throw new AssertionError("Expecting scenarios parameter not to be null.");
		}

		// check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
		Iterables.instance().assertContains(this.info, this.actual.getScenarios(), scenarios);

		// return the current assertion for method chaining
		return this;
	}

	/**
	 * Verifies that the actual FeatureSummary has no scenarios.
	 *
	 * @return this assertion object.
	 * @throws AssertionError if the actual FeatureSummary's scenarios is not empty.
	 */
	public FeatureSummaryAssert hasNoScenarios() {
		// check that actual FeatureSummary we want to make assertions on is not null.
		isNotNull();

		// we override the default error message with a more explicit one
		final String assertjErrorMessage = "\nExpected :\n  <%s>\nnot to have scenarios but had :\n  <%s>";

		// check
		if (this.actual.getScenarios().iterator().hasNext()) {
			failWithMessage(assertjErrorMessage, this.actual, this.actual.getScenarios());
		}

		// return the current assertion for method chaining
		return this;
	}

	/**
	 * Verifies that the actual FeatureSummary's tags contains the given String elements.
	 *
	 * @param tags the given elements that should be contained in actual FeatureSummary's tags.
	 * @return this assertion object.
	 * @throws AssertionError if the actual FeatureSummary's tags does not contain all given String elements.
	 */
	public FeatureSummaryAssert hasTags(final String... tags) {
		// check that actual FeatureSummary we want to make assertions on is not null.
		isNotNull();

		// check that given String varargs is not null.
		if (tags == null) {
			throw new AssertionError("Expecting tags parameter not to be null.");
		}

		// check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
		Iterables.instance().assertContains(this.info, this.actual.getTags(), tags);

		// return the current assertion for method chaining
		return this;
	}

	/**
	 * Verifies that the actual FeatureSummary has no tags.
	 *
	 * @return this assertion object.
	 * @throws AssertionError if the actual FeatureSummary's tags is not empty.
	 */
	public FeatureSummaryAssert hasNoTags() {
		// check that actual FeatureSummary we want to make assertions on is not null.
		isNotNull();

		// we override the default error message with a more explicit one
		final String assertjErrorMessage = "\nExpected :\n  <%s>\nnot to have tags but had :\n  <%s>";

		// check
		if (this.actual.getTags().iterator().hasNext()) {
			failWithMessage(assertjErrorMessage, this.actual, this.actual.getTags());
		}

		// return the current assertion for method chaining
		return this;
	}

	/**
	 * Verifies that the actual FeatureSummary's title is equal to the given one.
	 *
	 * @param title the given title to compare the actual FeatureSummary's title to.
	 * @return this assertion object.
	 * @throws AssertionError - if the actual FeatureSummary's title is not equal to the given one.
	 */
	public FeatureSummaryAssert hasTitle(final String title) {
		// check that actual FeatureSummary we want to make assertions on is not null.
		isNotNull();

		// overrides the default error message with a more explicit one
		final String assertjErrorMessage = "\nExpected title of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

		// null safe check
		final String actualTitle = this.actual.getTitle();
		if (!areEqual(actualTitle, title)) {
			failWithMessage(assertjErrorMessage, this.actual, title, actualTitle);
		}

		// return the current assertion for method chaining
		return this;
	}

}