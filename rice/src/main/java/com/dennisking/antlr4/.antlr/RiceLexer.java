// Generated from /workspaces/rice-language/rice/src/main/java/com/dennisking/antlr4/Rice.g4 by ANTLR 4.9.2
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
		AND=10, PRINT=11, SHORTCUT=12, IDENTIFIER=13, INTEGER=14, STRING=15, PLUS=16, 
		MINUS=17, MULT=18, DIV=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "WS", "RICE", "COOK", "SERVE", "EAT", "WITH", 
			"AND", "PRINT", "SHORTCUT", "IDENTIFIER", "INTEGER", "STRING", "PLUS", 
			"MINUS", "MULT", "DIV"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "';'", null, "'rice'", "'cook'", "'serve'", "'eat'", 
			"'with'", "'and'", "'print'", "'shortcut'", null, null, null, "'+'", 
			"'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "WS", "RICE", "COOK", "SERVE", "EAT", "WITH", 
			"AND", "PRINT", "SHORTCUT", "IDENTIFIER", "INTEGER", "STRING", "PLUS", 
			"MINUS", "MULT", "DIV"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\177\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\4\3\4\3\5\6\5\61\n\5\r\5\16\5\62"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\7\16e\n\16"+
		"\f\16\16\16h\13\16\3\17\6\17k\n\17\r\17\16\17l\3\20\3\20\7\20q\n\20\f"+
		"\20\16\20t\13\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\2\2"+
		"\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25\3\2\7\5\2\13\f\17\17\"\"\4\2C\\c|\5\2\62;C"+
		"\\c|\3\2\62;\5\2\f\f\17\17$$\2\u0082\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2"+
		"\2\2\5+\3\2\2\2\7-\3\2\2\2\t\60\3\2\2\2\13\66\3\2\2\2\r;\3\2\2\2\17@\3"+
		"\2\2\2\21F\3\2\2\2\23J\3\2\2\2\25O\3\2\2\2\27S\3\2\2\2\31Y\3\2\2\2\33"+
		"b\3\2\2\2\35j\3\2\2\2\37n\3\2\2\2!w\3\2\2\2#y\3\2\2\2%{\3\2\2\2\'}\3\2"+
		"\2\2)*\7}\2\2*\4\3\2\2\2+,\7\177\2\2,\6\3\2\2\2-.\7=\2\2.\b\3\2\2\2/\61"+
		"\t\2\2\2\60/\3\2\2\2\61\62\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\64\3"+
		"\2\2\2\64\65\b\5\2\2\65\n\3\2\2\2\66\67\7t\2\2\678\7k\2\289\7e\2\29:\7"+
		"g\2\2:\f\3\2\2\2;<\7e\2\2<=\7q\2\2=>\7q\2\2>?\7m\2\2?\16\3\2\2\2@A\7u"+
		"\2\2AB\7g\2\2BC\7t\2\2CD\7x\2\2DE\7g\2\2E\20\3\2\2\2FG\7g\2\2GH\7c\2\2"+
		"HI\7v\2\2I\22\3\2\2\2JK\7y\2\2KL\7k\2\2LM\7v\2\2MN\7j\2\2N\24\3\2\2\2"+
		"OP\7c\2\2PQ\7p\2\2QR\7f\2\2R\26\3\2\2\2ST\7r\2\2TU\7t\2\2UV\7k\2\2VW\7"+
		"p\2\2WX\7v\2\2X\30\3\2\2\2YZ\7u\2\2Z[\7j\2\2[\\\7q\2\2\\]\7t\2\2]^\7v"+
		"\2\2^_\7e\2\2_`\7w\2\2`a\7v\2\2a\32\3\2\2\2bf\t\3\2\2ce\t\4\2\2dc\3\2"+
		"\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\34\3\2\2\2hf\3\2\2\2ik\t\5\2\2ji\3"+
		"\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\36\3\2\2\2nr\7$\2\2oq\n\6\2\2po"+
		"\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2\2\2uv\7$\2\2v "+
		"\3\2\2\2wx\7-\2\2x\"\3\2\2\2yz\7/\2\2z$\3\2\2\2{|\7,\2\2|&\3\2\2\2}~\7"+
		"\61\2\2~(\3\2\2\2\7\2\62flr\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}