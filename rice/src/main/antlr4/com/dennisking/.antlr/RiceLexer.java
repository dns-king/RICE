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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, ID=16, INT=17, 
		STRING=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "ID", "INT", "STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Rice'", "'Cook'", "'{'", "'}'", "'Bowl'", "'='", "'Grain'", "','", 
			"'Eat.print'", "'('", "')'", "'+'", "'-'", "'*'", "'Serve'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "ID", "INT", "STRING"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24s\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\7\21a\n\21\f\21\16\21d\13"+
		"\21\3\22\6\22g\n\22\r\22\16\22h\3\23\3\23\7\23m\n\23\f\23\16\23p\13\23"+
		"\3\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\3\2\6\5\2C\\aac|\6\2\62;C\\aac|\3\2"+
		"\62;\3\2$$\2u\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5,\3\2\2\2\7\61\3\2\2\2\t\63\3"+
		"\2\2\2\13\65\3\2\2\2\r:\3\2\2\2\17<\3\2\2\2\21B\3\2\2\2\23D\3\2\2\2\25"+
		"N\3\2\2\2\27P\3\2\2\2\31R\3\2\2\2\33T\3\2\2\2\35V\3\2\2\2\37X\3\2\2\2"+
		"!^\3\2\2\2#f\3\2\2\2%j\3\2\2\2\'(\7T\2\2()\7k\2\2)*\7e\2\2*+\7g\2\2+\4"+
		"\3\2\2\2,-\7E\2\2-.\7q\2\2./\7q\2\2/\60\7m\2\2\60\6\3\2\2\2\61\62\7}\2"+
		"\2\62\b\3\2\2\2\63\64\7\177\2\2\64\n\3\2\2\2\65\66\7D\2\2\66\67\7q\2\2"+
		"\678\7y\2\289\7n\2\29\f\3\2\2\2:;\7?\2\2;\16\3\2\2\2<=\7I\2\2=>\7t\2\2"+
		">?\7c\2\2?@\7k\2\2@A\7p\2\2A\20\3\2\2\2BC\7.\2\2C\22\3\2\2\2DE\7G\2\2"+
		"EF\7c\2\2FG\7v\2\2GH\7\60\2\2HI\7r\2\2IJ\7t\2\2JK\7k\2\2KL\7p\2\2LM\7"+
		"v\2\2M\24\3\2\2\2NO\7*\2\2O\26\3\2\2\2PQ\7+\2\2Q\30\3\2\2\2RS\7-\2\2S"+
		"\32\3\2\2\2TU\7/\2\2U\34\3\2\2\2VW\7,\2\2W\36\3\2\2\2XY\7U\2\2YZ\7g\2"+
		"\2Z[\7t\2\2[\\\7x\2\2\\]\7g\2\2] \3\2\2\2^b\t\2\2\2_a\t\3\2\2`_\3\2\2"+
		"\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\"\3\2\2\2db\3\2\2\2eg\t\4\2\2fe\3\2"+
		"\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2i$\3\2\2\2jn\7$\2\2km\n\5\2\2lk\3\2"+
		"\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3\2\2\2pn\3\2\2\2qr\7$\2\2r&\3\2"+
		"\2\2\6\2bhn\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}