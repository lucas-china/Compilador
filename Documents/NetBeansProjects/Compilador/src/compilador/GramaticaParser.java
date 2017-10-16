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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, Tk_Class=33, Tk_Main=34, Tk_PtVirg=35, Tk_AbrePar=36, Tk_FechPar=37, 
		ID=38, INT=39, REAL=40, STRING=41, COMMENT_LINE=42, COMMENT=43, WS=44;
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
		null, "':'", "'Int'", "'Str'", "'Bool'", "'Float'", "','", "'final'", 
		"'='", "'('", "')'", "'return'", "'Void'", "'print'", "'read'", "'++'", 
		"'--'", "'+'", "'-'", "'*'", "'/'", "'if'", "'else'", "'for'", "'!'", 
		"'&&'", "'||'", "'=='", "'=!'", "'>='", "'<='", "'<'", "'>'", "'Class'", 
		"'Main'", "';'", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "Tk_Class", "Tk_Main", 
		"Tk_PtVirg", "Tk_AbrePar", "Tk_FechPar", "ID", "INT", "REAL", "STRING", 
		"COMMENT_LINE", "COMMENT", "WS"
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
					case T__1:
					case T__2:
					case T__3:
					case T__4:
						{
						setState(55);
						decVars();
						}
						break;
					case T__6:
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__11))) != 0)) {
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
			match(T__0);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) ) {
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
			setState(77);
			match(ID);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(78);
				match(T__5);
				setState(79);
				match(ID);
				}
				}
				setState(84);
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
			setState(85);
			match(T__6);
			setState(86);
			tipo();
			setState(87);
			match(ID);
			setState(88);
			match(T__7);
			setState(89);
			valor();
			setState(90);
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
			setState(92);
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
			setState(94);
			tipoRetorno();
			setState(95);
			match(ID);
			setState(96);
			match(T__8);
			setState(97);
			listaParam();
			setState(98);
			match(T__9);
			setState(99);
			match(Tk_AbrePar);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__6))) != 0)) {
				{
				setState(102);
				switch (_input.LA(1)) {
				case T__1:
				case T__2:
				case T__3:
				case T__4:
					{
					setState(100);
					decVars();
					}
					break;
				case T__6:
					{
					setState(101);
					decConsts();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__20) | (1L << T__22) | (1L << ID))) != 0)) {
				{
				{
				setState(107);
				comandos();
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(113);
				retorno();
				}
			}

			setState(116);
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
			setState(129);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) {
				{
				setState(118);
				tipo();
				setState(119);
				match(ID);
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(120);
					match(T__5);
					setState(121);
					tipo();
					setState(122);
					match(ID);
					}
					}
					setState(128);
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
			setState(131);
			match(T__10);
			setState(133);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__17) | (1L << ID) | (1L << INT) | (1L << REAL) | (1L << STRING))) != 0)) {
				{
				setState(132);
				expre();
				}
			}

			setState(135);
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
			setState(139);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case T__3:
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				tipo();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				match(T__11);
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
			setState(141);
			match(Tk_Main);
			setState(142);
			match(Tk_AbrePar);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__20) | (1L << T__22) | (1L << ID))) != 0)) {
				{
				{
				setState(143);
				comandos();
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
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
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				print();
				setState(152);
				match(Tk_PtVirg);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				read();
				setState(155);
				match(Tk_PtVirg);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				chamFuncs();
				setState(158);
				match(Tk_PtVirg);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(160);
				atribuicao();
				setState(161);
				match(Tk_PtVirg);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(163);
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
			setState(166);
			match(T__12);
			setState(167);
			match(T__8);
			setState(169);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__17) | (1L << ID) | (1L << INT) | (1L << REAL) | (1L << STRING))) != 0)) {
				{
				setState(168);
				listaExpre();
				}
			}

			setState(171);
			match(T__9);
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
			setState(173);
			match(T__13);
			setState(174);
			match(T__8);
			setState(175);
			listaIDs();
			setState(176);
			match(T__9);
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
			setState(178);
			match(ID);
			setState(179);
			match(T__8);
			setState(181);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__17) | (1L << ID) | (1L << INT) | (1L << REAL) | (1L << STRING))) != 0)) {
				{
				setState(180);
				listaExpre();
				}
			}

			setState(183);
			match(T__9);
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
			setState(185);
			expre();
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(186);
				match(T__5);
				setState(187);
				expre();
				}
				}
				setState(192);
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
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				valor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
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
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				match(ID);
				setState(199);
				match(T__7);
				setState(200);
				expre();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				match(ID);
				setState(202);
				match(T__14);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(203);
				match(ID);
				setState(204);
				match(T__15);
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
			setState(208);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FuncMathContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_funcMath);
					setState(210);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(211);
					_la = _input.LA(1);
					if ( !(_la==T__16 || _la==T__17) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(212);
					term(0);
					}
					} 
				}
				setState(217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
			setState(219);
			fator();
			}
			_ctx.stop = _input.LT(-1);
			setState(226);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TermContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(221);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(222);
					_la = _input.LA(1);
					if ( !(_la==T__18 || _la==T__19) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(223);
					fator();
					}
					} 
				}
				setState(228);
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
			setState(242);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				match(T__8);
				setState(230);
				funcMath(0);
				setState(231);
				match(T__9);
				}
				break;
			case T__17:
			case ID:
			case INT:
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(233);
					match(T__17);
					}
				}

				setState(240);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(236);
					match(INT);
					}
					break;
				case 2:
					{
					setState(237);
					match(REAL);
					}
					break;
				case 3:
					{
					setState(238);
					match(ID);
					}
					break;
				case 4:
					{
					setState(239);
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
			setState(290);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				match(T__20);
				setState(245);
				match(T__8);
				setState(246);
				testeLogic(0);
				setState(247);
				match(T__9);
				setState(248);
				match(Tk_AbrePar);
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__20) | (1L << T__22) | (1L << ID))) != 0)) {
					{
					{
					setState(249);
					comandos();
					}
					}
					setState(254);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(256);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(255);
					retorno();
					}
				}

				setState(258);
				match(Tk_FechPar);
				setState(271);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(259);
					match(T__21);
					setState(260);
					match(Tk_AbrePar);
					setState(264);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__20) | (1L << T__22) | (1L << ID))) != 0)) {
						{
						{
						setState(261);
						comandos();
						}
						}
						setState(266);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(268);
					_la = _input.LA(1);
					if (_la==T__10) {
						{
						setState(267);
						retorno();
						}
					}

					setState(270);
					match(Tk_FechPar);
					}
				}

				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				match(T__22);
				setState(274);
				match(T__8);
				setState(275);
				varControl();
				setState(276);
				match(Tk_PtVirg);
				setState(277);
				testeLogic(0);
				setState(278);
				match(Tk_PtVirg);
				setState(279);
				incrementos();
				setState(280);
				match(T__9);
				setState(281);
				match(Tk_AbrePar);
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__20) | (1L << T__22) | (1L << ID))) != 0)) {
					{
					{
					setState(282);
					comandos();
					}
					}
					setState(287);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(288);
				match(Tk_FechPar);
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
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(292);
				match(ID);
				}
				break;
			case 2:
				{
				setState(293);
				match(ID);
				setState(294);
				match(T__7);
				setState(295);
				match(INT);
				}
				break;
			}
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(298);
				match(T__5);
				setState(303);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(299);
					match(ID);
					}
					break;
				case 2:
					{
					setState(300);
					match(ID);
					setState(301);
					match(T__7);
					setState(302);
					match(INT);
					}
					break;
				}
				}
				}
				setState(309);
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
			setState(321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(311);
				match(T__23);
				setState(312);
				testeLogic(4);
				}
				break;
			case 2:
				{
				setState(313);
				match(T__8);
				setState(314);
				testeLogic(0);
				setState(315);
				match(T__9);
				}
				break;
			case 3:
				{
				setState(317);
				expre();
				setState(318);
				opLogic();
				setState(319);
				expre();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(328);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TesteLogicContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_testeLogic);
					setState(323);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(324);
					_la = _input.LA(1);
					if ( !(_la==T__24 || _la==T__25) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(325);
					testeLogic(4);
					}
					} 
				}
				setState(330);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
			setState(331);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) ) {
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
			setState(333);
			atribuicao();
			}
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(334);
				match(T__5);
				setState(335);
				atribuicao();
				}
				}
				setState(340);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3.\u0158\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\7\2<\n\2\f\2\16\2?\13\2\3\2\7"+
		"\2B\n\2\f\2\16\2E\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5"+
		"\7\5S\n\5\f\5\16\5V\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\7\bi\n\b\f\b\16\bl\13\b\3\b\7\bo\n\b\f\b\16\br"+
		"\13\b\3\b\5\bu\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\7\t\177\n\t\f\t\16"+
		"\t\u0082\13\t\5\t\u0084\n\t\3\n\3\n\5\n\u0088\n\n\3\n\3\n\3\13\3\13\5"+
		"\13\u008e\n\13\3\f\3\f\3\f\7\f\u0093\n\f\f\f\16\f\u0096\13\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00a7\n\r\3\16"+
		"\3\16\3\16\5\16\u00ac\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\5\20\u00b8\n\20\3\20\3\20\3\21\3\21\3\21\7\21\u00bf\n\21\f\21\16"+
		"\21\u00c2\13\21\3\22\3\22\3\22\5\22\u00c7\n\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u00d0\n\23\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00d8\n"+
		"\24\f\24\16\24\u00db\13\24\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u00e3\n"+
		"\25\f\25\16\25\u00e6\13\25\3\26\3\26\3\26\3\26\3\26\5\26\u00ed\n\26\3"+
		"\26\3\26\3\26\3\26\5\26\u00f3\n\26\5\26\u00f5\n\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\7\27\u00fd\n\27\f\27\16\27\u0100\13\27\3\27\5\27\u0103\n\27"+
		"\3\27\3\27\3\27\3\27\7\27\u0109\n\27\f\27\16\27\u010c\13\27\3\27\5\27"+
		"\u010f\n\27\3\27\5\27\u0112\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\7\27\u011e\n\27\f\27\16\27\u0121\13\27\3\27\3\27\5\27\u0125"+
		"\n\27\3\30\3\30\3\30\3\30\5\30\u012b\n\30\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u0132\n\30\7\30\u0134\n\30\f\30\16\30\u0137\13\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0144\n\31\3\31\3\31\3\31\7\31"+
		"\u0149\n\31\f\31\16\31\u014c\13\31\3\32\3\32\3\33\3\33\3\33\7\33\u0153"+
		"\n\33\f\33\16\33\u0156\13\33\3\33\2\5&(\60\34\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\2\b\3\2\4\7\3\2)+\3\2\23\24\3\2\25\26"+
		"\3\2\33\34\3\2\35\"\u016a\2\66\3\2\2\2\4H\3\2\2\2\6M\3\2\2\2\bO\3\2\2"+
		"\2\nW\3\2\2\2\f^\3\2\2\2\16`\3\2\2\2\20\u0083\3\2\2\2\22\u0085\3\2\2\2"+
		"\24\u008d\3\2\2\2\26\u008f\3\2\2\2\30\u00a6\3\2\2\2\32\u00a8\3\2\2\2\34"+
		"\u00af\3\2\2\2\36\u00b4\3\2\2\2 \u00bb\3\2\2\2\"\u00c6\3\2\2\2$\u00cf"+
		"\3\2\2\2&\u00d1\3\2\2\2(\u00dc\3\2\2\2*\u00f4\3\2\2\2,\u0124\3\2\2\2."+
		"\u012a\3\2\2\2\60\u0143\3\2\2\2\62\u014d\3\2\2\2\64\u014f\3\2\2\2\66\67"+
		"\7#\2\2\678\7(\2\28=\7%\2\29<\5\4\3\2:<\5\n\6\2;9\3\2\2\2;:\3\2\2\2<?"+
		"\3\2\2\2=;\3\2\2\2=>\3\2\2\2>C\3\2\2\2?=\3\2\2\2@B\5\16\b\2A@\3\2\2\2"+
		"BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2EC\3\2\2\2FG\5\26\f\2G\3\3\2\2"+
		"\2HI\5\6\4\2IJ\7\3\2\2JK\5\b\5\2KL\7%\2\2L\5\3\2\2\2MN\t\2\2\2N\7\3\2"+
		"\2\2OT\7(\2\2PQ\7\b\2\2QS\7(\2\2RP\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2"+
		"\2U\t\3\2\2\2VT\3\2\2\2WX\7\t\2\2XY\5\6\4\2YZ\7(\2\2Z[\7\n\2\2[\\\5\f"+
		"\7\2\\]\7%\2\2]\13\3\2\2\2^_\t\3\2\2_\r\3\2\2\2`a\5\24\13\2ab\7(\2\2b"+
		"c\7\13\2\2cd\5\20\t\2de\7\f\2\2ej\7&\2\2fi\5\4\3\2gi\5\n\6\2hf\3\2\2\2"+
		"hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2kp\3\2\2\2lj\3\2\2\2mo\5\30\r"+
		"\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qt\3\2\2\2rp\3\2\2\2su\5\22"+
		"\n\2ts\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\7\'\2\2w\17\3\2\2\2xy\5\6\4\2y\u0080"+
		"\7(\2\2z{\7\b\2\2{|\5\6\4\2|}\7(\2\2}\177\3\2\2\2~z\3\2\2\2\177\u0082"+
		"\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0084\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\u0083x\3\2\2\2\u0083\u0084\3\2\2\2\u0084\21\3\2\2\2\u0085"+
		"\u0087\7\r\2\2\u0086\u0088\5\"\22\2\u0087\u0086\3\2\2\2\u0087\u0088\3"+
		"\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\7%\2\2\u008a\23\3\2\2\2\u008b\u008e"+
		"\5\6\4\2\u008c\u008e\7\16\2\2\u008d\u008b\3\2\2\2\u008d\u008c\3\2\2\2"+
		"\u008e\25\3\2\2\2\u008f\u0090\7$\2\2\u0090\u0094\7&\2\2\u0091\u0093\5"+
		"\30\r\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098\7\'"+
		"\2\2\u0098\27\3\2\2\2\u0099\u009a\5\32\16\2\u009a\u009b\7%\2\2\u009b\u00a7"+
		"\3\2\2\2\u009c\u009d\5\34\17\2\u009d\u009e\7%\2\2\u009e\u00a7\3\2\2\2"+
		"\u009f\u00a0\5\36\20\2\u00a0\u00a1\7%\2\2\u00a1\u00a7\3\2\2\2\u00a2\u00a3"+
		"\5$\23\2\u00a3\u00a4\7%\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a7\5,\27\2\u00a6"+
		"\u0099\3\2\2\2\u00a6\u009c\3\2\2\2\u00a6\u009f\3\2\2\2\u00a6\u00a2\3\2"+
		"\2\2\u00a6\u00a5\3\2\2\2\u00a7\31\3\2\2\2\u00a8\u00a9\7\17\2\2\u00a9\u00ab"+
		"\7\13\2\2\u00aa\u00ac\5 \21\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2"+
		"\u00ac\u00ad\3\2\2\2\u00ad\u00ae\7\f\2\2\u00ae\33\3\2\2\2\u00af\u00b0"+
		"\7\20\2\2\u00b0\u00b1\7\13\2\2\u00b1\u00b2\5\b\5\2\u00b2\u00b3\7\f\2\2"+
		"\u00b3\35\3\2\2\2\u00b4\u00b5\7(\2\2\u00b5\u00b7\7\13\2\2\u00b6\u00b8"+
		"\5 \21\2\u00b7\u00b6\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00ba\7\f\2\2\u00ba\37\3\2\2\2\u00bb\u00c0\5\"\22\2\u00bc\u00bd\7\b\2"+
		"\2\u00bd\u00bf\5\"\22\2\u00be\u00bc\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1!\3\2\2\2\u00c2\u00c0\3\2\2\2"+
		"\u00c3\u00c7\7(\2\2\u00c4\u00c7\5\f\7\2\u00c5\u00c7\5&\24\2\u00c6\u00c3"+
		"\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7#\3\2\2\2\u00c8"+
		"\u00c9\7(\2\2\u00c9\u00ca\7\n\2\2\u00ca\u00d0\5\"\22\2\u00cb\u00cc\7("+
		"\2\2\u00cc\u00d0\7\21\2\2\u00cd\u00ce\7(\2\2\u00ce\u00d0\7\22\2\2\u00cf"+
		"\u00c8\3\2\2\2\u00cf\u00cb\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0%\3\2\2\2"+
		"\u00d1\u00d2\b\24\1\2\u00d2\u00d3\5(\25\2\u00d3\u00d9\3\2\2\2\u00d4\u00d5"+
		"\f\4\2\2\u00d5\u00d6\t\4\2\2\u00d6\u00d8\5(\25\2\u00d7\u00d4\3\2\2\2\u00d8"+
		"\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\'\3\2\2\2"+
		"\u00db\u00d9\3\2\2\2\u00dc\u00dd\b\25\1\2\u00dd\u00de\5*\26\2\u00de\u00e4"+
		"\3\2\2\2\u00df\u00e0\f\4\2\2\u00e0\u00e1\t\5\2\2\u00e1\u00e3\5*\26\2\u00e2"+
		"\u00df\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2"+
		"\2\2\u00e5)\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8\7\13\2\2\u00e8\u00e9"+
		"\5&\24\2\u00e9\u00ea\7\f\2\2\u00ea\u00f5\3\2\2\2\u00eb\u00ed\7\24\2\2"+
		"\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00f2\3\2\2\2\u00ee\u00f3"+
		"\7)\2\2\u00ef\u00f3\7*\2\2\u00f0\u00f3\7(\2\2\u00f1\u00f3\5\36\20\2\u00f2"+
		"\u00ee\3\2\2\2\u00f2\u00ef\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f1\3\2"+
		"\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00e7\3\2\2\2\u00f4\u00ec\3\2\2\2\u00f5"+
		"+\3\2\2\2\u00f6\u00f7\7\27\2\2\u00f7\u00f8\7\13\2\2\u00f8\u00f9\5\60\31"+
		"\2\u00f9\u00fa\7\f\2\2\u00fa\u00fe\7&\2\2\u00fb\u00fd\5\30\r\2\u00fc\u00fb"+
		"\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0103\5\22\n\2\u0102\u0101\3"+
		"\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0111\7\'\2\2\u0105"+
		"\u0106\7\30\2\2\u0106\u010a\7&\2\2\u0107\u0109\5\30\r\2\u0108\u0107\3"+
		"\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010f\5\22\n\2\u010e\u010d\3"+
		"\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112\7\'\2\2\u0111"+
		"\u0105\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0125\3\2\2\2\u0113\u0114\7\31"+
		"\2\2\u0114\u0115\7\13\2\2\u0115\u0116\5.\30\2\u0116\u0117\7%\2\2\u0117"+
		"\u0118\5\60\31\2\u0118\u0119\7%\2\2\u0119\u011a\5\64\33\2\u011a\u011b"+
		"\7\f\2\2\u011b\u011f\7&\2\2\u011c\u011e\5\30\r\2\u011d\u011c\3\2\2\2\u011e"+
		"\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0122\3\2"+
		"\2\2\u0121\u011f\3\2\2\2\u0122\u0123\7\'\2\2\u0123\u0125\3\2\2\2\u0124"+
		"\u00f6\3\2\2\2\u0124\u0113\3\2\2\2\u0125-\3\2\2\2\u0126\u012b\7(\2\2\u0127"+
		"\u0128\7(\2\2\u0128\u0129\7\n\2\2\u0129\u012b\7)\2\2\u012a\u0126\3\2\2"+
		"\2\u012a\u0127\3\2\2\2\u012b\u0135\3\2\2\2\u012c\u0131\7\b\2\2\u012d\u0132"+
		"\7(\2\2\u012e\u012f\7(\2\2\u012f\u0130\7\n\2\2\u0130\u0132\7)\2\2\u0131"+
		"\u012d\3\2\2\2\u0131\u012e\3\2\2\2\u0132\u0134\3\2\2\2\u0133\u012c\3\2"+
		"\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"/\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u0139\b\31\1\2\u0139\u013a\7\32\2"+
		"\2\u013a\u0144\5\60\31\6\u013b\u013c\7\13\2\2\u013c\u013d\5\60\31\2\u013d"+
		"\u013e\7\f\2\2\u013e\u0144\3\2\2\2\u013f\u0140\5\"\22\2\u0140\u0141\5"+
		"\62\32\2\u0141\u0142\5\"\22\2\u0142\u0144\3\2\2\2\u0143\u0138\3\2\2\2"+
		"\u0143\u013b\3\2\2\2\u0143\u013f\3\2\2\2\u0144\u014a\3\2\2\2\u0145\u0146"+
		"\f\5\2\2\u0146\u0147\t\6\2\2\u0147\u0149\5\60\31\6\u0148\u0145\3\2\2\2"+
		"\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\61"+
		"\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u014e\t\7\2\2\u014e\63\3\2\2\2\u014f"+
		"\u0154\5$\23\2\u0150\u0151\7\b\2\2\u0151\u0153\5$\23\2\u0152\u0150\3\2"+
		"\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155"+
		"\65\3\2\2\2\u0156\u0154\3\2\2\2\';=CThjpt\u0080\u0083\u0087\u008d\u0094"+
		"\u00a6\u00ab\u00b7\u00c0\u00c6\u00cf\u00d9\u00e4\u00ec\u00f2\u00f4\u00fe"+
		"\u0102\u010a\u010e\u0111\u011f\u0124\u012a\u0131\u0135\u0143\u014a\u0154";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}