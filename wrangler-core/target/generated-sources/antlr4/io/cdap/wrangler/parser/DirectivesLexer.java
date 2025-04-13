// Generated from io\cdap\wrangler\parser\Directives.g4 by ANTLR 4.7
package io.cdap.wrangler.parser;

/*
 * Copyright © 2017-2019 Cask Data, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DirectivesLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "OBrace", 
		"CBrace", "SColon", "Or", "And", "Equals", "NEquals", "GTEquals", "LTEquals", 
		"Match", "NotMatch", "QuestionColon", "StartsWith", "NotStartsWith", "EndsWith", 
		"NotEndsWith", "PlusEqual", "SubEqual", "MulEqual", "DivEqual", "PerEqual", 
		"AndEqual", "OrEqual", "XOREqual", "Pow", "External", "GT", "LT", "Add", 
		"Subtract", "Multiply", "Divide", "Modulus", "OBracket", "CBracket", "OParen", 
		"CParen", "Assign", "Comma", "QMark", "Colon", "Dot", "At", "Pipe", "BackSlash", 
		"Dollar", "Tilde", "Bool", "Number", "BYTE_SIZE", "TIME_DURATION", "BYTE_UNIT", 
		"TIME_UNIT", "Identifier", "Macro", "Column", "String", "EscapeSequence", 
		"OctalEscape", "UnicodeEscape", "HexDigit", "Comment", "Space", "Int", 
		"Digit"
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


	public DirectivesLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Directives.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2D\u01f6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3#"+
		"\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3"+
		".\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3"+
		"\66\3\66\3\67\3\67\38\38\39\39\39\39\39\39\39\39\39\59\u0147\n9\3:\3:"+
		"\3:\7:\u014c\n:\f:\16:\u014f\13:\5:\u0151\n:\3;\3;\3;\3<\3<\3<\3=\3=\5"+
		"=\u015b\n=\3=\3=\5=\u015f\n=\3=\3=\5=\u0163\n=\3=\3=\5=\u0167\n=\5=\u0169"+
		"\n=\3>\3>\5>\u016d\n>\3>\3>\3>\3>\3>\5>\u0174\n>\3?\3?\7?\u0178\n?\f?"+
		"\16?\u017b\13?\3@\3@\7@\u017f\n@\f@\16@\u0182\13@\3A\3A\3A\7A\u0187\n"+
		"A\fA\16A\u018a\13A\3B\3B\3B\7B\u018f\nB\fB\16B\u0192\13B\3B\3B\3B\3B\7"+
		"B\u0198\nB\fB\16B\u019b\13B\3B\5B\u019e\nB\3C\3C\3C\3C\5C\u01a4\nC\3D"+
		"\3D\3D\3D\3D\3D\3D\3D\3D\5D\u01af\nD\3E\3E\3E\3E\3E\3E\3E\3F\3F\3G\3G"+
		"\3G\3G\7G\u01be\nG\fG\16G\u01c1\13G\3G\3G\3G\3G\7G\u01c7\nG\fG\16G\u01ca"+
		"\13G\3G\3G\3G\3G\3G\3G\7G\u01d2\nG\fG\16G\u01d5\13G\5G\u01d7\nG\3G\3G"+
		"\3H\6H\u01dc\nH\rH\16H\u01dd\3H\3H\3I\5I\u01e3\nI\3I\3I\7I\u01e7\nI\f"+
		"I\16I\u01ea\13I\3I\7I\u01ed\nI\fI\16I\u01f0\13I\3I\5I\u01f3\nI\3J\3J\3"+
		"\u01c8\2K\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65"+
		"i\66k\67m8o9q:s;u<w=y\2{\2}>\177?\u0081@\u0083A\u0085B\u0087\2\u0089\2"+
		"\u008b\2\u008dC\u008fD\u0091\2\u0093\2\3\2\31\4\2MMmm\4\2DDdd\4\2OOoo"+
		"\4\2IIii\4\2VVvv\4\2UUuu\4\2KKkk\4\2PPpp\6\2FFJJffjj\6\2//C\\aac|\7\2"+
		"//\62;C\\aac|\5\2C\\aac|\6\2\62;C\\aac|\7\2//\62<C\\aac|\3\2))\3\2$$\n"+
		"\2$$))^^ddhhppttvv\5\2\62;CHch\4\2\f\f\17\17\5\2\13\f\16\17\"\"\3\2\63"+
		";\3\2NN\3\2\62;\2\u0212\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2"+
		"\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2"+
		"w\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\3\u0095\3\2\2\2\5\u0098\3\2\2"+
		"\2\7\u009d\3\2\2\2\t\u00a1\3\2\2\2\13\u00a9\3\2\2\2\r\u00b9\3\2\2\2\17"+
		"\u00c1\3\2\2\2\21\u00c5\3\2\2\2\23\u00ca\3\2\2\2\25\u00cc\3\2\2\2\27\u00ce"+
		"\3\2\2\2\31\u00d0\3\2\2\2\33\u00d3\3\2\2\2\35\u00d6\3\2\2\2\37\u00d9\3"+
		"\2\2\2!\u00dc\3\2\2\2#\u00df\3\2\2\2%\u00e2\3\2\2\2\'\u00e5\3\2\2\2)\u00e8"+
		"\3\2\2\2+\u00eb\3\2\2\2-\u00ee\3\2\2\2/\u00f1\3\2\2\2\61\u00f4\3\2\2\2"+
		"\63\u00f7\3\2\2\2\65\u00fa\3\2\2\2\67\u00fd\3\2\2\29\u0100\3\2\2\2;\u0103"+
		"\3\2\2\2=\u0106\3\2\2\2?\u0109\3\2\2\2A\u010c\3\2\2\2C\u010f\3\2\2\2E"+
		"\u0111\3\2\2\2G\u0113\3\2\2\2I\u0115\3\2\2\2K\u0117\3\2\2\2M\u0119\3\2"+
		"\2\2O\u011b\3\2\2\2Q\u011d\3\2\2\2S\u011f\3\2\2\2U\u0121\3\2\2\2W\u0123"+
		"\3\2\2\2Y\u0125\3\2\2\2[\u0127\3\2\2\2]\u0129\3\2\2\2_\u012b\3\2\2\2a"+
		"\u012d\3\2\2\2c\u012f\3\2\2\2e\u0131\3\2\2\2g\u0133\3\2\2\2i\u0135\3\2"+
		"\2\2k\u0137\3\2\2\2m\u0139\3\2\2\2o\u013b\3\2\2\2q\u0146\3\2\2\2s\u0148"+
		"\3\2\2\2u\u0152\3\2\2\2w\u0155\3\2\2\2y\u0168\3\2\2\2{\u0173\3\2\2\2}"+
		"\u0175\3\2\2\2\177\u017c\3\2\2\2\u0081\u0183\3\2\2\2\u0083\u019d\3\2\2"+
		"\2\u0085\u01a3\3\2\2\2\u0087\u01ae\3\2\2\2\u0089\u01b0\3\2\2\2\u008b\u01b7"+
		"\3\2\2\2\u008d\u01d6\3\2\2\2\u008f\u01db\3\2\2\2\u0091\u01f2\3\2\2\2\u0093"+
		"\u01f4\3\2\2\2\u0095\u0096\7k\2\2\u0096\u0097\7h\2\2\u0097\4\3\2\2\2\u0098"+
		"\u0099\7g\2\2\u0099\u009a\7n\2\2\u009a\u009b\7u\2\2\u009b\u009c\7g\2\2"+
		"\u009c\6\3\2\2\2\u009d\u009e\7h\2\2\u009e\u009f\7q\2\2\u009f\u00a0\7t"+
		"\2\2\u00a0\b\3\2\2\2\u00a1\u00a2\7%\2\2\u00a2\u00a3\7r\2\2\u00a3\u00a4"+
		"\7t\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7i\2\2\u00a6\u00a7\7o\2\2\u00a7"+
		"\u00a8\7c\2\2\u00a8\n\3\2\2\2\u00a9\u00aa\7n\2\2\u00aa\u00ab\7q\2\2\u00ab"+
		"\u00ac\7c\2\2\u00ac\u00ad\7f\2\2\u00ad\u00ae\7/\2\2\u00ae\u00af\7f\2\2"+
		"\u00af\u00b0\7k\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3"+
		"\7e\2\2\u00b3\u00b4\7v\2\2\u00b4\u00b5\7k\2\2\u00b5\u00b6\7x\2\2\u00b6"+
		"\u00b7\7g\2\2\u00b7\u00b8\7u\2\2\u00b8\f\3\2\2\2\u00b9\u00ba\7x\2\2\u00ba"+
		"\u00bb\7g\2\2\u00bb\u00bc\7t\2\2\u00bc\u00bd\7u\2\2\u00bd\u00be\7k\2\2"+
		"\u00be\u00bf\7q\2\2\u00bf\u00c0\7p\2\2\u00c0\16\3\2\2\2\u00c1\u00c2\7"+
		"g\2\2\u00c2\u00c3\7z\2\2\u00c3\u00c4\7r\2\2\u00c4\20\3\2\2\2\u00c5\u00c6"+
		"\7r\2\2\u00c6\u00c7\7t\2\2\u00c7\u00c8\7q\2\2\u00c8\u00c9\7r\2\2\u00c9"+
		"\22\3\2\2\2\u00ca\u00cb\7}\2\2\u00cb\24\3\2\2\2\u00cc\u00cd\7\177\2\2"+
		"\u00cd\26\3\2\2\2\u00ce\u00cf\7=\2\2\u00cf\30\3\2\2\2\u00d0\u00d1\7~\2"+
		"\2\u00d1\u00d2\7~\2\2\u00d2\32\3\2\2\2\u00d3\u00d4\7(\2\2\u00d4\u00d5"+
		"\7(\2\2\u00d5\34\3\2\2\2\u00d6\u00d7\7?\2\2\u00d7\u00d8\7?\2\2\u00d8\36"+
		"\3\2\2\2\u00d9\u00da\7#\2\2\u00da\u00db\7?\2\2\u00db \3\2\2\2\u00dc\u00dd"+
		"\7@\2\2\u00dd\u00de\7?\2\2\u00de\"\3\2\2\2\u00df\u00e0\7>\2\2\u00e0\u00e1"+
		"\7?\2\2\u00e1$\3\2\2\2\u00e2\u00e3\7?\2\2\u00e3\u00e4\7\u0080\2\2\u00e4"+
		"&\3\2\2\2\u00e5\u00e6\7#\2\2\u00e6\u00e7\7\u0080\2\2\u00e7(\3\2\2\2\u00e8"+
		"\u00e9\7A\2\2\u00e9\u00ea\7<\2\2\u00ea*\3\2\2\2\u00eb\u00ec\7?\2\2\u00ec"+
		"\u00ed\7`\2\2\u00ed,\3\2\2\2\u00ee\u00ef\7#\2\2\u00ef\u00f0\7`\2\2\u00f0"+
		".\3\2\2\2\u00f1\u00f2\7?\2\2\u00f2\u00f3\7&\2\2\u00f3\60\3\2\2\2\u00f4"+
		"\u00f5\7#\2\2\u00f5\u00f6\7&\2\2\u00f6\62\3\2\2\2\u00f7\u00f8\7-\2\2\u00f8"+
		"\u00f9\7?\2\2\u00f9\64\3\2\2\2\u00fa\u00fb\7/\2\2\u00fb\u00fc\7?\2\2\u00fc"+
		"\66\3\2\2\2\u00fd\u00fe\7,\2\2\u00fe\u00ff\7?\2\2\u00ff8\3\2\2\2\u0100"+
		"\u0101\7\61\2\2\u0101\u0102\7?\2\2\u0102:\3\2\2\2\u0103\u0104\7\'\2\2"+
		"\u0104\u0105\7?\2\2\u0105<\3\2\2\2\u0106\u0107\7(\2\2\u0107\u0108\7?\2"+
		"\2\u0108>\3\2\2\2\u0109\u010a\7~\2\2\u010a\u010b\7?\2\2\u010b@\3\2\2\2"+
		"\u010c\u010d\7`\2\2\u010d\u010e\7?\2\2\u010eB\3\2\2\2\u010f\u0110\7`\2"+
		"\2\u0110D\3\2\2\2\u0111\u0112\7#\2\2\u0112F\3\2\2\2\u0113\u0114\7@\2\2"+
		"\u0114H\3\2\2\2\u0115\u0116\7>\2\2\u0116J\3\2\2\2\u0117\u0118\7-\2\2\u0118"+
		"L\3\2\2\2\u0119\u011a\7/\2\2\u011aN\3\2\2\2\u011b\u011c\7,\2\2\u011cP"+
		"\3\2\2\2\u011d\u011e\7\61\2\2\u011eR\3\2\2\2\u011f\u0120\7\'\2\2\u0120"+
		"T\3\2\2\2\u0121\u0122\7]\2\2\u0122V\3\2\2\2\u0123\u0124\7_\2\2\u0124X"+
		"\3\2\2\2\u0125\u0126\7*\2\2\u0126Z\3\2\2\2\u0127\u0128\7+\2\2\u0128\\"+
		"\3\2\2\2\u0129\u012a\7?\2\2\u012a^\3\2\2\2\u012b\u012c\7.\2\2\u012c`\3"+
		"\2\2\2\u012d\u012e\7A\2\2\u012eb\3\2\2\2\u012f\u0130\7<\2\2\u0130d\3\2"+
		"\2\2\u0131\u0132\7\60\2\2\u0132f\3\2\2\2\u0133\u0134\7B\2\2\u0134h\3\2"+
		"\2\2\u0135\u0136\7~\2\2\u0136j\3\2\2\2\u0137\u0138\7^\2\2\u0138l\3\2\2"+
		"\2\u0139\u013a\7&\2\2\u013an\3\2\2\2\u013b\u013c\7\u0080\2\2\u013cp\3"+
		"\2\2\2\u013d\u013e\7v\2\2\u013e\u013f\7t\2\2\u013f\u0140\7w\2\2\u0140"+
		"\u0147\7g\2\2\u0141\u0142\7h\2\2\u0142\u0143\7c\2\2\u0143\u0144\7n\2\2"+
		"\u0144\u0145\7u\2\2\u0145\u0147\7g\2\2\u0146\u013d\3\2\2\2\u0146\u0141"+
		"\3\2\2\2\u0147r\3\2\2\2\u0148\u0150\5\u0091I\2\u0149\u014d\7\60\2\2\u014a"+
		"\u014c\5\u0093J\2\u014b\u014a\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b"+
		"\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u0150"+
		"\u0149\3\2\2\2\u0150\u0151\3\2\2\2\u0151t\3\2\2\2\u0152\u0153\5\u0091"+
		"I\2\u0153\u0154\5y=\2\u0154v\3\2\2\2\u0155\u0156\5\u0091I\2\u0156\u0157"+
		"\5{>\2\u0157x\3\2\2\2\u0158\u015a\t\2\2\2\u0159\u015b\t\3\2\2\u015a\u0159"+
		"\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u0169\3\2\2\2\u015c\u015e\t\4\2\2\u015d"+
		"\u015f\t\3\2\2\u015e\u015d\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0169\3\2"+
		"\2\2\u0160\u0162\t\5\2\2\u0161\u0163\t\3\2\2\u0162\u0161\3\2\2\2\u0162"+
		"\u0163\3\2\2\2\u0163\u0169\3\2\2\2\u0164\u0166\t\6\2\2\u0165\u0167\t\3"+
		"\2\2\u0166\u0165\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0169\3\2\2\2\u0168"+
		"\u0158\3\2\2\2\u0168\u015c\3\2\2\2\u0168\u0160\3\2\2\2\u0168\u0164\3\2"+
		"\2\2\u0169z\3\2\2\2\u016a\u016c\t\4\2\2\u016b\u016d\t\7\2\2\u016c\u016b"+
		"\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u0174\3\2\2\2\u016e\u0174\t\7\2\2\u016f"+
		"\u0170\t\4\2\2\u0170\u0171\t\b\2\2\u0171\u0174\t\t\2\2\u0172\u0174\t\n"+
		"\2\2\u0173\u016a\3\2\2\2\u0173\u016e\3\2\2\2\u0173\u016f\3\2\2\2\u0173"+
		"\u0172\3\2\2\2\u0174|\3\2\2\2\u0175\u0179\t\13\2\2\u0176\u0178\t\f\2\2"+
		"\u0177\u0176\3\2\2\2\u0178\u017b\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a"+
		"\3\2\2\2\u017a~\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u0180\t\r\2\2\u017d"+
		"\u017f\t\16\2\2\u017e\u017d\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3"+
		"\2\2\2\u0180\u0181\3\2\2\2\u0181\u0080\3\2\2\2\u0182\u0180\3\2\2\2\u0183"+
		"\u0184\7<\2\2\u0184\u0188\t\13\2\2\u0185\u0187\t\17\2\2\u0186\u0185\3"+
		"\2\2\2\u0187\u018a\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189"+
		"\u0082\3\2\2\2\u018a\u0188\3\2\2\2\u018b\u0190\7)\2\2\u018c\u018f\5\u0085"+
		"C\2\u018d\u018f\n\20\2\2\u018e\u018c\3\2\2\2\u018e\u018d\3\2\2\2\u018f"+
		"\u0192\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0193\3\2"+
		"\2\2\u0192\u0190\3\2\2\2\u0193\u019e\7)\2\2\u0194\u0199\7$\2\2\u0195\u0198"+
		"\5\u0085C\2\u0196\u0198\n\21\2\2\u0197\u0195\3\2\2\2\u0197\u0196\3\2\2"+
		"\2\u0198\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019c"+
		"\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u019e\7$\2\2\u019d\u018b\3\2\2\2\u019d"+
		"\u0194\3\2\2\2\u019e\u0084\3\2\2\2\u019f\u01a0\7^\2\2\u01a0\u01a4\t\22"+
		"\2\2\u01a1\u01a4\5\u0089E\2\u01a2\u01a4\5\u0087D\2\u01a3\u019f\3\2\2\2"+
		"\u01a3\u01a1\3\2\2\2\u01a3\u01a2\3\2\2\2\u01a4\u0086\3\2\2\2\u01a5\u01a6"+
		"\7^\2\2\u01a6\u01a7\4\62\65\2\u01a7\u01a8\4\629\2\u01a8\u01af\4\629\2"+
		"\u01a9\u01aa\7^\2\2\u01aa\u01ab\4\629\2\u01ab\u01af\4\629\2\u01ac\u01ad"+
		"\7^\2\2\u01ad\u01af\4\629\2\u01ae\u01a5\3\2\2\2\u01ae\u01a9\3\2\2\2\u01ae"+
		"\u01ac\3\2\2\2\u01af\u0088\3\2\2\2\u01b0\u01b1\7^\2\2\u01b1\u01b2\7w\2"+
		"\2\u01b2\u01b3\5\u008bF\2\u01b3\u01b4\5\u008bF\2\u01b4\u01b5\5\u008bF"+
		"\2\u01b5\u01b6\5\u008bF\2\u01b6\u008a\3\2\2\2\u01b7\u01b8\t\23\2\2\u01b8"+
		"\u008c\3\2\2\2\u01b9\u01ba\7\61\2\2\u01ba\u01bb\7\61\2\2\u01bb\u01bf\3"+
		"\2\2\2\u01bc\u01be\n\24\2\2\u01bd\u01bc\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf"+
		"\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01d7\3\2\2\2\u01c1\u01bf\3\2"+
		"\2\2\u01c2\u01c3\7\61\2\2\u01c3\u01c4\7,\2\2\u01c4\u01c8\3\2\2\2\u01c5"+
		"\u01c7\13\2\2\2\u01c6\u01c5\3\2\2\2\u01c7\u01ca\3\2\2\2\u01c8\u01c9\3"+
		"\2\2\2\u01c8\u01c6\3\2\2\2\u01c9\u01cb\3\2\2\2\u01ca\u01c8\3\2\2\2\u01cb"+
		"\u01cc\7,\2\2\u01cc\u01d7\7\61\2\2\u01cd\u01ce\7/\2\2\u01ce\u01cf\7/\2"+
		"\2\u01cf\u01d3\3\2\2\2\u01d0\u01d2\n\24\2\2\u01d1\u01d0\3\2\2\2\u01d2"+
		"\u01d5\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d7\3\2"+
		"\2\2\u01d5\u01d3\3\2\2\2\u01d6\u01b9\3\2\2\2\u01d6\u01c2\3\2\2\2\u01d6"+
		"\u01cd\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9\bG\2\2\u01d9\u008e\3\2"+
		"\2\2\u01da\u01dc\t\25\2\2\u01db\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd"+
		"\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e0\bH"+
		"\2\2\u01e0\u0090\3\2\2\2\u01e1\u01e3\7/\2\2\u01e2\u01e1\3\2\2\2\u01e2"+
		"\u01e3\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e8\t\26\2\2\u01e5\u01e7\5"+
		"\u0093J\2\u01e6\u01e5\3\2\2\2\u01e7\u01ea\3\2\2\2\u01e8\u01e6\3\2\2\2"+
		"\u01e8\u01e9\3\2\2\2\u01e9\u01ee\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb\u01ed"+
		"\t\27\2\2\u01ec\u01eb\3\2\2\2\u01ed\u01f0\3\2\2\2\u01ee\u01ec\3\2\2\2"+
		"\u01ee\u01ef\3\2\2\2\u01ef\u01f3\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f1\u01f3"+
		"\7\62\2\2\u01f2\u01e2\3\2\2\2\u01f2\u01f1\3\2\2\2\u01f3\u0092\3\2\2\2"+
		"\u01f4\u01f5\t\30\2\2\u01f5\u0094\3\2\2\2 \2\u0146\u014d\u0150\u015a\u015e"+
		"\u0162\u0166\u0168\u016c\u0173\u0179\u0180\u0188\u018e\u0190\u0197\u0199"+
		"\u019d\u01a3\u01ae\u01bf\u01c8\u01d3\u01d6\u01dd\u01e2\u01e8\u01ee\u01f2"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}