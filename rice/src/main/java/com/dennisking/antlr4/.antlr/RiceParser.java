// Generated from /workspaces/rice-language/rice/src/main/java/com/dennisking/antlr4/Rice.g4 by ANTLR 4.9.2
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
		T__0=1, T__1=2, T__2=3, WS=4, RICE=5, COOK=6, SERVE=7, EAT=8, WITH=9, 
		AND=10, PRINT=11, SHORTCUT=12, IDENTIFIER=13, INTEGER=14, STRING=15, PLUS=16, 
		MINUS=17, MULT=18, DIV=19;
	public static final int
		RULE_program = 0, RULE_code_block = 1, RULE_statement = 2, RULE_cook_statement = 3, 
		RULE_serve_statement = 4, RULE_eat_statement = 5, RULE_print_statement = 6, 
		RULE_shortcut_statement = 7, RULE_shortcut_code = 8, RULE_expression = 9, 
		RULE_additive_expression = 10, RULE_multiplicative_expression = 11, RULE_unary_expression = 12, 
		RULE_primary_expression = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "code_block", "statement", "cook_statement", "serve_statement", 
			"eat_statement", "print_statement", "shortcut_statement", "shortcut_code", 
			"expression", "additive_expression", "multiplicative_expression", "unary_expression", 
			"primary_expression"
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
		public TerminalNode RICE() { return getToken(RiceParser.RICE, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(RiceParser.EOF, 0); }
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
			setState(28);
			match(RICE);
			setState(29);
			code_block();
			setState(30);
			match(EOF);
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

	public static class Code_blockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Code_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_block; }
	}

	public final Code_blockContext code_block() throws RecognitionException {
		Code_blockContext _localctx = new Code_blockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_code_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(T__0);
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COOK) | (1L << SERVE) | (1L << EAT) | (1L << SHORTCUT))) != 0)) {
				{
				{
				setState(33);
				statement();
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(39);
			match(T__1);
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
		public Cook_statementContext cook_statement() {
			return getRuleContext(Cook_statementContext.class,0);
		}
		public Serve_statementContext serve_statement() {
			return getRuleContext(Serve_statementContext.class,0);
		}
		public Eat_statementContext eat_statement() {
			return getRuleContext(Eat_statementContext.class,0);
		}
		public Shortcut_statementContext shortcut_statement() {
			return getRuleContext(Shortcut_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COOK:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				cook_statement();
				}
				break;
			case SERVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				serve_statement();
				}
				break;
			case EAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				eat_statement();
				}
				break;
			case SHORTCUT:
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
				shortcut_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Cook_statementContext extends ParserRuleContext {
		public TerminalNode COOK() { return getToken(RiceParser.COOK, 0); }
		public Cook_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cook_statement; }
	}

	public final Cook_statementContext cook_statement() throws RecognitionException {
		Cook_statementContext _localctx = new Cook_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cook_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(COOK);
			setState(48);
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

	public static class Serve_statementContext extends ParserRuleContext {
		public TerminalNode SERVE() { return getToken(RiceParser.SERVE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode WITH() { return getToken(RiceParser.WITH, 0); }
		public List<TerminalNode> AND() { return getTokens(RiceParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(RiceParser.AND, i);
		}
		public Serve_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serve_statement; }
	}

	public final Serve_statementContext serve_statement() throws RecognitionException {
		Serve_statementContext _localctx = new Serve_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_serve_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(SERVE);
			setState(51);
			expression();
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(52);
				match(WITH);
				setState(53);
				expression();
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND) {
					{
					{
					setState(54);
					match(AND);
					setState(55);
					expression();
					}
					}
					setState(60);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(63);
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

	public static class Eat_statementContext extends ParserRuleContext {
		public TerminalNode EAT() { return getToken(RiceParser.EAT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Print_statementContext print_statement() {
			return getRuleContext(Print_statementContext.class,0);
		}
		public Eat_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eat_statement; }
	}

	public final Eat_statementContext eat_statement() throws RecognitionException {
		Eat_statementContext _localctx = new Eat_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_eat_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(EAT);
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case INTEGER:
			case STRING:
			case PLUS:
			case MINUS:
				{
				setState(66);
				expression();
				}
				break;
			case PRINT:
				{
				setState(67);
				print_statement();
				}
				break;
			case T__2:
				break;
			default:
				break;
			}
			setState(70);
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

	public static class Print_statementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(RiceParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Print_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_statement; }
	}

	public final Print_statementContext print_statement() throws RecognitionException {
		Print_statementContext _localctx = new Print_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_print_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(PRINT);
			setState(73);
			expression();
			setState(74);
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

	public static class Shortcut_statementContext extends ParserRuleContext {
		public TerminalNode SHORTCUT() { return getToken(RiceParser.SHORTCUT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(RiceParser.IDENTIFIER, 0); }
		public Shortcut_codeContext shortcut_code() {
			return getRuleContext(Shortcut_codeContext.class,0);
		}
		public Shortcut_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortcut_statement; }
	}

	public final Shortcut_statementContext shortcut_statement() throws RecognitionException {
		Shortcut_statementContext _localctx = new Shortcut_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_shortcut_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(SHORTCUT);
			setState(77);
			match(IDENTIFIER);
			setState(78);
			match(T__0);
			setState(79);
			shortcut_code();
			setState(80);
			match(T__1);
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

	public static class Shortcut_codeContext extends ParserRuleContext {
		public Shortcut_codeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortcut_code; }
	}

	public final Shortcut_codeContext shortcut_code() throws RecognitionException {
		Shortcut_codeContext _localctx = new Shortcut_codeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_shortcut_code);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << WS) | (1L << RICE) | (1L << COOK) | (1L << SERVE) | (1L << EAT) | (1L << WITH) | (1L << AND) | (1L << PRINT) | (1L << SHORTCUT) | (1L << IDENTIFIER) | (1L << INTEGER) | (1L << STRING) | (1L << PLUS) | (1L << MINUS) | (1L << MULT) | (1L << DIV))) != 0)) {
				{
				{
				setState(82);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(87);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Additive_expressionContext additive_expression() {
			return getRuleContext(Additive_expressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			additive_expression();
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

	public static class Additive_expressionContext extends ParserRuleContext {
		public List<Multiplicative_expressionContext> multiplicative_expression() {
			return getRuleContexts(Multiplicative_expressionContext.class);
		}
		public Multiplicative_expressionContext multiplicative_expression(int i) {
			return getRuleContext(Multiplicative_expressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(RiceParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(RiceParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(RiceParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(RiceParser.MINUS, i);
		}
		public Additive_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive_expression; }
	}

	public final Additive_expressionContext additive_expression() throws RecognitionException {
		Additive_expressionContext _localctx = new Additive_expressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_additive_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			multiplicative_expression();
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(91);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(92);
				multiplicative_expression();
				}
				}
				setState(97);
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

	public static class Multiplicative_expressionContext extends ParserRuleContext {
		public List<Unary_expressionContext> unary_expression() {
			return getRuleContexts(Unary_expressionContext.class);
		}
		public Unary_expressionContext unary_expression(int i) {
			return getRuleContext(Unary_expressionContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(RiceParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(RiceParser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(RiceParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(RiceParser.DIV, i);
		}
		public Multiplicative_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative_expression; }
	}

	public final Multiplicative_expressionContext multiplicative_expression() throws RecognitionException {
		Multiplicative_expressionContext _localctx = new Multiplicative_expressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_multiplicative_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			unary_expression();
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIV) {
				{
				{
				setState(99);
				_la = _input.LA(1);
				if ( !(_la==MULT || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(100);
				unary_expression();
				}
				}
				setState(105);
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

	public static class Unary_expressionContext extends ParserRuleContext {
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(RiceParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(RiceParser.MINUS, 0); }
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_unary_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(106);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(109);
			primary_expression();
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

	public static class Primary_expressionContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(RiceParser.INTEGER, 0); }
		public TerminalNode STRING() { return getToken(RiceParser.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(RiceParser.IDENTIFIER, 0); }
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_primary_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << INTEGER) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25t\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\3\3\3\7\3%\n\3\f"+
		"\3\16\3(\13\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4\60\n\4\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\7\6;\n\6\f\6\16\6>\13\6\5\6@\n\6\3\6\3\6\3\7\3\7\3\7\5"+
		"\7G\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\7\nV\n\n\f"+
		"\n\16\nY\13\n\3\13\3\13\3\f\3\f\3\f\7\f`\n\f\f\f\16\fc\13\f\3\r\3\r\3"+
		"\r\7\rh\n\r\f\r\16\rk\13\r\3\16\5\16n\n\16\3\16\3\16\3\17\3\17\3\17\2"+
		"\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\6\3\2\4\4\3\2\22\23\3\2\24"+
		"\25\3\2\17\21\2q\2\36\3\2\2\2\4\"\3\2\2\2\6/\3\2\2\2\b\61\3\2\2\2\n\64"+
		"\3\2\2\2\fC\3\2\2\2\16J\3\2\2\2\20N\3\2\2\2\22W\3\2\2\2\24Z\3\2\2\2\26"+
		"\\\3\2\2\2\30d\3\2\2\2\32m\3\2\2\2\34q\3\2\2\2\36\37\7\7\2\2\37 \5\4\3"+
		"\2 !\7\2\2\3!\3\3\2\2\2\"&\7\3\2\2#%\5\6\4\2$#\3\2\2\2%(\3\2\2\2&$\3\2"+
		"\2\2&\'\3\2\2\2\')\3\2\2\2(&\3\2\2\2)*\7\4\2\2*\5\3\2\2\2+\60\5\b\5\2"+
		",\60\5\n\6\2-\60\5\f\7\2.\60\5\20\t\2/+\3\2\2\2/,\3\2\2\2/-\3\2\2\2/."+
		"\3\2\2\2\60\7\3\2\2\2\61\62\7\b\2\2\62\63\7\5\2\2\63\t\3\2\2\2\64\65\7"+
		"\t\2\2\65?\5\24\13\2\66\67\7\13\2\2\67<\5\24\13\289\7\f\2\29;\5\24\13"+
		"\2:8\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=@\3\2\2\2><\3\2\2\2?\66\3\2"+
		"\2\2?@\3\2\2\2@A\3\2\2\2AB\7\5\2\2B\13\3\2\2\2CF\7\n\2\2DG\5\24\13\2E"+
		"G\5\16\b\2FD\3\2\2\2FE\3\2\2\2FG\3\2\2\2GH\3\2\2\2HI\7\5\2\2I\r\3\2\2"+
		"\2JK\7\r\2\2KL\5\24\13\2LM\7\5\2\2M\17\3\2\2\2NO\7\16\2\2OP\7\17\2\2P"+
		"Q\7\3\2\2QR\5\22\n\2RS\7\4\2\2S\21\3\2\2\2TV\n\2\2\2UT\3\2\2\2VY\3\2\2"+
		"\2WU\3\2\2\2WX\3\2\2\2X\23\3\2\2\2YW\3\2\2\2Z[\5\26\f\2[\25\3\2\2\2\\"+
		"a\5\30\r\2]^\t\3\2\2^`\5\30\r\2_]\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2"+
		"\2b\27\3\2\2\2ca\3\2\2\2di\5\32\16\2ef\t\4\2\2fh\5\32\16\2ge\3\2\2\2h"+
		"k\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\31\3\2\2\2ki\3\2\2\2ln\t\3\2\2ml\3\2\2"+
		"\2mn\3\2\2\2no\3\2\2\2op\5\34\17\2p\33\3\2\2\2qr\t\5\2\2r\35\3\2\2\2\13"+
		"&/<?FWaim";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}