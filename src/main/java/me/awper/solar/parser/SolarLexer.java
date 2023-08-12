package me.awper.solar.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SolarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, PLUS=12, MINUS=13, DIV=14, MUL=15, INT=16, BOOL=17, 
		ID=18, WHITE=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "PLUS", "MINUS", "DIV", "MUL", "INT", "BOOL", "ID", 
			"WHITE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'('", "','", "')'", "'{'", "'}'", "'='", "'if'", "'else'", 
			"';'", "'return'", "'+'", "'-'", "'/'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"PLUS", "MINUS", "DIV", "MUL", "INT", "BOOL", "ID", "WHITE"
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


	public SolarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Solar.g4"; }

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
		"\u0004\u0000\u0013s\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0004\u000fR\b\u000f\u000b\u000f\f\u000fS\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010_\b\u0010\u0001\u0011\u0004"+
		"\u0011b\b\u0011\u000b\u0011\f\u0011c\u0001\u0011\u0004\u0011g\b\u0011"+
		"\u000b\u0011\f\u0011h\u0003\u0011k\b\u0011\u0001\u0012\u0004\u0012n\b"+
		"\u0012\u000b\u0012\f\u0012o\u0001\u0012\u0001\u0012\u0000\u0000\u0013"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\u0001\u0000\u0001\u0003"+
		"\u0000\t\n\r\r  x\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0001\'\u0001\u0000\u0000\u0000\u0003+\u0001"+
		"\u0000\u0000\u0000\u0005-\u0001\u0000\u0000\u0000\u0007/\u0001\u0000\u0000"+
		"\u0000\t1\u0001\u0000\u0000\u0000\u000b3\u0001\u0000\u0000\u0000\r5\u0001"+
		"\u0000\u0000\u0000\u000f7\u0001\u0000\u0000\u0000\u0011:\u0001\u0000\u0000"+
		"\u0000\u0013?\u0001\u0000\u0000\u0000\u0015A\u0001\u0000\u0000\u0000\u0017"+
		"H\u0001\u0000\u0000\u0000\u0019J\u0001\u0000\u0000\u0000\u001bL\u0001"+
		"\u0000\u0000\u0000\u001dN\u0001\u0000\u0000\u0000\u001fQ\u0001\u0000\u0000"+
		"\u0000!^\u0001\u0000\u0000\u0000#j\u0001\u0000\u0000\u0000%m\u0001\u0000"+
		"\u0000\u0000\'(\u0005d\u0000\u0000()\u0005e\u0000\u0000)*\u0005f\u0000"+
		"\u0000*\u0002\u0001\u0000\u0000\u0000+,\u0005(\u0000\u0000,\u0004\u0001"+
		"\u0000\u0000\u0000-.\u0005,\u0000\u0000.\u0006\u0001\u0000\u0000\u0000"+
		"/0\u0005)\u0000\u00000\b\u0001\u0000\u0000\u000012\u0005{\u0000\u0000"+
		"2\n\u0001\u0000\u0000\u000034\u0005}\u0000\u00004\f\u0001\u0000\u0000"+
		"\u000056\u0005=\u0000\u00006\u000e\u0001\u0000\u0000\u000078\u0005i\u0000"+
		"\u000089\u0005f\u0000\u00009\u0010\u0001\u0000\u0000\u0000:;\u0005e\u0000"+
		"\u0000;<\u0005l\u0000\u0000<=\u0005s\u0000\u0000=>\u0005e\u0000\u0000"+
		">\u0012\u0001\u0000\u0000\u0000?@\u0005;\u0000\u0000@\u0014\u0001\u0000"+
		"\u0000\u0000AB\u0005r\u0000\u0000BC\u0005e\u0000\u0000CD\u0005t\u0000"+
		"\u0000DE\u0005u\u0000\u0000EF\u0005r\u0000\u0000FG\u0005n\u0000\u0000"+
		"G\u0016\u0001\u0000\u0000\u0000HI\u0005+\u0000\u0000I\u0018\u0001\u0000"+
		"\u0000\u0000JK\u0005-\u0000\u0000K\u001a\u0001\u0000\u0000\u0000LM\u0005"+
		"/\u0000\u0000M\u001c\u0001\u0000\u0000\u0000NO\u0005*\u0000\u0000O\u001e"+
		"\u0001\u0000\u0000\u0000PR\u000209\u0000QP\u0001\u0000\u0000\u0000RS\u0001"+
		"\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000"+
		"T \u0001\u0000\u0000\u0000UV\u0005t\u0000\u0000VW\u0005r\u0000\u0000W"+
		"X\u0005u\u0000\u0000X_\u0005e\u0000\u0000YZ\u0005f\u0000\u0000Z[\u0005"+
		"a\u0000\u0000[\\\u0005l\u0000\u0000\\]\u0005s\u0000\u0000]_\u0005e\u0000"+
		"\u0000^U\u0001\u0000\u0000\u0000^Y\u0001\u0000\u0000\u0000_\"\u0001\u0000"+
		"\u0000\u0000`b\u0002az\u0000a`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000"+
		"\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000dk\u0001\u0000"+
		"\u0000\u0000eg\u0002AZ\u0000fe\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000"+
		"\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ik\u0001\u0000"+
		"\u0000\u0000ja\u0001\u0000\u0000\u0000jf\u0001\u0000\u0000\u0000k$\u0001"+
		"\u0000\u0000\u0000ln\u0007\u0000\u0000\u0000ml\u0001\u0000\u0000\u0000"+
		"no\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000"+
		"\u0000pq\u0001\u0000\u0000\u0000qr\u0006\u0012\u0000\u0000r&\u0001\u0000"+
		"\u0000\u0000\u0007\u0000S^chjo\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}