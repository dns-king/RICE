// Generated from /workspaces/rice-language/rice/src/main/antlr4/com/dennisking/Rice.g4 by ANTLR 4.9.2
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
		T__17=18, BOWL=19, GRAIN=20, ID=21, WS=22;
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
			"T__17", "BOWL", "GRAIN", "DIGIT", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Rice'", "'{'", "'}'", "'Cook'", "'main'", "'('", "')'", "'Eat'", 
			"'.'", "'print'", "';'", "'='", "'bowl'", "'grain'", "'*'", "'/'", "'+'", 
			"'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "BOWL", "GRAIN", "ID", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u008a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\5\24m\n\24\3\24\6\24"+
		"p\n\24\r\24\16\24q\3\25\3\25\7\25v\n\25\f\25\16\25y\13\25\3\25\3\25\3"+
		"\26\3\26\3\27\6\27\u0080\n\27\r\27\16\27\u0081\3\30\6\30\u0085\n\30\r"+
		"\30\16\30\u0086\3\30\3\30\2\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\2-\27/\30"+
		"\3\2\6\3\2$$\3\2\62;\4\2C\\c|\5\2\13\f\17\17\"\"\2\u008d\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5\66\3\2\2"+
		"\2\78\3\2\2\2\t:\3\2\2\2\13?\3\2\2\2\rD\3\2\2\2\17F\3\2\2\2\21H\3\2\2"+
		"\2\23L\3\2\2\2\25N\3\2\2\2\27T\3\2\2\2\31V\3\2\2\2\33X\3\2\2\2\35]\3\2"+
		"\2\2\37c\3\2\2\2!e\3\2\2\2#g\3\2\2\2%i\3\2\2\2\'l\3\2\2\2)s\3\2\2\2+|"+
		"\3\2\2\2-\177\3\2\2\2/\u0084\3\2\2\2\61\62\7T\2\2\62\63\7k\2\2\63\64\7"+
		"e\2\2\64\65\7g\2\2\65\4\3\2\2\2\66\67\7}\2\2\67\6\3\2\2\289\7\177\2\2"+
		"9\b\3\2\2\2:;\7E\2\2;<\7q\2\2<=\7q\2\2=>\7m\2\2>\n\3\2\2\2?@\7o\2\2@A"+
		"\7c\2\2AB\7k\2\2BC\7p\2\2C\f\3\2\2\2DE\7*\2\2E\16\3\2\2\2FG\7+\2\2G\20"+
		"\3\2\2\2HI\7G\2\2IJ\7c\2\2JK\7v\2\2K\22\3\2\2\2LM\7\60\2\2M\24\3\2\2\2"+
		"NO\7r\2\2OP\7t\2\2PQ\7k\2\2QR\7p\2\2RS\7v\2\2S\26\3\2\2\2TU\7=\2\2U\30"+
		"\3\2\2\2VW\7?\2\2W\32\3\2\2\2XY\7d\2\2YZ\7q\2\2Z[\7y\2\2[\\\7n\2\2\\\34"+
		"\3\2\2\2]^\7i\2\2^_\7t\2\2_`\7c\2\2`a\7k\2\2ab\7p\2\2b\36\3\2\2\2cd\7"+
		",\2\2d \3\2\2\2ef\7\61\2\2f\"\3\2\2\2gh\7-\2\2h$\3\2\2\2ij\7/\2\2j&\3"+
		"\2\2\2km\7/\2\2lk\3\2\2\2lm\3\2\2\2mo\3\2\2\2np\5+\26\2on\3\2\2\2pq\3"+
		"\2\2\2qo\3\2\2\2qr\3\2\2\2r(\3\2\2\2sw\7$\2\2tv\n\2\2\2ut\3\2\2\2vy\3"+
		"\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2\2\2z{\7$\2\2{*\3\2\2\2|}\t"+
		"\3\2\2},\3\2\2\2~\u0080\t\4\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082.\3\2\2\2\u0083\u0085\t\5\2\2\u0084"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2"+
		"\2\2\u0087\u0088\3\2\2\2\u0088\u0089\b\30\2\2\u0089\60\3\2\2\2\b\2lqw"+
		"\u0081\u0086\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}