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
		RULE_root = 0, RULE_func = 1, RULE_var = 2, RULE_expr = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "func", "var", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';\n'", "'func '", "' '", "'('", "', '", "') '", "'var '", "' = '", 
			"')'", null, null, "'+'", "'-'", "'*'", "'/'"
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
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarLab03Visitor ) return ((GrammarLab03Visitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(12);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
					{
					setState(8);
					func();
					}
					break;
				case T__6:
					{
					setState(9);
					var();
					setState(10);
					match(T__0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(14); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 || _la==T__6 );
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
			setState(16);
			match(T__1);
			setState(17);
			match(ID);
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(18);
				match(T__2);
				}
			}

			setState(21);
			match(T__3);
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(22);
				match(ID);
				}
			}

			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(25);
				match(T__4);
				setState(26);
				match(ID);
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
			match(T__5);
			setState(33);
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
		enterRule(_localctx, 4, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(T__6);
			setState(36);
			match(ID);
			setState(37);
			match(T__7);
			setState(38);
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
		public List<TerminalNode> NUM() { return getTokens(GrammarLab03Parser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(GrammarLab03Parser.NUM, i);
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new ExprParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(41);
					match(T__2);
					}
				}

				setState(44);
				match(T__3);
				setState(45);
				expr(0);
				setState(46);
				match(T__8);
				setState(48);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(47);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 2:
				{
				_localctx = new ExprFuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(50);
				match(ID);
				setState(51);
				match(T__3);
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID || _la==NUM) {
					{
					setState(52);
					_la = _input.LA(1);
					if ( !(_la==ID || _la==NUM) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(55);
					match(T__4);
					setState(56);
					_la = _input.LA(1);
					if ( !(_la==ID || _la==NUM) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(61);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(62);
				match(T__8);
				setState(64);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(63);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 3:
				{
				_localctx = new ExprNumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(66);
				match(NUM);
				}
				break;
			case 4:
				{
				_localctx = new ExprIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(67);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(106);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMultContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(70);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(72);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__2) {
							{
							setState(71);
							match(T__2);
							}
						}

						setState(74);
						match(MULT);
						setState(76);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
						case 1:
							{
							setState(75);
							match(T__2);
							}
							break;
						}
						setState(78);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(79);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(81);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__2) {
							{
							setState(80);
							match(T__2);
							}
						}

						setState(83);
						match(DIV);
						setState(85);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
						case 1:
							{
							setState(84);
							match(T__2);
							}
							break;
						}
						setState(87);
						expr(7);
						}
						break;
					case 3:
						{
						_localctx = new ExprSumContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(88);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(90);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__2) {
							{
							setState(89);
							match(T__2);
							}
						}

						setState(92);
						match(ADD);
						setState(94);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
						case 1:
							{
							setState(93);
							match(T__2);
							}
							break;
						}
						setState(96);
						expr(6);
						}
						break;
					case 4:
						{
						_localctx = new ExprSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(97);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(99);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__2) {
							{
							setState(98);
							match(T__2);
							}
						}

						setState(101);
						match(SUB);
						setState(103);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
						case 1:
							{
							setState(102);
							match(T__2);
							}
							break;
						}
						setState(105);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21r\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\6\2\17\n\2\r\2\16\2\20\3\3\3\3\3\3"+
		"\5\3\26\n\3\3\3\3\3\5\3\32\n\3\3\3\3\3\7\3\36\n\3\f\3\16\3!\13\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\5\5-\n\5\3\5\3\5\3\5\3\5\5\5\63\n\5"+
		"\3\5\3\5\3\5\5\58\n\5\3\5\3\5\7\5<\n\5\f\5\16\5?\13\5\3\5\3\5\5\5C\n\5"+
		"\3\5\3\5\5\5G\n\5\3\5\3\5\5\5K\n\5\3\5\3\5\5\5O\n\5\3\5\3\5\3\5\5\5T\n"+
		"\5\3\5\3\5\5\5X\n\5\3\5\3\5\3\5\5\5]\n\5\3\5\3\5\5\5a\n\5\3\5\3\5\3\5"+
		"\5\5f\n\5\3\5\3\5\5\5j\n\5\3\5\7\5m\n\5\f\5\16\5p\13\5\3\5\2\3\b\6\2\4"+
		"\6\b\2\3\3\2\f\r\2\u0086\2\16\3\2\2\2\4\22\3\2\2\2\6%\3\2\2\2\bF\3\2\2"+
		"\2\n\17\5\4\3\2\13\f\5\6\4\2\f\r\7\3\2\2\r\17\3\2\2\2\16\n\3\2\2\2\16"+
		"\13\3\2\2\2\17\20\3\2\2\2\20\16\3\2\2\2\20\21\3\2\2\2\21\3\3\2\2\2\22"+
		"\23\7\4\2\2\23\25\7\f\2\2\24\26\7\5\2\2\25\24\3\2\2\2\25\26\3\2\2\2\26"+
		"\27\3\2\2\2\27\31\7\6\2\2\30\32\7\f\2\2\31\30\3\2\2\2\31\32\3\2\2\2\32"+
		"\37\3\2\2\2\33\34\7\7\2\2\34\36\7\f\2\2\35\33\3\2\2\2\36!\3\2\2\2\37\35"+
		"\3\2\2\2\37 \3\2\2\2 \"\3\2\2\2!\37\3\2\2\2\"#\7\b\2\2#$\5\b\5\2$\5\3"+
		"\2\2\2%&\7\t\2\2&\'\7\f\2\2\'(\7\n\2\2()\5\b\5\2)\7\3\2\2\2*,\b\5\1\2"+
		"+-\7\5\2\2,+\3\2\2\2,-\3\2\2\2-.\3\2\2\2./\7\6\2\2/\60\5\b\5\2\60\62\7"+
		"\13\2\2\61\63\7\5\2\2\62\61\3\2\2\2\62\63\3\2\2\2\63G\3\2\2\2\64\65\7"+
		"\f\2\2\65\67\7\6\2\2\668\t\2\2\2\67\66\3\2\2\2\678\3\2\2\28=\3\2\2\29"+
		":\7\7\2\2:<\t\2\2\2;9\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2"+
		"?=\3\2\2\2@B\7\13\2\2AC\7\5\2\2BA\3\2\2\2BC\3\2\2\2CG\3\2\2\2DG\7\r\2"+
		"\2EG\7\f\2\2F*\3\2\2\2F\64\3\2\2\2FD\3\2\2\2FE\3\2\2\2Gn\3\2\2\2HJ\f\t"+
		"\2\2IK\7\5\2\2JI\3\2\2\2JK\3\2\2\2KL\3\2\2\2LN\7\20\2\2MO\7\5\2\2NM\3"+
		"\2\2\2NO\3\2\2\2OP\3\2\2\2Pm\5\b\5\nQS\f\b\2\2RT\7\5\2\2SR\3\2\2\2ST\3"+
		"\2\2\2TU\3\2\2\2UW\7\21\2\2VX\7\5\2\2WV\3\2\2\2WX\3\2\2\2XY\3\2\2\2Ym"+
		"\5\b\5\tZ\\\f\7\2\2[]\7\5\2\2\\[\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^`\7\16\2"+
		"\2_a\7\5\2\2`_\3\2\2\2`a\3\2\2\2ab\3\2\2\2bm\5\b\5\bce\f\6\2\2df\7\5\2"+
		"\2ed\3\2\2\2ef\3\2\2\2fg\3\2\2\2gi\7\17\2\2hj\7\5\2\2ih\3\2\2\2ij\3\2"+
		"\2\2jk\3\2\2\2km\5\b\5\7lH\3\2\2\2lQ\3\2\2\2lZ\3\2\2\2lc\3\2\2\2mp\3\2"+
		"\2\2nl\3\2\2\2no\3\2\2\2o\t\3\2\2\2pn\3\2\2\2\27\16\20\25\31\37,\62\67"+
		"=BFJNSW\\`eiln";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}