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
		Tk_Atribu=37, ID=38, INT=39, REAL=40, STRING=41, COMMENT_LINE=42, COMMENT=43, 
		WS=44;
	public static final int
		RULE_programa = 0, RULE_decVars = 1, RULE_tipo = 2, RULE_listaIDs = 3, 
		RULE_decConsts = 4, RULE_valor = 5, RULE_decFuncs = 6, RULE_listaParam = 7, 
		RULE_retorno = 8, RULE_tipoRetorno = 9, RULE_main = 10, RULE_comandos = 11, 
		RULE_print = 12, RULE_read = 13, RULE_chamFuncs = 14, RULE_listaExpre = 15, 
		RULE_expre = 16, RULE_atribuicao = 17, RULE_funcMath = 18, RULE_term = 19, 
		RULE_fator = 20, RULE_controle = 21, RULE_varControl = 22, RULE_testeLogic = 23, 
		RULE_opLogic = 24, RULE_incrementos = 25;
	public static final String[] ruleNames = {
		"programa", "decVars", "tipo", "listaIDs", "decConsts", "valor", "decFuncs", 
		"listaParam", "retorno", "tipoRetorno", "main", "comandos", "print", "read", 
		"chamFuncs", "listaExpre", "expre", "atribuicao", "funcMath", "term", 
		"fator", "controle", "varControl", "testeLogic", "opLogic", "incrementos"
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
			setState(52);
			match(Tk_Class);
			setState(53);
			match(ID);
			setState(54);
			match(Tk_PtVirg);
			setState(59);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(57);
					switch (_input.LA(1)) {
					case Tk_Int:
					case Tk_Float:
					case Tk_Bool:
					case Tk_Str:
						{
						setState(55);
						decVars();
						}
						break;
					case Tk_FINAL:
						{
						setState(56);
						decConsts();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(61);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_Int) | (1L << Tk_Float) | (1L << Tk_Bool) | (1L << Tk_Str) | (1L << Tk_VOID))) != 0)) {
				{
				{
				setState(62);
				decFuncs();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
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
			setState(70);
			tipo();
			setState(71);
			match(Tk_DoisPonts);
			setState(72);
			listaIDs();
			setState(73);
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
			setState(83);
			switch (_input.LA(1)) {
			case Tk_Int:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				match(Tk_Int);
				((TipoContext)_localctx).t = 1;
				}
				break;
			case Tk_Str:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				match(Tk_Str);
				((TipoContext)_localctx).t = 2;
				}
				break;
			case Tk_Bool:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				match(Tk_Bool);
				((TipoContext)_localctx).t = 3;
				}
				break;
			case Tk_Float:
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
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
			setState(85);
			match(ID);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_Virg) {
				{
				{
				setState(86);
				match(Tk_Virg);
				setState(87);
				match(ID);
				}
				}
				setState(92);
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
			setState(93);
			match(Tk_FINAL);
			setState(94);
			tipo();
			setState(95);
			match(ID);
			setState(96);
			match(Tk_Atribu);
			setState(97);
			valor();
			setState(98);
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
			setState(100);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << REAL) | (1L << STRING))) != 0)) ) {
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
			setState(102);
			tipoRetorno();
			setState(103);
			match(ID);
			setState(104);
			match(Tk_AbrePar);
			setState(105);
			listaParam();
			setState(106);
			match(Tk_FechPar);
			setState(107);
			match(Tk_AbreChaves);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_Int) | (1L << Tk_Float) | (1L << Tk_Bool) | (1L << Tk_Str) | (1L << Tk_FINAL))) != 0)) {
				{
				setState(110);
				switch (_input.LA(1)) {
				case Tk_Int:
				case Tk_Float:
				case Tk_Bool:
				case Tk_Str:
					{
					setState(108);
					decVars();
					}
					break;
				case Tk_FINAL:
					{
					setState(109);
					decConsts();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_IF) | (1L << Tk_FOR) | (1L << Tk_PRINT) | (1L << Tk_READ) | (1L << ID))) != 0)) {
				{
				{
				setState(115);
				comandos();
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
			_la = _input.LA(1);
			if (_la==Tk_RETURN) {
				{
				setState(121);
				retorno();
				}
			}

			setState(124);
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
			setState(137);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_Int) | (1L << Tk_Float) | (1L << Tk_Bool) | (1L << Tk_Str))) != 0)) {
				{
				setState(126);
				tipo();
				setState(127);
				match(ID);
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Tk_Virg) {
					{
					{
					setState(128);
					match(Tk_Virg);
					setState(129);
					tipo();
					setState(130);
					match(ID);
					}
					}
					setState(136);
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
			setState(139);
			match(Tk_RETURN);
			setState(141);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_AbrePar) | (1L << TK_SUB) | (1L << ID) | (1L << INT) | (1L << REAL) | (1L << STRING))) != 0)) {
				{
				setState(140);
				expre();
				}
			}

			setState(143);
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
			setState(147);
			switch (_input.LA(1)) {
			case Tk_Int:
			case Tk_Float:
			case Tk_Bool:
			case Tk_Str:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				tipo();
				}
				break;
			case Tk_VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
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
			setState(149);
			match(Tk_Main);
			setState(150);
			match(Tk_AbreChaves);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_IF) | (1L << Tk_FOR) | (1L << Tk_PRINT) | (1L << Tk_READ) | (1L << ID))) != 0)) {
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
			setState(157);
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
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				print();
				setState(160);
				match(Tk_PtVirg);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				read();
				setState(163);
				match(Tk_PtVirg);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(165);
				chamFuncs();
				setState(166);
				match(Tk_PtVirg);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(168);
				atribuicao();
				setState(169);
				match(Tk_PtVirg);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(171);
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
			setState(174);
			match(Tk_PRINT);
			setState(175);
			match(Tk_AbrePar);
			setState(177);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_AbrePar) | (1L << TK_SUB) | (1L << ID) | (1L << INT) | (1L << REAL) | (1L << STRING))) != 0)) {
				{
				setState(176);
				listaExpre();
				}
			}

			setState(179);
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
			setState(181);
			match(Tk_READ);
			setState(182);
			match(Tk_AbrePar);
			setState(183);
			listaIDs();
			setState(184);
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
			setState(186);
			match(ID);
			setState(187);
			match(Tk_AbrePar);
			setState(189);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_AbrePar) | (1L << TK_SUB) | (1L << ID) | (1L << INT) | (1L << REAL) | (1L << STRING))) != 0)) {
				{
				setState(188);
				listaExpre();
				}
			}

			setState(191);
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
			setState(193);
			expre();
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_Virg) {
				{
				{
				setState(194);
				match(Tk_Virg);
				setState(195);
				expre();
				}
				}
				setState(200);
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
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				valor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(203);
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
		public ExpreContext expre() {
			return getRuleContext(ExpreContext.class,0);
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
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(ID);
				setState(207);
				match(Tk_Atribu);
				setState(208);
				expre();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(ID);
				setState(210);
				match(Tk_Incre);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				match(ID);
				setState(212);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_funcMath, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(216);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FuncMathContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_funcMath);
					setState(218);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(219);
					_la = _input.LA(1);
					if ( !(_la==TK_SUB || _la==Tk_SOMA) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(220);
					term(0);
					}
					} 
				}
				setState(225);
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
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_term, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(227);
			fator();
			}
			_ctx.stop = _input.LT(-1);
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TermContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(229);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(230);
					_la = _input.LA(1);
					if ( !(_la==Tk_MULT || _la==Tk_DIV) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(231);
					fator();
					}
					} 
				}
				setState(236);
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

	public static class FatorContext extends ParserRuleContext {
		public FuncMathContext funcMath() {
			return getRuleContext(FuncMathContext.class,0);
		}
		public TerminalNode INT() { return getToken(GramaticaParser.INT, 0); }
		public TerminalNode REAL() { return getToken(GramaticaParser.REAL, 0); }
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
		enterRule(_localctx, 40, RULE_fator);
		int _la;
		try {
			setState(250);
			switch (_input.LA(1)) {
			case Tk_AbrePar:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				match(Tk_AbrePar);
				setState(238);
				funcMath(0);
				setState(239);
				match(Tk_FechPar);
				}
				break;
			case TK_SUB:
			case ID:
			case INT:
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				_la = _input.LA(1);
				if (_la==TK_SUB) {
					{
					setState(241);
					match(TK_SUB);
					}
				}

				setState(248);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(244);
					match(INT);
					}
					break;
				case 2:
					{
					setState(245);
					match(REAL);
					}
					break;
				case 3:
					{
					setState(246);
					match(ID);
					}
					break;
				case 4:
					{
					setState(247);
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
		enterRule(_localctx, 42, RULE_controle);
		int _la;
		try {
			setState(298);
			switch (_input.LA(1)) {
			case Tk_IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				match(Tk_IF);
				setState(253);
				match(Tk_AbrePar);
				setState(254);
				testeLogic(0);
				setState(255);
				match(Tk_FechPar);
				setState(256);
				match(Tk_AbreChaves);
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_IF) | (1L << Tk_FOR) | (1L << Tk_PRINT) | (1L << Tk_READ) | (1L << ID))) != 0)) {
					{
					{
					setState(257);
					comandos();
					}
					}
					setState(262);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(264);
				_la = _input.LA(1);
				if (_la==Tk_RETURN) {
					{
					setState(263);
					retorno();
					}
				}

				setState(266);
				match(Tk_FechaChaves);
				setState(279);
				_la = _input.LA(1);
				if (_la==Tk_ELSE) {
					{
					setState(267);
					match(Tk_ELSE);
					setState(268);
					match(Tk_AbreChaves);
					setState(272);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_IF) | (1L << Tk_FOR) | (1L << Tk_PRINT) | (1L << Tk_READ) | (1L << ID))) != 0)) {
						{
						{
						setState(269);
						comandos();
						}
						}
						setState(274);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(276);
					_la = _input.LA(1);
					if (_la==Tk_RETURN) {
						{
						setState(275);
						retorno();
						}
					}

					setState(278);
					match(Tk_FechaChaves);
					}
				}

				}
				break;
			case Tk_FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				match(Tk_FOR);
				setState(282);
				match(Tk_AbrePar);
				setState(283);
				varControl();
				setState(284);
				match(Tk_PtVirg);
				setState(285);
				testeLogic(0);
				setState(286);
				match(Tk_PtVirg);
				setState(287);
				incrementos();
				setState(288);
				match(Tk_FechPar);
				setState(289);
				match(Tk_AbreChaves);
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_IF) | (1L << Tk_FOR) | (1L << Tk_PRINT) | (1L << Tk_READ) | (1L << ID))) != 0)) {
					{
					{
					setState(290);
					comandos();
					}
					}
					setState(295);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(296);
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
		enterRule(_localctx, 44, RULE_varControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(300);
				match(ID);
				}
				break;
			case 2:
				{
				setState(301);
				match(ID);
				setState(302);
				match(Tk_Atribu);
				setState(303);
				match(INT);
				}
				break;
			}
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_Virg) {
				{
				{
				setState(306);
				match(Tk_Virg);
				setState(311);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(307);
					match(ID);
					}
					break;
				case 2:
					{
					setState(308);
					match(ID);
					setState(309);
					match(Tk_Atribu);
					setState(310);
					match(INT);
					}
					break;
				}
				}
				}
				setState(317);
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

	public static class TesteLogicContext extends ParserRuleContext {
		public List<TesteLogicContext> testeLogic() {
			return getRuleContexts(TesteLogicContext.class);
		}
		public TesteLogicContext testeLogic(int i) {
			return getRuleContext(TesteLogicContext.class,i);
		}
		public List<ExpreContext> expre() {
			return getRuleContexts(ExpreContext.class);
		}
		public ExpreContext expre(int i) {
			return getRuleContext(ExpreContext.class,i);
		}
		public OpLogicContext opLogic() {
			return getRuleContext(OpLogicContext.class,0);
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
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_testeLogic, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(319);
				match(Tk_Neg);
				setState(320);
				testeLogic(4);
				}
				break;
			case 2:
				{
				setState(321);
				match(Tk_AbrePar);
				setState(322);
				testeLogic(0);
				setState(323);
				match(Tk_FechPar);
				}
				break;
			case 3:
				{
				setState(325);
				expre();
				setState(326);
				opLogic();
				setState(327);
				expre();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(336);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TesteLogicContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_testeLogic);
					setState(331);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(332);
					_la = _input.LA(1);
					if ( !(_la==Tk_E || _la==TK_OU) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(333);
					testeLogic(4);
					}
					} 
				}
				setState(338);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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

	public static class OpLogicContext extends ParserRuleContext {
		public OpLogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opLogic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterOpLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitOpLogic(this);
		}
	}

	public final OpLogicContext opLogic() throws RecognitionException {
		OpLogicContext _localctx = new OpLogicContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_opLogic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_MaiorQ) | (1L << Tk_MenorQ) | (1L << Tk_MaiorIgual) | (1L << Tk_MenorIgual) | (1L << Tk_Dif) | (1L << Tk_Igual))) != 0)) ) {
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
		enterRule(_localctx, 50, RULE_incrementos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(341);
			atribuicao();
			}
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_Virg) {
				{
				{
				setState(342);
				match(Tk_Virg);
				setState(343);
				atribuicao();
				}
				}
				setState(348);
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
			return funcMath_sempred((FuncMathContext)_localctx, predIndex);
		case 19:
			return term_sempred((TermContext)_localctx, predIndex);
		case 23:
			return testeLogic_sempred((TesteLogicContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean funcMath_sempred(FuncMathContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean testeLogic_sempred(TesteLogicContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3.\u0160\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\7\2<\n\2\f\2\16\2?\13\2\3\2\7"+
		"\2B\n\2\f\2\16\2E\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\4V\n\4\3\5\3\5\3\5\7\5[\n\5\f\5\16\5^\13\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bq\n\b\f\b"+
		"\16\bt\13\b\3\b\7\bw\n\b\f\b\16\bz\13\b\3\b\5\b}\n\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\7\t\u0087\n\t\f\t\16\t\u008a\13\t\5\t\u008c\n\t\3\n\3\n"+
		"\5\n\u0090\n\n\3\n\3\n\3\13\3\13\5\13\u0096\n\13\3\f\3\f\3\f\7\f\u009b"+
		"\n\f\f\f\16\f\u009e\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\5\r\u00af\n\r\3\16\3\16\3\16\5\16\u00b4\n\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\5\20\u00c0\n\20\3\20\3\20\3\21"+
		"\3\21\3\21\7\21\u00c7\n\21\f\21\16\21\u00ca\13\21\3\22\3\22\3\22\5\22"+
		"\u00cf\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00d8\n\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\7\24\u00e0\n\24\f\24\16\24\u00e3\13\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\7\25\u00eb\n\25\f\25\16\25\u00ee\13\25\3\26\3"+
		"\26\3\26\3\26\3\26\5\26\u00f5\n\26\3\26\3\26\3\26\3\26\5\26\u00fb\n\26"+
		"\5\26\u00fd\n\26\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0105\n\27\f\27\16"+
		"\27\u0108\13\27\3\27\5\27\u010b\n\27\3\27\3\27\3\27\3\27\7\27\u0111\n"+
		"\27\f\27\16\27\u0114\13\27\3\27\5\27\u0117\n\27\3\27\5\27\u011a\n\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0126\n\27\f\27"+
		"\16\27\u0129\13\27\3\27\3\27\5\27\u012d\n\27\3\30\3\30\3\30\3\30\5\30"+
		"\u0133\n\30\3\30\3\30\3\30\3\30\3\30\5\30\u013a\n\30\7\30\u013c\n\30\f"+
		"\30\16\30\u013f\13\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u014c\n\31\3\31\3\31\3\31\7\31\u0151\n\31\f\31\16\31\u0154"+
		"\13\31\3\32\3\32\3\33\3\33\3\33\7\33\u015b\n\33\f\33\16\33\u015e\13\33"+
		"\3\33\2\5&(\60\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\2\7\3\2)+\3\2\33\34\3\2\31\32\3\2\17\20\3\2\21\26\u0175\2\66\3\2\2"+
		"\2\4H\3\2\2\2\6U\3\2\2\2\bW\3\2\2\2\n_\3\2\2\2\ff\3\2\2\2\16h\3\2\2\2"+
		"\20\u008b\3\2\2\2\22\u008d\3\2\2\2\24\u0095\3\2\2\2\26\u0097\3\2\2\2\30"+
		"\u00ae\3\2\2\2\32\u00b0\3\2\2\2\34\u00b7\3\2\2\2\36\u00bc\3\2\2\2 \u00c3"+
		"\3\2\2\2\"\u00ce\3\2\2\2$\u00d7\3\2\2\2&\u00d9\3\2\2\2(\u00e4\3\2\2\2"+
		"*\u00fc\3\2\2\2,\u012c\3\2\2\2.\u0132\3\2\2\2\60\u014b\3\2\2\2\62\u0155"+
		"\3\2\2\2\64\u0157\3\2\2\2\66\67\7\3\2\2\678\7(\2\28=\7\5\2\29<\5\4\3\2"+
		":<\5\n\6\2;9\3\2\2\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>C\3\2\2\2"+
		"?=\3\2\2\2@B\5\16\b\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2"+
		"\2EC\3\2\2\2FG\5\26\f\2G\3\3\2\2\2HI\5\6\4\2IJ\7\7\2\2JK\5\b\5\2KL\7\5"+
		"\2\2L\5\3\2\2\2MN\7\n\2\2NV\b\4\1\2OP\7\r\2\2PV\b\4\1\2QR\7\f\2\2RV\b"+
		"\4\1\2ST\7\13\2\2TV\b\4\1\2UM\3\2\2\2UO\3\2\2\2UQ\3\2\2\2US\3\2\2\2V\7"+
		"\3\2\2\2W\\\7(\2\2XY\7\6\2\2Y[\7(\2\2ZX\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\"+
		"]\3\2\2\2]\t\3\2\2\2^\\\3\2\2\2_`\7&\2\2`a\5\6\4\2ab\7(\2\2bc\7\'\2\2"+
		"cd\5\f\7\2de\7\5\2\2e\13\3\2\2\2fg\t\2\2\2g\r\3\2\2\2hi\5\24\13\2ij\7"+
		"(\2\2jk\7\b\2\2kl\5\20\t\2lm\7\t\2\2mr\7\27\2\2nq\5\4\3\2oq\5\n\6\2pn"+
		"\3\2\2\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2sx\3\2\2\2tr\3\2\2\2u"+
		"w\5\30\r\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y|\3\2\2\2zx\3\2\2\2"+
		"{}\5\22\n\2|{\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\177\7\30\2\2\177\17\3\2\2\2"+
		"\u0080\u0081\5\6\4\2\u0081\u0088\7(\2\2\u0082\u0083\7\6\2\2\u0083\u0084"+
		"\5\6\4\2\u0084\u0085\7(\2\2\u0085\u0087\3\2\2\2\u0086\u0082\3\2\2\2\u0087"+
		"\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008c\3\2"+
		"\2\2\u008a\u0088\3\2\2\2\u008b\u0080\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\21\3\2\2\2\u008d\u008f\7%\2\2\u008e\u0090\5\"\22\2\u008f\u008e\3\2\2"+
		"\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\7\5\2\2\u0092\23"+
		"\3\2\2\2\u0093\u0096\5\6\4\2\u0094\u0096\7$\2\2\u0095\u0093\3\2\2\2\u0095"+
		"\u0094\3\2\2\2\u0096\25\3\2\2\2\u0097\u0098\7\4\2\2\u0098\u009c\7\27\2"+
		"\2\u0099\u009b\5\30\r\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2"+
		"\2\2\u009f\u00a0\7\30\2\2\u00a0\27\3\2\2\2\u00a1\u00a2\5\32\16\2\u00a2"+
		"\u00a3\7\5\2\2\u00a3\u00af\3\2\2\2\u00a4\u00a5\5\34\17\2\u00a5\u00a6\7"+
		"\5\2\2\u00a6\u00af\3\2\2\2\u00a7\u00a8\5\36\20\2\u00a8\u00a9\7\5\2\2\u00a9"+
		"\u00af\3\2\2\2\u00aa\u00ab\5$\23\2\u00ab\u00ac\7\5\2\2\u00ac\u00af\3\2"+
		"\2\2\u00ad\u00af\5,\27\2\u00ae\u00a1\3\2\2\2\u00ae\u00a4\3\2\2\2\u00ae"+
		"\u00a7\3\2\2\2\u00ae\u00aa\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af\31\3\2\2"+
		"\2\u00b0\u00b1\7\"\2\2\u00b1\u00b3\7\b\2\2\u00b2\u00b4\5 \21\2\u00b3\u00b2"+
		"\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\7\t\2\2\u00b6"+
		"\33\3\2\2\2\u00b7\u00b8\7#\2\2\u00b8\u00b9\7\b\2\2\u00b9\u00ba\5\b\5\2"+
		"\u00ba\u00bb\7\t\2\2\u00bb\35\3\2\2\2\u00bc\u00bd\7(\2\2\u00bd\u00bf\7"+
		"\b\2\2\u00be\u00c0\5 \21\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00c2\7\t\2\2\u00c2\37\3\2\2\2\u00c3\u00c8\5\"\22"+
		"\2\u00c4\u00c5\7\6\2\2\u00c5\u00c7\5\"\22\2\u00c6\u00c4\3\2\2\2\u00c7"+
		"\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9!\3\2\2\2"+
		"\u00ca\u00c8\3\2\2\2\u00cb\u00cf\7(\2\2\u00cc\u00cf\5\f\7\2\u00cd\u00cf"+
		"\5&\24\2\u00ce\u00cb\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf"+
		"#\3\2\2\2\u00d0\u00d1\7(\2\2\u00d1\u00d2\7\'\2\2\u00d2\u00d8\5\"\22\2"+
		"\u00d3\u00d4\7(\2\2\u00d4\u00d8\7 \2\2\u00d5\u00d6\7(\2\2\u00d6\u00d8"+
		"\7!\2\2\u00d7\u00d0\3\2\2\2\u00d7\u00d3\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8"+
		"%\3\2\2\2\u00d9\u00da\b\24\1\2\u00da\u00db\5(\25\2\u00db\u00e1\3\2\2\2"+
		"\u00dc\u00dd\f\4\2\2\u00dd\u00de\t\3\2\2\u00de\u00e0\5(\25\2\u00df\u00dc"+
		"\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\'\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5\b\25\1\2\u00e5\u00e6\5*\26"+
		"\2\u00e6\u00ec\3\2\2\2\u00e7\u00e8\f\4\2\2\u00e8\u00e9\t\4\2\2\u00e9\u00eb"+
		"\5*\26\2\u00ea\u00e7\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed)\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\7\b\2\2"+
		"\u00f0\u00f1\5&\24\2\u00f1\u00f2\7\t\2\2\u00f2\u00fd\3\2\2\2\u00f3\u00f5"+
		"\7\33\2\2\u00f4\u00f3\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00fa\3\2\2\2"+
		"\u00f6\u00fb\7)\2\2\u00f7\u00fb\7*\2\2\u00f8\u00fb\7(\2\2\u00f9\u00fb"+
		"\5\36\20\2\u00fa\u00f6\3\2\2\2\u00fa\u00f7\3\2\2\2\u00fa\u00f8\3\2\2\2"+
		"\u00fa\u00f9\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00ef\3\2\2\2\u00fc\u00f4"+
		"\3\2\2\2\u00fd+\3\2\2\2\u00fe\u00ff\7\35\2\2\u00ff\u0100\7\b\2\2\u0100"+
		"\u0101\5\60\31\2\u0101\u0102\7\t\2\2\u0102\u0106\7\27\2\2\u0103\u0105"+
		"\5\30\r\2\u0104\u0103\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2"+
		"\u0106\u0107\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010b"+
		"\5\22\n\2\u010a\u0109\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\3\2\2\2"+
		"\u010c\u0119\7\30\2\2\u010d\u010e\7\37\2\2\u010e\u0112\7\27\2\2\u010f"+
		"\u0111\5\30\r\2\u0110\u010f\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3"+
		"\2\2\2\u0112\u0113\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0115"+
		"\u0117\5\22\n\2\u0116\u0115\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\3"+
		"\2\2\2\u0118\u011a\7\30\2\2\u0119\u010d\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\u012d\3\2\2\2\u011b\u011c\7\36\2\2\u011c\u011d\7\b\2\2\u011d\u011e\5"+
		".\30\2\u011e\u011f\7\5\2\2\u011f\u0120\5\60\31\2\u0120\u0121\7\5\2\2\u0121"+
		"\u0122\5\64\33\2\u0122\u0123\7\t\2\2\u0123\u0127\7\27\2\2\u0124\u0126"+
		"\5\30\r\2\u0125\u0124\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2"+
		"\u0127\u0128\3\2\2\2\u0128\u012a\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012b"+
		"\7\30\2\2\u012b\u012d\3\2\2\2\u012c\u00fe\3\2\2\2\u012c\u011b\3\2\2\2"+
		"\u012d-\3\2\2\2\u012e\u0133\7(\2\2\u012f\u0130\7(\2\2\u0130\u0131\7\'"+
		"\2\2\u0131\u0133\7)\2\2\u0132\u012e\3\2\2\2\u0132\u012f\3\2\2\2\u0133"+
		"\u013d\3\2\2\2\u0134\u0139\7\6\2\2\u0135\u013a\7(\2\2\u0136\u0137\7(\2"+
		"\2\u0137\u0138\7\'\2\2\u0138\u013a\7)\2\2\u0139\u0135\3\2\2\2\u0139\u0136"+
		"\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u0134\3\2\2\2\u013c\u013f\3\2\2\2\u013d"+
		"\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e/\3\2\2\2\u013f\u013d\3\2\2\2"+
		"\u0140\u0141\b\31\1\2\u0141\u0142\7\16\2\2\u0142\u014c\5\60\31\6\u0143"+
		"\u0144\7\b\2\2\u0144\u0145\5\60\31\2\u0145\u0146\7\t\2\2\u0146\u014c\3"+
		"\2\2\2\u0147\u0148\5\"\22\2\u0148\u0149\5\62\32\2\u0149\u014a\5\"\22\2"+
		"\u014a\u014c\3\2\2\2\u014b\u0140\3\2\2\2\u014b\u0143\3\2\2\2\u014b\u0147"+
		"\3\2\2\2\u014c\u0152\3\2\2\2\u014d\u014e\f\5\2\2\u014e\u014f\t\5\2\2\u014f"+
		"\u0151\5\60\31\6\u0150\u014d\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3"+
		"\2\2\2\u0152\u0153\3\2\2\2\u0153\61\3\2\2\2\u0154\u0152\3\2\2\2\u0155"+
		"\u0156\t\6\2\2\u0156\63\3\2\2\2\u0157\u015c\5$\23\2\u0158\u0159\7\6\2"+
		"\2\u0159\u015b\5$\23\2\u015a\u0158\3\2\2\2\u015b\u015e\3\2\2\2\u015c\u015a"+
		"\3\2\2\2\u015c\u015d\3\2\2\2\u015d\65\3\2\2\2\u015e\u015c\3\2\2\2(;=C"+
		"U\\prx|\u0088\u008b\u008f\u0095\u009c\u00ae\u00b3\u00bf\u00c8\u00ce\u00d7"+
		"\u00e1\u00ec\u00f4\u00fa\u00fc\u0106\u010a\u0112\u0116\u0119\u0127\u012c"+
		"\u0132\u0139\u013d\u014b\u0152\u015c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}