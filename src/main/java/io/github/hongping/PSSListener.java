// Generated from c:\Users\htan31\Documents\My Stuff\My Project\pss_antlr4_grammar\PSS.g4 by ANTLR 4.7.1

package io.github.hongping;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PSSParser}.
 */
public interface PSSListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PSSParser#model}.
	 * @param ctx the parse tree
	 */
	void enterModel(PSSParser.ModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSSParser#model}.
	 * @param ctx the parse tree
	 */
	void exitModel(PSSParser.ModelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSSParser#portable_stimulus_desc}.
	 * @param ctx the parse tree
	 */
	void enterPortable_stimulus_desc(PSSParser.Portable_stimulus_descContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSSParser#portable_stimulus_desc}.
	 * @param ctx the parse tree
	 */
	void exitPortable_stimulus_desc(PSSParser.Portable_stimulus_descContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSSParser#component_declaration}.
	 * @param ctx the parse tree
	 */
	void enterComponent_declaration(PSSParser.Component_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSSParser#component_declaration}.
	 * @param ctx the parse tree
	 */
	void exitComponent_declaration(PSSParser.Component_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSSParser#component_super_spec}.
	 * @param ctx the parse tree
	 */
	void enterComponent_super_spec(PSSParser.Component_super_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSSParser#component_super_spec}.
	 * @param ctx the parse tree
	 */
	void exitComponent_super_spec(PSSParser.Component_super_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSSParser#component_body_item}.
	 * @param ctx the parse tree
	 */
	void enterComponent_body_item(PSSParser.Component_body_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSSParser#component_body_item}.
	 * @param ctx the parse tree
	 */
	void exitComponent_body_item(PSSParser.Component_body_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSSParser#component_identifier}.
	 * @param ctx the parse tree
	 */
	void enterComponent_identifier(PSSParser.Component_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSSParser#component_identifier}.
	 * @param ctx the parse tree
	 */
	void exitComponent_identifier(PSSParser.Component_identifierContext ctx);
}