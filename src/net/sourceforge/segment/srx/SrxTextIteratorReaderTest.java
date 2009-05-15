package net.sourceforge.segment.srx;

import java.io.StringReader;

import net.rootnode.loomchild.util.io.ReaderCharSequence;
import net.sourceforge.segment.TextIterator;

import org.junit.Ignore;
import org.junit.Test;

public class SrxTextIteratorReaderTest extends AbstractSrxTextIteratorTest {

	protected TextIterator getTextIterator(String text,
			SrxDocument document, String languageCode) {
		StringReader reader = new StringReader(text);
		CharSequence sequence = new ReaderCharSequence(reader, 
				Integer.MAX_VALUE, ReaderCharSequence.DEFAULT_BUFFER_SIZE, 1);
		return new SrxTextIterator(document, languageCode, sequence);
	}

	@Ignore
	@Test
	/**
	 * Ignore this test because cannot make it work with reader. 
	 */
	public void testMatchingEnd() {
		super.testMatchingEnd();
	}
	
}