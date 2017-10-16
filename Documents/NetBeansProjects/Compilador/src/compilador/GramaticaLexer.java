// Generated from /home/lucas_brito/Documents/Compiladores/Compiladores/Documents/NetBeansProjects/Compilador/src/compilador/Gramatica.g4 by ANTLR 4.5.3
package compilador;

  import java.util.HashMap;
  import java.util.Map;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Tk_Class=1, Tk_Main=2, Tk_PtVirg=3, Tk_Virg=4, Tk_DoisPonts=5, Tk_AbrePar=6, 
		Tk_FechPar=7, Tk_Int=8, Tk_Float=9, Tk_Bool=10, Tk_Str=11, Tk_Neg=12, 
		Tk_E=13, TK_OU=14, Tk_MaiorQ=15, Tk_MenorQ=16, Tk_MaiorIgual=17, Tk_MenorIgual=18, 
		Tk_Dif=19, Tk_Igual=20, Tk_AbreChaves=21, Tk_FechaChaves=22, Tk_MULT=23, 
		Tk_DIV=24, TK_SUB=25, Tk_SOMA=26, Tk_IF=27, Tk_FOR=28, Tk_ELSE=29, Tk_Incre=30, 
		Tk_Decre=31, Tk_PRINT=32, Tk_READ=33, Tk_VOID=34, Tk_RETURN=35, Tk_FINAL=36, 
		Tk_Atribu=37, ID=38, INT=39, REAL=40, STRING=41, COMMENT_LINE=42, COMMENT=43, 
		WS=44;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Tk_Class", "Tk_Main", "Tk_PtVirg", "Tk_Virg", "Tk_DoisPonts", "Tk_AbrePar", 
		"Tk_FechPar", "Tk_Int", "Tk_Float", "Tk_Bool", "Tk_Str", "Tk_Neg", "Tk_E", 
		"TK_OU", "Tk_MaiorQ", "Tk_MenorQ", "Tk_MaiorIgual", "Tk_MenorIgual", "Tk_Dif", 
		"Tk_Igual", "Tk_AbreChaves", "Tk_FechaChaves", "Tk_MULT", "Tk_DIV", "TK_SUB", 
		"Tk_SOMA", "Tk_IF", "Tk_FOR", "Tk_ELSE", "Tk_Incre", "Tk_Decre", "Tk_PRINT", 
		"Tk_READ", "Tk_VOID", "Tk_RETURN", "Tk_FINAL", "Tk_Atribu", "ID", "INT", 
		"REAL", "STRING", "COMMENT_LINE", "COMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Class'", "'Main'", "';'", "','", "':'", "'('", "')'", "'Int'", 
		"'Float'", "'Bool'", "'Str'", "'!'", "'&&'", "'||'", "'>'", "'<'", "'>='", 
		"'<='", "'=!'", "'=='", "'{'", "'}'", "'*'", "'/'", "'-'", "'+'", "'if'", 
		"'for'", "'else'", "'++'", "'--'", "'print'", "'read'", "'Void'", "'return'", 
		"'final'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Tk_Class", "Tk_Main", "Tk_PtVirg", "Tk_Virg", "Tk_DoisPonts", "Tk_AbrePar", 
		"Tk_FechPar", "Tk_Int", "Tk_Float", "Tk_Bool", "Tk_Str", "Tk_Neg", "Tk_E", 
		"TK_OU", "Tk_MaiorQ", "Tk_MenorQ", "Tk_MaiorIgual", "Tk_MenorIgual", "Tk_Dif", 
		"Tk_Igual", "Tk_AbreChaves", "Tk_FechaChaves", "Tk_MULT", "Tk_DIV", "TK_SUB", 
		"Tk_SOMA", "Tk_IF", "Tk_FOR", "Tk_ELSE", "Tk_Incre", "Tk_Decre", "Tk_PRINT", 
		"Tk_READ", "Tk_VOID", "Tk_RETURN", "Tk_FINAL", "Tk_Atribu", "ID", "INT", 
		"REAL", "STRING", "COMMENT_LINE", "COMMENT", "WS"
	};
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


	public GramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2.\u011a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#"+
		"\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3\'\3\'\7\'\u00db\n\'"+
		"\f\'\16\'\u00de\13\'\3(\6(\u00e1\n(\r(\16(\u00e2\3)\6)\u00e6\n)\r)\16"+
		")\u00e7\3)\3)\6)\u00ec\n)\r)\16)\u00ed\3*\3*\7*\u00f2\n*\f*\16*\u00f5"+
		"\13*\3*\3*\3+\3+\3+\3+\7+\u00fd\n+\f+\16+\u0100\13+\3+\5+\u0103\n+\3+"+
		"\3+\3+\3+\3,\3,\3,\3,\7,\u010d\n,\f,\16,\u0110\13,\3,\3,\3,\3,\3,\3-\3"+
		"-\3-\3-\5\u00f3\u00fe\u010e\2.\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.\3\2\6\4"+
		"\2C\\c|\5\2\62;C\\c|\3\2\62;\5\2\13\f\17\17\"\"\u0121\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2"+
		"\2\2\2Y\3\2\2\2\3[\3\2\2\2\5a\3\2\2\2\7f\3\2\2\2\th\3\2\2\2\13j\3\2\2"+
		"\2\rl\3\2\2\2\17n\3\2\2\2\21p\3\2\2\2\23t\3\2\2\2\25z\3\2\2\2\27\177\3"+
		"\2\2\2\31\u0083\3\2\2\2\33\u0085\3\2\2\2\35\u0088\3\2\2\2\37\u008b\3\2"+
		"\2\2!\u008d\3\2\2\2#\u008f\3\2\2\2%\u0092\3\2\2\2\'\u0095\3\2\2\2)\u0098"+
		"\3\2\2\2+\u009b\3\2\2\2-\u009d\3\2\2\2/\u009f\3\2\2\2\61\u00a1\3\2\2\2"+
		"\63\u00a3\3\2\2\2\65\u00a5\3\2\2\2\67\u00a7\3\2\2\29\u00aa\3\2\2\2;\u00ae"+
		"\3\2\2\2=\u00b3\3\2\2\2?\u00b6\3\2\2\2A\u00b9\3\2\2\2C\u00bf\3\2\2\2E"+
		"\u00c4\3\2\2\2G\u00c9\3\2\2\2I\u00d0\3\2\2\2K\u00d6\3\2\2\2M\u00d8\3\2"+
		"\2\2O\u00e0\3\2\2\2Q\u00e5\3\2\2\2S\u00ef\3\2\2\2U\u00f8\3\2\2\2W\u0108"+
		"\3\2\2\2Y\u0116\3\2\2\2[\\\7E\2\2\\]\7n\2\2]^\7c\2\2^_\7u\2\2_`\7u\2\2"+
		"`\4\3\2\2\2ab\7O\2\2bc\7c\2\2cd\7k\2\2de\7p\2\2e\6\3\2\2\2fg\7=\2\2g\b"+
		"\3\2\2\2hi\7.\2\2i\n\3\2\2\2jk\7<\2\2k\f\3\2\2\2lm\7*\2\2m\16\3\2\2\2"+
		"no\7+\2\2o\20\3\2\2\2pq\7K\2\2qr\7p\2\2rs\7v\2\2s\22\3\2\2\2tu\7H\2\2"+
		"uv\7n\2\2vw\7q\2\2wx\7c\2\2xy\7v\2\2y\24\3\2\2\2z{\7D\2\2{|\7q\2\2|}\7"+
		"q\2\2}~\7n\2\2~\26\3\2\2\2\177\u0080\7U\2\2\u0080\u0081\7v\2\2\u0081\u0082"+
		"\7t\2\2\u0082\30\3\2\2\2\u0083\u0084\7#\2\2\u0084\32\3\2\2\2\u0085\u0086"+
		"\7(\2\2\u0086\u0087\7(\2\2\u0087\34\3\2\2\2\u0088\u0089\7~\2\2\u0089\u008a"+
		"\7~\2\2\u008a\36\3\2\2\2\u008b\u008c\7@\2\2\u008c \3\2\2\2\u008d\u008e"+
		"\7>\2\2\u008e\"\3\2\2\2\u008f\u0090\7@\2\2\u0090\u0091\7?\2\2\u0091$\3"+
		"\2\2\2\u0092\u0093\7>\2\2\u0093\u0094\7?\2\2\u0094&\3\2\2\2\u0095\u0096"+
		"\7?\2\2\u0096\u0097\7#\2\2\u0097(\3\2\2\2\u0098\u0099\7?\2\2\u0099\u009a"+
		"\7?\2\2\u009a*\3\2\2\2\u009b\u009c\7}\2\2\u009c,\3\2\2\2\u009d\u009e\7"+
		"\177\2\2\u009e.\3\2\2\2\u009f\u00a0\7,\2\2\u00a0\60\3\2\2\2\u00a1\u00a2"+
		"\7\61\2\2\u00a2\62\3\2\2\2\u00a3\u00a4\7/\2\2\u00a4\64\3\2\2\2\u00a5\u00a6"+
		"\7-\2\2\u00a6\66\3\2\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7h\2\2\u00a98"+
		"\3\2\2\2\u00aa\u00ab\7h\2\2\u00ab\u00ac\7q\2\2\u00ac\u00ad\7t\2\2\u00ad"+
		":\3\2\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7n\2\2\u00b0\u00b1\7u\2\2\u00b1"+
		"\u00b2\7g\2\2\u00b2<\3\2\2\2\u00b3\u00b4\7-\2\2\u00b4\u00b5\7-\2\2\u00b5"+
		">\3\2\2\2\u00b6\u00b7\7/\2\2\u00b7\u00b8\7/\2\2\u00b8@\3\2\2\2\u00b9\u00ba"+
		"\7r\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd\7p\2\2\u00bd"+
		"\u00be\7v\2\2\u00beB\3\2\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1\7g\2\2\u00c1"+
		"\u00c2\7c\2\2\u00c2\u00c3\7f\2\2\u00c3D\3\2\2\2\u00c4\u00c5\7X\2\2\u00c5"+
		"\u00c6\7q\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c8\7f\2\2\u00c8F\3\2\2\2\u00c9"+
		"\u00ca\7t\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd\7w\2\2"+
		"\u00cd\u00ce\7t\2\2\u00ce\u00cf\7p\2\2\u00cfH\3\2\2\2\u00d0\u00d1\7h\2"+
		"\2\u00d1\u00d2\7k\2\2\u00d2\u00d3\7p\2\2\u00d3\u00d4\7c\2\2\u00d4\u00d5"+
		"\7n\2\2\u00d5J\3\2\2\2\u00d6\u00d7\7?\2\2\u00d7L\3\2\2\2\u00d8\u00dc\t"+
		"\2\2\2\u00d9\u00db\t\3\2\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00ddN\3\2\2\2\u00de\u00dc\3\2\2\2"+
		"\u00df\u00e1\t\4\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e0"+
		"\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3P\3\2\2\2\u00e4\u00e6\t\4\2\2\u00e5"+
		"\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2"+
		"\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\7\60\2\2\u00ea\u00ec\t\4\2\2\u00eb"+
		"\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2"+
		"\2\2\u00eeR\3\2\2\2\u00ef\u00f3\7$\2\2\u00f0\u00f2\13\2\2\2\u00f1\u00f0"+
		"\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4"+
		"\u00f6\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\7$\2\2\u00f7T\3\2\2\2\u00f8"+
		"\u00f9\7\61\2\2\u00f9\u00fa\7\61\2\2\u00fa\u00fe\3\2\2\2\u00fb\u00fd\13"+
		"\2\2\2\u00fc\u00fb\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00ff\3\2\2\2\u00fe"+
		"\u00fc\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0103\7\17"+
		"\2\2\u0102\u0101\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0105\7\f\2\2\u0105\u0106\3\2\2\2\u0106\u0107\b+\2\2\u0107V\3\2\2\2\u0108"+
		"\u0109\7\61\2\2\u0109\u010a\7,\2\2\u010a\u010e\3\2\2\2\u010b\u010d\13"+
		"\2\2\2\u010c\u010b\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010f\3\2\2\2\u010e"+
		"\u010c\3\2\2\2\u010f\u0111\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0112\7,"+
		"\2\2\u0112\u0113\7\61\2\2\u0113\u0114\3\2\2\2\u0114\u0115\b,\2\2\u0115"+
		"X\3\2\2\2\u0116\u0117\t\5\2\2\u0117\u0118\3\2\2\2\u0118\u0119\b-\2\2\u0119"+
		"Z\3\2\2\2\13\2\u00dc\u00e2\u00e7\u00ed\u00f3\u00fe\u0102\u010e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}