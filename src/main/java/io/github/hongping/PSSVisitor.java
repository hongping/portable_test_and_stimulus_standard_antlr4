// Generated from c:\Users\htan31\Documents\My Stuff\My Project\pss_antlr4_grammar\PSS.g4 by ANTLR 4.7.1

package io.github.hongping;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PSSParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PSSVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PSSParser#model}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel(PSSParser.ModelContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSSParser#portable_stimulus_desc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPortable_stimulus_desc(PSSParser.Portable_stimulus_descContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSSParser#component_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent_declaration(PSSParser.Component_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSSParser#component_super_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent_super_spec(PSSParser.Component_super_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSSParser#component_body_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent_body_item(PSSParser.Component_body_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSSParser#component_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent_identifier(PSSParser.Component_identifierContext ctx);
}