// Generated from GrammarLab03.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLab03Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, ID=12, NUM=13, ADD=14, SUB=15, MULT=16, DIV=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "ID", "NUM", "ADD", "SUB", "MULT", "DIV"
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


	public GrammarLab03Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GrammarLab03.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\\\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\7\rK\n\r\f\r\16\rN\13\r\3\16\6\16Q\n\16\r\16\16\16R\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\22\3\22\2\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23\3\2\5\5\2C\\aac"+
		"|\6\2\62;C\\aac|\3\2\62;\2]\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5(\3\2\2\2\7.\3\2\2\2\t\60\3"+
		"\2\2\2\13\63\3\2\2\2\r\66\3\2\2\2\179\3\2\2\2\21>\3\2\2\2\23B\3\2\2\2"+
		"\25D\3\2\2\2\27F\3\2\2\2\31H\3\2\2\2\33P\3\2\2\2\35T\3\2\2\2\37V\3\2\2"+
		"\2!X\3\2\2\2#Z\3\2\2\2%&\7=\2\2&\'\7\f\2\2\'\4\3\2\2\2()\7h\2\2)*\7w\2"+
		"\2*+\7p\2\2+,\7e\2\2,-\7\"\2\2-\6\3\2\2\2./\7*\2\2/\b\3\2\2\2\60\61\7"+
		"\"\2\2\61\62\7*\2\2\62\n\3\2\2\2\63\64\7.\2\2\64\65\7\"\2\2\65\f\3\2\2"+
		"\2\66\67\7+\2\2\678\7\"\2\28\16\3\2\2\29:\7x\2\2:;\7c\2\2;<\7t\2\2<=\7"+
		"\"\2\2=\20\3\2\2\2>?\7\"\2\2?@\7?\2\2@A\7\"\2\2A\22\3\2\2\2BC\7+\2\2C"+
		"\24\3\2\2\2DE\7\"\2\2E\26\3\2\2\2FG\7.\2\2G\30\3\2\2\2HL\t\2\2\2IK\t\3"+
		"\2\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\32\3\2\2\2NL\3\2\2\2OQ\t"+
		"\4\2\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\34\3\2\2\2TU\7-\2\2U\36"+
		"\3\2\2\2VW\7/\2\2W \3\2\2\2XY\7,\2\2Y\"\3\2\2\2Z[\7\61\2\2[$\3\2\2\2\5"+
		"\2LR\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}