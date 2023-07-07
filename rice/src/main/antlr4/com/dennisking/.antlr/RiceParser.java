// Generated from /workspaces/rice-language/rice/src/main/antlr4/com/dennisking/Rice.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RiceParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, BOWL=20, GRAIN=21, ID=22, WS=23;
	public static final int
		RULE_program = 0, RULE_cookMainMethod = 1, RULE_block = 2, RULE_statement = 3, 
		RULE_ifStatement = 4, RULE_expression = 5, RULE_eatPrint = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "cookMainMethod", "block", "statement", "ifStatement", "expression", 
			"eatPrint"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Rice'", "'{'", "'}'", "'Cook'", "'main'", "'('", "'grain'", "'['", 
			"']'", "')'", "'if'", "'*'", "'/'", "'+'", "'-'", "';'", "'Eat'", "'.'", 
			"'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "BOWL", "GRAIN", "ID", 
			"WS"
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

	@Override
	public String getGrammarFileName() { return "Rice.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RiceParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public CookMainMethodContext cookMainMethod() {
			return getRuleContext(CookMainMethodContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			match(T__0);
			setState(15);
			match(T__1);
			setState(16);
			cookMainMethod();
			setState(17);
			match(T__2);
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

	public static class CookMainMethodContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RiceParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CookMainMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cookMainMethod; }
	}

	public final CookMainMethodContext cookMainMethod() throws RecognitionException {
		CookMainMethodContext _localctx = new CookMainMethodContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_cookMainMethod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(T__3);
			setState(20);
			match(T__4);
			setState(21);
			match(T__5);
			setState(22);
			match(T__6);
			setState(23);
			match(T__7);
			setState(24);
			match(T__8);
			setState(25);
			match(ID);
			setState(26);
			match(T__9);
			setState(27);
			block();
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(T__1);
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(30);
				statement();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
			match(T__2);
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

	public static class StatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			ifStatement();
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

	public static class IfStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(T__10);
			setState(41);
			match(T__5);
			setState(42);
			expression(0);
			setState(43);
			match(T__9);
			setState(44);
			block();
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode BOWL() { return getToken(RiceParser.BOWL, 0); }
		public TerminalNode GRAIN() { return getToken(RiceParser.GRAIN, 0); }
		public TerminalNode ID() { return getToken(RiceParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EatPrintContext eatPrint() {
			return getRuleContext(EatPrintContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOWL:
				{
				setState(47);
				match(BOWL);
				}
				break;
			case GRAIN:
				{
				setState(48);
				match(GRAIN);
				}
				break;
			case ID:
				{
				setState(49);
				match(ID);
				}
				break;
			case T__5:
				{
				setState(50);
				match(T__5);
				setState(51);
				expression(0);
				setState(52);
				match(T__9);
				}
				break;
			case T__16:
				{
				setState(54);
				eatPrint();
				setState(55);
				match(T__5);
				setState(56);
				expression(0);
				setState(57);
				match(T__9);
				setState(58);
				match(T__15);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(76);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(74);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(62);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(63);
						match(T__11);
						setState(64);
						expression(7);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(65);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(66);
						match(T__12);
						setState(67);
						expression(6);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(68);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(69);
						match(T__13);
						setState(70);
						expression(5);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(71);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(72);
						match(T__14);
						setState(73);
						expression(4);
						}
						break;
					}
					} 
				}
				setState(78);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EatPrintContext extends ParserRuleContext {
		public EatPrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eatPrint; }
	}

	public final EatPrintContext eatPrint() throws RecognitionException {
		EatPrintContext _localctx = new EatPrintContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_eatPrint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__16);
			setState(80);
			match(T__17);
			setState(81);
			match(T__18);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31V\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\7\4\"\n\4\f\4\16\4%\13\4\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7?\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\7\7M\n\7\f\7\16\7P\13\7\3\b\3\b\3\b\3\b\3\b\2\3\f\t\2\4\6\b"+
		"\n\f\16\2\2\2W\2\20\3\2\2\2\4\25\3\2\2\2\6\37\3\2\2\2\b(\3\2\2\2\n*\3"+
		"\2\2\2\f>\3\2\2\2\16Q\3\2\2\2\20\21\7\3\2\2\21\22\7\4\2\2\22\23\5\4\3"+
		"\2\23\24\7\5\2\2\24\3\3\2\2\2\25\26\7\6\2\2\26\27\7\7\2\2\27\30\7\b\2"+
		"\2\30\31\7\t\2\2\31\32\7\n\2\2\32\33\7\13\2\2\33\34\7\30\2\2\34\35\7\f"+
		"\2\2\35\36\5\6\4\2\36\5\3\2\2\2\37#\7\4\2\2 \"\5\b\5\2! \3\2\2\2\"%\3"+
		"\2\2\2#!\3\2\2\2#$\3\2\2\2$&\3\2\2\2%#\3\2\2\2&\'\7\5\2\2\'\7\3\2\2\2"+
		"()\5\n\6\2)\t\3\2\2\2*+\7\r\2\2+,\7\b\2\2,-\5\f\7\2-.\7\f\2\2./\5\6\4"+
		"\2/\13\3\2\2\2\60\61\b\7\1\2\61?\7\26\2\2\62?\7\27\2\2\63?\7\30\2\2\64"+
		"\65\7\b\2\2\65\66\5\f\7\2\66\67\7\f\2\2\67?\3\2\2\289\5\16\b\29:\7\b\2"+
		"\2:;\5\f\7\2;<\7\f\2\2<=\7\22\2\2=?\3\2\2\2>\60\3\2\2\2>\62\3\2\2\2>\63"+
		"\3\2\2\2>\64\3\2\2\2>8\3\2\2\2?N\3\2\2\2@A\f\b\2\2AB\7\16\2\2BM\5\f\7"+
		"\tCD\f\7\2\2DE\7\17\2\2EM\5\f\7\bFG\f\6\2\2GH\7\20\2\2HM\5\f\7\7IJ\f\5"+
		"\2\2JK\7\21\2\2KM\5\f\7\6L@\3\2\2\2LC\3\2\2\2LF\3\2\2\2LI\3\2\2\2MP\3"+
		"\2\2\2NL\3\2\2\2NO\3\2\2\2O\r\3\2\2\2PN\3\2\2\2QR\7\23\2\2RS\7\24\2\2"+
		"ST\7\25\2\2T\17\3\2\2\2\6#>LN";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}