// Generated from GrammarLab03.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLab03Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		ID=10, NUM=11, ADD=12, SUB=13, MULT=14, DIV=15;
	public static final int
		RULE_root = 0, RULE_func = 1, RULE_expr = 2, RULE_var = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "func", "expr", "var"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';\n'", "'func '", "'('", "', '", "') '", "' '", "')'", "'var '", 
			"' = '", null, null, "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "ID", "NUM", 
			"ADD", "SUB", "MULT", "DIV"
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
	public String getGrammarFileName() { return "GrammarLab03.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarLab03Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RootContext extends ParserRuleContext {
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarLab03Visitor) return ((GrammarLab03Visitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			setState(13);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(8);
				func();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(9);
				var();
				}
				break;
			case T__2:
			case ID:
			case NUM:
				enterOuterAlt(_localctx, 3);
				{
				setState(10);
				expr(0);
				setState(11);
				match(T__0);
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

	public static class FuncContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GrammarLab03Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarLab03Parser.ID, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarLab03Visitor ) return ((GrammarLab03Visitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			match(T__1);
			setState(16);
			match(ID);
			setState(17);
			match(T__2);
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(18);
				match(ID);
				}
			}

			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(21);
				match(T__3);
				setState(22);
				match(ID);
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(28);
			match(T__4);
			setState(29);
			expr(0);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprNumContext extends ExprContext {
		public TerminalNode NUM() { return getToken(GrammarLab03Parser.NUM, 0); }
		public ExprNumContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarLab03Visitor ) return ((GrammarLab03Visitor<? extends T>)visitor).visitExprNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprMultContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(GrammarLab03Parser.MULT, 0); }
		public ExprMultContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarLab03Visitor ) return ((GrammarLab03Visitor<? extends T>)visitor).visitExprMult(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprFuncCallContext extends ExprContext {
		public List<TerminalNode> ID() { return getTokens(GrammarLab03Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarLab03Parser.ID, i);
		}
		public ExprFuncCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarLab03Visitor ) return ((GrammarLab03Visitor<? extends T>)visitor).visitExprFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprSumContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(GrammarLab03Parser.ADD, 0); }
		public ExprSumContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarLab03Visitor ) return ((GrammarLab03Visitor<? extends T>)visitor).visitExprSum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprSubContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SUB() { return getToken(GrammarLab03Parser.SUB, 0); }
		public ExprSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarLab03Visitor ) return ((GrammarLab03Visitor<? extends T>)visitor).visitExprSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprParenthesisContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprParenthesisContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarLab03Visitor ) return ((GrammarLab03Visitor<? extends T>)visitor).visitExprParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprIdContext extends ExprContext {
		public TerminalNode ID() { return getToken(GrammarLab03Parser.ID, 0); }
		public ExprIdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarLab03Visitor ) return ((GrammarLab03Visitor<? extends T>)visitor).visitExprId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprDivContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DIV() { return getToken(GrammarLab03Parser.DIV, 0); }
		public ExprDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarLab03Visitor ) return ((GrammarLab03Visitor<? extends T>)visitor).visitExprDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				_localctx = new ExprParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(32);
				match(T__2);
				setState(33);
				expr(0);
				setState(34);
				match(T__6);
				}
				break;
			case 2:
				{
				_localctx = new ExprFuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(36);
				match(ID);
				setState(37);
				match(T__2);
				setState(38);
				match(ID);
				setState(39);
				match(T__4);
				}
				break;
			case 3:
				{
				_localctx = new ExprNumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(40);
				match(NUM);
				}
				break;
			case 4:
				{
				_localctx = new ExprIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(41);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(82);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(80);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMultContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(44);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(46);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__5) {
							{
							setState(45);
							match(T__5);
							}
						}

						setState(48);
						match(MULT);
						setState(50);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__5) {
							{
							setState(49);
							match(T__5);
							}
						}

						setState(52);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new ExprDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(53);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(55);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__5) {
							{
							setState(54);
							match(T__5);
							}
						}

						setState(57);
						match(DIV);
						setState(59);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__5) {
							{
							setState(58);
							match(T__5);
							}
						}

						setState(61);
						expr(8);
						}
						break;
					case 3:
						{
						_localctx = new ExprSumContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(62);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(64);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__5) {
							{
							setState(63);
							match(T__5);
							}
						}

						setState(66);
						match(ADD);
						setState(68);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__5) {
							{
							setState(67);
							match(T__5);
							}
						}

						setState(70);
						expr(7);
						}
						break;
					case 4:
						{
						_localctx = new ExprSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(71);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(73);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__5) {
							{
							setState(72);
							match(T__5);
							}
						}

						setState(75);
						match(SUB);
						setState(77);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__5) {
							{
							setState(76);
							match(T__5);
							}
						}

						setState(79);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(84);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarLab03Parser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarLab03Visitor ) return ((GrammarLab03Visitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__7);
			setState(86);
			match(ID);
			setState(87);
			match(T__8);
			setState(88);
			expr(0);
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
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21]\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\3\2\5\2\20\n\2\3\3\3\3\3\3\3\3\5\3"+
		"\26\n\3\3\3\3\3\7\3\32\n\3\f\3\16\3\35\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4-\n\4\3\4\3\4\5\4\61\n\4\3\4\3\4\5\4"+
		"\65\n\4\3\4\3\4\3\4\5\4:\n\4\3\4\3\4\5\4>\n\4\3\4\3\4\3\4\5\4C\n\4\3\4"+
		"\3\4\5\4G\n\4\3\4\3\4\3\4\5\4L\n\4\3\4\3\4\5\4P\n\4\3\4\7\4S\n\4\f\4\16"+
		"\4V\13\4\3\5\3\5\3\5\3\5\3\5\3\5\2\3\6\6\2\4\6\b\2\2\2k\2\17\3\2\2\2\4"+
		"\21\3\2\2\2\6,\3\2\2\2\bW\3\2\2\2\n\20\5\4\3\2\13\20\5\b\5\2\f\r\5\6\4"+
		"\2\r\16\7\3\2\2\16\20\3\2\2\2\17\n\3\2\2\2\17\13\3\2\2\2\17\f\3\2\2\2"+
		"\20\3\3\2\2\2\21\22\7\4\2\2\22\23\7\f\2\2\23\25\7\5\2\2\24\26\7\f\2\2"+
		"\25\24\3\2\2\2\25\26\3\2\2\2\26\33\3\2\2\2\27\30\7\6\2\2\30\32\7\f\2\2"+
		"\31\27\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\36\3\2\2\2"+
		"\35\33\3\2\2\2\36\37\7\7\2\2\37 \5\6\4\2 \5\3\2\2\2!\"\b\4\1\2\"#\7\5"+
		"\2\2#$\5\6\4\2$%\7\t\2\2%-\3\2\2\2&\'\7\f\2\2\'(\7\5\2\2()\7\f\2\2)-\7"+
		"\7\2\2*-\7\r\2\2+-\7\f\2\2,!\3\2\2\2,&\3\2\2\2,*\3\2\2\2,+\3\2\2\2-T\3"+
		"\2\2\2.\60\f\n\2\2/\61\7\b\2\2\60/\3\2\2\2\60\61\3\2\2\2\61\62\3\2\2\2"+
		"\62\64\7\20\2\2\63\65\7\b\2\2\64\63\3\2\2\2\64\65\3\2\2\2\65\66\3\2\2"+
		"\2\66S\5\6\4\13\679\f\t\2\28:\7\b\2\298\3\2\2\29:\3\2\2\2:;\3\2\2\2;="+
		"\7\21\2\2<>\7\b\2\2=<\3\2\2\2=>\3\2\2\2>?\3\2\2\2?S\5\6\4\n@B\f\b\2\2"+
		"AC\7\b\2\2BA\3\2\2\2BC\3\2\2\2CD\3\2\2\2DF\7\16\2\2EG\7\b\2\2FE\3\2\2"+
		"\2FG\3\2\2\2GH\3\2\2\2HS\5\6\4\tIK\f\7\2\2JL\7\b\2\2KJ\3\2\2\2KL\3\2\2"+
		"\2LM\3\2\2\2MO\7\17\2\2NP\7\b\2\2ON\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QS\5\6"+
		"\4\bR.\3\2\2\2R\67\3\2\2\2R@\3\2\2\2RI\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3"+
		"\2\2\2U\7\3\2\2\2VT\3\2\2\2WX\7\n\2\2XY\7\f\2\2YZ\7\13\2\2Z[\5\6\4\2["+
		"\t\3\2\2\2\20\17\25\33,\60\649=BFKORT";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}