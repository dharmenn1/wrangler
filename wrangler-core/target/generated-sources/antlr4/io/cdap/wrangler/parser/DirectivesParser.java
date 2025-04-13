// Generated from io\cdap\wrangler\parser\Directives.g4 by ANTLR 4.7
package io.cdap.wrangler.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DirectivesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, OBrace=9, 
		CBrace=10, SColon=11, Or=12, And=13, Equals=14, NEquals=15, GTEquals=16, 
		LTEquals=17, Match=18, NotMatch=19, QuestionColon=20, StartsWith=21, NotStartsWith=22, 
		EndsWith=23, NotEndsWith=24, PlusEqual=25, SubEqual=26, MulEqual=27, DivEqual=28, 
		PerEqual=29, AndEqual=30, OrEqual=31, XOREqual=32, Pow=33, External=34, 
		GT=35, LT=36, Add=37, Subtract=38, Multiply=39, Divide=40, Modulus=41, 
		OBracket=42, CBracket=43, OParen=44, CParen=45, Assign=46, Comma=47, QMark=48, 
		Colon=49, Dot=50, At=51, Pipe=52, BackSlash=53, Dollar=54, Tilde=55, Bool=56, 
		Number=57, BYTE_SIZE=58, TIME_DURATION=59, Identifier=60, Macro=61, Column=62, 
		String=63, EscapeSequence=64, Comment=65, Space=66;
	public static final int
		RULE_recipe = 0, RULE_statements = 1, RULE_directive = 2, RULE_ifStatement = 3, 
		RULE_ifStat = 4, RULE_elseIfStat = 5, RULE_elseStat = 6, RULE_expression = 7, 
		RULE_forStatement = 8, RULE_macro = 9, RULE_pragma = 10, RULE_pragmaLoadDirective = 11, 
		RULE_pragmaVersion = 12, RULE_codeblock = 13, RULE_identifier = 14, RULE_properties = 15, 
		RULE_propertyList = 16, RULE_property = 17, RULE_numberRanges = 18, RULE_numberRange = 19, 
		RULE_value = 20, RULE_byteSizeArg = 21, RULE_timeDurationArg = 22, RULE_ecommand = 23, 
		RULE_config = 24, RULE_column = 25, RULE_text = 26, RULE_number = 27, 
		RULE_bool = 28, RULE_condition = 29, RULE_command = 30, RULE_colList = 31, 
		RULE_numberList = 32, RULE_boolList = 33, RULE_stringList = 34, RULE_identifierList = 35;
	public static final String[] ruleNames = {
		"recipe", "statements", "directive", "ifStatement", "ifStat", "elseIfStat", 
		"elseStat", "expression", "forStatement", "macro", "pragma", "pragmaLoadDirective", 
		"pragmaVersion", "codeblock", "identifier", "properties", "propertyList", 
		"property", "numberRanges", "numberRange", "value", "byteSizeArg", "timeDurationArg", 
		"ecommand", "config", "column", "text", "number", "bool", "condition", 
		"command", "colList", "numberList", "boolList", "stringList", "identifierList"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'if'", "'else'", "'for'", "'#pragma'", "'load-directives'", "'version'", 
		"'exp'", "'prop'", "'{'", "'}'", "';'", "'||'", "'&&'", "'=='", "'!='", 
		"'>='", "'<='", "'=~'", "'!~'", "'?:'", "'=^'", "'!^'", "'=$'", "'!$'", 
		"'+='", "'-='", "'*='", "'/='", "'%='", "'&='", "'|='", "'^='", "'^'", 
		"'!'", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'['", "']'", 
		"'('", "')'", "'='", "','", "'?'", "':'", "'.'", "'@'", "'|'", "'\\'", 
		"'$'", "'~'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "OBrace", "CBrace", 
		"SColon", "Or", "And", "Equals", "NEquals", "GTEquals", "LTEquals", "Match", 
		"NotMatch", "QuestionColon", "StartsWith", "NotStartsWith", "EndsWith", 
		"NotEndsWith", "PlusEqual", "SubEqual", "MulEqual", "DivEqual", "PerEqual", 
		"AndEqual", "OrEqual", "XOREqual", "Pow", "External", "GT", "LT", "Add", 
		"Subtract", "Multiply", "Divide", "Modulus", "OBracket", "CBracket", "OParen", 
		"CParen", "Assign", "Comma", "QMark", "Colon", "Dot", "At", "Pipe", "BackSlash", 
		"Dollar", "Tilde", "Bool", "Number", "BYTE_SIZE", "TIME_DURATION", "Identifier", 
		"Macro", "Column", "String", "EscapeSequence", "Comment", "Space"
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
	public String getGrammarFileName() { return "Directives.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DirectivesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RecipeContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(DirectivesParser.EOF, 0); }
		public RecipeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recipe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterRecipe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitRecipe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitRecipe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecipeContext recipe() throws RecognitionException {
		RecipeContext _localctx = new RecipeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_recipe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			statements();
			setState(73);
			match(EOF);
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

	public static class StatementsContext extends ParserRuleContext {
		public List<TerminalNode> Comment() { return getTokens(DirectivesParser.Comment); }
		public TerminalNode Comment(int i) {
			return getToken(DirectivesParser.Comment, i);
		}
		public List<MacroContext> macro() {
			return getRuleContexts(MacroContext.class);
		}
		public MacroContext macro(int i) {
			return getRuleContext(MacroContext.class,i);
		}
		public List<DirectiveContext> directive() {
			return getRuleContexts(DirectiveContext.class);
		}
		public DirectiveContext directive(int i) {
			return getRuleContext(DirectiveContext.class,i);
		}
		public List<PragmaContext> pragma() {
			return getRuleContexts(PragmaContext.class);
		}
		public PragmaContext pragma(int i) {
			return getRuleContext(PragmaContext.class,i);
		}
		public List<IfStatementContext> ifStatement() {
			return getRuleContexts(IfStatementContext.class);
		}
		public IfStatementContext ifStatement(int i) {
			return getRuleContext(IfStatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << Dollar) | (1L << Identifier))) != 0) || _la==Comment) {
				{
				setState(84);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Comment:
					{
					setState(75);
					match(Comment);
					}
					break;
				case Dollar:
					{
					setState(76);
					macro();
					}
					break;
				case Identifier:
					{
					setState(77);
					directive();
					setState(78);
					match(SColon);
					}
					break;
				case T__3:
					{
					setState(80);
					pragma();
					setState(81);
					match(SColon);
					}
					break;
				case T__0:
					{
					setState(83);
					ifStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(88);
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

	public static class DirectiveContext extends ParserRuleContext {
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public List<CodeblockContext> codeblock() {
			return getRuleContexts(CodeblockContext.class);
		}
		public CodeblockContext codeblock(int i) {
			return getRuleContext(CodeblockContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<MacroContext> macro() {
			return getRuleContexts(MacroContext.class);
		}
		public MacroContext macro(int i) {
			return getRuleContext(MacroContext.class,i);
		}
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<BoolContext> bool() {
			return getRuleContexts(BoolContext.class);
		}
		public BoolContext bool(int i) {
			return getRuleContext(BoolContext.class,i);
		}
		public List<ColumnContext> column() {
			return getRuleContexts(ColumnContext.class);
		}
		public ColumnContext column(int i) {
			return getRuleContext(ColumnContext.class,i);
		}
		public List<ColListContext> colList() {
			return getRuleContexts(ColListContext.class);
		}
		public ColListContext colList(int i) {
			return getRuleContext(ColListContext.class,i);
		}
		public List<NumberListContext> numberList() {
			return getRuleContexts(NumberListContext.class);
		}
		public NumberListContext numberList(int i) {
			return getRuleContext(NumberListContext.class,i);
		}
		public List<BoolListContext> boolList() {
			return getRuleContexts(BoolListContext.class);
		}
		public BoolListContext boolList(int i) {
			return getRuleContext(BoolListContext.class,i);
		}
		public List<StringListContext> stringList() {
			return getRuleContexts(StringListContext.class);
		}
		public StringListContext stringList(int i) {
			return getRuleContext(StringListContext.class,i);
		}
		public List<NumberRangesContext> numberRanges() {
			return getRuleContexts(NumberRangesContext.class);
		}
		public NumberRangesContext numberRanges(int i) {
			return getRuleContext(NumberRangesContext.class,i);
		}
		public List<PropertiesContext> properties() {
			return getRuleContexts(PropertiesContext.class);
		}
		public PropertiesContext properties(int i) {
			return getRuleContext(PropertiesContext.class,i);
		}
		public List<ByteSizeArgContext> byteSizeArg() {
			return getRuleContexts(ByteSizeArgContext.class);
		}
		public ByteSizeArgContext byteSizeArg(int i) {
			return getRuleContext(ByteSizeArgContext.class,i);
		}
		public List<TimeDurationArgContext> timeDurationArg() {
			return getRuleContexts(TimeDurationArgContext.class);
		}
		public TimeDurationArgContext timeDurationArg(int i) {
			return getRuleContext(TimeDurationArgContext.class,i);
		}
		public DirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectiveContext directive() throws RecognitionException {
		DirectiveContext _localctx = new DirectiveContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_directive);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			command();
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					setState(105);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(90);
						codeblock();
						}
						break;
					case 2:
						{
						setState(91);
						identifier();
						}
						break;
					case 3:
						{
						setState(92);
						macro();
						}
						break;
					case 4:
						{
						setState(93);
						text();
						}
						break;
					case 5:
						{
						setState(94);
						number();
						}
						break;
					case 6:
						{
						setState(95);
						bool();
						}
						break;
					case 7:
						{
						setState(96);
						column();
						}
						break;
					case 8:
						{
						setState(97);
						colList();
						}
						break;
					case 9:
						{
						setState(98);
						numberList();
						}
						break;
					case 10:
						{
						setState(99);
						boolList();
						}
						break;
					case 11:
						{
						setState(100);
						stringList();
						}
						break;
					case 12:
						{
						setState(101);
						numberRanges();
						}
						break;
					case 13:
						{
						setState(102);
						properties();
						}
						break;
					case 14:
						{
						setState(103);
						byteSizeArg();
						}
						break;
					case 15:
						{
						setState(104);
						timeDurationArg();
						}
						break;
					}
					} 
				}
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class IfStatementContext extends ParserRuleContext {
		public IfStatContext ifStat() {
			return getRuleContext(IfStatContext.class,0);
		}
		public List<ElseIfStatContext> elseIfStat() {
			return getRuleContexts(ElseIfStatContext.class);
		}
		public ElseIfStatContext elseIfStat(int i) {
			return getRuleContext(ElseIfStatContext.class,i);
		}
		public ElseStatContext elseStat() {
			return getRuleContext(ElseStatContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			ifStat();
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(111);
					elseIfStat();
					}
					} 
				}
				setState(116);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(117);
				elseStat();
				}
				break;
			}
			setState(120);
			match(CBrace);
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

	public static class IfStatContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public IfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitIfStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitIfStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatContext ifStat() throws RecognitionException {
		IfStatContext _localctx = new IfStatContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(T__0);
			setState(123);
			expression();
			setState(124);
			match(OBrace);
			setState(125);
			statements();
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

	public static class ElseIfStatContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ElseIfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterElseIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitElseIfStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitElseIfStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfStatContext elseIfStat() throws RecognitionException {
		ElseIfStatContext _localctx = new ElseIfStatContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_elseIfStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(CBrace);
			setState(128);
			match(T__1);
			setState(129);
			match(T__0);
			setState(130);
			expression();
			setState(131);
			match(OBrace);
			setState(132);
			statements();
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

	public static class ElseStatContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ElseStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterElseStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitElseStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitElseStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatContext elseStat() throws RecognitionException {
		ElseStatContext _localctx = new ElseStatContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_elseStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(CBrace);
			setState(135);
			match(T__1);
			setState(136);
			match(OBrace);
			setState(137);
			statements();
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(OParen);
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(142);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
					case T__1:
					case T__2:
					case T__3:
					case T__4:
					case T__5:
					case T__6:
					case T__7:
					case OBrace:
					case CBrace:
					case SColon:
					case Or:
					case And:
					case Equals:
					case NEquals:
					case GTEquals:
					case LTEquals:
					case Match:
					case NotMatch:
					case QuestionColon:
					case StartsWith:
					case NotStartsWith:
					case EndsWith:
					case NotEndsWith:
					case PlusEqual:
					case SubEqual:
					case MulEqual:
					case DivEqual:
					case PerEqual:
					case AndEqual:
					case OrEqual:
					case XOREqual:
					case Pow:
					case External:
					case GT:
					case LT:
					case Add:
					case Subtract:
					case Multiply:
					case Divide:
					case Modulus:
					case OBracket:
					case CBracket:
					case CParen:
					case Assign:
					case Comma:
					case QMark:
					case Colon:
					case Dot:
					case At:
					case Pipe:
					case BackSlash:
					case Dollar:
					case Tilde:
					case Bool:
					case Number:
					case BYTE_SIZE:
					case TIME_DURATION:
					case Identifier:
					case Macro:
					case Column:
					case String:
					case EscapeSequence:
					case Comment:
					case Space:
						{
						setState(140);
						_la = _input.LA(1);
						if ( _la <= 0 || (_la==OParen) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case OParen:
						{
						setState(141);
						expression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(147);
			match(CParen);
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

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(DirectivesParser.Identifier, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__2);
			setState(150);
			match(OParen);
			setState(151);
			match(Identifier);
			setState(152);
			match(Assign);
			setState(153);
			expression();
			setState(154);
			match(SColon);
			setState(155);
			expression();
			setState(156);
			match(SColon);
			setState(157);
			expression();
			setState(158);
			match(CParen);
			setState(159);
			match(OBrace);
			setState(160);
			statements();
			setState(161);
			match(CBrace);
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

	public static class MacroContext extends ParserRuleContext {
		public TerminalNode Dollar() { return getToken(DirectivesParser.Dollar, 0); }
		public List<TerminalNode> OBrace() { return getTokens(DirectivesParser.OBrace); }
		public TerminalNode OBrace(int i) {
			return getToken(DirectivesParser.OBrace, i);
		}
		public TerminalNode CBrace() { return getToken(DirectivesParser.CBrace, 0); }
		public List<MacroContext> macro() {
			return getRuleContexts(MacroContext.class);
		}
		public MacroContext macro(int i) {
			return getRuleContext(MacroContext.class,i);
		}
		public List<TerminalNode> Macro() { return getTokens(DirectivesParser.Macro); }
		public TerminalNode Macro(int i) {
			return getToken(DirectivesParser.Macro, i);
		}
		public MacroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterMacro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitMacro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitMacro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroContext macro() throws RecognitionException {
		MacroContext _localctx = new MacroContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_macro);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(Dollar);
			setState(164);
			match(OBrace);
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					setState(168);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						setState(165);
						_la = _input.LA(1);
						if ( _la <= 0 || (_la==OBrace) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 2:
						{
						setState(166);
						macro();
						}
						break;
					case 3:
						{
						setState(167);
						match(Macro);
						}
						break;
					}
					} 
				}
				setState(172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(173);
			match(CBrace);
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

	public static class PragmaContext extends ParserRuleContext {
		public PragmaLoadDirectiveContext pragmaLoadDirective() {
			return getRuleContext(PragmaLoadDirectiveContext.class,0);
		}
		public PragmaVersionContext pragmaVersion() {
			return getRuleContext(PragmaVersionContext.class,0);
		}
		public PragmaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterPragma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitPragma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitPragma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PragmaContext pragma() throws RecognitionException {
		PragmaContext _localctx = new PragmaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_pragma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(T__3);
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				setState(176);
				pragmaLoadDirective();
				}
				break;
			case T__5:
				{
				setState(177);
				pragmaVersion();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class PragmaLoadDirectiveContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public PragmaLoadDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmaLoadDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterPragmaLoadDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitPragmaLoadDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitPragmaLoadDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PragmaLoadDirectiveContext pragmaLoadDirective() throws RecognitionException {
		PragmaLoadDirectiveContext _localctx = new PragmaLoadDirectiveContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_pragmaLoadDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(T__4);
			setState(181);
			identifierList();
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

	public static class PragmaVersionContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(DirectivesParser.Number, 0); }
		public PragmaVersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmaVersion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterPragmaVersion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitPragmaVersion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitPragmaVersion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PragmaVersionContext pragmaVersion() throws RecognitionException {
		PragmaVersionContext _localctx = new PragmaVersionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_pragmaVersion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(T__5);
			setState(184);
			match(Number);
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

	public static class CodeblockContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<TerminalNode> Space() { return getTokens(DirectivesParser.Space); }
		public TerminalNode Space(int i) {
			return getToken(DirectivesParser.Space, i);
		}
		public CodeblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterCodeblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitCodeblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitCodeblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeblockContext codeblock() throws RecognitionException {
		CodeblockContext _localctx = new CodeblockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_codeblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(T__6);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Space) {
				{
				{
				setState(187);
				match(Space);
				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(193);
			match(Colon);
			setState(194);
			condition();
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(DirectivesParser.Identifier, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(Identifier);
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

	public static class PropertiesContext extends ParserRuleContext {
		public List<TerminalNode> OBrace() { return getTokens(DirectivesParser.OBrace); }
		public TerminalNode OBrace(int i) {
			return getToken(DirectivesParser.OBrace, i);
		}
		public List<TerminalNode> CBrace() { return getTokens(DirectivesParser.CBrace); }
		public TerminalNode CBrace(int i) {
			return getToken(DirectivesParser.CBrace, i);
		}
		public List<PropertyListContext> propertyList() {
			return getRuleContexts(PropertyListContext.class);
		}
		public PropertyListContext propertyList(int i) {
			return getRuleContext(PropertyListContext.class,i);
		}
		public PropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_properties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertiesContext properties() throws RecognitionException {
		PropertiesContext _localctx = new PropertiesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_properties);
		int _la;
		try {
			int _alt;
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				match(T__7);
				setState(199);
				match(Colon);
				setState(200);
				match(OBrace);
				setState(202); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(201);
					propertyList();
					}
					}
					setState(204); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Identifier );
				setState(206);
				match(CBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(T__7);
				setState(209);
				match(Colon);
				setState(210);
				match(OBrace);
				setState(211);
				match(OBrace);
				setState(213); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(212);
					propertyList();
					}
					}
					setState(215); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Identifier );
				setState(217);
				match(CBrace);
				 notifyErrorListeners("Too many start paranthesis"); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				match(T__7);
				setState(221);
				match(Colon);
				setState(222);
				match(OBrace);
				setState(224); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(223);
					propertyList();
					}
					}
					setState(226); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Identifier );
				setState(228);
				match(CBrace);
				setState(229);
				match(CBrace);
				 notifyErrorListeners("Too many start paranthesis"); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(232);
				match(T__7);
				setState(233);
				match(Colon);
				setState(235); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(234);
					propertyList();
					}
					}
					setState(237); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Identifier );
				setState(239);
				match(CBrace);
				 notifyErrorListeners("Missing opening brace"); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(242);
				match(T__7);
				setState(243);
				match(Colon);
				setState(244);
				match(OBrace);
				setState(246); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(245);
						propertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(248); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				 notifyErrorListeners("Missing closing brace"); 
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

	public static class PropertyListContext extends ParserRuleContext {
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public PropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterPropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitPropertyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitPropertyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyListContext propertyList() throws RecognitionException {
		PropertyListContext _localctx = new PropertyListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_propertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			property();
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(255);
				match(Comma);
				setState(256);
				property();
				}
				}
				setState(261);
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

	public static class PropertyContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(DirectivesParser.Identifier, 0); }
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(Identifier);
			setState(263);
			match(Assign);
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case String:
				{
				setState(264);
				text();
				}
				break;
			case Number:
				{
				setState(265);
				number();
				}
				break;
			case Bool:
				{
				setState(266);
				bool();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class NumberRangesContext extends ParserRuleContext {
		public List<NumberRangeContext> numberRange() {
			return getRuleContexts(NumberRangeContext.class);
		}
		public NumberRangeContext numberRange(int i) {
			return getRuleContext(NumberRangeContext.class,i);
		}
		public NumberRangesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberRanges; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterNumberRanges(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitNumberRanges(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitNumberRanges(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberRangesContext numberRanges() throws RecognitionException {
		NumberRangesContext _localctx = new NumberRangesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_numberRanges);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			numberRange();
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(270);
				match(Comma);
				setState(271);
				numberRange();
				}
				}
				setState(276);
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

	public static class NumberRangeContext extends ParserRuleContext {
		public List<TerminalNode> Number() { return getTokens(DirectivesParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(DirectivesParser.Number, i);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public NumberRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberRange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterNumberRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitNumberRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitNumberRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberRangeContext numberRange() throws RecognitionException {
		NumberRangeContext _localctx = new NumberRangeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_numberRange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(Number);
			setState(278);
			match(Colon);
			setState(279);
			match(Number);
			setState(280);
			match(Assign);
			setState(281);
			value();
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(DirectivesParser.String, 0); }
		public TerminalNode Number() { return getToken(DirectivesParser.Number, 0); }
		public TerminalNode Column() { return getToken(DirectivesParser.Column, 0); }
		public TerminalNode Bool() { return getToken(DirectivesParser.Bool, 0); }
		public TerminalNode BYTE_SIZE() { return getToken(DirectivesParser.BYTE_SIZE, 0); }
		public TerminalNode TIME_DURATION() { return getToken(DirectivesParser.TIME_DURATION, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Number) | (1L << BYTE_SIZE) | (1L << TIME_DURATION) | (1L << Column) | (1L << String))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class ByteSizeArgContext extends ParserRuleContext {
		public TerminalNode BYTE_SIZE() { return getToken(DirectivesParser.BYTE_SIZE, 0); }
		public ByteSizeArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_byteSizeArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterByteSizeArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitByteSizeArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitByteSizeArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ByteSizeArgContext byteSizeArg() throws RecognitionException {
		ByteSizeArgContext _localctx = new ByteSizeArgContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_byteSizeArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(BYTE_SIZE);
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

	public static class TimeDurationArgContext extends ParserRuleContext {
		public TerminalNode TIME_DURATION() { return getToken(DirectivesParser.TIME_DURATION, 0); }
		public TimeDurationArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeDurationArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterTimeDurationArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitTimeDurationArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitTimeDurationArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeDurationArgContext timeDurationArg() throws RecognitionException {
		TimeDurationArgContext _localctx = new TimeDurationArgContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_timeDurationArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(TIME_DURATION);
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

	public static class EcommandContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(DirectivesParser.Identifier, 0); }
		public EcommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ecommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterEcommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitEcommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitEcommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EcommandContext ecommand() throws RecognitionException {
		EcommandContext _localctx = new EcommandContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ecommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(External);
			setState(290);
			match(Identifier);
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

	public static class ConfigContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(DirectivesParser.Identifier, 0); }
		public ConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_config; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterConfig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitConfig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitConfig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConfigContext config() throws RecognitionException {
		ConfigContext _localctx = new ConfigContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_config);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(Identifier);
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

	public static class ColumnContext extends ParserRuleContext {
		public TerminalNode Column() { return getToken(DirectivesParser.Column, 0); }
		public ColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnContext column() throws RecognitionException {
		ColumnContext _localctx = new ColumnContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_column);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(Column);
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

	public static class TextContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(DirectivesParser.String, 0); }
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_text);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(String);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(DirectivesParser.Number, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(Number);
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

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode Bool() { return getToken(DirectivesParser.Bool, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(Bool);
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

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode OBrace() { return getToken(DirectivesParser.OBrace, 0); }
		public List<TerminalNode> CBrace() { return getTokens(DirectivesParser.CBrace); }
		public TerminalNode CBrace(int i) {
			return getToken(DirectivesParser.CBrace, i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(OBrace);
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << OBrace) | (1L << SColon) | (1L << Or) | (1L << And) | (1L << Equals) | (1L << NEquals) | (1L << GTEquals) | (1L << LTEquals) | (1L << Match) | (1L << NotMatch) | (1L << QuestionColon) | (1L << StartsWith) | (1L << NotStartsWith) | (1L << EndsWith) | (1L << NotEndsWith) | (1L << PlusEqual) | (1L << SubEqual) | (1L << MulEqual) | (1L << DivEqual) | (1L << PerEqual) | (1L << AndEqual) | (1L << OrEqual) | (1L << XOREqual) | (1L << Pow) | (1L << External) | (1L << GT) | (1L << LT) | (1L << Add) | (1L << Subtract) | (1L << Multiply) | (1L << Divide) | (1L << Modulus) | (1L << OBracket) | (1L << CBracket) | (1L << OParen) | (1L << CParen) | (1L << Assign) | (1L << Comma) | (1L << QMark) | (1L << Colon) | (1L << Dot) | (1L << At) | (1L << Pipe) | (1L << BackSlash) | (1L << Dollar) | (1L << Tilde) | (1L << Bool) | (1L << Number) | (1L << BYTE_SIZE) | (1L << TIME_DURATION) | (1L << Identifier) | (1L << Macro) | (1L << Column) | (1L << String))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EscapeSequence - 64)) | (1L << (Comment - 64)) | (1L << (Space - 64)))) != 0)) {
				{
				setState(305);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(303);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==CBrace) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case 2:
					{
					setState(304);
					condition();
					}
					break;
				}
				}
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(310);
			match(CBrace);
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

	public static class CommandContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(DirectivesParser.Identifier, 0); }
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(Identifier);
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

	public static class ColListContext extends ParserRuleContext {
		public List<TerminalNode> Column() { return getTokens(DirectivesParser.Column); }
		public TerminalNode Column(int i) {
			return getToken(DirectivesParser.Column, i);
		}
		public ColListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterColList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitColList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitColList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColListContext colList() throws RecognitionException {
		ColListContext _localctx = new ColListContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_colList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(Column);
			setState(317); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(315);
				match(Comma);
				setState(316);
				match(Column);
				}
				}
				setState(319); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Comma );
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

	public static class NumberListContext extends ParserRuleContext {
		public List<TerminalNode> Number() { return getTokens(DirectivesParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(DirectivesParser.Number, i);
		}
		public NumberListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterNumberList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitNumberList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitNumberList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberListContext numberList() throws RecognitionException {
		NumberListContext _localctx = new NumberListContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_numberList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(Number);
			setState(324); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(322);
				match(Comma);
				setState(323);
				match(Number);
				}
				}
				setState(326); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Comma );
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

	public static class BoolListContext extends ParserRuleContext {
		public List<TerminalNode> Bool() { return getTokens(DirectivesParser.Bool); }
		public TerminalNode Bool(int i) {
			return getToken(DirectivesParser.Bool, i);
		}
		public BoolListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterBoolList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitBoolList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitBoolList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolListContext boolList() throws RecognitionException {
		BoolListContext _localctx = new BoolListContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_boolList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(Bool);
			setState(331); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(329);
				match(Comma);
				setState(330);
				match(Bool);
				}
				}
				setState(333); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Comma );
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

	public static class StringListContext extends ParserRuleContext {
		public List<TerminalNode> String() { return getTokens(DirectivesParser.String); }
		public TerminalNode String(int i) {
			return getToken(DirectivesParser.String, i);
		}
		public StringListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterStringList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitStringList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitStringList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringListContext stringList() throws RecognitionException {
		StringListContext _localctx = new StringListContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_stringList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(String);
			setState(338); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(336);
				match(Comma);
				setState(337);
				match(String);
				}
				}
				setState(340); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Comma );
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

	public static class IdentifierListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(DirectivesParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(DirectivesParser.Identifier, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(Identifier);
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(343);
				match(Comma);
				setState(344);
				match(Identifier);
				}
				}
				setState(349);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3D\u0161\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\7\3W\n\3\f\3\16\3Z\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4l\n\4\f\4\16\4o\13\4\3\5\3\5\7\5s\n\5\f"+
		"\5\16\5v\13\5\3\5\5\5y\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\7\t\u0091\n\t\f\t\16\t\u0094"+
		"\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\7\13\u00ab\n\13\f\13\16\13\u00ae\13\13\3\13"+
		"\3\13\3\f\3\f\3\f\5\f\u00b5\n\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\7"+
		"\17\u00bf\n\17\f\17\16\17\u00c2\13\17\3\17\3\17\3\17\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\6\21\u00cd\n\21\r\21\16\21\u00ce\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\6\21\u00d8\n\21\r\21\16\21\u00d9\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\6\21\u00e3\n\21\r\21\16\21\u00e4\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\6\21\u00ee\n\21\r\21\16\21\u00ef\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\6\21\u00f9\n\21\r\21\16\21\u00fa\3\21\3\21\5\21\u00ff\n\21\3\22\3"+
		"\22\3\22\7\22\u0104\n\22\f\22\16\22\u0107\13\22\3\23\3\23\3\23\3\23\3"+
		"\23\5\23\u010e\n\23\3\24\3\24\3\24\7\24\u0113\n\24\f\24\16\24\u0116\13"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3"+
		"\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3"+
		"\37\7\37\u0134\n\37\f\37\16\37\u0137\13\37\3\37\3\37\3 \3 \3!\3!\3!\6"+
		"!\u0140\n!\r!\16!\u0141\3\"\3\"\3\"\6\"\u0147\n\"\r\"\16\"\u0148\3#\3"+
		"#\3#\6#\u014e\n#\r#\16#\u014f\3$\3$\3$\6$\u0155\n$\r$\16$\u0156\3%\3%"+
		"\3%\7%\u015c\n%\f%\16%\u015f\13%\3%\4m\u00ac\2&\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH\2\6\3\2..\3\2\13\13\4\2"+
		":=@A\3\2\f\f\2\u016d\2J\3\2\2\2\4X\3\2\2\2\6[\3\2\2\2\bp\3\2\2\2\n|\3"+
		"\2\2\2\f\u0081\3\2\2\2\16\u0088\3\2\2\2\20\u008d\3\2\2\2\22\u0097\3\2"+
		"\2\2\24\u00a5\3\2\2\2\26\u00b1\3\2\2\2\30\u00b6\3\2\2\2\32\u00b9\3\2\2"+
		"\2\34\u00bc\3\2\2\2\36\u00c6\3\2\2\2 \u00fe\3\2\2\2\"\u0100\3\2\2\2$\u0108"+
		"\3\2\2\2&\u010f\3\2\2\2(\u0117\3\2\2\2*\u011d\3\2\2\2,\u011f\3\2\2\2."+
		"\u0121\3\2\2\2\60\u0123\3\2\2\2\62\u0126\3\2\2\2\64\u0128\3\2\2\2\66\u012a"+
		"\3\2\2\28\u012c\3\2\2\2:\u012e\3\2\2\2<\u0130\3\2\2\2>\u013a\3\2\2\2@"+
		"\u013c\3\2\2\2B\u0143\3\2\2\2D\u014a\3\2\2\2F\u0151\3\2\2\2H\u0158\3\2"+
		"\2\2JK\5\4\3\2KL\7\2\2\3L\3\3\2\2\2MW\7C\2\2NW\5\24\13\2OP\5\6\4\2PQ\7"+
		"\r\2\2QW\3\2\2\2RS\5\26\f\2ST\7\r\2\2TW\3\2\2\2UW\5\b\5\2VM\3\2\2\2VN"+
		"\3\2\2\2VO\3\2\2\2VR\3\2\2\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y"+
		"\5\3\2\2\2ZX\3\2\2\2[m\5> \2\\l\5\34\17\2]l\5\36\20\2^l\5\24\13\2_l\5"+
		"\66\34\2`l\58\35\2al\5:\36\2bl\5\64\33\2cl\5@!\2dl\5B\"\2el\5D#\2fl\5"+
		"F$\2gl\5&\24\2hl\5 \21\2il\5,\27\2jl\5.\30\2k\\\3\2\2\2k]\3\2\2\2k^\3"+
		"\2\2\2k_\3\2\2\2k`\3\2\2\2ka\3\2\2\2kb\3\2\2\2kc\3\2\2\2kd\3\2\2\2ke\3"+
		"\2\2\2kf\3\2\2\2kg\3\2\2\2kh\3\2\2\2ki\3\2\2\2kj\3\2\2\2lo\3\2\2\2mn\3"+
		"\2\2\2mk\3\2\2\2n\7\3\2\2\2om\3\2\2\2pt\5\n\6\2qs\5\f\7\2rq\3\2\2\2sv"+
		"\3\2\2\2tr\3\2\2\2tu\3\2\2\2ux\3\2\2\2vt\3\2\2\2wy\5\16\b\2xw\3\2\2\2"+
		"xy\3\2\2\2yz\3\2\2\2z{\7\f\2\2{\t\3\2\2\2|}\7\3\2\2}~\5\20\t\2~\177\7"+
		"\13\2\2\177\u0080\5\4\3\2\u0080\13\3\2\2\2\u0081\u0082\7\f\2\2\u0082\u0083"+
		"\7\4\2\2\u0083\u0084\7\3\2\2\u0084\u0085\5\20\t\2\u0085\u0086\7\13\2\2"+
		"\u0086\u0087\5\4\3\2\u0087\r\3\2\2\2\u0088\u0089\7\f\2\2\u0089\u008a\7"+
		"\4\2\2\u008a\u008b\7\13\2\2\u008b\u008c\5\4\3\2\u008c\17\3\2\2\2\u008d"+
		"\u0092\7.\2\2\u008e\u0091\n\2\2\2\u008f\u0091\5\20\t\2\u0090\u008e\3\2"+
		"\2\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096\7/"+
		"\2\2\u0096\21\3\2\2\2\u0097\u0098\7\5\2\2\u0098\u0099\7.\2\2\u0099\u009a"+
		"\7>\2\2\u009a\u009b\7\60\2\2\u009b\u009c\5\20\t\2\u009c\u009d\7\r\2\2"+
		"\u009d\u009e\5\20\t\2\u009e\u009f\7\r\2\2\u009f\u00a0\5\20\t\2\u00a0\u00a1"+
		"\7/\2\2\u00a1\u00a2\7\13\2\2\u00a2\u00a3\5\4\3\2\u00a3\u00a4\7\f\2\2\u00a4"+
		"\23\3\2\2\2\u00a5\u00a6\78\2\2\u00a6\u00ac\7\13\2\2\u00a7\u00ab\n\3\2"+
		"\2\u00a8\u00ab\5\24\13\2\u00a9\u00ab\7?\2\2\u00aa\u00a7\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af"+
		"\u00b0\7\f\2\2\u00b0\25\3\2\2\2\u00b1\u00b4\7\6\2\2\u00b2\u00b5\5\30\r"+
		"\2\u00b3\u00b5\5\32\16\2\u00b4\u00b2\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5"+
		"\27\3\2\2\2\u00b6\u00b7\7\7\2\2\u00b7\u00b8\5H%\2\u00b8\31\3\2\2\2\u00b9"+
		"\u00ba\7\b\2\2\u00ba\u00bb\7;\2\2\u00bb\33\3\2\2\2\u00bc\u00c0\7\t\2\2"+
		"\u00bd\u00bf\7D\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be"+
		"\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3"+
		"\u00c4\7\63\2\2\u00c4\u00c5\5<\37\2\u00c5\35\3\2\2\2\u00c6\u00c7\7>\2"+
		"\2\u00c7\37\3\2\2\2\u00c8\u00c9\7\n\2\2\u00c9\u00ca\7\63\2\2\u00ca\u00cc"+
		"\7\13\2\2\u00cb\u00cd\5\"\22\2\u00cc\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2"+
		"\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1"+
		"\7\f\2\2\u00d1\u00ff\3\2\2\2\u00d2\u00d3\7\n\2\2\u00d3\u00d4\7\63\2\2"+
		"\u00d4\u00d5\7\13\2\2\u00d5\u00d7\7\13\2\2\u00d6\u00d8\5\"\22\2\u00d7"+
		"\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2"+
		"\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\7\f\2\2\u00dc\u00dd\b\21\1\2\u00dd"+
		"\u00ff\3\2\2\2\u00de\u00df\7\n\2\2\u00df\u00e0\7\63\2\2\u00e0\u00e2\7"+
		"\13\2\2\u00e1\u00e3\5\"\22\2\u00e2\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\7\f"+
		"\2\2\u00e7\u00e8\7\f\2\2\u00e8\u00e9\b\21\1\2\u00e9\u00ff\3\2\2\2\u00ea"+
		"\u00eb\7\n\2\2\u00eb\u00ed\7\63\2\2\u00ec\u00ee\5\"\22\2\u00ed\u00ec\3"+
		"\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\u00f2\7\f\2\2\u00f2\u00f3\b\21\1\2\u00f3\u00ff\3"+
		"\2\2\2\u00f4\u00f5\7\n\2\2\u00f5\u00f6\7\63\2\2\u00f6\u00f8\7\13\2\2\u00f7"+
		"\u00f9\5\"\22\2\u00f8\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00f8\3"+
		"\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\b\21\1\2\u00fd"+
		"\u00ff\3\2\2\2\u00fe\u00c8\3\2\2\2\u00fe\u00d2\3\2\2\2\u00fe\u00de\3\2"+
		"\2\2\u00fe\u00ea\3\2\2\2\u00fe\u00f4\3\2\2\2\u00ff!\3\2\2\2\u0100\u0105"+
		"\5$\23\2\u0101\u0102\7\61\2\2\u0102\u0104\5$\23\2\u0103\u0101\3\2\2\2"+
		"\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106#\3"+
		"\2\2\2\u0107\u0105\3\2\2\2\u0108\u0109\7>\2\2\u0109\u010d\7\60\2\2\u010a"+
		"\u010e\5\66\34\2\u010b\u010e\58\35\2\u010c\u010e\5:\36\2\u010d\u010a\3"+
		"\2\2\2\u010d\u010b\3\2\2\2\u010d\u010c\3\2\2\2\u010e%\3\2\2\2\u010f\u0114"+
		"\5(\25\2\u0110\u0111\7\61\2\2\u0111\u0113\5(\25\2\u0112\u0110\3\2\2\2"+
		"\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\'\3"+
		"\2\2\2\u0116\u0114\3\2\2\2\u0117\u0118\7;\2\2\u0118\u0119\7\63\2\2\u0119"+
		"\u011a\7;\2\2\u011a\u011b\7\60\2\2\u011b\u011c\5*\26\2\u011c)\3\2\2\2"+
		"\u011d\u011e\t\4\2\2\u011e+\3\2\2\2\u011f\u0120\7<\2\2\u0120-\3\2\2\2"+
		"\u0121\u0122\7=\2\2\u0122/\3\2\2\2\u0123\u0124\7$\2\2\u0124\u0125\7>\2"+
		"\2\u0125\61\3\2\2\2\u0126\u0127\7>\2\2\u0127\63\3\2\2\2\u0128\u0129\7"+
		"@\2\2\u0129\65\3\2\2\2\u012a\u012b\7A\2\2\u012b\67\3\2\2\2\u012c\u012d"+
		"\7;\2\2\u012d9\3\2\2\2\u012e\u012f\7:\2\2\u012f;\3\2\2\2\u0130\u0135\7"+
		"\13\2\2\u0131\u0134\n\5\2\2\u0132\u0134\5<\37\2\u0133\u0131\3\2\2\2\u0133"+
		"\u0132\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2"+
		"\2\2\u0136\u0138\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u0139\7\f\2\2\u0139"+
		"=\3\2\2\2\u013a\u013b\7>\2\2\u013b?\3\2\2\2\u013c\u013f\7@\2\2\u013d\u013e"+
		"\7\61\2\2\u013e\u0140\7@\2\2\u013f\u013d\3\2\2\2\u0140\u0141\3\2\2\2\u0141"+
		"\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142A\3\2\2\2\u0143\u0146\7;\2\2\u0144"+
		"\u0145\7\61\2\2\u0145\u0147\7;\2\2\u0146\u0144\3\2\2\2\u0147\u0148\3\2"+
		"\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149C\3\2\2\2\u014a\u014d"+
		"\7:\2\2\u014b\u014c\7\61\2\2\u014c\u014e\7:\2\2\u014d\u014b\3\2\2\2\u014e"+
		"\u014f\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150E\3\2\2\2"+
		"\u0151\u0154\7A\2\2\u0152\u0153\7\61\2\2\u0153\u0155\7A\2\2\u0154\u0152"+
		"\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157"+
		"G\3\2\2\2\u0158\u015d\7>\2\2\u0159\u015a\7\61\2\2\u015a\u015c\7>\2\2\u015b"+
		"\u0159\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2"+
		"\2\2\u015eI\3\2\2\2\u015f\u015d\3\2\2\2\36VXkmtx\u0090\u0092\u00aa\u00ac"+
		"\u00b4\u00c0\u00ce\u00d9\u00e4\u00ef\u00fa\u00fe\u0105\u010d\u0114\u0133"+
		"\u0135\u0141\u0148\u014f\u0156\u015d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}