package test.algorithms.strings;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.algorithms.strings.Slugifier;

public class SlugifierTest {

	@Test
	public void testSlugify() {
		assertEquals("my-string-w-spaces", Slugifier.toSlug("my string w spaces"));
	}

	@Test
	public void testSlugifyWillRemoveSpecialChars() {
		assertEquals("ala-dei-sardi", Slugifier.toSlug("alà dei Sardi"));
	}
}
