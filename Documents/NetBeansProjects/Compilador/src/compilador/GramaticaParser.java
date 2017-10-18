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
		Tk_Class=1, Tk_Main=2, Tk_PtVirg=3, Tk_Virg=4, Tk_DoisPonts=5, Tk_AbrePar=6, 
		Tk_FechPar=7, Tk_Int=8, Tk_Float=9, Tk_Bool=10, Tk_Str=11, Tk_Neg=12, 
		Tk_E=13, TK_OU=14, Tk_MaiorQ=15, Tk_MenorQ=16, Tk_MaiorIgual=17, Tk_MenorIgual=18, 
		Tk_Dif=19, Tk_Igual=20, Tk_AbreChaves=21, Tk_FechaChaves=22, Tk_MULT=23, 
		Tk_DIV=24, TK_SUB=25, Tk_SOMA=26, Tk_IF=27, Tk_FOR=28, Tk_ELSE=29, Tk_Incre=30, 
		Tk_Decre=31, Tk_PRINT=32, Tk_READ=33, Tk_VOID=34, Tk_RETURN=35, Tk_FINAL=36, 
		Tk_Atribu=37, Tk_True=38, Tk_False=39, ID=40, INT=41, REAL=42, STRING=43, 
		COMMENT_LINE=44, COMMENT=45, WS=46, TRUE=47, FALSE=48;
	public static final int
		RULE_programa = 0, RULE_decVars = 1, RULE_tipo = 2, RULE_listaIDs = 3, 
		RULE_decConsts = 4, RULE_valor = 5, RULE_decFuncs = 6, RULE_listaParam = 7, 
		RULE_retorno = 8, RULE_tipoRetorno = 9, RULE_main = 10, RULE_comandos = 11, 
		RULE_print = 12, RULE_read = 13, RULE_chamFuncs = 14, RULE_listaExpre = 15, 
		RULE_expre = 16, RULE_atribuicao = 17, RULE_testeLogic = 18, RULE_teste1 = 19, 
		RULE_teste2 = 20, RULE_teste3 = 21, RULE_funcMath = 22, RULE_term = 23, 
		RULE_unary = 24, RULE_fator = 25, RULE_controle = 26, RULE_varControl = 27, 
		RULE_opSec = 28, RULE_opPrim = 29, RULE_incrementos = 30;
	public static final String[] ruleNames = {
		"programa", "decVars", "tipo", "listaIDs", "decConsts", "valor", "decFuncs", 
		"listaParam", "retorno", "tipoRetorno", "main", "comandos", "print", "read", 
		"chamFuncs", "listaExpre", "expre", "atribuicao", "testeLogic", "teste1", 
		"teste2", "teste3", "funcMath", "term", "unary", "fator", "controle", 
		"varControl", "opSec", "opPrim", "incrementos"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Class'", "'Main'", "';'", "','", "':'", "'('", "')'", "'Int'", 
		"'Float'", "'Bool'", "'Str'", "'!'", "'&&'", "'||'", "'>'", "'<'", "'>='", 
		"'<='", "'=!'", "'=='", "'{'", "'}'", "'*'", "'/'", "'-'", "'+'", "'if'", 
		"'for'", "'else'", "'++'", "'--'", "'print'", "'read'", "'Void'", "'return'", 
		"'final'", "'='", "'true'", "'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Tk_Class", "Tk_Main", "Tk_PtVirg", "Tk_Virg", "Tk_DoisPonts", "Tk_AbrePar", 
		"Tk_FechPar", "Tk_Int", "Tk_Float", "Tk_Bool", "Tk_Str", "Tk_Neg", "Tk_E", 
		"TK_OU", "Tk_MaiorQ", "Tk_MenorQ", "Tk_MaiorIgual", "Tk_MenorIgual", "Tk_Dif", 
		"Tk_Igual", "Tk_AbreChaves", "Tk_FechaChaves", "Tk_MULT", "Tk_DIV", "TK_SUB", 
		"Tk_SOMA", "Tk_IF", "Tk_FOR", "Tk_ELSE", "Tk_Incre", "Tk_Decre", "Tk_PRINT", 
		"Tk_READ", "Tk_VOID", "Tk_RETURN", "Tk_FINAL", "Tk_Atribu", "Tk_True", 
		"Tk_False", "ID", "INT", "REAL", "STRING", "COMMENT_LINE", "COMMENT", 
		"WS", "TRUE", "FALSE"
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
			setState(62);
			match(Tk_Class);
			setState(63);
			match(ID);
			setState(64);
			match(Tk_PtVirg);
			setState(69);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(67);
					switch (_input.LA(1)) {
					case Tk_Int:
					case Tk_Float:
					case Tk_Bool:
					case Tk_Str:
						{
						setState(65);
						decVars();
						}
						break;
					case Tk_FINAL:
						{
						setState(66);
						decConsts();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(71);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_Int) | (1L << Tk_Float) | (1L << Tk_Bool) | (1L << Tk_Str) | (1L << Tk_VOID))) != 0)) {
				{
				{
				setState(72);
				decFuncs();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
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
			setState(80);
			tipo();
			setState(81);
			match(Tk_DoisPonts);
			setState(82);
			listaIDs();
			setState(83);
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
		enterRule(_localctx, 4, RULE_tipo);
		try {
			setState(93);
			switch (_input.LA(1)) {
			case Tk_Int:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(Tk_Int);
				((TipoContext)_localctx).t = 1;
				}
				break;
			case Tk_Str:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(Tk_Str);
				((TipoContext)_localctx).t = 2;
				}
				break;
			case Tk_Bool:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				match(Tk_Bool);
				((TipoContext)_localctx).t = 3;
				}
				break;
			case Tk_Float:
				enterOuterAlt(_localctx, 4);
				{
				setState(91);
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
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
		}
		public ListaIDsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final ListaIDsContext listaIDs() throws RecognitionException {
		ListaIDsContext _localctx = new ListaIDsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_listaIDs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(ID);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_Virg) {
				{
				{
				setState(96);
				match(Tk_Virg);
				setState(97);
				match(ID);
				}
				}
				setState(102);
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
		enterRule(_localctx, 8, RULE_decConsts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(Tk_FINAL);
			setState(104);
			tipo();
			setState(105);
			match(ID);
			setState(106);
			match(Tk_Atribu);
			setState(107);
			valor();
			setState(108);
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
		enterRule(_localctx, 10, RULE_valor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
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
		enterRule(_localctx, 12, RULE_decFuncs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			tipoRetorno();
			setState(113);
			match(ID);
			setState(114);
			match(Tk_AbrePar);
			setState(115);
			listaParam();
			setState(116);
			match(Tk_FechPar);
			setState(117);
			match(Tk_AbreChaves);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_Int) | (1L << Tk_Float) | (1L << Tk_Bool) | (1L << Tk_Str) | (1L << Tk_FINAL))) != 0)) {
				{
				setState(120);
				switch (_input.LA(1)) {
				case Tk_Int:
				case Tk_Float:
				case Tk_Bool:
				case Tk_Str:
					{
					setState(118);
					decVars();
					}
					break;
				case Tk_FINAL:
					{
					setState(119);
					decConsts();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_IF) | (1L << Tk_FOR) | (1L << Tk_PRINT) | (1L << Tk_READ) | (1L << ID))) != 0)) {
				{
				{
				setState(125);
				comandos();
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132);
			_la = _input.LA(1);
			if (_la==Tk_RETURN) {
				{
				setState(131);
				retorno();
				}
			}

			setState(134);
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
		enterRule(_localctx, 14, RULE_listaParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_Int) | (1L << Tk_Float) | (1L << Tk_Bool) | (1L << Tk_Str))) != 0)) {
				{
				setState(136);
				tipo();
				setState(137);
				match(ID);
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Tk_Virg) {
					{
					{
					setState(138);
					match(Tk_Virg);
					setState(139);
					tipo();
					setState(140);
					match(ID);
					}
					}
					setState(146);
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
		enterRule(_localctx, 16, RULE_retorno);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(Tk_RETURN);
			setState(151);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_AbrePar) | (1L << Tk_True) | (1L << Tk_False) | (1L << ID) | (1L << INT) | (1L << REAL) | (1L << STRING) | (1L << TRUE) | (1L << FALSE))) != 0)) {
				{
				setState(150);
				expre();
				}
			}

			setState(153);
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
		enterRule(_localctx, 18, RULE_tipoRetorno);
		try {
			setState(157);
			switch (_input.LA(1)) {
			case Tk_Int:
			case Tk_Float:
			case Tk_Bool:
			case Tk_Str:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				tipo();
				}
				break;
			case Tk_VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
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
		enterRule(_localctx, 20, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(Tk_Main);
			setState(160);
			match(Tk_AbreChaves);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_IF) | (1L << Tk_FOR) | (1L << Tk_PRINT) | (1L << Tk_READ) | (1L << ID))) != 0)) {
				{
				{
				setState(161);
				comandos();
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(167);
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
		enterRule(_localctx, 22, RULE_comandos);
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				print();
				setState(170);
				match(Tk_PtVirg);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				read();
				setState(173);
				match(Tk_PtVirg);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				chamFuncs();
				setState(176);
				match(Tk_PtVirg);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(178);
				atribuicao();
				setState(179);
				match(Tk_PtVirg);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(181);
				controle();
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
		enterRule(_localctx, 24, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(Tk_PRINT);
			setState(185);
			match(Tk_AbrePar);
			setState(187);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_AbrePar) | (1L << Tk_True) | (1L << Tk_False) | (1L << ID) | (1L << INT) | (1L << REAL) | (1L << STRING) | (1L << TRUE) | (1L << FALSE))) != 0)) {
				{
				setState(186);
				listaExpre();
				}
			}

			setState(189);
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
		public ListaIDsContext listaIDs() {
			return getRuleContext(ListaIDsContext.class,0);
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
		enterRule(_localctx, 26, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(Tk_READ);
			setState(192);
			match(Tk_AbrePar);
			setState(193);
			listaIDs();
			setState(194);
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
		enterRule(_localctx, 28, RULE_chamFuncs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(ID);
			setState(197);
			match(Tk_AbrePar);
			setState(199);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_AbrePar) | (1L << Tk_True) | (1L << Tk_False) | (1L << ID) | (1L << INT) | (1L << REAL) | (1L << STRING) | (1L << TRUE) | (1L << FALSE))) != 0)) {
				{
				setState(198);
				listaExpre();
				}
			}

			setState(201);
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
		enterRule(_localctx, 30, RULE_listaExpre);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			expre();
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_Virg) {
				{
				{
				setState(204);
				match(Tk_Virg);
				setState(205);
				expre();
				}
				}
				setState(210);
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
		public FuncMathContext funcMath() {
			return getRuleContext(FuncMathContext.class,0);
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
		enterRule(_localctx, 32, RULE_expre);
		try {
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				valor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				funcMath(0);
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
		enterRule(_localctx, 34, RULE_atribuicao);
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				match(ID);
				setState(217);
				match(Tk_Atribu);
				setState(218);
				testeLogic(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				match(ID);
				setState(220);
				match(Tk_Incre);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				match(ID);
				setState(222);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_testeLogic, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(226);
			teste1(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(233);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TesteLogicContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_testeLogic);
					setState(228);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(229);
					match(TK_OU);
					setState(230);
					teste1(0);
					}
					} 
				}
				setState(235);
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

	public static class Teste1Context extends ParserRuleContext {
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
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_teste1, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(237);
			teste2(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Teste1Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_teste1);
					setState(239);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(240);
					match(Tk_E);
					setState(241);
					teste2(0);
					}
					} 
				}
				setState(246);
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

	public static class Teste2Context extends ParserRuleContext {
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_teste2, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(248);
			teste3(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Teste2Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_teste2);
					setState(250);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(251);
					opSec();
					setState(252);
					teste3(0);
					}
					} 
				}
				setState(258);
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

	public static class Teste3Context extends ParserRuleContext {
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_teste3, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(260);
			funcMath(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(268);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Teste3Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_teste3);
					setState(262);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(263);
					opPrim();
					setState(264);
					funcMath(0);
					}
					} 
				}
				setState(270);
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

	public static class FuncMathContext extends ParserRuleContext {
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_funcMath, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(272);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(279);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FuncMathContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_funcMath);
					setState(274);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(275);
					_la = _input.LA(1);
					if ( !(_la==TK_SUB || _la==Tk_SOMA) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(276);
					term(0);
					}
					} 
				}
				setState(281);
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

	public static class TermContext extends ParserRuleContext {
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
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_term, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(283);
			fator();
			}
			_ctx.stop = _input.LT(-1);
			setState(290);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TermContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(285);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(286);
					_la = _input.LA(1);
					if ( !(_la==Tk_MULT || _la==Tk_DIV) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(287);
					fator();
					}
					} 
				}
				setState(292);
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

	public static class UnaryContext extends ParserRuleContext {
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
		enterRule(_localctx, 48, RULE_unary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_la = _input.LA(1);
			if (_la==Tk_Neg || _la==TK_SUB) {
				{
				setState(293);
				_la = _input.LA(1);
				if ( !(_la==Tk_Neg || _la==TK_SUB) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(296);
			fator();
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
		public TesteLogicContext testeLogic() {
			return getRuleContext(TesteLogicContext.class,0);
		}
		public TerminalNode INT() { return getToken(GramaticaParser.INT, 0); }
		public TerminalNode REAL() { return getToken(GramaticaParser.REAL, 0); }
		public TerminalNode Tk_True() { return getToken(GramaticaParser.Tk_True, 0); }
		public TerminalNode Tk_False() { return getToken(GramaticaParser.Tk_False, 0); }
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
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
		enterRule(_localctx, 50, RULE_fator);
		try {
			setState(310);
			switch (_input.LA(1)) {
			case Tk_AbrePar:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				match(Tk_AbrePar);
				setState(299);
				testeLogic(0);
				setState(300);
				match(Tk_FechPar);
				}
				break;
			case Tk_True:
			case Tk_False:
			case ID:
			case INT:
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(302);
					match(INT);
					}
					break;
				case 2:
					{
					setState(303);
					match(REAL);
					}
					break;
				case 3:
					{
					setState(304);
					match(Tk_True);
					}
					break;
				case 4:
					{
					setState(305);
					match(Tk_False);
					}
					break;
				case 5:
					{
					setState(306);
					match(ID);
					}
					break;
				case 6:
					{
					setState(307);
					chamFuncs();
					}
					break;
				}
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
		enterRule(_localctx, 52, RULE_controle);
		int _la;
		try {
			setState(358);
			switch (_input.LA(1)) {
			case Tk_IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				match(Tk_IF);
				setState(313);
				match(Tk_AbrePar);
				setState(314);
				testeLogic(0);
				setState(315);
				match(Tk_FechPar);
				setState(316);
				match(Tk_AbreChaves);
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_IF) | (1L << Tk_FOR) | (1L << Tk_PRINT) | (1L << Tk_READ) | (1L << ID))) != 0)) {
					{
					{
					setState(317);
					comandos();
					}
					}
					setState(322);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(324);
				_la = _input.LA(1);
				if (_la==Tk_RETURN) {
					{
					setState(323);
					retorno();
					}
				}

				setState(326);
				match(Tk_FechaChaves);
				setState(339);
				_la = _input.LA(1);
				if (_la==Tk_ELSE) {
					{
					setState(327);
					match(Tk_ELSE);
					setState(328);
					match(Tk_AbreChaves);
					setState(332);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_IF) | (1L << Tk_FOR) | (1L << Tk_PRINT) | (1L << Tk_READ) | (1L << ID))) != 0)) {
						{
						{
						setState(329);
						comandos();
						}
						}
						setState(334);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(336);
					_la = _input.LA(1);
					if (_la==Tk_RETURN) {
						{
						setState(335);
						retorno();
						}
					}

					setState(338);
					match(Tk_FechaChaves);
					}
				}

				}
				break;
			case Tk_FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				match(Tk_FOR);
				setState(342);
				match(Tk_AbrePar);
				setState(343);
				varControl();
				setState(344);
				match(Tk_PtVirg);
				setState(345);
				testeLogic(0);
				setState(346);
				match(Tk_PtVirg);
				setState(347);
				incrementos();
				setState(348);
				match(Tk_FechPar);
				setState(349);
				match(Tk_AbreChaves);
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_IF) | (1L << Tk_FOR) | (1L << Tk_PRINT) | (1L << Tk_READ) | (1L << ID))) != 0)) {
					{
					{
					setState(350);
					comandos();
					}
					}
					setState(355);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(356);
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
		enterRule(_localctx, 54, RULE_varControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(360);
			match(ID);
			setState(361);
			match(Tk_Atribu);
			setState(362);
			match(INT);
			}
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_Virg) {
				{
				{
				setState(364);
				match(Tk_Virg);
				{
				setState(365);
				match(ID);
				setState(366);
				match(Tk_Atribu);
				setState(367);
				match(INT);
				}
				}
				}
				setState(372);
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
		enterRule(_localctx, 56, RULE_opSec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
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
		enterRule(_localctx, 58, RULE_opPrim);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			_la = _input.LA(1);
			if ( !(_la==Tk_Dif || _la==Tk_Igual) ) {
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
		enterRule(_localctx, 60, RULE_incrementos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(377);
			atribuicao();
			}
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_Virg) {
				{
				{
				setState(378);
				match(Tk_Virg);
				setState(379);
				atribuicao();
				}
				}
				setState(384);
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
		case 18:
			return testeLogic_sempred((TesteLogicContext)_localctx, predIndex);
		case 19:
			return teste1_sempred((Teste1Context)_localctx, predIndex);
		case 20:
			return teste2_sempred((Teste2Context)_localctx, predIndex);
		case 21:
			return teste3_sempred((Teste3Context)_localctx, predIndex);
		case 22:
			return funcMath_sempred((FuncMathContext)_localctx, predIndex);
		case 23:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\62\u0184\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\2\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\7\2L\n\2\f\2\16\2O\13\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4`\n\4\3"+
		"\5\3\5\3\5\7\5e\n\5\f\5\16\5h\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b{\n\b\f\b\16\b~\13\b\3\b\7\b\u0081"+
		"\n\b\f\b\16\b\u0084\13\b\3\b\5\b\u0087\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\7\t\u0091\n\t\f\t\16\t\u0094\13\t\5\t\u0096\n\t\3\n\3\n\5\n\u009a"+
		"\n\n\3\n\3\n\3\13\3\13\5\13\u00a0\n\13\3\f\3\f\3\f\7\f\u00a5\n\f\f\f\16"+
		"\f\u00a8\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\5\r\u00b9\n\r\3\16\3\16\3\16\5\16\u00be\n\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\5\20\u00ca\n\20\3\20\3\20\3\21\3\21\3\21"+
		"\7\21\u00d1\n\21\f\21\16\21\u00d4\13\21\3\22\3\22\3\22\5\22\u00d9\n\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00e2\n\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\7\24\u00ea\n\24\f\24\16\24\u00ed\13\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\7\25\u00f5\n\25\f\25\16\25\u00f8\13\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\7\26\u0101\n\26\f\26\16\26\u0104\13\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\7\27\u010d\n\27\f\27\16\27\u0110\13\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\7\30\u0118\n\30\f\30\16\30\u011b\13\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\7\31\u0123\n\31\f\31\16\31\u0126\13\31\3\32\5\32"+
		"\u0129\n\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\5\33\u0137\n\33\5\33\u0139\n\33\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u0141"+
		"\n\34\f\34\16\34\u0144\13\34\3\34\5\34\u0147\n\34\3\34\3\34\3\34\3\34"+
		"\7\34\u014d\n\34\f\34\16\34\u0150\13\34\3\34\5\34\u0153\n\34\3\34\5\34"+
		"\u0156\n\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u0162"+
		"\n\34\f\34\16\34\u0165\13\34\3\34\3\34\5\34\u0169\n\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\7\35\u0173\n\35\f\35\16\35\u0176\13\35\3\36"+
		"\3\36\3\37\3\37\3 \3 \3 \7 \u017f\n \f \16 \u0182\13 \3 \2\b&(*,.\60!"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>\2\b\4"+
		"\2+-\61\62\3\2\33\34\3\2\31\32\4\2\16\16\33\33\3\2\21\24\3\2\25\26\u0195"+
		"\2@\3\2\2\2\4R\3\2\2\2\6_\3\2\2\2\ba\3\2\2\2\ni\3\2\2\2\fp\3\2\2\2\16"+
		"r\3\2\2\2\20\u0095\3\2\2\2\22\u0097\3\2\2\2\24\u009f\3\2\2\2\26\u00a1"+
		"\3\2\2\2\30\u00b8\3\2\2\2\32\u00ba\3\2\2\2\34\u00c1\3\2\2\2\36\u00c6\3"+
		"\2\2\2 \u00cd\3\2\2\2\"\u00d8\3\2\2\2$\u00e1\3\2\2\2&\u00e3\3\2\2\2(\u00ee"+
		"\3\2\2\2*\u00f9\3\2\2\2,\u0105\3\2\2\2.\u0111\3\2\2\2\60\u011c\3\2\2\2"+
		"\62\u0128\3\2\2\2\64\u0138\3\2\2\2\66\u0168\3\2\2\28\u016a\3\2\2\2:\u0177"+
		"\3\2\2\2<\u0179\3\2\2\2>\u017b\3\2\2\2@A\7\3\2\2AB\7*\2\2BG\7\5\2\2CF"+
		"\5\4\3\2DF\5\n\6\2EC\3\2\2\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2H"+
		"M\3\2\2\2IG\3\2\2\2JL\5\16\b\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2"+
		"NP\3\2\2\2OM\3\2\2\2PQ\5\26\f\2Q\3\3\2\2\2RS\5\6\4\2ST\7\7\2\2TU\5\b\5"+
		"\2UV\7\5\2\2V\5\3\2\2\2WX\7\n\2\2X`\b\4\1\2YZ\7\r\2\2Z`\b\4\1\2[\\\7\f"+
		"\2\2\\`\b\4\1\2]^\7\13\2\2^`\b\4\1\2_W\3\2\2\2_Y\3\2\2\2_[\3\2\2\2_]\3"+
		"\2\2\2`\7\3\2\2\2af\7*\2\2bc\7\6\2\2ce\7*\2\2db\3\2\2\2eh\3\2\2\2fd\3"+
		"\2\2\2fg\3\2\2\2g\t\3\2\2\2hf\3\2\2\2ij\7&\2\2jk\5\6\4\2kl\7*\2\2lm\7"+
		"\'\2\2mn\5\f\7\2no\7\5\2\2o\13\3\2\2\2pq\t\2\2\2q\r\3\2\2\2rs\5\24\13"+
		"\2st\7*\2\2tu\7\b\2\2uv\5\20\t\2vw\7\t\2\2w|\7\27\2\2x{\5\4\3\2y{\5\n"+
		"\6\2zx\3\2\2\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\u0082\3\2\2\2"+
		"~|\3\2\2\2\177\u0081\5\30\r\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2"+
		"\2\2\u0085\u0087\5\22\n\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u0089\7\30\2\2\u0089\17\3\2\2\2\u008a\u008b\5\6\4"+
		"\2\u008b\u0092\7*\2\2\u008c\u008d\7\6\2\2\u008d\u008e\5\6\4\2\u008e\u008f"+
		"\7*\2\2\u008f\u0091\3\2\2\2\u0090\u008c\3\2\2\2\u0091\u0094\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2"+
		"\2\2\u0095\u008a\3\2\2\2\u0095\u0096\3\2\2\2\u0096\21\3\2\2\2\u0097\u0099"+
		"\7%\2\2\u0098\u009a\5\"\22\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u009c\7\5\2\2\u009c\23\3\2\2\2\u009d\u00a0\5\6\4"+
		"\2\u009e\u00a0\7$\2\2\u009f\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\25"+
		"\3\2\2\2\u00a1\u00a2\7\4\2\2\u00a2\u00a6\7\27\2\2\u00a3\u00a5\5\30\r\2"+
		"\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7"+
		"\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\7\30\2\2"+
		"\u00aa\27\3\2\2\2\u00ab\u00ac\5\32\16\2\u00ac\u00ad\7\5\2\2\u00ad\u00b9"+
		"\3\2\2\2\u00ae\u00af\5\34\17\2\u00af\u00b0\7\5\2\2\u00b0\u00b9\3\2\2\2"+
		"\u00b1\u00b2\5\36\20\2\u00b2\u00b3\7\5\2\2\u00b3\u00b9\3\2\2\2\u00b4\u00b5"+
		"\5$\23\2\u00b5\u00b6\7\5\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b9\5\66\34\2"+
		"\u00b8\u00ab\3\2\2\2\u00b8\u00ae\3\2\2\2\u00b8\u00b1\3\2\2\2\u00b8\u00b4"+
		"\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\31\3\2\2\2\u00ba\u00bb\7\"\2\2\u00bb"+
		"\u00bd\7\b\2\2\u00bc\u00be\5 \21\2\u00bd\u00bc\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\7\t\2\2\u00c0\33\3\2\2\2\u00c1\u00c2"+
		"\7#\2\2\u00c2\u00c3\7\b\2\2\u00c3\u00c4\5\b\5\2\u00c4\u00c5\7\t\2\2\u00c5"+
		"\35\3\2\2\2\u00c6\u00c7\7*\2\2\u00c7\u00c9\7\b\2\2\u00c8\u00ca\5 \21\2"+
		"\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc"+
		"\7\t\2\2\u00cc\37\3\2\2\2\u00cd\u00d2\5\"\22\2\u00ce\u00cf\7\6\2\2\u00cf"+
		"\u00d1\5\"\22\2\u00d0\u00ce\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3"+
		"\2\2\2\u00d2\u00d3\3\2\2\2\u00d3!\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d9"+
		"\7*\2\2\u00d6\u00d9\5\f\7\2\u00d7\u00d9\5.\30\2\u00d8\u00d5\3\2\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9#\3\2\2\2\u00da\u00db\7*\2\2\u00db"+
		"\u00dc\7\'\2\2\u00dc\u00e2\5&\24\2\u00dd\u00de\7*\2\2\u00de\u00e2\7 \2"+
		"\2\u00df\u00e0\7*\2\2\u00e0\u00e2\7!\2\2\u00e1\u00da\3\2\2\2\u00e1\u00dd"+
		"\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2%\3\2\2\2\u00e3\u00e4\b\24\1\2\u00e4"+
		"\u00e5\5(\25\2\u00e5\u00eb\3\2\2\2\u00e6\u00e7\f\4\2\2\u00e7\u00e8\7\20"+
		"\2\2\u00e8\u00ea\5(\25\2\u00e9\u00e6\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb"+
		"\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\'\3\2\2\2\u00ed\u00eb\3\2\2\2"+
		"\u00ee\u00ef\b\25\1\2\u00ef\u00f0\5*\26\2\u00f0\u00f6\3\2\2\2\u00f1\u00f2"+
		"\f\4\2\2\u00f2\u00f3\7\17\2\2\u00f3\u00f5\5*\26\2\u00f4\u00f1\3\2\2\2"+
		"\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7)\3"+
		"\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa\b\26\1\2\u00fa\u00fb\5,\27\2\u00fb"+
		"\u0102\3\2\2\2\u00fc\u00fd\f\4\2\2\u00fd\u00fe\5:\36\2\u00fe\u00ff\5,"+
		"\27\2\u00ff\u0101\3\2\2\2\u0100\u00fc\3\2\2\2\u0101\u0104\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103+\3\2\2\2\u0104\u0102\3\2\2\2"+
		"\u0105\u0106\b\27\1\2\u0106\u0107\5.\30\2\u0107\u010e\3\2\2\2\u0108\u0109"+
		"\f\4\2\2\u0109\u010a\5<\37\2\u010a\u010b\5.\30\2\u010b\u010d\3\2\2\2\u010c"+
		"\u0108\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2"+
		"\2\2\u010f-\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0112\b\30\1\2\u0112\u0113"+
		"\5\60\31\2\u0113\u0119\3\2\2\2\u0114\u0115\f\4\2\2\u0115\u0116\t\3\2\2"+
		"\u0116\u0118\5\60\31\2\u0117\u0114\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117"+
		"\3\2\2\2\u0119\u011a\3\2\2\2\u011a/\3\2\2\2\u011b\u0119\3\2\2\2\u011c"+
		"\u011d\b\31\1\2\u011d\u011e\5\64\33\2\u011e\u0124\3\2\2\2\u011f\u0120"+
		"\f\4\2\2\u0120\u0121\t\4\2\2\u0121\u0123\5\64\33\2\u0122\u011f\3\2\2\2"+
		"\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\61"+
		"\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u0129\t\5\2\2\u0128\u0127\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\5\64\33\2\u012b\63\3\2"+
		"\2\2\u012c\u012d\7\b\2\2\u012d\u012e\5&\24\2\u012e\u012f\7\t\2\2\u012f"+
		"\u0139\3\2\2\2\u0130\u0137\7+\2\2\u0131\u0137\7,\2\2\u0132\u0137\7(\2"+
		"\2\u0133\u0137\7)\2\2\u0134\u0137\7*\2\2\u0135\u0137\5\36\20\2\u0136\u0130"+
		"\3\2\2\2\u0136\u0131\3\2\2\2\u0136\u0132\3\2\2\2\u0136\u0133\3\2\2\2\u0136"+
		"\u0134\3\2\2\2\u0136\u0135\3\2\2\2\u0137\u0139\3\2\2\2\u0138\u012c\3\2"+
		"\2\2\u0138\u0136\3\2\2\2\u0139\65\3\2\2\2\u013a\u013b\7\35\2\2\u013b\u013c"+
		"\7\b\2\2\u013c\u013d\5&\24\2\u013d\u013e\7\t\2\2\u013e\u0142\7\27\2\2"+
		"\u013f\u0141\5\30\r\2\u0140\u013f\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140"+
		"\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0145"+
		"\u0147\5\22\n\2\u0146\u0145\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\3"+
		"\2\2\2\u0148\u0155\7\30\2\2\u0149\u014a\7\37\2\2\u014a\u014e\7\27\2\2"+
		"\u014b\u014d\5\30\r\2\u014c\u014b\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c"+
		"\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0151"+
		"\u0153\5\22\n\2\u0152\u0151\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\3"+
		"\2\2\2\u0154\u0156\7\30\2\2\u0155\u0149\3\2\2\2\u0155\u0156\3\2\2\2\u0156"+
		"\u0169\3\2\2\2\u0157\u0158\7\36\2\2\u0158\u0159\7\b\2\2\u0159\u015a\5"+
		"8\35\2\u015a\u015b\7\5\2\2\u015b\u015c\5&\24\2\u015c\u015d\7\5\2\2\u015d"+
		"\u015e\5> \2\u015e\u015f\7\t\2\2\u015f\u0163\7\27\2\2\u0160\u0162\5\30"+
		"\r\2\u0161\u0160\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0163"+
		"\u0164\3\2\2\2\u0164\u0166\3\2\2\2\u0165\u0163\3\2\2\2\u0166\u0167\7\30"+
		"\2\2\u0167\u0169\3\2\2\2\u0168\u013a\3\2\2\2\u0168\u0157\3\2\2\2\u0169"+
		"\67\3\2\2\2\u016a\u016b\7*\2\2\u016b\u016c\7\'\2\2\u016c\u016d\7+\2\2"+
		"\u016d\u0174\3\2\2\2\u016e\u016f\7\6\2\2\u016f\u0170\7*\2\2\u0170\u0171"+
		"\7\'\2\2\u0171\u0173\7+\2\2\u0172\u016e\3\2\2\2\u0173\u0176\3\2\2\2\u0174"+
		"\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u01759\3\2\2\2\u0176\u0174\3\2\2\2"+
		"\u0177\u0178\t\6\2\2\u0178;\3\2\2\2\u0179\u017a\t\7\2\2\u017a=\3\2\2\2"+
		"\u017b\u0180\5$\23\2\u017c\u017d\7\6\2\2\u017d\u017f\5$\23\2\u017e\u017c"+
		"\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181"+
		"?\3\2\2\2\u0182\u0180\3\2\2\2(EGM_fz|\u0082\u0086\u0092\u0095\u0099\u009f"+
		"\u00a6\u00b8\u00bd\u00c9\u00d2\u00d8\u00e1\u00eb\u00f6\u0102\u010e\u0119"+
		"\u0124\u0128\u0136\u0138\u0142\u0146\u014e\u0152\u0155\u0163\u0168\u0174"+
		"\u0180";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}