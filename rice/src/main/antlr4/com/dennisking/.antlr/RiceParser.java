
// Generated from /workspaces/rice-language/rice/src/main/antlr4/com/dennisking/Rice.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class RiceParser extends Parser {
	static {
		RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION);
	}

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
	public static final int T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
			T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, T__14 = 15, ID = 16, INT = 17,
			STRING = 18;
	public static final int RULE_program = 0, RULE_riceBlock = 1, RULE_cookBlock = 2, RULE_statement = 3,
			RULE_declarationStmt = 4, RULE_declarationStmtTail = 5, RULE_assignmentStmt = 6,
			RULE_printStmt = 7, RULE_expr = 8, RULE_addExpr = 9, RULE_term = 10, RULE_mulExpr = 11,
			RULE_factor = 12, RULE_addOp = 13, RULE_mulOp = 14, RULE_serveStmt = 15;

	private static String[] makeRuleNames() {
		return new String[] {
				"program", "riceBlock", "cookBlock", "statement", "declarationStmt",
				"declarationStmtTail", "assignmentStmt", "printStmt", "expr", "addExpr",
				"term", "mulExpr", "factor", "addOp", "mulOp", "serveStmt"
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

	@Override
	public String getGrammarFileName() {
		return "Rice.g4";
	}

	@Override
	public String[] getRuleNames() {
		return ruleNames;
	}

	@Override
	public String getSerializedATN() {
		return _serializedATN;
	}

	@Override
	public ATN getATN() {
		return _ATN;
	}

	public RiceParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public RiceBlockContext riceBlock() {
			return getRuleContext(RiceBlockContext.class, 0);
		}

		public ServeStmtContext serveStmt() {
			return getRuleContext(ServeStmtContext.class, 0);
		}

		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_program;
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(32);
				riceBlock();
				setState(33);
				serveStmt();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RiceBlockContext extends ParserRuleContext {
		public CookBlockContext cookBlock() {
			return getRuleContext(CookBlockContext.class, 0);
		}

		public RiceBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_riceBlock;
		}
	}

	public final RiceBlockContext riceBlock() throws RecognitionException {
		RiceBlockContext _localctx = new RiceBlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_riceBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(35);
				match(T__0);
				setState(36);
				cookBlock();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CookBlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}

		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class, i);
		}

		public CookBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_cookBlock;
		}
	}

	public final CookBlockContext cookBlock() throws RecognitionException {
		CookBlockContext _localctx = new CookBlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cookBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(38);
				match(T__1);
				setState(39);
				match(T__2);
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0
						&& ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << T__8) | (1L << ID))) != 0)) {
					{
						{
							setState(40);
							statement();
						}
					}
					setState(45);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(46);
				match(T__3);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public DeclarationStmtContext declarationStmt() {
			return getRuleContext(DeclarationStmtContext.class, 0);
		}

		public AssignmentStmtContext assignmentStmt() {
			return getRuleContext(AssignmentStmtContext.class, 0);
		}

		public PrintStmtContext printStmt() {
			return getRuleContext(PrintStmtContext.class, 0);
		}

		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_statement;
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case T__4:
				case T__6:
					enterOuterAlt(_localctx, 1); {
					setState(48);
					declarationStmt();
				}
					break;
				case ID:
					enterOuterAlt(_localctx, 2); {
					setState(49);
					assignmentStmt();
				}
					break;
				case T__8:
					enterOuterAlt(_localctx, 3); {
					setState(50);
					printStmt();
				}
					break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationStmtContext extends ParserRuleContext {
		public TerminalNode ID() {
			return getToken(RiceParser.ID, 0);
		}

		public TerminalNode INT() {
			return getToken(RiceParser.INT, 0);
		}

		public DeclarationStmtTailContext declarationStmtTail() {
			return getRuleContext(DeclarationStmtTailContext.class, 0);
		}

		public TerminalNode STRING() {
			return getToken(RiceParser.STRING, 0);
		}

		public DeclarationStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_declarationStmt;
		}
	}

	public final DeclarationStmtContext declarationStmt() throws RecognitionException {
		DeclarationStmtContext _localctx = new DeclarationStmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declarationStmt);
		int _la;
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case T__4:
					enterOuterAlt(_localctx, 1); {
					setState(53);
					match(T__4);
					setState(54);
					match(ID);
					setState(55);
					match(T__5);
					setState(56);
					match(INT);
					setState(58);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == T__7) {
						{
							setState(57);
							declarationStmtTail();
						}
					}

				}
					break;
				case T__6:
					enterOuterAlt(_localctx, 2); {
					setState(60);
					match(T__6);
					setState(61);
					match(ID);
					setState(62);
					match(T__5);
					setState(63);
					match(STRING);
					setState(65);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == T__7) {
						{
							setState(64);
							declarationStmtTail();
						}
					}

				}
					break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationStmtTailContext extends ParserRuleContext {
		public DeclarationStmtContext declarationStmt() {
			return getRuleContext(DeclarationStmtContext.class, 0);
		}

		public DeclarationStmtTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_declarationStmtTail;
		}
	}

	public final DeclarationStmtTailContext declarationStmtTail() throws RecognitionException {
		DeclarationStmtTailContext _localctx = new DeclarationStmtTailContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declarationStmtTail);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(69);
				match(T__7);
				setState(70);
				declarationStmt();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentStmtContext extends ParserRuleContext {
		public TerminalNode ID() {
			return getToken(RiceParser.ID, 0);
		}

		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public AssignmentStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_assignmentStmt;
		}
	}

	public final AssignmentStmtContext assignmentStmt() throws RecognitionException {
		AssignmentStmtContext _localctx = new AssignmentStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignmentStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(72);
				match(ID);
				setState(73);
				match(T__5);
				setState(74);
				expr();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public PrintStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_printStmt;
		}
	}

	public final PrintStmtContext printStmt() throws RecognitionException {
		PrintStmtContext _localctx = new PrintStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_printStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(76);
				match(T__8);
				setState(77);
				match(T__9);
				setState(78);
				expr();
				setState(79);
				match(T__10);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class, 0);
		}

		public List<AddExprContext> addExpr() {
			return getRuleContexts(AddExprContext.class);
		}

		public AddExprContext addExpr(int i) {
			return getRuleContext(AddExprContext.class, i);
		}

		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_expr;
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(81);
				term();
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == T__11 || _la == T__12) {
					{
						{
							setState(82);
							addExpr();
						}
					}
					setState(87);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddExprContext extends ParserRuleContext {
		public AddOpContext addOp() {
			return getRuleContext(AddOpContext.class, 0);
		}

		public TermContext term() {
			return getRuleContext(TermContext.class, 0);
		}

		public AddExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_addExpr;
		}
	}

	public final AddExprContext addExpr() throws RecognitionException {
		AddExprContext _localctx = new AddExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_addExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(88);
				addOp();
				setState(89);
				term();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class, 0);
		}

		public List<MulExprContext> mulExpr() {
			return getRuleContexts(MulExprContext.class);
		}

		public MulExprContext mulExpr(int i) {
			return getRuleContext(MulExprContext.class, i);
		}

		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_term;
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(91);
				factor();
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == T__13) {
					{
						{
							setState(92);
							mulExpr();
						}
					}
					setState(97);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MulExprContext extends ParserRuleContext {
		public MulOpContext mulOp() {
			return getRuleContext(MulOpContext.class, 0);
		}

		public FactorContext factor() {
			return getRuleContext(FactorContext.class, 0);
		}

		public MulExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_mulExpr;
		}
	}

	public final MulExprContext mulExpr() throws RecognitionException {
		MulExprContext _localctx = new MulExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mulExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(98);
				mulOp();
				setState(99);
				factor();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode ID() {
			return getToken(RiceParser.ID, 0);
		}

		public TerminalNode INT() {
			return getToken(RiceParser.INT, 0);
		}

		public TerminalNode STRING() {
			return getToken(RiceParser.STRING, 0);
		}

		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_factor;
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_factor);
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case ID:
					enterOuterAlt(_localctx, 1); {
					setState(101);
					match(ID);
				}
					break;
				case INT:
					enterOuterAlt(_localctx, 2); {
					setState(102);
					match(INT);
				}
					break;
				case STRING:
					enterOuterAlt(_localctx, 3); {
					setState(103);
					match(STRING);
				}
					break;
				case T__9:
					enterOuterAlt(_localctx, 4); {
					setState(104);
					match(T__9);
					setState(105);
					expr();
					setState(106);
					match(T__10);
				}
					break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddOpContext extends ParserRuleContext {
		public AddOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_addOp;
		}
	}

	public final AddOpContext addOp() throws RecognitionException {
		AddOpContext _localctx = new AddOpContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_addOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(110);
				_la = _input.LA(1);
				if (!(_la == T__11 || _la == T__12)) {
					_errHandler.recoverInline(this);
				} else {
					if (_input.LA(1) == Token.EOF)
						matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MulOpContext extends ParserRuleContext {
		public MulOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_mulOp;
		}
	}

	public final MulOpContext mulOp() throws RecognitionException {
		MulOpContext _localctx = new MulOpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_mulOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(112);
				match(T__13);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ServeStmtContext extends ParserRuleContext {
		public ServeStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_serveStmt;
		}
	}

	public final ServeStmtContext serveStmt() throws RecognitionException {
		ServeStmtContext _localctx = new ServeStmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_serveStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(114);
				match(T__14);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN = "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24w\4\2\t\2\4\3\t"
			+
			"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4" +
			"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3\2\3\3" +
			"\3\3\3\3\3\4\3\4\3\4\7\4,\n\4\f\4\16\4/\13\4\3\4\3\4\3\5\3\5\3\5\5\5\66" +
			"\n\5\3\6\3\6\3\6\3\6\3\6\5\6=\n\6\3\6\3\6\3\6\3\6\3\6\5\6D\n\6\5\6F\n" +
			"\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\7\nV\n\n\f" +
			"\n\16\nY\13\n\3\13\3\13\3\13\3\f\3\f\7\f`\n\f\f\f\16\fc\13\f\3\r\3\r\3" +
			"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16o\n\16\3\17\3\17\3\20\3\20\3" +
			"\21\3\21\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\3\3\2\16" +
			"\17\2q\2\"\3\2\2\2\4%\3\2\2\2\6(\3\2\2\2\b\65\3\2\2\2\nE\3\2\2\2\fG\3" +
			"\2\2\2\16J\3\2\2\2\20N\3\2\2\2\22S\3\2\2\2\24Z\3\2\2\2\26]\3\2\2\2\30" +
			"d\3\2\2\2\32n\3\2\2\2\34p\3\2\2\2\36r\3\2\2\2 t\3\2\2\2\"#\5\4\3\2#$\5" +
			" \21\2$\3\3\2\2\2%&\7\3\2\2&\'\5\6\4\2\'\5\3\2\2\2()\7\4\2\2)-\7\5\2\2" +
			"*,\5\b\5\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/-\3\2\2" +
			"\2\60\61\7\6\2\2\61\7\3\2\2\2\62\66\5\n\6\2\63\66\5\16\b\2\64\66\5\20" +
			"\t\2\65\62\3\2\2\2\65\63\3\2\2\2\65\64\3\2\2\2\66\t\3\2\2\2\678\7\7\2" +
			"\289\7\22\2\29:\7\b\2\2:<\7\23\2\2;=\5\f\7\2<;\3\2\2\2<=\3\2\2\2=F\3\2" +
			"\2\2>?\7\t\2\2?@\7\22\2\2@A\7\b\2\2AC\7\24\2\2BD\5\f\7\2CB\3\2\2\2CD\3" +
			"\2\2\2DF\3\2\2\2E\67\3\2\2\2E>\3\2\2\2F\13\3\2\2\2GH\7\n\2\2HI\5\n\6\2" +
			"I\r\3\2\2\2JK\7\22\2\2KL\7\b\2\2LM\5\22\n\2M\17\3\2\2\2NO\7\13\2\2OP\7" +
			"\f\2\2PQ\5\22\n\2QR\7\r\2\2R\21\3\2\2\2SW\5\26\f\2TV\5\24\13\2UT\3\2\2" +
			"\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\23\3\2\2\2YW\3\2\2\2Z[\5\34\17\2[\\" +
			"\5\26\f\2\\\25\3\2\2\2]a\5\32\16\2^`\5\30\r\2_^\3\2\2\2`c\3\2\2\2a_\3" +
			"\2\2\2ab\3\2\2\2b\27\3\2\2\2ca\3\2\2\2de\5\36\20\2ef\5\32\16\2f\31\3\2" +
			"\2\2go\7\22\2\2ho\7\23\2\2io\7\24\2\2jk\7\f\2\2kl\5\22\n\2lm\7\r\2\2m" +
			"o\3\2\2\2ng\3\2\2\2nh\3\2\2\2ni\3\2\2\2nj\3\2\2\2o\33\3\2\2\2pq\t\2\2" +
			"\2q\35\3\2\2\2rs\7\20\2\2s\37\3\2\2\2tu\7\21\2\2u!\3\2\2\2\n-\65<CEWa" +
			"n";
	public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}