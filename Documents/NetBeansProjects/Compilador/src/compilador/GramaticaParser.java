// Generated from /home/lucas_brito/Documents/Compiladores/Compiladores/Documents/NetBeansProjects/Compilador/src/compilador/Gramatica.g4 by ANTLR 4.5.3
package compilador;

  import java.util.HashMap;
  import java.util.Map;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, Tk_break=2, Tk_Class=3, Tk_Main=4, Tk_PtVirg=5, Tk_Virg=6, Tk_DoisPonts=7, 
		Tk_AbrePar=8, Tk_FechPar=9, Tk_Int=10, Tk_Float=11, Tk_Bool=12, Tk_Str=13, 
		Tk_Neg=14, Tk_E=15, TK_OU=16, Tk_MaiorQ=17, Tk_MenorQ=18, Tk_MaiorIgual=19, 
		Tk_MenorIgual=20, Tk_Dif=21, Tk_Igual=22, Tk_AbreChaves=23, Tk_FechaChaves=24, 
		Tk_MULT=25, Tk_DIV=26, TK_SUB=27, Tk_SOMA=28, Tk_IF=29, Tk_FOR=30, Tk_ELSE=31, 
		Tk_Incre=32, Tk_Decre=33, Tk_PRINT=34, Tk_READ=35, Tk_VOID=36, Tk_RETURN=37, 
		Tk_FINAL=38, Tk_Atribu=39, Tk_True=40, Tk_False=41, ID=42, INT=43, REAL=44, 
		STRING=45, COMMENT_LINE=46, COMMENT=47, WS=48, TRUE=49, FALSE=50;
	public static final int
		RULE_programa = 0, RULE_decVars = 1, RULE_decVarsFunc = 2, RULE_tipo = 3, 
		RULE_listaIDs = 4, RULE_listaIDs2 = 5, RULE_decConsts = 6, RULE_decConstsFunc = 7, 
		RULE_valor = 8, RULE_decFuncs = 9, RULE_listaParam = 10, RULE_retorno = 11, 
		RULE_tipoRetorno = 12, RULE_main = 13, RULE_comandos = 14, RULE_print = 15, 
		RULE_read = 16, RULE_chamFuncs = 17, RULE_listaExpre = 18, RULE_expre = 19, 
		RULE_atribuicao = 20, RULE_testeLogic = 21, RULE_teste1 = 22, RULE_teste2 = 23, 
		RULE_teste3 = 24, RULE_funcMath = 25, RULE_term = 26, RULE_unary = 27, 
		RULE_fator = 28, RULE_controle = 29, RULE_varControl = 30, RULE_opSec = 31, 
		RULE_opPrim = 32, RULE_incrementos = 33;
	public static final String[] ruleNames = {
		"programa", "decVars", "decVarsFunc", "tipo", "listaIDs", "listaIDs2", 
		"decConsts", "decConstsFunc", "valor", "decFuncs", "listaParam", "retorno", 
		"tipoRetorno", "main", "comandos", "print", "read", "chamFuncs", "listaExpre", 
		"expre", "atribuicao", "testeLogic", "teste1", "teste2", "teste3", "funcMath", 
		"term", "unary", "fator", "controle", "varControl", "opSec", "opPrim", 
		"incrementos"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'!='", "'break'", "'Class'", "'Main'", "';'", "','", "':'", "'('", 
		"')'", "'Int'", "'Float'", "'Bool'", "'Str'", "'!'", "'&&'", "'||'", "'>'", 
		"'<'", "'>='", "'<='", "'=!'", "'=='", "'{'", "'}'", "'*'", "'/'", "'-'", 
		"'+'", "'if'", "'for'", "'else'", "'++'", "'--'", "'print'", "'read'", 
		"'Void'", "'return'", "'final'", "'='", "'true'", "'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "Tk_break", "Tk_Class", "Tk_Main", "Tk_PtVirg", "Tk_Virg", 
		"Tk_DoisPonts", "Tk_AbrePar", "Tk_FechPar", "Tk_Int", "Tk_Float", "Tk_Bool", 
		"Tk_Str", "Tk_Neg", "Tk_E", "TK_OU", "Tk_MaiorQ", "Tk_MenorQ", "Tk_MaiorIgual", 
		"Tk_MenorIgual", "Tk_Dif", "Tk_Igual", "Tk_AbreChaves", "Tk_FechaChaves", 
		"Tk_MULT", "Tk_DIV", "TK_SUB", "Tk_SOMA", "Tk_IF", "Tk_FOR", "Tk_ELSE", 
		"Tk_Incre", "Tk_Decre", "Tk_PRINT", "Tk_READ", "Tk_VOID", "Tk_RETURN", 
		"Tk_FINAL", "Tk_Atribu", "Tk_True", "Tk_False", "ID", "INT", "REAL", "STRING", 
		"COMMENT_LINE", "COMMENT", "WS", "TRUE", "FALSE"
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

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	//   Map <String,Integer> tabSimb = new HashMap<String,Integer>();                 

	public GramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<DecVarsContext> decVars() {
			return getRuleContexts(DecVarsContext.class);
		}
		public DecVarsContext decVars(int i) {
			return getRuleContext(DecVarsContext.class,i);
		}
		public List<DecConstsContext> decConsts() {
			return getRuleContexts(DecConstsContext.class);
		}
		public DecConstsContext decConsts(int i) {
			return getRuleContext(DecConstsContext.class,i);
		}
		public List<DecFuncsContext> decFuncs() {
			return getRuleContexts(DecFuncsContext.class);
		}
		public DecFuncsContext decFuncs(int i) {
			return getRuleContext(DecFuncsContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(Tk_Class);
			setState(69);
			match(ID);
			setState(70);
			match(Tk_PtVirg);
			setState(75);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(73);
					switch (_input.LA(1)) {
					case Tk_Int:
					case Tk_Float:
					case Tk_Bool:
					case Tk_Str:
						{
						setState(71);
						decVars();
						}
						break;
					case Tk_FINAL:
						{
						setState(72);
						decConsts();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(77);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_Int) | (1L << Tk_Float) | (1L << Tk_Bool) | (1L << Tk_Str) | (1L << Tk_VOID))) != 0)) {
				{
				{
				setState(78);
				decFuncs();
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
			main();
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

	public static class DecVarsContext extends ParserRuleContext {
		public TipoContext tipo;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ListaIDsContext listaIDs() {
			return getRuleContext(ListaIDsContext.class,0);
		}
		public DecVarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decVars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDecVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDecVars(this);
		}
	}

	public final DecVarsContext decVars() throws RecognitionException {
		DecVarsContext _localctx = new DecVarsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decVars);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			((DecVarsContext)_localctx).tipo = tipo();
			setState(87);
			match(Tk_DoisPonts);
			setState(88);
			listaIDs(((DecVarsContext)_localctx).tipo.t);
			setState(89);
			match(Tk_PtVirg);
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

	public static class DecVarsFuncContext extends ParserRuleContext {
		public TipoContext tipo;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ListaIDsContext listaIDs() {
			return getRuleContext(ListaIDsContext.class,0);
		}
		public DecVarsFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decVarsFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDecVarsFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDecVarsFunc(this);
		}
	}

	public final DecVarsFuncContext decVarsFunc() throws RecognitionException {
		DecVarsFuncContext _localctx = new DecVarsFuncContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decVarsFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			((DecVarsFuncContext)_localctx).tipo = tipo();
			setState(92);
			match(Tk_DoisPonts);
			setState(93);
			listaIDs(((DecVarsFuncContext)_localctx).tipo.t);
			setState(94);
			match(Tk_PtVirg);
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

	public static class TipoContext extends ParserRuleContext {
		public int t;
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipo);
		try {
			setState(104);
			switch (_input.LA(1)) {
			case Tk_Int:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(Tk_Int);
				((TipoContext)_localctx).t = 1;
				}
				break;
			case Tk_Str:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(Tk_Str);
				((TipoContext)_localctx).t = 2;
				}
				break;
			case Tk_Bool:
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				match(Tk_Bool);
				((TipoContext)_localctx).t = 3;
				}
				break;
			case Tk_Float:
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				match(Tk_Float);
				((TipoContext)_localctx).t = 4;
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

	public static class ListaIDsContext extends ParserRuleContext {
		public int t;
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
		}
		public ListaIDsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ListaIDsContext(ParserRuleContext parent, int invokingState, int t) {
			super(parent, invokingState);
			this.t = t;
		}
		@Override public int getRuleIndex() { return RULE_listaIDs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterListaIDs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitListaIDs(this);
		}
	}

	public final ListaIDsContext listaIDs(int t) throws RecognitionException {
		ListaIDsContext _localctx = new ListaIDsContext(_ctx, getState(), t);
		enterRule(_localctx, 8, RULE_listaIDs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(ID);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_Virg) {
				{
				{
				setState(107);
				match(Tk_Virg);
				setState(108);
				match(ID);
				}
				}
				setState(113);
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

	public static class ListaIDs2Context extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
		}
		public ListaIDs2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaIDs2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterListaIDs2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitListaIDs2(this);
		}
	}

	public final ListaIDs2Context listaIDs2() throws RecognitionException {
		ListaIDs2Context _localctx = new ListaIDs2Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_listaIDs2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(ID);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_Virg) {
				{
				{
				setState(115);
				match(Tk_Virg);
				setState(116);
				match(ID);
				}
				}
				setState(121);
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

	public static class DecConstsContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public DecConstsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decConsts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDecConsts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDecConsts(this);
		}
	}

	public final DecConstsContext decConsts() throws RecognitionException {
		DecConstsContext _localctx = new DecConstsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_decConsts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(Tk_FINAL);
			setState(123);
			tipo();
			setState(124);
			match(ID);
			setState(125);
			match(Tk_Atribu);
			setState(126);
			valor();
			setState(127);
			match(Tk_PtVirg);
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

	public static class DecConstsFuncContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public DecConstsFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decConstsFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDecConstsFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDecConstsFunc(this);
		}
	}

	public final DecConstsFuncContext decConstsFunc() throws RecognitionException {
		DecConstsFuncContext _localctx = new DecConstsFuncContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_decConstsFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(Tk_FINAL);
			setState(130);
			tipo();
			setState(131);
			match(ID);
			setState(132);
			match(Tk_Atribu);
			setState(133);
			valor();
			setState(134);
			match(Tk_PtVirg);
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

	public static class ValorContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GramaticaParser.INT, 0); }
		public TerminalNode REAL() { return getToken(GramaticaParser.REAL, 0); }
		public TerminalNode STRING() { return getToken(GramaticaParser.STRING, 0); }
		public TerminalNode TRUE() { return getToken(GramaticaParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(GramaticaParser.FALSE, 0); }
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitValor(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_valor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << REAL) | (1L << STRING) | (1L << TRUE) | (1L << FALSE))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class DecFuncsContext extends ParserRuleContext {
		public TipoRetornoContext tipoRetorno() {
			return getRuleContext(TipoRetornoContext.class,0);
		}
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public ListaParamContext listaParam() {
			return getRuleContext(ListaParamContext.class,0);
		}
		public List<DecVarsFuncContext> decVarsFunc() {
			return getRuleContexts(DecVarsFuncContext.class);
		}
		public DecVarsFuncContext decVarsFunc(int i) {
			return getRuleContext(DecVarsFuncContext.class,i);
		}
		public List<DecConstsFuncContext> decConstsFunc() {
			return getRuleContexts(DecConstsFuncContext.class);
		}
		public DecConstsFuncContext decConstsFunc(int i) {
			return getRuleContext(DecConstsFuncContext.class,i);
		}
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public DecFuncsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decFuncs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDecFuncs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDecFuncs(this);
		}
	}

	public final DecFuncsContext decFuncs() throws RecognitionException {
		DecFuncsContext _localctx = new DecFuncsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_decFuncs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			tipoRetorno();
			setState(139);
			match(ID);
			setState(140);
			match(Tk_AbrePar);
			setState(141);
			listaParam();
			setState(142);
			match(Tk_FechPar);
			setState(143);
			match(Tk_AbreChaves);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_Int) | (1L << Tk_Float) | (1L << Tk_Bool) | (1L << Tk_Str) | (1L << Tk_FINAL))) != 0)) {
				{
				setState(146);
				switch (_input.LA(1)) {
				case Tk_Int:
				case Tk_Float:
				case Tk_Bool:
				case Tk_Str:
					{
					setState(144);
					decVarsFunc();
					}
					break;
				case Tk_FINAL:
					{
					setState(145);
					decConstsFunc();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_break) | (1L << Tk_IF) | (1L << Tk_FOR) | (1L << Tk_PRINT) | (1L << Tk_READ) | (1L << ID))) != 0)) {
				{
				{
				setState(151);
				comandos();
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(158);
			_la = _input.LA(1);
			if (_la==Tk_RETURN) {
				{
				setState(157);
				retorno();
				}
			}

			setState(160);
			match(Tk_FechaChaves);
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

	public static class ListaParamContext extends ParserRuleContext {
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
		}
		public ListaParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterListaParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitListaParam(this);
		}
	}

	public final ListaParamContext listaParam() throws RecognitionException {
		ListaParamContext _localctx = new ListaParamContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_listaParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_Int) | (1L << Tk_Float) | (1L << Tk_Bool) | (1L << Tk_Str))) != 0)) {
				{
				setState(162);
				tipo();
				setState(163);
				match(ID);
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Tk_Virg) {
					{
					{
					setState(164);
					match(Tk_Virg);
					setState(165);
					tipo();
					setState(166);
					match(ID);
					}
					}
					setState(172);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class RetornoContext extends ParserRuleContext {
		public ExpreContext expre() {
			return getRuleContext(ExpreContext.class,0);
		}
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitRetorno(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_retorno);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(Tk_RETURN);
			setState(177);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_AbrePar) | (1L << Tk_True) | (1L << Tk_False) | (1L << ID) | (1L << INT) | (1L << REAL) | (1L << STRING) | (1L << TRUE) | (1L << FALSE))) != 0)) {
				{
				setState(176);
				expre();
				}
			}

			setState(179);
			match(Tk_PtVirg);
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

	public static class TipoRetornoContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TipoRetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoRetorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterTipoRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitTipoRetorno(this);
		}
	}

	public final TipoRetornoContext tipoRetorno() throws RecognitionException {
		TipoRetornoContext _localctx = new TipoRetornoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tipoRetorno);
		try {
			setState(183);
			switch (_input.LA(1)) {
			case Tk_Int:
			case Tk_Float:
			case Tk_Bool:
			case Tk_Str:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				tipo();
				}
				break;
			case Tk_VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				match(Tk_VOID);
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

	public static class MainContext extends ParserRuleContext {
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(Tk_Main);
			setState(186);
			match(Tk_AbreChaves);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_break) | (1L << Tk_IF) | (1L << Tk_FOR) | (1L << Tk_PRINT) | (1L << Tk_READ) | (1L << ID))) != 0)) {
				{
				{
				setState(187);
				comandos();
				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(193);
			match(Tk_FechaChaves);
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

	public static class ComandosContext extends ParserRuleContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public ChamFuncsContext chamFuncs() {
			return getRuleContext(ChamFuncsContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public ControleContext controle() {
			return getRuleContext(ControleContext.class,0);
		}
		public TerminalNode Tk_break() { return getToken(GramaticaParser.Tk_break, 0); }
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitComandos(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comandos);
		try {
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				print();
				setState(196);
				match(Tk_PtVirg);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				read();
				setState(199);
				match(Tk_PtVirg);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
				chamFuncs();
				setState(202);
				match(Tk_PtVirg);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(204);
				atribuicao();
				setState(205);
				match(Tk_PtVirg);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(207);
				controle();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(208);
				match(Tk_break);
				setState(209);
				match(Tk_PtVirg);
				}
				break;
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

	public static class PrintContext extends ParserRuleContext {
		public ListaExpreContext listaExpre() {
			return getRuleContext(ListaExpreContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(Tk_PRINT);
			setState(213);
			match(Tk_AbrePar);
			setState(215);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_AbrePar) | (1L << Tk_True) | (1L << Tk_False) | (1L << ID) | (1L << INT) | (1L << REAL) | (1L << STRING) | (1L << TRUE) | (1L << FALSE))) != 0)) {
				{
				setState(214);
				listaExpre();
				}
			}

			setState(217);
			match(Tk_FechPar);
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

	public static class ReadContext extends ParserRuleContext {
		public ListaIDs2Context listaIDs2() {
			return getRuleContext(ListaIDs2Context.class,0);
		}
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitRead(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(Tk_READ);
			setState(220);
			match(Tk_AbrePar);
			setState(221);
			listaIDs2();
			setState(222);
			match(Tk_FechPar);
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

	public static class ChamFuncsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public ListaExpreContext listaExpre() {
			return getRuleContext(ListaExpreContext.class,0);
		}
		public ChamFuncsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamFuncs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterChamFuncs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitChamFuncs(this);
		}
	}

	public final ChamFuncsContext chamFuncs() throws RecognitionException {
		ChamFuncsContext _localctx = new ChamFuncsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_chamFuncs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(ID);
			setState(225);
			match(Tk_AbrePar);
			setState(227);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_AbrePar) | (1L << Tk_True) | (1L << Tk_False) | (1L << ID) | (1L << INT) | (1L << REAL) | (1L << STRING) | (1L << TRUE) | (1L << FALSE))) != 0)) {
				{
				setState(226);
				listaExpre();
				}
			}

			setState(229);
			match(Tk_FechPar);
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

	public static class ListaExpreContext extends ParserRuleContext {
		public List<ExpreContext> expre() {
			return getRuleContexts(ExpreContext.class);
		}
		public ExpreContext expre(int i) {
			return getRuleContext(ExpreContext.class,i);
		}
		public ListaExpreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaExpre; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterListaExpre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitListaExpre(this);
		}
	}

	public final ListaExpreContext listaExpre() throws RecognitionException {
		ListaExpreContext _localctx = new ListaExpreContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_listaExpre);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			expre();
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_Virg) {
				{
				{
				setState(232);
				match(Tk_Virg);
				setState(233);
				expre();
				}
				}
				setState(238);
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

	public static class ExpreContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public TesteLogicContext testeLogic() {
			return getRuleContext(TesteLogicContext.class,0);
		}
		public ExpreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expre; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExpre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExpre(this);
		}
	}

	public final ExpreContext expre() throws RecognitionException {
		ExpreContext _localctx = new ExpreContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expre);
		try {
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				valor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
				testeLogic(0);
				}
				break;
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

	public static class AtribuicaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TesteLogicContext testeLogic() {
			return getRuleContext(TesteLogicContext.class,0);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitAtribuicao(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_atribuicao);
		try {
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				match(ID);
				setState(245);
				match(Tk_Atribu);
				setState(246);
				testeLogic(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				match(ID);
				setState(248);
				match(Tk_Incre);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				match(ID);
				setState(250);
				match(Tk_Decre);
				}
				break;
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

	public static class TesteLogicContext extends ParserRuleContext {
		public int t;
		public Teste1Context a;
		public Teste1Context teste1() {
			return getRuleContext(Teste1Context.class,0);
		}
		public TesteLogicContext testeLogic() {
			return getRuleContext(TesteLogicContext.class,0);
		}
		public TesteLogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testeLogic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterTesteLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitTesteLogic(this);
		}
	}

	public final TesteLogicContext testeLogic() throws RecognitionException {
		return testeLogic(0);
	}

	private TesteLogicContext testeLogic(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TesteLogicContext _localctx = new TesteLogicContext(_ctx, _parentState);
		TesteLogicContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_testeLogic, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(254);
			((TesteLogicContext)_localctx).a = teste1(0);
			((TesteLogicContext)_localctx).t =  ((TesteLogicContext)_localctx).a.t;
			}
			_ctx.stop = _input.LT(-1);
			setState(264);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TesteLogicContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_testeLogic);
					setState(257);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(258);
					match(TK_OU);
					setState(259);
					((TesteLogicContext)_localctx).a = teste1(0);
					((TesteLogicContext)_localctx).t =  ((TesteLogicContext)_localctx).a.t;
					}
					} 
				}
				setState(266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class Teste1Context extends ParserRuleContext {
		public int t;
		public Teste2Context a;
		public Teste2Context teste2() {
			return getRuleContext(Teste2Context.class,0);
		}
		public Teste1Context teste1() {
			return getRuleContext(Teste1Context.class,0);
		}
		public Teste1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_teste1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterTeste1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitTeste1(this);
		}
	}

	public final Teste1Context teste1() throws RecognitionException {
		return teste1(0);
	}

	private Teste1Context teste1(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Teste1Context _localctx = new Teste1Context(_ctx, _parentState);
		Teste1Context _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_teste1, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(268);
			((Teste1Context)_localctx).a = teste2(0);
			((Teste1Context)_localctx).t =  ((Teste1Context)_localctx).a.t;
			}
			_ctx.stop = _input.LT(-1);
			setState(278);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Teste1Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_teste1);
					setState(271);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(272);
					match(Tk_E);
					setState(273);
					((Teste1Context)_localctx).a = teste2(0);
					((Teste1Context)_localctx).t =  ((Teste1Context)_localctx).a.t;
					}
					} 
				}
				setState(280);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class Teste2Context extends ParserRuleContext {
		public int t;
		public Teste3Context a;
		public Teste3Context teste3() {
			return getRuleContext(Teste3Context.class,0);
		}
		public Teste2Context teste2() {
			return getRuleContext(Teste2Context.class,0);
		}
		public OpSecContext opSec() {
			return getRuleContext(OpSecContext.class,0);
		}
		public Teste2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_teste2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterTeste2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitTeste2(this);
		}
	}

	public final Teste2Context teste2() throws RecognitionException {
		return teste2(0);
	}

	private Teste2Context teste2(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Teste2Context _localctx = new Teste2Context(_ctx, _parentState);
		Teste2Context _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_teste2, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(282);
			((Teste2Context)_localctx).a = teste3(0);
			((Teste2Context)_localctx).t =  ((Teste2Context)_localctx).a.t;
			}
			_ctx.stop = _input.LT(-1);
			setState(292);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Teste2Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_teste2);
					setState(285);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(286);
					opSec();
					setState(287);
					((Teste2Context)_localctx).a = teste3(0);
					((Teste2Context)_localctx).t =  ((Teste2Context)_localctx).a.t;
					}
					} 
				}
				setState(294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class Teste3Context extends ParserRuleContext {
		public int t;
		public FuncMathContext a;
		public FuncMathContext funcMath() {
			return getRuleContext(FuncMathContext.class,0);
		}
		public Teste3Context teste3() {
			return getRuleContext(Teste3Context.class,0);
		}
		public OpPrimContext opPrim() {
			return getRuleContext(OpPrimContext.class,0);
		}
		public Teste3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_teste3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterTeste3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitTeste3(this);
		}
	}

	public final Teste3Context teste3() throws RecognitionException {
		return teste3(0);
	}

	private Teste3Context teste3(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Teste3Context _localctx = new Teste3Context(_ctx, _parentState);
		Teste3Context _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_teste3, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(296);
			((Teste3Context)_localctx).a = funcMath(0);
			((Teste3Context)_localctx).t =  ((Teste3Context)_localctx).a.t;
			}
			_ctx.stop = _input.LT(-1);
			setState(306);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Teste3Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_teste3);
					setState(299);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(300);
					opPrim();
					setState(301);
					((Teste3Context)_localctx).a = funcMath(0);
					((Teste3Context)_localctx).t =  ((Teste3Context)_localctx).a.t;
					}
					} 
				}
				setState(308);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	public static class FuncMathContext extends ParserRuleContext {
		public int t;
		public TermContext a;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public FuncMathContext funcMath() {
			return getRuleContext(FuncMathContext.class,0);
		}
		public FuncMathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcMath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterFuncMath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitFuncMath(this);
		}
	}

	public final FuncMathContext funcMath() throws RecognitionException {
		return funcMath(0);
	}

	private FuncMathContext funcMath(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FuncMathContext _localctx = new FuncMathContext(_ctx, _parentState);
		FuncMathContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_funcMath, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(310);
			((FuncMathContext)_localctx).a = term(0);
			((FuncMathContext)_localctx).t =  ((FuncMathContext)_localctx).a.t;
			}
			_ctx.stop = _input.LT(-1);
			setState(320);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FuncMathContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_funcMath);
					setState(313);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(314);
					_la = _input.LA(1);
					if ( !(_la==TK_SUB || _la==Tk_SOMA) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(315);
					((FuncMathContext)_localctx).a = term(0);
					((FuncMathContext)_localctx).t =  ((FuncMathContext)_localctx).a.t;
					}
					} 
				}
				setState(322);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	public static class TermContext extends ParserRuleContext {
		public int t;
		public FatorContext a;
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_term, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(324);
			((TermContext)_localctx).a = fator();
			((TermContext)_localctx).t =  ((TermContext)_localctx).a.t;
			}
			_ctx.stop = _input.LT(-1);
			setState(334);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TermContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(327);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(328);
					_la = _input.LA(1);
					if ( !(_la==Tk_MULT || _la==Tk_DIV) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(329);
					((TermContext)_localctx).a = fator();
					((TermContext)_localctx).t =  ((TermContext)_localctx).a.t;
					}
					} 
				}
				setState(336);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	public static class UnaryContext extends ParserRuleContext {
		public int t;
		public FatorContext a;
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitUnary(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_unary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			_la = _input.LA(1);
			if (_la==Tk_Neg || _la==TK_SUB) {
				{
				setState(337);
				_la = _input.LA(1);
				if ( !(_la==Tk_Neg || _la==TK_SUB) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(340);
			((UnaryContext)_localctx).a = fator();
			((UnaryContext)_localctx).t =  ((UnaryContext)_localctx).a.t;
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

	public static class FatorContext extends ParserRuleContext {
		public int t;
		public TesteLogicContext testeLogic() {
			return getRuleContext(TesteLogicContext.class,0);
		}
		public TerminalNode INT() { return getToken(GramaticaParser.INT, 0); }
		public TerminalNode REAL() { return getToken(GramaticaParser.REAL, 0); }
		public TerminalNode Tk_True() { return getToken(GramaticaParser.Tk_True, 0); }
		public TerminalNode Tk_False() { return getToken(GramaticaParser.Tk_False, 0); }
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode STRING() { return getToken(GramaticaParser.STRING, 0); }
		public ChamFuncsContext chamFuncs() {
			return getRuleContext(ChamFuncsContext.class,0);
		}
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitFator(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_fator);
		try {
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				match(Tk_AbrePar);
				setState(344);
				testeLogic(0);
				setState(345);
				match(Tk_FechPar);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				match(INT);
				((FatorContext)_localctx).t =  1;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(349);
				match(REAL);
				((FatorContext)_localctx).t =  4;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(351);
				match(Tk_True);
				((FatorContext)_localctx).t =  3;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(353);
				match(Tk_False);
				((FatorContext)_localctx).t =  3;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(355);
				match(ID);
				((FatorContext)_localctx).t =  5;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(357);
				match(STRING);
				((FatorContext)_localctx).t =  2;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(359);
				chamFuncs();
				}
				break;
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

	public static class ControleContext extends ParserRuleContext {
		public TesteLogicContext testeLogic() {
			return getRuleContext(TesteLogicContext.class,0);
		}
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public List<RetornoContext> retorno() {
			return getRuleContexts(RetornoContext.class);
		}
		public RetornoContext retorno(int i) {
			return getRuleContext(RetornoContext.class,i);
		}
		public VarControlContext varControl() {
			return getRuleContext(VarControlContext.class,0);
		}
		public IncrementosContext incrementos() {
			return getRuleContext(IncrementosContext.class,0);
		}
		public ControleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterControle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitControle(this);
		}
	}

	public final ControleContext controle() throws RecognitionException {
		ControleContext _localctx = new ControleContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_controle);
		int _la;
		try {
			setState(412);
			switch (_input.LA(1)) {
			case Tk_IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				match(Tk_IF);
				setState(363);
				match(Tk_AbrePar);
				setState(364);
				testeLogic(0);
				setState(365);
				match(Tk_FechPar);
				setState(366);
				match(Tk_AbreChaves);
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_break) | (1L << Tk_IF) | (1L << Tk_FOR) | (1L << Tk_PRINT) | (1L << Tk_READ) | (1L << ID))) != 0)) {
					{
					{
					setState(367);
					comandos();
					}
					}
					setState(372);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(374);
				_la = _input.LA(1);
				if (_la==Tk_RETURN) {
					{
					setState(373);
					retorno();
					}
				}

				setState(376);
				match(Tk_FechaChaves);
				setState(389);
				_la = _input.LA(1);
				if (_la==Tk_ELSE) {
					{
					setState(377);
					match(Tk_ELSE);
					setState(378);
					match(Tk_AbreChaves);
					setState(382);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_break) | (1L << Tk_IF) | (1L << Tk_FOR) | (1L << Tk_PRINT) | (1L << Tk_READ) | (1L << ID))) != 0)) {
						{
						{
						setState(379);
						comandos();
						}
						}
						setState(384);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(386);
					_la = _input.LA(1);
					if (_la==Tk_RETURN) {
						{
						setState(385);
						retorno();
						}
					}

					setState(388);
					match(Tk_FechaChaves);
					}
				}

				}
				break;
			case Tk_FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
				match(Tk_FOR);
				setState(392);
				match(Tk_AbrePar);
				setState(394);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(393);
					varControl();
					}
				}

				setState(396);
				match(Tk_PtVirg);
				setState(397);
				testeLogic(0);
				setState(398);
				match(Tk_PtVirg);
				setState(400);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(399);
					incrementos();
					}
				}

				setState(402);
				match(Tk_FechPar);
				setState(403);
				match(Tk_AbreChaves);
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_break) | (1L << Tk_IF) | (1L << Tk_FOR) | (1L << Tk_PRINT) | (1L << Tk_READ) | (1L << ID))) != 0)) {
					{
					{
					setState(404);
					comandos();
					}
					}
					setState(409);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(410);
				match(Tk_FechaChaves);
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

	public static class VarControlContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
		}
		public List<TerminalNode> INT() { return getTokens(GramaticaParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GramaticaParser.INT, i);
		}
		public VarControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterVarControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitVarControl(this);
		}
	}

	public final VarControlContext varControl() throws RecognitionException {
		VarControlContext _localctx = new VarControlContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_varControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(414);
			match(ID);
			setState(415);
			match(Tk_Atribu);
			setState(416);
			match(INT);
			}
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_Virg) {
				{
				{
				setState(418);
				match(Tk_Virg);
				{
				setState(419);
				match(ID);
				setState(420);
				match(Tk_Atribu);
				setState(421);
				match(INT);
				}
				}
				}
				setState(426);
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

	public static class OpSecContext extends ParserRuleContext {
		public OpSecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opSec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterOpSec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitOpSec(this);
		}
	}

	public final OpSecContext opSec() throws RecognitionException {
		OpSecContext _localctx = new OpSecContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_opSec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_MaiorQ) | (1L << Tk_MenorQ) | (1L << Tk_MaiorIgual) | (1L << Tk_MenorIgual))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class OpPrimContext extends ParserRuleContext {
		public OpPrimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opPrim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterOpPrim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitOpPrim(this);
		}
	}

	public final OpPrimContext opPrim() throws RecognitionException {
		OpPrimContext _localctx = new OpPrimContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_opPrim);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==Tk_Igual) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class IncrementosContext extends ParserRuleContext {
		public List<AtribuicaoContext> atribuicao() {
			return getRuleContexts(AtribuicaoContext.class);
		}
		public AtribuicaoContext atribuicao(int i) {
			return getRuleContext(AtribuicaoContext.class,i);
		}
		public IncrementosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incrementos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterIncrementos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitIncrementos(this);
		}
	}

	public final IncrementosContext incrementos() throws RecognitionException {
		IncrementosContext _localctx = new IncrementosContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_incrementos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(431);
			atribuicao();
			}
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_Virg) {
				{
				{
				setState(432);
				match(Tk_Virg);
				setState(433);
				atribuicao();
				}
				}
				setState(438);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 21:
			return testeLogic_sempred((TesteLogicContext)_localctx, predIndex);
		case 22:
			return teste1_sempred((Teste1Context)_localctx, predIndex);
		case 23:
			return teste2_sempred((Teste2Context)_localctx, predIndex);
		case 24:
			return teste3_sempred((Teste3Context)_localctx, predIndex);
		case 25:
			return funcMath_sempred((FuncMathContext)_localctx, predIndex);
		case 26:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean testeLogic_sempred(TesteLogicContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean teste1_sempred(Teste1Context _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean teste2_sempred(Teste2Context _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean teste3_sempred(Teste3Context _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean funcMath_sempred(FuncMathContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\64\u01ba\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\2\7\2L\n\2\f\2\16\2O\13\2\3\2\7\2"+
		"R\n\2\f\2\16\2U\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5k\n\5\3\6\3\6\3\6\7\6p\n\6\f\6\16\6"+
		"s\13\6\3\7\3\7\3\7\7\7x\n\7\f\7\16\7{\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\7\13\u0095\n\13\f\13\16\13\u0098\13\13\3\13\7\13\u009b\n\13\f\13"+
		"\16\13\u009e\13\13\3\13\5\13\u00a1\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\7\f\u00ab\n\f\f\f\16\f\u00ae\13\f\5\f\u00b0\n\f\3\r\3\r\5\r\u00b4"+
		"\n\r\3\r\3\r\3\16\3\16\5\16\u00ba\n\16\3\17\3\17\3\17\7\17\u00bf\n\17"+
		"\f\17\16\17\u00c2\13\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00d5\n\20\3\21\3\21\3\21"+
		"\5\21\u00da\n\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\5\23"+
		"\u00e6\n\23\3\23\3\23\3\24\3\24\3\24\7\24\u00ed\n\24\f\24\16\24\u00f0"+
		"\13\24\3\25\3\25\3\25\5\25\u00f5\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\5\26\u00fe\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27"+
		"\u0109\n\27\f\27\16\27\u010c\13\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\7\30\u0117\n\30\f\30\16\30\u011a\13\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\7\31\u0125\n\31\f\31\16\31\u0128\13\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0133\n\32\f\32\16\32\u0136"+
		"\13\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u0141\n\33\f"+
		"\33\16\33\u0144\13\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34"+
		"\u014f\n\34\f\34\16\34\u0152\13\34\3\35\5\35\u0155\n\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\5\36\u016b\n\36\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0173"+
		"\n\37\f\37\16\37\u0176\13\37\3\37\5\37\u0179\n\37\3\37\3\37\3\37\3\37"+
		"\7\37\u017f\n\37\f\37\16\37\u0182\13\37\3\37\5\37\u0185\n\37\3\37\5\37"+
		"\u0188\n\37\3\37\3\37\3\37\5\37\u018d\n\37\3\37\3\37\3\37\3\37\5\37\u0193"+
		"\n\37\3\37\3\37\3\37\7\37\u0198\n\37\f\37\16\37\u019b\13\37\3\37\3\37"+
		"\5\37\u019f\n\37\3 \3 \3 \3 \3 \3 \3 \3 \7 \u01a9\n \f \16 \u01ac\13 "+
		"\3!\3!\3\"\3\"\3#\3#\3#\7#\u01b5\n#\f#\16#\u01b8\13#\3#\2\b,.\60\62\64"+
		"\66$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@"+
		"BD\2\b\4\2-/\63\64\3\2\35\36\3\2\33\34\4\2\20\20\35\35\3\2\23\26\4\2\3"+
		"\3\30\30\u01cd\2F\3\2\2\2\4X\3\2\2\2\6]\3\2\2\2\bj\3\2\2\2\nl\3\2\2\2"+
		"\ft\3\2\2\2\16|\3\2\2\2\20\u0083\3\2\2\2\22\u008a\3\2\2\2\24\u008c\3\2"+
		"\2\2\26\u00af\3\2\2\2\30\u00b1\3\2\2\2\32\u00b9\3\2\2\2\34\u00bb\3\2\2"+
		"\2\36\u00d4\3\2\2\2 \u00d6\3\2\2\2\"\u00dd\3\2\2\2$\u00e2\3\2\2\2&\u00e9"+
		"\3\2\2\2(\u00f4\3\2\2\2*\u00fd\3\2\2\2,\u00ff\3\2\2\2.\u010d\3\2\2\2\60"+
		"\u011b\3\2\2\2\62\u0129\3\2\2\2\64\u0137\3\2\2\2\66\u0145\3\2\2\28\u0154"+
		"\3\2\2\2:\u016a\3\2\2\2<\u019e\3\2\2\2>\u01a0\3\2\2\2@\u01ad\3\2\2\2B"+
		"\u01af\3\2\2\2D\u01b1\3\2\2\2FG\7\5\2\2GH\7,\2\2HM\7\7\2\2IL\5\4\3\2J"+
		"L\5\16\b\2KI\3\2\2\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NS\3\2\2\2"+
		"OM\3\2\2\2PR\5\24\13\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2"+
		"\2US\3\2\2\2VW\5\34\17\2W\3\3\2\2\2XY\5\b\5\2YZ\7\t\2\2Z[\5\n\6\2[\\\7"+
		"\7\2\2\\\5\3\2\2\2]^\5\b\5\2^_\7\t\2\2_`\5\n\6\2`a\7\7\2\2a\7\3\2\2\2"+
		"bc\7\f\2\2ck\b\5\1\2de\7\17\2\2ek\b\5\1\2fg\7\16\2\2gk\b\5\1\2hi\7\r\2"+
		"\2ik\b\5\1\2jb\3\2\2\2jd\3\2\2\2jf\3\2\2\2jh\3\2\2\2k\t\3\2\2\2lq\7,\2"+
		"\2mn\7\b\2\2np\7,\2\2om\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\13\3\2"+
		"\2\2sq\3\2\2\2ty\7,\2\2uv\7\b\2\2vx\7,\2\2wu\3\2\2\2x{\3\2\2\2yw\3\2\2"+
		"\2yz\3\2\2\2z\r\3\2\2\2{y\3\2\2\2|}\7(\2\2}~\5\b\5\2~\177\7,\2\2\177\u0080"+
		"\7)\2\2\u0080\u0081\5\22\n\2\u0081\u0082\7\7\2\2\u0082\17\3\2\2\2\u0083"+
		"\u0084\7(\2\2\u0084\u0085\5\b\5\2\u0085\u0086\7,\2\2\u0086\u0087\7)\2"+
		"\2\u0087\u0088\5\22\n\2\u0088\u0089\7\7\2\2\u0089\21\3\2\2\2\u008a\u008b"+
		"\t\2\2\2\u008b\23\3\2\2\2\u008c\u008d\5\32\16\2\u008d\u008e\7,\2\2\u008e"+
		"\u008f\7\n\2\2\u008f\u0090\5\26\f\2\u0090\u0091\7\13\2\2\u0091\u0096\7"+
		"\31\2\2\u0092\u0095\5\6\4\2\u0093\u0095\5\20\t\2\u0094\u0092\3\2\2\2\u0094"+
		"\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097\u009c\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009b\5\36\20\2\u009a"+
		"\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a1\5\30\r\2\u00a0"+
		"\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\7\32"+
		"\2\2\u00a3\25\3\2\2\2\u00a4\u00a5\5\b\5\2\u00a5\u00ac\7,\2\2\u00a6\u00a7"+
		"\7\b\2\2\u00a7\u00a8\5\b\5\2\u00a8\u00a9\7,\2\2\u00a9\u00ab\3\2\2\2\u00aa"+
		"\u00a6\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00a4\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\27\3\2\2\2\u00b1\u00b3\7\'\2\2\u00b2\u00b4\5(\25"+
		"\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6"+
		"\7\7\2\2\u00b6\31\3\2\2\2\u00b7\u00ba\5\b\5\2\u00b8\u00ba\7&\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\33\3\2\2\2\u00bb\u00bc\7\6\2"+
		"\2\u00bc\u00c0\7\31\2\2\u00bd\u00bf\5\36\20\2\u00be\u00bd\3\2\2\2\u00bf"+
		"\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2"+
		"\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\7\32\2\2\u00c4\35\3\2\2\2\u00c5\u00c6"+
		"\5 \21\2\u00c6\u00c7\7\7\2\2\u00c7\u00d5\3\2\2\2\u00c8\u00c9\5\"\22\2"+
		"\u00c9\u00ca\7\7\2\2\u00ca\u00d5\3\2\2\2\u00cb\u00cc\5$\23\2\u00cc\u00cd"+
		"\7\7\2\2\u00cd\u00d5\3\2\2\2\u00ce\u00cf\5*\26\2\u00cf\u00d0\7\7\2\2\u00d0"+
		"\u00d5\3\2\2\2\u00d1\u00d5\5<\37\2\u00d2\u00d3\7\4\2\2\u00d3\u00d5\7\7"+
		"\2\2\u00d4\u00c5\3\2\2\2\u00d4\u00c8\3\2\2\2\u00d4\u00cb\3\2\2\2\u00d4"+
		"\u00ce\3\2\2\2\u00d4\u00d1\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\37\3\2\2"+
		"\2\u00d6\u00d7\7$\2\2\u00d7\u00d9\7\n\2\2\u00d8\u00da\5&\24\2\u00d9\u00d8"+
		"\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\7\13\2\2"+
		"\u00dc!\3\2\2\2\u00dd\u00de\7%\2\2\u00de\u00df\7\n\2\2\u00df\u00e0\5\f"+
		"\7\2\u00e0\u00e1\7\13\2\2\u00e1#\3\2\2\2\u00e2\u00e3\7,\2\2\u00e3\u00e5"+
		"\7\n\2\2\u00e4\u00e6\5&\24\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7\u00e8\7\13\2\2\u00e8%\3\2\2\2\u00e9\u00ee\5(\25\2"+
		"\u00ea\u00eb\7\b\2\2\u00eb\u00ed\5(\25\2\u00ec\u00ea\3\2\2\2\u00ed\u00f0"+
		"\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\'\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f1\u00f5\7,\2\2\u00f2\u00f5\5\22\n\2\u00f3\u00f5\5,"+
		"\27\2\u00f4\u00f1\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5"+
		")\3\2\2\2\u00f6\u00f7\7,\2\2\u00f7\u00f8\7)\2\2\u00f8\u00fe\5,\27\2\u00f9"+
		"\u00fa\7,\2\2\u00fa\u00fe\7\"\2\2\u00fb\u00fc\7,\2\2\u00fc\u00fe\7#\2"+
		"\2\u00fd\u00f6\3\2\2\2\u00fd\u00f9\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe+"+
		"\3\2\2\2\u00ff\u0100\b\27\1\2\u0100\u0101\5.\30\2\u0101\u0102\b\27\1\2"+
		"\u0102\u010a\3\2\2\2\u0103\u0104\f\4\2\2\u0104\u0105\7\22\2\2\u0105\u0106"+
		"\5.\30\2\u0106\u0107\b\27\1\2\u0107\u0109\3\2\2\2\u0108\u0103\3\2\2\2"+
		"\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b-\3"+
		"\2\2\2\u010c\u010a\3\2\2\2\u010d\u010e\b\30\1\2\u010e\u010f\5\60\31\2"+
		"\u010f\u0110\b\30\1\2\u0110\u0118\3\2\2\2\u0111\u0112\f\4\2\2\u0112\u0113"+
		"\7\21\2\2\u0113\u0114\5\60\31\2\u0114\u0115\b\30\1\2\u0115\u0117\3\2\2"+
		"\2\u0116\u0111\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119"+
		"\3\2\2\2\u0119/\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011c\b\31\1\2\u011c"+
		"\u011d\5\62\32\2\u011d\u011e\b\31\1\2\u011e\u0126\3\2\2\2\u011f\u0120"+
		"\f\4\2\2\u0120\u0121\5@!\2\u0121\u0122\5\62\32\2\u0122\u0123\b\31\1\2"+
		"\u0123\u0125\3\2\2\2\u0124\u011f\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124"+
		"\3\2\2\2\u0126\u0127\3\2\2\2\u0127\61\3\2\2\2\u0128\u0126\3\2\2\2\u0129"+
		"\u012a\b\32\1\2\u012a\u012b\5\64\33\2\u012b\u012c\b\32\1\2\u012c\u0134"+
		"\3\2\2\2\u012d\u012e\f\4\2\2\u012e\u012f\5B\"\2\u012f\u0130\5\64\33\2"+
		"\u0130\u0131\b\32\1\2\u0131\u0133\3\2\2\2\u0132\u012d\3\2\2\2\u0133\u0136"+
		"\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\63\3\2\2\2\u0136"+
		"\u0134\3\2\2\2\u0137\u0138\b\33\1\2\u0138\u0139\5\66\34\2\u0139\u013a"+
		"\b\33\1\2\u013a\u0142\3\2\2\2\u013b\u013c\f\4\2\2\u013c\u013d\t\3\2\2"+
		"\u013d\u013e\5\66\34\2\u013e\u013f\b\33\1\2\u013f\u0141\3\2\2\2\u0140"+
		"\u013b\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2"+
		"\2\2\u0143\65\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0146\b\34\1\2\u0146\u0147"+
		"\5:\36\2\u0147\u0148\b\34\1\2\u0148\u0150\3\2\2\2\u0149\u014a\f\4\2\2"+
		"\u014a\u014b\t\4\2\2\u014b\u014c\5:\36\2\u014c\u014d\b\34\1\2\u014d\u014f"+
		"\3\2\2\2\u014e\u0149\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150"+
		"\u0151\3\2\2\2\u0151\67\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u0155\t\5\2"+
		"\2\u0154\u0153\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157"+
		"\5:\36\2\u0157\u0158\b\35\1\2\u01589\3\2\2\2\u0159\u015a\7\n\2\2\u015a"+
		"\u015b\5,\27\2\u015b\u015c\7\13\2\2\u015c\u016b\3\2\2\2\u015d\u015e\7"+
		"-\2\2\u015e\u016b\b\36\1\2\u015f\u0160\7.\2\2\u0160\u016b\b\36\1\2\u0161"+
		"\u0162\7*\2\2\u0162\u016b\b\36\1\2\u0163\u0164\7+\2\2\u0164\u016b\b\36"+
		"\1\2\u0165\u0166\7,\2\2\u0166\u016b\b\36\1\2\u0167\u0168\7/\2\2\u0168"+
		"\u016b\b\36\1\2\u0169\u016b\5$\23\2\u016a\u0159\3\2\2\2\u016a\u015d\3"+
		"\2\2\2\u016a\u015f\3\2\2\2\u016a\u0161\3\2\2\2\u016a\u0163\3\2\2\2\u016a"+
		"\u0165\3\2\2\2\u016a\u0167\3\2\2\2\u016a\u0169\3\2\2\2\u016b;\3\2\2\2"+
		"\u016c\u016d\7\37\2\2\u016d\u016e\7\n\2\2\u016e\u016f\5,\27\2\u016f\u0170"+
		"\7\13\2\2\u0170\u0174\7\31\2\2\u0171\u0173\5\36\20\2\u0172\u0171\3\2\2"+
		"\2\u0173\u0176\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0178"+
		"\3\2\2\2\u0176\u0174\3\2\2\2\u0177\u0179\5\30\r\2\u0178\u0177\3\2\2\2"+
		"\u0178\u0179\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u0187\7\32\2\2\u017b\u017c"+
		"\7!\2\2\u017c\u0180\7\31\2\2\u017d\u017f\5\36\20\2\u017e\u017d\3\2\2\2"+
		"\u017f\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0184"+
		"\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u0185\5\30\r\2\u0184\u0183\3\2\2\2"+
		"\u0184\u0185\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0188\7\32\2\2\u0187\u017b"+
		"\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u019f\3\2\2\2\u0189\u018a\7 \2\2\u018a"+
		"\u018c\7\n\2\2\u018b\u018d\5> \2\u018c\u018b\3\2\2\2\u018c\u018d\3\2\2"+
		"\2\u018d\u018e\3\2\2\2\u018e\u018f\7\7\2\2\u018f\u0190\5,\27\2\u0190\u0192"+
		"\7\7\2\2\u0191\u0193\5D#\2\u0192\u0191\3\2\2\2\u0192\u0193\3\2\2\2\u0193"+
		"\u0194\3\2\2\2\u0194\u0195\7\13\2\2\u0195\u0199\7\31\2\2\u0196\u0198\5"+
		"\36\20\2\u0197\u0196\3\2\2\2\u0198\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u0199"+
		"\u019a\3\2\2\2\u019a\u019c\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u019d\7\32"+
		"\2\2\u019d\u019f\3\2\2\2\u019e\u016c\3\2\2\2\u019e\u0189\3\2\2\2\u019f"+
		"=\3\2\2\2\u01a0\u01a1\7,\2\2\u01a1\u01a2\7)\2\2\u01a2\u01a3\7-\2\2\u01a3"+
		"\u01aa\3\2\2\2\u01a4\u01a5\7\b\2\2\u01a5\u01a6\7,\2\2\u01a6\u01a7\7)\2"+
		"\2\u01a7\u01a9\7-\2\2\u01a8\u01a4\3\2\2\2\u01a9\u01ac\3\2\2\2\u01aa\u01a8"+
		"\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab?\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad"+
		"\u01ae\t\6\2\2\u01aeA\3\2\2\2\u01af\u01b0\t\7\2\2\u01b0C\3\2\2\2\u01b1"+
		"\u01b6\5*\26\2\u01b2\u01b3\7\b\2\2\u01b3\u01b5\5*\26\2\u01b4\u01b2\3\2"+
		"\2\2\u01b5\u01b8\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7"+
		"E\3\2\2\2\u01b8\u01b6\3\2\2\2*KMSjqy\u0094\u0096\u009c\u00a0\u00ac\u00af"+
		"\u00b3\u00b9\u00c0\u00d4\u00d9\u00e5\u00ee\u00f4\u00fd\u010a\u0118\u0126"+
		"\u0134\u0142\u0150\u0154\u016a\u0174\u0178\u0180\u0184\u0187\u018c\u0192"+
		"\u0199\u019e\u01aa\u01b6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}