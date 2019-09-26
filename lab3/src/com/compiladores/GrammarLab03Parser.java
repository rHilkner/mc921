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
		T__9=10, T__10=11, ID=12, NUM=13, ADD=14, SUB=15, MULT=16, DIV=17;
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
			null, "';\n'", "'func '", "'('", "' ('", "', '", "') '", "'var '", "' = '", 
			"')'", "' '", "','", null, null, "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"ID", "NUM", "ADD", "SUB", "MULT", "DIV"
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
			setState(14); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
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
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(12);
				match(T__0);
				}
				}
				setState(16); 
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
			setState(18);
			match(T__1);
			setState(19);
			match(ID);
			setState(20);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(21);
				match(ID);
				}
			}

			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(24);
				match(T__4);
				setState(25);
				match(ID);
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(31);
			match(T__5);
			setState(32);
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
			setState(34);
			match(T__6);
			setState(35);
			match(ID);
			setState(36);
			match(T__7);
			setState(37);
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
	public static class ExprSpaceRightContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprSpaceRightContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarLab03Visitor ) return ((GrammarLab03Visitor<? extends T>)visitor).visitExprSpaceRight(this);
			else return visitor.visitChildren(this);
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
	public static class ExprParenthesisSpaceRightContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprParenthesisSpaceRightContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarLab03Visitor ) return ((GrammarLab03Visitor<? extends T>)visitor).visitExprParenthesisSpaceRight(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprParenthesisSpaceLeftContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprParenthesisSpaceLeftContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarLab03Visitor ) return ((GrammarLab03Visitor<? extends T>)visitor).visitExprParenthesisSpaceLeft(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprSpaceLeftContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprSpaceLeftContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarLab03Visitor ) return ((GrammarLab03Visitor<? extends T>)visitor).visitExprSpaceLeft(this);
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
	public static class ExprParenthesisSpaceBothContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprParenthesisSpaceBothContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarLab03Visitor ) return ((GrammarLab03Visitor<? extends T>)visitor).visitExprParenthesisSpaceBoth(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprSpaceBothContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprSpaceBothContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarLab03Visitor ) return ((GrammarLab03Visitor<? extends T>)visitor).visitExprSpaceBoth(this);
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
	public static class ExprIdContext extends ExprContext {
		public TerminalNode ID() { return getToken(GrammarLab03Parser.ID, 0); }
		public ExprIdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarLab03Visitor ) return ((GrammarLab03Visitor<? extends T>)visitor).visitExprId(this);
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
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new ExprParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(40);
				match(T__2);
				setState(41);
				expr(0);
				setState(42);
				match(T__8);
				}
				break;
			case 2:
				{
				_localctx = new ExprParenthesisSpaceLeftContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(44);
				match(T__3);
				setState(45);
				expr(0);
				setState(46);
				match(T__8);
				}
				break;
			case 3:
				{
				_localctx = new ExprParenthesisSpaceRightContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(48);
				match(T__2);
				setState(49);
				expr(0);
				setState(50);
				match(T__5);
				}
				break;
			case 4:
				{
				_localctx = new ExprParenthesisSpaceBothContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(52);
				match(T__3);
				setState(53);
				expr(0);
				setState(54);
				match(T__5);
				}
				break;
			case 5:
				{
				_localctx = new ExprSpaceBothContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(56);
				match(T__9);
				setState(57);
				expr(0);
				setState(58);
				match(T__9);
				}
				break;
			case 6:
				{
				_localctx = new ExprSpaceLeftContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(60);
				match(T__9);
				setState(61);
				expr(4);
				}
				break;
			case 7:
				{
				_localctx = new ExprFuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(62);
				match(ID);
				setState(63);
				_la = _input.LA(1);
				if ( !(_la==T__2 || _la==T__3) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID || _la==NUM) {
					{
					setState(64);
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

				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4 || _la==T__10) {
					{
					{
					setState(67);
					_la = _input.LA(1);
					if ( !(_la==T__4 || _la==T__10) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(68);
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
					setState(73);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(74);
				_la = _input.LA(1);
				if ( !(_la==T__5 || _la==T__8) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 8:
				{
				_localctx = new ExprNumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(75);
				match(NUM);
				}
				break;
			case 9:
				{
				_localctx = new ExprIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(76);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(93);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMultContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(79);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(80);
						match(MULT);
						setState(81);
						expr(15);
						}
						break;
					case 2:
						{
						_localctx = new ExprDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(82);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(83);
						match(DIV);
						setState(84);
						expr(14);
						}
						break;
					case 3:
						{
						_localctx = new ExprSumContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(85);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(86);
						match(ADD);
						setState(87);
						expr(13);
						}
						break;
					case 4:
						{
						_localctx = new ExprSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(88);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(89);
						match(SUB);
						setState(90);
						expr(12);
						}
						break;
					case 5:
						{
						_localctx = new ExprSpaceRightContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(91);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(92);
						match(T__9);
						}
						break;
					}
					} 
				}
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23e\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\5\2\r\n\2\3\2\3\2\6\2\21\n\2\r\2\16\2\22\3"+
		"\3\3\3\3\3\3\3\5\3\31\n\3\3\3\3\3\7\3\35\n\3\f\3\16\3 \13\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5D\n\5\3\5"+
		"\3\5\7\5H\n\5\f\5\16\5K\13\5\3\5\3\5\3\5\5\5P\n\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5`\n\5\f\5\16\5c\13\5\3\5\2\3\b"+
		"\6\2\4\6\b\2\6\3\2\5\6\3\2\16\17\4\2\7\7\r\r\4\2\b\b\13\13\2s\2\20\3\2"+
		"\2\2\4\24\3\2\2\2\6$\3\2\2\2\bO\3\2\2\2\n\r\5\4\3\2\13\r\5\6\4\2\f\n\3"+
		"\2\2\2\f\13\3\2\2\2\r\16\3\2\2\2\16\17\7\3\2\2\17\21\3\2\2\2\20\f\3\2"+
		"\2\2\21\22\3\2\2\2\22\20\3\2\2\2\22\23\3\2\2\2\23\3\3\2\2\2\24\25\7\4"+
		"\2\2\25\26\7\16\2\2\26\30\t\2\2\2\27\31\7\16\2\2\30\27\3\2\2\2\30\31\3"+
		"\2\2\2\31\36\3\2\2\2\32\33\7\7\2\2\33\35\7\16\2\2\34\32\3\2\2\2\35 \3"+
		"\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37!\3\2\2\2 \36\3\2\2\2!\"\7\b\2\2"+
		"\"#\5\b\5\2#\5\3\2\2\2$%\7\t\2\2%&\7\16\2\2&\'\7\n\2\2\'(\5\b\5\2(\7\3"+
		"\2\2\2)*\b\5\1\2*+\7\5\2\2+,\5\b\5\2,-\7\13\2\2-P\3\2\2\2./\7\6\2\2/\60"+
		"\5\b\5\2\60\61\7\13\2\2\61P\3\2\2\2\62\63\7\5\2\2\63\64\5\b\5\2\64\65"+
		"\7\b\2\2\65P\3\2\2\2\66\67\7\6\2\2\678\5\b\5\289\7\b\2\29P\3\2\2\2:;\7"+
		"\f\2\2;<\5\b\5\2<=\7\f\2\2=P\3\2\2\2>?\7\f\2\2?P\5\b\5\6@A\7\16\2\2AC"+
		"\t\2\2\2BD\t\3\2\2CB\3\2\2\2CD\3\2\2\2DI\3\2\2\2EF\t\4\2\2FH\t\3\2\2G"+
		"E\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LP\t\5\2\2"+
		"MP\7\17\2\2NP\7\16\2\2O)\3\2\2\2O.\3\2\2\2O\62\3\2\2\2O\66\3\2\2\2O:\3"+
		"\2\2\2O>\3\2\2\2O@\3\2\2\2OM\3\2\2\2ON\3\2\2\2Pa\3\2\2\2QR\f\20\2\2RS"+
		"\7\22\2\2S`\5\b\5\21TU\f\17\2\2UV\7\23\2\2V`\5\b\5\20WX\f\16\2\2XY\7\20"+
		"\2\2Y`\5\b\5\17Z[\f\r\2\2[\\\7\21\2\2\\`\5\b\5\16]^\f\7\2\2^`\7\f\2\2"+
		"_Q\3\2\2\2_T\3\2\2\2_W\3\2\2\2_Z\3\2\2\2_]\3\2\2\2`c\3\2\2\2a_\3\2\2\2"+
		"ab\3\2\2\2b\t\3\2\2\2ca\3\2\2\2\13\f\22\30\36CIO_a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}