// Generated from /home/lucas_brito/Documents/Compiladores/Compiladores/Documents/NetBeansProjects/Compilador/src/compilador/Gramatica.g4 by ANTLR 4.5.3
package compilador;

  import java.util.HashMap;
  import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaParser}.
 */
public interface GramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(GramaticaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(GramaticaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#decVars}.
	 * @param ctx the parse tree
	 */
	void enterDecVars(GramaticaParser.DecVarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#decVars}.
	 * @param ctx the parse tree
	 */
	void exitDecVars(GramaticaParser.DecVarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(GramaticaParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(GramaticaParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#listaIDs}.
	 * @param ctx the parse tree
	 */
	void enterListaIDs(GramaticaParser.ListaIDsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#listaIDs}.
	 * @param ctx the parse tree
	 */
	void exitListaIDs(GramaticaParser.ListaIDsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#decConsts}.
	 * @param ctx the parse tree
	 */
	void enterDecConsts(GramaticaParser.DecConstsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#decConsts}.
	 * @param ctx the parse tree
	 */
	void exitDecConsts(GramaticaParser.DecConstsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(GramaticaParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(GramaticaParser.ValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#decFuncs}.
	 * @param ctx the parse tree
	 */
	void enterDecFuncs(GramaticaParser.DecFuncsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#decFuncs}.
	 * @param ctx the parse tree
	 */
	void exitDecFuncs(GramaticaParser.DecFuncsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#listaParam}.
	 * @param ctx the parse tree
	 */
	void enterListaParam(GramaticaParser.ListaParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#listaParam}.
	 * @param ctx the parse tree
	 */
	void exitListaParam(GramaticaParser.ListaParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(GramaticaParser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(GramaticaParser.RetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#tipoRetorno}.
	 * @param ctx the parse tree
	 */
	void enterTipoRetorno(GramaticaParser.TipoRetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#tipoRetorno}.
	 * @param ctx the parse tree
	 */
	void exitTipoRetorno(GramaticaParser.TipoRetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(GramaticaParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(GramaticaParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(GramaticaParser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(GramaticaParser.ComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(GramaticaParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(GramaticaParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(GramaticaParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(GramaticaParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#chamFuncs}.
	 * @param ctx the parse tree
	 */
	void enterChamFuncs(GramaticaParser.ChamFuncsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#chamFuncs}.
	 * @param ctx the parse tree
	 */
	void exitChamFuncs(GramaticaParser.ChamFuncsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#listaExpre}.
	 * @param ctx the parse tree
	 */
	void enterListaExpre(GramaticaParser.ListaExpreContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#listaExpre}.
	 * @param ctx the parse tree
	 */
	void exitListaExpre(GramaticaParser.ListaExpreContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#expre}.
	 * @param ctx the parse tree
	 */
	void enterExpre(GramaticaParser.ExpreContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#expre}.
	 * @param ctx the parse tree
	 */
	void exitExpre(GramaticaParser.ExpreContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(GramaticaParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(GramaticaParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#funcMath}.
	 * @param ctx the parse tree
	 */
	void enterFuncMath(GramaticaParser.FuncMathContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#funcMath}.
	 * @param ctx the parse tree
	 */
	void exitFuncMath(GramaticaParser.FuncMathContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(GramaticaParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(GramaticaParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(GramaticaParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(GramaticaParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#controle}.
	 * @param ctx the parse tree
	 */
	void enterControle(GramaticaParser.ControleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#controle}.
	 * @param ctx the parse tree
	 */
	void exitControle(GramaticaParser.ControleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#varControl}.
	 * @param ctx the parse tree
	 */
	void enterVarControl(GramaticaParser.VarControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#varControl}.
	 * @param ctx the parse tree
	 */
	void exitVarControl(GramaticaParser.VarControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#testeLogic}.
	 * @param ctx the parse tree
	 */
	void enterTesteLogic(GramaticaParser.TesteLogicContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#testeLogic}.
	 * @param ctx the parse tree
	 */
	void exitTesteLogic(GramaticaParser.TesteLogicContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#opLogic}.
	 * @param ctx the parse tree
	 */
	void enterOpLogic(GramaticaParser.OpLogicContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#opLogic}.
	 * @param ctx the parse tree
	 */
	void exitOpLogic(GramaticaParser.OpLogicContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#incrementos}.
	 * @param ctx the parse tree
	 */
	void enterIncrementos(GramaticaParser.IncrementosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#incrementos}.
	 * @param ctx the parse tree
	 */
	void exitIncrementos(GramaticaParser.IncrementosContext ctx);
}