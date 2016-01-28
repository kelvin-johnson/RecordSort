// Generated from C:/Users/kelvin.johnson/IdeaProjects/RecordSort/rslib/src/main/java/com/example/grammar\DelimitedFileParser.g4 by ANTLR 4.5.1
package com.example.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DelimitedFileParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TEXT=1, PIPE=2, SPACE=3, COMMA=4, CR=5, NL=6;
	public static final int
		RULE_file = 0, RULE_row = 1, RULE_rowc = 2, RULE_rowp = 3, RULE_rows = 4, 
		RULE_field = 5;
	public static final String[] ruleNames = {
		"file", "row", "rowc", "rowp", "rows", "field"
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

	@Override
	public String getGrammarFileName() { return "DelimitedFileParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DelimitedFileParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public List<RowContext> row() {
			return getRuleContexts(RowContext.class);
		}
		public RowContext row(int i) {
			return getRuleContext(RowContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DelimitedFileParserListener ) ((DelimitedFileParserListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DelimitedFileParserListener ) ((DelimitedFileParserListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DelimitedFileParserVisitor ) return ((DelimitedFileParserVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEXT) {
				{
				{
				setState(12);
				row();
				}
				}
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RowContext extends ParserRuleContext {
		public RowcContext rowc() {
			return getRuleContext(RowcContext.class,0);
		}
		public RowpContext rowp() {
			return getRuleContext(RowpContext.class,0);
		}
		public RowsContext rows() {
			return getRuleContext(RowsContext.class,0);
		}
		public TerminalNode CR() { return getToken(DelimitedFileParser.CR, 0); }
		public TerminalNode NL() { return getToken(DelimitedFileParser.NL, 0); }
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DelimitedFileParserListener ) ((DelimitedFileParserListener)listener).enterRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DelimitedFileParserListener ) ((DelimitedFileParserListener)listener).exitRow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DelimitedFileParserVisitor ) return ((DelimitedFileParserVisitor<? extends T>)visitor).visitRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(18);
				rowc();
				}
				break;
			case 2:
				{
				setState(19);
				rowp();
				}
				break;
			case 3:
				{
				setState(20);
				rows();
				}
				break;
			}
			setState(24);
			_la = _input.LA(1);
			if (_la==CR) {
				{
				setState(23);
				match(CR);
				}
			}

			setState(27);
			_la = _input.LA(1);
			if (_la==NL) {
				{
				setState(26);
				match(NL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RowcContext extends ParserRuleContext {
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DelimitedFileParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DelimitedFileParser.COMMA, i);
		}
		public RowcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DelimitedFileParserListener ) ((DelimitedFileParserListener)listener).enterRowc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DelimitedFileParserListener ) ((DelimitedFileParserListener)listener).exitRowc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DelimitedFileParserVisitor ) return ((DelimitedFileParserVisitor<? extends T>)visitor).visitRowc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowcContext rowc() throws RecognitionException {
		RowcContext _localctx = new RowcContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_rowc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			field();
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(30);
				match(COMMA);
				setState(31);
				field();
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RowpContext extends ParserRuleContext {
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public List<TerminalNode> PIPE() { return getTokens(DelimitedFileParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(DelimitedFileParser.PIPE, i);
		}
		public RowpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DelimitedFileParserListener ) ((DelimitedFileParserListener)listener).enterRowp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DelimitedFileParserListener ) ((DelimitedFileParserListener)listener).exitRowp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DelimitedFileParserVisitor ) return ((DelimitedFileParserVisitor<? extends T>)visitor).visitRowp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowpContext rowp() throws RecognitionException {
		RowpContext _localctx = new RowpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_rowp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			field();
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PIPE) {
				{
				{
				setState(38);
				match(PIPE);
				setState(39);
				field();
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RowsContext extends ParserRuleContext {
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public List<TerminalNode> SPACE() { return getTokens(DelimitedFileParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(DelimitedFileParser.SPACE, i);
		}
		public RowsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rows; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DelimitedFileParserListener ) ((DelimitedFileParserListener)listener).enterRows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DelimitedFileParserListener ) ((DelimitedFileParserListener)listener).exitRows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DelimitedFileParserVisitor ) return ((DelimitedFileParserVisitor<? extends T>)visitor).visitRows(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowsContext rows() throws RecognitionException {
		RowsContext _localctx = new RowsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_rows);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			field();
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(46);
				match(SPACE);
				setState(47);
				field();
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(DelimitedFileParser.TEXT, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DelimitedFileParserListener ) ((DelimitedFileParserListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DelimitedFileParserListener ) ((DelimitedFileParserListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DelimitedFileParserVisitor ) return ((DelimitedFileParserVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(TEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\b:\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\7\2\20\n\2\f\2\16\2\23\13\2\3\3"+
		"\3\3\3\3\5\3\30\n\3\3\3\5\3\33\n\3\3\3\5\3\36\n\3\3\4\3\4\3\4\7\4#\n\4"+
		"\f\4\16\4&\13\4\3\5\3\5\3\5\7\5+\n\5\f\5\16\5.\13\5\3\6\3\6\3\6\7\6\63"+
		"\n\6\f\6\16\6\66\13\6\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\2;\2\21\3\2\2\2"+
		"\4\27\3\2\2\2\6\37\3\2\2\2\b\'\3\2\2\2\n/\3\2\2\2\f\67\3\2\2\2\16\20\5"+
		"\4\3\2\17\16\3\2\2\2\20\23\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22\3\3"+
		"\2\2\2\23\21\3\2\2\2\24\30\5\6\4\2\25\30\5\b\5\2\26\30\5\n\6\2\27\24\3"+
		"\2\2\2\27\25\3\2\2\2\27\26\3\2\2\2\30\32\3\2\2\2\31\33\7\7\2\2\32\31\3"+
		"\2\2\2\32\33\3\2\2\2\33\35\3\2\2\2\34\36\7\b\2\2\35\34\3\2\2\2\35\36\3"+
		"\2\2\2\36\5\3\2\2\2\37$\5\f\7\2 !\7\6\2\2!#\5\f\7\2\" \3\2\2\2#&\3\2\2"+
		"\2$\"\3\2\2\2$%\3\2\2\2%\7\3\2\2\2&$\3\2\2\2\',\5\f\7\2()\7\4\2\2)+\5"+
		"\f\7\2*(\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\t\3\2\2\2.,\3\2\2\2/\64"+
		"\5\f\7\2\60\61\7\5\2\2\61\63\5\f\7\2\62\60\3\2\2\2\63\66\3\2\2\2\64\62"+
		"\3\2\2\2\64\65\3\2\2\2\65\13\3\2\2\2\66\64\3\2\2\2\678\7\3\2\28\r\3\2"+
		"\2\2\t\21\27\32\35$,\64";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}