
public class module3EscapeSequence {
	public static void selection12() {
		System.out.println();
		System.out.println("Escape Sequence: \n");
		String sentenceEscapeTab = "\t Escape Sequence: [ \\t ]   \t This escape sequence inserts a tab into the sentence.";		// Insert a tab in the text at this point.
		System.out.println(sentenceEscapeTab);
		String sentenceEscapeQuotation = "\t Escape Sequence: [ \\n ] This escape sequence adds a new line to this sentence below. \n";	//Insert a backspace in the text at this point.
		System.out.println(sentenceEscapeQuotation);
		String sentenceEscapeNewline = "\t Escape Sequence: [ \\\" ] This allows the sentence to have \"quotations.\"  ";			// Insert a double quote character in the text at this point.
		System.out.println(sentenceEscapeNewline);
		String sentenceEscapeBackslash = "\t Escape Sequence: [ \\\\ ] This iserts a backslash \\ to a sentence.";					//Insert a backslash character in the text at this point.
		System.out.println(sentenceEscapeBackslash);
		String sentenceEscapeSingleQuote = "\t Escape Sequence: [ \\' ] This inserts a \'single quote\' to a sentence.";
		System.out.println(sentenceEscapeSingleQuote);
		System.out.println();
		System.out.println("\t **Note** The Escape Sequence has additional members. ");
		System.out.println();

	}
}
