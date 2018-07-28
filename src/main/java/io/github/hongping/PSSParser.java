// Generated from c:\Users\htan31\Documents\My Stuff\My Project\pss_antlr4_grammar\PSS.g4 by ANTLR 4.7.1

package io.github.hongping;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PSSParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, Simple_identifier=6, Whitespace=7;
	public static final int
		RULE_model = 0, RULE_portable_stimulus_desc = 1, RULE_component_declaration = 2, 
		RULE_component_super_spec = 3, RULE_component_body_item = 4, RULE_component_identifier = 5;
	public static final String[] ruleNames = {
		"model", "portable_stimulus_desc", "component_declaration", "component_super_spec", 
		"component_body_item", "component_identifier"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'component'", "':'", "'{'", "'}'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "Simple_identifier", "Whitespace"
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
	public String getGrammarFileName() { return "PSS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PSSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ModelContext extends ParserRuleContext {
		public Portable_stimulus_descContext portable_stimulus_desc() {
			return getRuleContext(Portable_stimulus_descContext.class,0);
		}
		public ModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSSListener ) ((PSSListener)listener).enterModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSSListener ) ((PSSListener)listener).exitModel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSSVisitor ) return ((PSSVisitor<? extends T>)visitor).visitModel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModelContext model() throws RecognitionException {
		ModelContext _localctx = new ModelContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_model);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			portable_stimulus_desc();
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

	public static class Portable_stimulus_descContext extends ParserRuleContext {
		public Component_declarationContext component_declaration() {
			return getRuleContext(Component_declarationContext.class,0);
		}
		public Portable_stimulus_descContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_portable_stimulus_desc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSSListener ) ((PSSListener)listener).enterPortable_stimulus_desc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSSListener ) ((PSSListener)listener).exitPortable_stimulus_desc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSSVisitor ) return ((PSSVisitor<? extends T>)visitor).visitPortable_stimulus_desc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Portable_stimulus_descContext portable_stimulus_desc() throws RecognitionException {
		Portable_stimulus_descContext _localctx = new Portable_stimulus_descContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_portable_stimulus_desc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			component_declaration();
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

	public static class Component_declarationContext extends ParserRuleContext {
		public Component_identifierContext component_identifier() {
			return getRuleContext(Component_identifierContext.class,0);
		}
		public Component_super_specContext component_super_spec() {
			return getRuleContext(Component_super_specContext.class,0);
		}
		public List<Component_body_itemContext> component_body_item() {
			return getRuleContexts(Component_body_itemContext.class);
		}
		public Component_body_itemContext component_body_item(int i) {
			return getRuleContext(Component_body_itemContext.class,i);
		}
		public Component_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSSListener ) ((PSSListener)listener).enterComponent_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSSListener ) ((PSSListener)listener).exitComponent_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSSVisitor ) return ((PSSVisitor<? extends T>)visitor).visitComponent_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Component_declarationContext component_declaration() throws RecognitionException {
		Component_declarationContext _localctx = new Component_declarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_component_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(T__0);
			setState(17);
			component_identifier();
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(18);
				match(T__1);
				setState(19);
				component_super_spec();
				}
			}

			setState(22);
			match(T__2);
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Simple_identifier) {
				{
				{
				setState(23);
				component_body_item();
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29);
			match(T__3);
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(30);
				match(T__4);
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

	public static class Component_super_specContext extends ParserRuleContext {
		public TerminalNode Simple_identifier() { return getToken(PSSParser.Simple_identifier, 0); }
		public Component_super_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component_super_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSSListener ) ((PSSListener)listener).enterComponent_super_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSSListener ) ((PSSListener)listener).exitComponent_super_spec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSSVisitor ) return ((PSSVisitor<? extends T>)visitor).visitComponent_super_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Component_super_specContext component_super_spec() throws RecognitionException {
		Component_super_specContext _localctx = new Component_super_specContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_component_super_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(T__1);
			setState(34);
			match(Simple_identifier);
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

	public static class Component_body_itemContext extends ParserRuleContext {
		public TerminalNode Simple_identifier() { return getToken(PSSParser.Simple_identifier, 0); }
		public Component_body_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component_body_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSSListener ) ((PSSListener)listener).enterComponent_body_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSSListener ) ((PSSListener)listener).exitComponent_body_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSSVisitor ) return ((PSSVisitor<? extends T>)visitor).visitComponent_body_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Component_body_itemContext component_body_item() throws RecognitionException {
		Component_body_itemContext _localctx = new Component_body_itemContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_component_body_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(Simple_identifier);
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

	public static class Component_identifierContext extends ParserRuleContext {
		public TerminalNode Simple_identifier() { return getToken(PSSParser.Simple_identifier, 0); }
		public Component_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSSListener ) ((PSSListener)listener).enterComponent_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSSListener ) ((PSSListener)listener).exitComponent_identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSSVisitor ) return ((PSSVisitor<? extends T>)visitor).visitComponent_identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Component_identifierContext component_identifier() throws RecognitionException {
		Component_identifierContext _localctx = new Component_identifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_component_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(Simple_identifier);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\t+\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\5\4"+
		"\27\n\4\3\4\3\4\7\4\33\n\4\f\4\16\4\36\13\4\3\4\3\4\5\4\"\n\4\3\5\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\2\2\'\2\16\3\2\2\2\4\20\3"+
		"\2\2\2\6\22\3\2\2\2\b#\3\2\2\2\n&\3\2\2\2\f(\3\2\2\2\16\17\5\4\3\2\17"+
		"\3\3\2\2\2\20\21\5\6\4\2\21\5\3\2\2\2\22\23\7\3\2\2\23\26\5\f\7\2\24\25"+
		"\7\4\2\2\25\27\5\b\5\2\26\24\3\2\2\2\26\27\3\2\2\2\27\30\3\2\2\2\30\34"+
		"\7\5\2\2\31\33\5\n\6\2\32\31\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34\35"+
		"\3\2\2\2\35\37\3\2\2\2\36\34\3\2\2\2\37!\7\6\2\2 \"\7\7\2\2! \3\2\2\2"+
		"!\"\3\2\2\2\"\7\3\2\2\2#$\7\4\2\2$%\7\b\2\2%\t\3\2\2\2&\'\7\b\2\2\'\13"+
		"\3\2\2\2()\7\b\2\2)\r\3\2\2\2\5\26\34!";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}