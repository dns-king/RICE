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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, INT_LITERAL=20, STRING_LITERAL=21, BOOL_LITERAL=22, 
		ID=23, WS=24, COMMENT=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "INT_LITERAL", "STRING_LITERAL", "BOOL_LITERAL", "ID", 
			"WS", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Rice'", "'{'", "'}'", "'Cook'", "'main'", "'('", "')'", "'='", 
			"';'", "'Eat'", "'.'", "'print'", "'*'", "'/'", "'+'", "'-'", "'bowl'", 
			"'grain'", "'nice'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "INT_LITERAL", "STRING_LITERAL", 
			"BOOL_LITERAL", "ID", "WS", "COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u00a6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\25\6\25v\n\25\r\25\16\25w\3\26\3\26\7\26|\n\26\f"+
		"\26\16\26\177\13\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u008c\n\27\3\30\3\30\7\30\u0090\n\30\f\30\16\30\u0093\13\30"+
		"\3\31\6\31\u0096\n\31\r\31\16\31\u0097\3\31\3\31\3\32\3\32\3\32\3\32\7"+
		"\32\u00a0\n\32\f\32\16\32\u00a3\13\32\3\32\3\32\2\2\33\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\3\2\b\3\2\62;\5\2\f\f\17\17$$\5\2C\\"+
		"aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u00ab\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\3\65\3\2\2\2\5:\3\2\2\2\7<\3\2\2\2\t>\3\2\2\2\13C\3"+
		"\2\2\2\rH\3\2\2\2\17J\3\2\2\2\21L\3\2\2\2\23N\3\2\2\2\25P\3\2\2\2\27T"+
		"\3\2\2\2\31V\3\2\2\2\33\\\3\2\2\2\35^\3\2\2\2\37`\3\2\2\2!b\3\2\2\2#d"+
		"\3\2\2\2%i\3\2\2\2\'o\3\2\2\2)u\3\2\2\2+y\3\2\2\2-\u008b\3\2\2\2/\u008d"+
		"\3\2\2\2\61\u0095\3\2\2\2\63\u009b\3\2\2\2\65\66\7T\2\2\66\67\7k\2\2\67"+
		"8\7e\2\289\7g\2\29\4\3\2\2\2:;\7}\2\2;\6\3\2\2\2<=\7\177\2\2=\b\3\2\2"+
		"\2>?\7E\2\2?@\7q\2\2@A\7q\2\2AB\7m\2\2B\n\3\2\2\2CD\7o\2\2DE\7c\2\2EF"+
		"\7k\2\2FG\7p\2\2G\f\3\2\2\2HI\7*\2\2I\16\3\2\2\2JK\7+\2\2K\20\3\2\2\2"+
		"LM\7?\2\2M\22\3\2\2\2NO\7=\2\2O\24\3\2\2\2PQ\7G\2\2QR\7c\2\2RS\7v\2\2"+
		"S\26\3\2\2\2TU\7\60\2\2U\30\3\2\2\2VW\7r\2\2WX\7t\2\2XY\7k\2\2YZ\7p\2"+
		"\2Z[\7v\2\2[\32\3\2\2\2\\]\7,\2\2]\34\3\2\2\2^_\7\61\2\2_\36\3\2\2\2`"+
		"a\7-\2\2a \3\2\2\2bc\7/\2\2c\"\3\2\2\2de\7d\2\2ef\7q\2\2fg\7y\2\2gh\7"+
		"n\2\2h$\3\2\2\2ij\7i\2\2jk\7t\2\2kl\7c\2\2lm\7k\2\2mn\7p\2\2n&\3\2\2\2"+
		"op\7p\2\2pq\7k\2\2qr\7e\2\2rs\7g\2\2s(\3\2\2\2tv\t\2\2\2ut\3\2\2\2vw\3"+
		"\2\2\2wu\3\2\2\2wx\3\2\2\2x*\3\2\2\2y}\7$\2\2z|\n\3\2\2{z\3\2\2\2|\177"+
		"\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0081\7"+
		"$\2\2\u0081,\3\2\2\2\u0082\u0083\7v\2\2\u0083\u0084\7t\2\2\u0084\u0085"+
		"\7w\2\2\u0085\u008c\7g\2\2\u0086\u0087\7h\2\2\u0087\u0088\7c\2\2\u0088"+
		"\u0089\7n\2\2\u0089\u008a\7u\2\2\u008a\u008c\7g\2\2\u008b\u0082\3\2\2"+
		"\2\u008b\u0086\3\2\2\2\u008c.\3\2\2\2\u008d\u0091\t\4\2\2\u008e\u0090"+
		"\t\5\2\2\u008f\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\60\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0096\t\6\2"+
		"\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098"+
		"\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\b\31\2\2\u009a\62\3\2\2\2\u009b"+
		"\u009c\7\61\2\2\u009c\u009d\7\61\2\2\u009d\u00a1\3\2\2\2\u009e\u00a0\n"+
		"\7\2\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\b\32"+
		"\2\2\u00a5\64\3\2\2\2\t\2w}\u008b\u0091\u0097\u00a1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}