// Generated from com/dennisking/Rice.g4 by ANTLR 4.9.2
package com.dennisking;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RiceLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, WS=4, RICE=5, COOK=6, SERVE=7, EAT=8, WITH=9, 
		AND=10, PRINT=11, IDENTIFIER=12, INTEGER=13, STRING=14, PLUS=15, MINUS=16, 
		MULT=17, DIV=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "WS", "RICE", "COOK", "SERVE", "EAT", "WITH", 
			"AND", "PRINT", "IDENTIFIER", "INTEGER", "STRING", "PLUS", "MINUS", "MULT", 
			"DIV"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "';'", null, "'rice'", "'cook'", "'serve'", "'eat'", 
			"'with'", "'and'", "'print'", null, null, null, "'+'", "'-'", "'*'", 
			"'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "WS", "RICE", "COOK", "SERVE", "EAT", "WITH", 
			"AND", "PRINT", "IDENTIFIER", "INTEGER", "STRING", "PLUS", "MINUS", "MULT", 
			"DIV"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public RiceLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Rice.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24t\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\3\3\3\4\3\4\3\5\6\5/\n\5\r\5\16\5\60\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\7\rZ\n\r\f\r\16\r]\13\r\3\16\6\16`\n\16\r\16\16\16a\3\17\3"+
		"\17\7\17f\n\17\f\17\16\17i\13\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3"+
		"\22\3\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\3\2\7\5\2\13\f\17\17\"\"\4\2C\\"+
		"c|\5\2\62;C\\c|\3\2\62;\5\2\f\f\17\17$$\2w\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2"+
		"\5)\3\2\2\2\7+\3\2\2\2\t.\3\2\2\2\13\64\3\2\2\2\r9\3\2\2\2\17>\3\2\2\2"+
		"\21D\3\2\2\2\23H\3\2\2\2\25M\3\2\2\2\27Q\3\2\2\2\31W\3\2\2\2\33_\3\2\2"+
		"\2\35c\3\2\2\2\37l\3\2\2\2!n\3\2\2\2#p\3\2\2\2%r\3\2\2\2\'(\7}\2\2(\4"+
		"\3\2\2\2)*\7\177\2\2*\6\3\2\2\2+,\7=\2\2,\b\3\2\2\2-/\t\2\2\2.-\3\2\2"+
		"\2/\60\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\62\3\2\2\2\62\63\b\5\2\2\63"+
		"\n\3\2\2\2\64\65\7t\2\2\65\66\7k\2\2\66\67\7e\2\2\678\7g\2\28\f\3\2\2"+
		"\29:\7e\2\2:;\7q\2\2;<\7q\2\2<=\7m\2\2=\16\3\2\2\2>?\7u\2\2?@\7g\2\2@"+
		"A\7t\2\2AB\7x\2\2BC\7g\2\2C\20\3\2\2\2DE\7g\2\2EF\7c\2\2FG\7v\2\2G\22"+
		"\3\2\2\2HI\7y\2\2IJ\7k\2\2JK\7v\2\2KL\7j\2\2L\24\3\2\2\2MN\7c\2\2NO\7"+
		"p\2\2OP\7f\2\2P\26\3\2\2\2QR\7r\2\2RS\7t\2\2ST\7k\2\2TU\7p\2\2UV\7v\2"+
		"\2V\30\3\2\2\2W[\t\3\2\2XZ\t\4\2\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3"+
		"\2\2\2\\\32\3\2\2\2][\3\2\2\2^`\t\5\2\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2"+
		"ab\3\2\2\2b\34\3\2\2\2cg\7$\2\2df\n\6\2\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2"+
		"\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\7$\2\2k\36\3\2\2\2lm\7-\2\2m \3\2\2"+
		"\2no\7/\2\2o\"\3\2\2\2pq\7,\2\2q$\3\2\2\2rs\7\61\2\2s&\3\2\2\2\7\2\60"+
		"[ag\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}