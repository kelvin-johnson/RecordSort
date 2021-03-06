// Generated from C:/Users/kelvin.johnson/IdeaProjects/RecordSort/rslib/src/main/java/com/example/grammar\DelimitedFileLexer.g4 by ANTLR 4.5.1
package com.example.gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DelimitedFileLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TEXT=1, PIPE=2, SPACE=3, COMMA=4, CR=5, NL=6;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"TEXT", "PIPE", "SPACE", "COMMA", "CR", "NL"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'|'", "' '", "','", "'\r'", "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TEXT", "PIPE", "SPACE", "COMMA", "CR", "NL"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public DelimitedFileLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DelimitedFileLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\b\36\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\6\2\21\n\2\r\2\16\2\22\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\2\2\b\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\3\2\3\7\2\f\f\17\17\"\"..~~\36\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\3\20\3\2\2\2\5\24\3\2\2\2\7\26\3\2"+
		"\2\2\t\30\3\2\2\2\13\32\3\2\2\2\r\34\3\2\2\2\17\21\n\2\2\2\20\17\3\2\2"+
		"\2\21\22\3\2\2\2\22\20\3\2\2\2\22\23\3\2\2\2\23\4\3\2\2\2\24\25\7~\2\2"+
		"\25\6\3\2\2\2\26\27\7\"\2\2\27\b\3\2\2\2\30\31\7.\2\2\31\n\3\2\2\2\32"+
		"\33\7\17\2\2\33\f\3\2\2\2\34\35\7\f\2\2\35\16\3\2\2\2\4\2\22\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}