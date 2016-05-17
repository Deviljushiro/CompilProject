// Generated from grammar_JJ.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class grammar_JJParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, Number=36, Boolean=37, X=38, WS=39;
	public static final int
		RULE_type = 0, RULE_e = 1, RULE_i = 2, RULE_d = 3, RULE_p = 4, RULE_additionExpr = 5, 
		RULE_multiplyExpr = 6, RULE_atomExpr = 7, RULE_combinatedBinarExpr = 8, 
		RULE_binarExpr = 9, RULE_boolExpr = 10, RULE_arrayExpr = 11, RULE_eeExpr = 12, 
		RULE_appelExpr = 13, RULE_k = 14;
	public static final String[] ruleNames = {
		"type", "e", "i", "d", "p", "additionExpr", "multiplyExpr", "atomExpr", 
		"combinatedBinarExpr", "binarExpr", "boolExpr", "arrayExpr", "eeExpr", 
		"appelExpr", "k"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'integer'", "'boolean'", "'array'", "'of'", "':='", "'if'", "'then'", 
		"'else'", "'while'", "'do'", "'f('", "':'", "')'", "'[:'", "']'", "'var'", 
		"'+'", "'-'", "'*'", "'/'", "'('", "'and'", "'or'", "'>'", "'>='", "'<'", 
		"'<='", "'='", "'!='", "'not'", "'new'", "'['", "'read'", "'write'", "'f'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"Number", "Boolean", "X", "WS"
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
	public String getGrammarFileName() { return "grammar_JJ.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public grammar_JJParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_JJListener ) ((grammar_JJListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_JJListener ) ((grammar_JJListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(30);
				match(T__0);
				}
				break;
			case T__1:
				{
				setState(31);
				match(T__1);
				}
				break;
			case T__2:
				{
				setState(32);
				match(T__2);
				setState(33);
				match(T__3);
				setState(34);
				type();
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

	public static class EContext extends ParserRuleContext {
		public KContext k() {
			return getRuleContext(KContext.class,0);
		}
		public TerminalNode X() { return getToken(grammar_JJParser.X, 0); }
		public AdditionExprContext additionExpr() {
			return getRuleContext(AdditionExprContext.class,0);
		}
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public AppelExprContext appelExpr() {
			return getRuleContext(AppelExprContext.class,0);
		}
		public ArrayExprContext arrayExpr() {
			return getRuleContext(ArrayExprContext.class,0);
		}
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_JJListener ) ((grammar_JJListener)listener).enterE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_JJListener ) ((grammar_JJListener)listener).exitE(this);
		}
	}

	public final EContext e() throws RecognitionException {
		EContext _localctx = new EContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_e);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(37);
				k();
				}
				break;
			case 2:
				{
				setState(38);
				match(X);
				}
				break;
			case 3:
				{
				setState(39);
				additionExpr();
				}
				break;
			case 4:
				{
				setState(40);
				boolExpr();
				}
				break;
			case 5:
				{
				setState(41);
				appelExpr();
				}
				break;
			case 6:
				{
				setState(42);
				arrayExpr();
				}
				break;
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

	public static class IContext extends ParserRuleContext {
		public TerminalNode X() { return getToken(grammar_JJParser.X, 0); }
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public EeExprContext eeExpr() {
			return getRuleContext(EeExprContext.class,0);
		}
		public IContext i() {
			return getRuleContext(IContext.class,0);
		}
		public AppelExprContext appelExpr() {
			return getRuleContext(AppelExprContext.class,0);
		}
		public IContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_JJListener ) ((grammar_JJListener)listener).enterI(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_JJListener ) ((grammar_JJListener)listener).exitI(this);
		}
	}

	public final IContext i() throws RecognitionException {
		IContext _localctx = new IContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_i);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(45);
				match(X);
				setState(46);
				match(T__4);
				setState(47);
				e();
				}
				break;
			case 2:
				{
				setState(48);
				eeExpr();
				setState(49);
				match(T__4);
				setState(50);
				e();
				}
				break;
			case 3:
				{
				setState(52);
				match(T__5);
				setState(53);
				e();
				setState(54);
				match(T__6);
				setState(55);
				e();
				setState(56);
				match(T__7);
				setState(57);
				e();
				}
				break;
			case 4:
				{
				setState(59);
				match(T__8);
				setState(60);
				e();
				setState(61);
				match(T__9);
				setState(62);
				i();
				}
				break;
			case 5:
				{
				setState(64);
				appelExpr();
				}
				break;
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

	public static class DContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public IContext i() {
			return getRuleContext(IContext.class,0);
		}
		public List<TerminalNode> X() { return getTokens(grammar_JJParser.X); }
		public TerminalNode X(int i) {
			return getToken(grammar_JJParser.X, i);
		}
		public DContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_d; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_JJListener ) ((grammar_JJListener)listener).enterD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_JJListener ) ((grammar_JJListener)listener).exitD(this);
		}
	}

	public final DContext d() throws RecognitionException {
		DContext _localctx = new DContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_d);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__10);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==X) {
				{
				{
				setState(68);
				match(X);
				setState(69);
				match(T__11);
				setState(70);
				type();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
			match(T__12);
			setState(77);
			match(T__13);
			setState(78);
			type();
			setState(79);
			match(T__14);
			setState(80);
			match(T__15);
			setState(86);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(81);
					match(X);
					setState(82);
					match(T__11);
					setState(83);
					type();
					}
					} 
				}
				setState(88);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(89);
			i();
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

	public static class PContext extends ParserRuleContext {
		public IContext i() {
			return getRuleContext(IContext.class,0);
		}
		public List<TerminalNode> X() { return getTokens(grammar_JJParser.X); }
		public TerminalNode X(int i) {
			return getToken(grammar_JJParser.X, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<DContext> d() {
			return getRuleContexts(DContext.class);
		}
		public DContext d(int i) {
			return getRuleContext(DContext.class,i);
		}
		public PContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_JJListener ) ((grammar_JJListener)listener).enterP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_JJListener ) ((grammar_JJListener)listener).exitP(this);
		}
	}

	public final PContext p() throws RecognitionException {
		PContext _localctx = new PContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__15);
			setState(97);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(92);
					match(X);
					setState(93);
					match(T__11);
					setState(94);
					type();
					}
					} 
				}
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(100);
				d();
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
			i();
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

	public static class AdditionExprContext extends ParserRuleContext {
		public List<MultiplyExprContext> multiplyExpr() {
			return getRuleContexts(MultiplyExprContext.class);
		}
		public MultiplyExprContext multiplyExpr(int i) {
			return getRuleContext(MultiplyExprContext.class,i);
		}
		public AdditionExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_JJListener ) ((grammar_JJListener)listener).enterAdditionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_JJListener ) ((grammar_JJListener)listener).exitAdditionExpr(this);
		}
	}

	public final AdditionExprContext additionExpr() throws RecognitionException {
		AdditionExprContext _localctx = new AdditionExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_additionExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			multiplyExpr();
			setState(115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(113);
					switch (_input.LA(1)) {
					case T__16:
						{
						setState(109);
						match(T__16);
						setState(110);
						multiplyExpr();
						}
						break;
					case T__17:
						{
						setState(111);
						match(T__17);
						setState(112);
						multiplyExpr();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class MultiplyExprContext extends ParserRuleContext {
		public List<AtomExprContext> atomExpr() {
			return getRuleContexts(AtomExprContext.class);
		}
		public AtomExprContext atomExpr(int i) {
			return getRuleContext(AtomExprContext.class,i);
		}
		public MultiplyExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_JJListener ) ((grammar_JJListener)listener).enterMultiplyExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_JJListener ) ((grammar_JJListener)listener).exitMultiplyExpr(this);
		}
	}

	public final MultiplyExprContext multiplyExpr() throws RecognitionException {
		MultiplyExprContext _localctx = new MultiplyExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_multiplyExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			atomExpr();
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18 || _la==T__19) {
				{
				setState(123);
				switch (_input.LA(1)) {
				case T__18:
					{
					setState(119);
					match(T__18);
					setState(120);
					atomExpr();
					}
					break;
				case T__19:
					{
					setState(121);
					match(T__19);
					setState(122);
					atomExpr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(127);
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

	public static class AtomExprContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(grammar_JJParser.Number, 0); }
		public AdditionExprContext additionExpr() {
			return getRuleContext(AdditionExprContext.class,0);
		}
		public AtomExprContext atomExpr() {
			return getRuleContext(AtomExprContext.class,0);
		}
		public AtomExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_JJListener ) ((grammar_JJListener)listener).enterAtomExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_JJListener ) ((grammar_JJListener)listener).exitAtomExpr(this);
		}
	}

	public final AtomExprContext atomExpr() throws RecognitionException {
		AtomExprContext _localctx = new AtomExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_atomExpr);
		try {
			setState(135);
			switch (_input.LA(1)) {
			case Number:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(Number);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(T__20);
				setState(130);
				additionExpr();
				setState(131);
				match(T__12);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				match(T__17);
				setState(134);
				atomExpr();
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

	public static class CombinatedBinarExprContext extends ParserRuleContext {
		public List<BinarExprContext> binarExpr() {
			return getRuleContexts(BinarExprContext.class);
		}
		public BinarExprContext binarExpr(int i) {
			return getRuleContext(BinarExprContext.class,i);
		}
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public CombinatedBinarExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_combinatedBinarExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_JJListener ) ((grammar_JJListener)listener).enterCombinatedBinarExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_JJListener ) ((grammar_JJListener)listener).exitCombinatedBinarExpr(this);
		}
	}

	public final CombinatedBinarExprContext combinatedBinarExpr() throws RecognitionException {
		CombinatedBinarExprContext _localctx = new CombinatedBinarExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_combinatedBinarExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(137);
				binarExpr();
				}
				break;
			case 2:
				{
				setState(138);
				boolExpr();
				}
				break;
			}
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21 || _la==T__22) {
				{
				setState(151);
				switch (_input.LA(1)) {
				case T__21:
					{
					setState(141);
					match(T__21);
					setState(144);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						setState(142);
						binarExpr();
						}
						break;
					case 2:
						{
						setState(143);
						boolExpr();
						}
						break;
					}
					}
					break;
				case T__22:
					{
					setState(146);
					match(T__22);
					setState(149);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						setState(147);
						binarExpr();
						}
						break;
					case 2:
						{
						setState(148);
						boolExpr();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(155);
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

	public static class BinarExprContext extends ParserRuleContext {
		public List<AtomExprContext> atomExpr() {
			return getRuleContexts(AtomExprContext.class);
		}
		public AtomExprContext atomExpr(int i) {
			return getRuleContext(AtomExprContext.class,i);
		}
		public BinarExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binarExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_JJListener ) ((grammar_JJListener)listener).enterBinarExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_JJListener ) ((grammar_JJListener)listener).exitBinarExpr(this);
		}
	}

	public final BinarExprContext binarExpr() throws RecognitionException {
		BinarExprContext _localctx = new BinarExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_binarExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			atomExpr();
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28))) != 0)) {
				{
				setState(169);
				switch (_input.LA(1)) {
				case T__23:
					{
					setState(157);
					match(T__23);
					setState(158);
					atomExpr();
					}
					break;
				case T__24:
					{
					setState(159);
					match(T__24);
					setState(160);
					atomExpr();
					}
					break;
				case T__25:
					{
					setState(161);
					match(T__25);
					setState(162);
					atomExpr();
					}
					break;
				case T__26:
					{
					setState(163);
					match(T__26);
					setState(164);
					atomExpr();
					}
					break;
				case T__27:
					{
					setState(165);
					match(T__27);
					setState(166);
					atomExpr();
					}
					break;
				case T__28:
					{
					setState(167);
					match(T__28);
					setState(168);
					atomExpr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(173);
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

	public static class BoolExprContext extends ParserRuleContext {
		public TerminalNode Boolean() { return getToken(grammar_JJParser.Boolean, 0); }
		public CombinatedBinarExprContext combinatedBinarExpr() {
			return getRuleContext(CombinatedBinarExprContext.class,0);
		}
		public BinarExprContext binarExpr() {
			return getRuleContext(BinarExprContext.class,0);
		}
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public BoolExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_JJListener ) ((grammar_JJListener)listener).enterBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_JJListener ) ((grammar_JJListener)listener).exitBoolExpr(this);
		}
	}

	public final BoolExprContext boolExpr() throws RecognitionException {
		BoolExprContext _localctx = new BoolExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_boolExpr);
		try {
			setState(182);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(Boolean);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(T__20);
				setState(176);
				combinatedBinarExpr();
				setState(177);
				match(T__12);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				binarExpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(180);
				match(T__29);
				setState(181);
				boolExpr();
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

	public static class ArrayExprContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public ArrayExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_JJListener ) ((grammar_JJListener)listener).enterArrayExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_JJListener ) ((grammar_JJListener)listener).exitArrayExpr(this);
		}
	}

	public final ArrayExprContext arrayExpr() throws RecognitionException {
		ArrayExprContext _localctx = new ArrayExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arrayExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(T__30);
			setState(185);
			match(T__2);
			setState(186);
			match(T__3);
			setState(187);
			type();
			setState(188);
			match(T__31);
			setState(189);
			e();
			setState(190);
			match(T__14);
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

	public static class EeExprContext extends ParserRuleContext {
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public EeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eeExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_JJListener ) ((grammar_JJListener)listener).enterEeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_JJListener ) ((grammar_JJListener)listener).exitEeExpr(this);
		}
	}

	public final EeExprContext eeExpr() throws RecognitionException {
		EeExprContext _localctx = new EeExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_eeExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			e();
			setState(193);
			match(T__31);
			setState(194);
			e();
			setState(195);
			match(T__14);
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

	public static class AppelExprContext extends ParserRuleContext {
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public AppelExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appelExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_JJListener ) ((grammar_JJListener)listener).enterAppelExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_JJListener ) ((grammar_JJListener)listener).exitAppelExpr(this);
		}
	}

	public final AppelExprContext appelExpr() throws RecognitionException {
		AppelExprContext _localctx = new AppelExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_appelExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(198);
					match(T__20);
					setState(199);
					e();
					setState(200);
					match(T__12);
					}
					} 
				}
				setState(206);
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
			exitRule();
		}
		return _localctx;
	}

	public static class KContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(grammar_JJParser.Number, 0); }
		public TerminalNode Boolean() { return getToken(grammar_JJParser.Boolean, 0); }
		public KContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_k; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_JJListener ) ((grammar_JJListener)listener).enterK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_JJListener ) ((grammar_JJListener)listener).exitK(this);
		}
	}

	public final KContext k() throws RecognitionException {
		KContext _localctx = new KContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_k);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_la = _input.LA(1);
			if ( !(_la==Number || _la==Boolean) ) {
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3)\u00d4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\2"+
		"\5\2&\n\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3.\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4D\n\4\3\5\3\5"+
		"\3\5\3\5\7\5J\n\5\f\5\16\5M\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5W"+
		"\n\5\f\5\16\5Z\13\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6b\n\6\f\6\16\6e\13\6\3"+
		"\6\7\6h\n\6\f\6\16\6k\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\7\7t\n\7\f\7\16"+
		"\7w\13\7\3\b\3\b\3\b\3\b\3\b\7\b~\n\b\f\b\16\b\u0081\13\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\5\t\u008a\n\t\3\n\3\n\5\n\u008e\n\n\3\n\3\n\3\n\5\n\u0093"+
		"\n\n\3\n\3\n\3\n\5\n\u0098\n\n\7\n\u009a\n\n\f\n\16\n\u009d\13\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00ac"+
		"\n\13\f\13\16\13\u00af\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b9"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\7\17\u00cd\n\17\f\17\16\17\u00d0\13\17\3\20\3\20\3\20"+
		"\2\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\4\3\2#%\3\2&\'\u00e8"+
		"\2%\3\2\2\2\4-\3\2\2\2\6C\3\2\2\2\bE\3\2\2\2\n]\3\2\2\2\fn\3\2\2\2\16"+
		"x\3\2\2\2\20\u0089\3\2\2\2\22\u008d\3\2\2\2\24\u009e\3\2\2\2\26\u00b8"+
		"\3\2\2\2\30\u00ba\3\2\2\2\32\u00c2\3\2\2\2\34\u00c7\3\2\2\2\36\u00d1\3"+
		"\2\2\2 &\7\3\2\2!&\7\4\2\2\"#\7\5\2\2#$\7\6\2\2$&\5\2\2\2% \3\2\2\2%!"+
		"\3\2\2\2%\"\3\2\2\2&\3\3\2\2\2\'.\5\36\20\2(.\7(\2\2).\5\f\7\2*.\5\26"+
		"\f\2+.\5\34\17\2,.\5\30\r\2-\'\3\2\2\2-(\3\2\2\2-)\3\2\2\2-*\3\2\2\2-"+
		"+\3\2\2\2-,\3\2\2\2.\5\3\2\2\2/\60\7(\2\2\60\61\7\7\2\2\61D\5\4\3\2\62"+
		"\63\5\32\16\2\63\64\7\7\2\2\64\65\5\4\3\2\65D\3\2\2\2\66\67\7\b\2\2\67"+
		"8\5\4\3\289\7\t\2\29:\5\4\3\2:;\7\n\2\2;<\5\4\3\2<D\3\2\2\2=>\7\13\2\2"+
		">?\5\4\3\2?@\7\f\2\2@A\5\6\4\2AD\3\2\2\2BD\5\34\17\2C/\3\2\2\2C\62\3\2"+
		"\2\2C\66\3\2\2\2C=\3\2\2\2CB\3\2\2\2D\7\3\2\2\2EK\7\r\2\2FG\7(\2\2GH\7"+
		"\16\2\2HJ\5\2\2\2IF\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK"+
		"\3\2\2\2NO\7\17\2\2OP\7\20\2\2PQ\5\2\2\2QR\7\21\2\2RX\7\22\2\2ST\7(\2"+
		"\2TU\7\16\2\2UW\5\2\2\2VS\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2"+
		"\2\2ZX\3\2\2\2[\\\5\6\4\2\\\t\3\2\2\2]c\7\22\2\2^_\7(\2\2_`\7\16\2\2`"+
		"b\5\2\2\2a^\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2di\3\2\2\2ec\3\2\2\2"+
		"fh\5\b\5\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2"+
		"lm\5\6\4\2m\13\3\2\2\2nu\5\16\b\2op\7\23\2\2pt\5\16\b\2qr\7\24\2\2rt\5"+
		"\16\b\2so\3\2\2\2sq\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v\r\3\2\2\2w"+
		"u\3\2\2\2x\177\5\20\t\2yz\7\25\2\2z~\5\20\t\2{|\7\26\2\2|~\5\20\t\2}y"+
		"\3\2\2\2}{\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\17\3\2\2\2\u0081\177\3\2\2\2\u0082\u008a\7&\2\2\u0083\u0084\7\27\2\2"+
		"\u0084\u0085\5\f\7\2\u0085\u0086\7\17\2\2\u0086\u008a\3\2\2\2\u0087\u0088"+
		"\7\24\2\2\u0088\u008a\5\20\t\2\u0089\u0082\3\2\2\2\u0089\u0083\3\2\2\2"+
		"\u0089\u0087\3\2\2\2\u008a\21\3\2\2\2\u008b\u008e\5\24\13\2\u008c\u008e"+
		"\5\26\f\2\u008d\u008b\3\2\2\2\u008d\u008c\3\2\2\2\u008e\u009b\3\2\2\2"+
		"\u008f\u0092\7\30\2\2\u0090\u0093\5\24\13\2\u0091\u0093\5\26\f\2\u0092"+
		"\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093\u009a\3\2\2\2\u0094\u0097\7\31"+
		"\2\2\u0095\u0098\5\24\13\2\u0096\u0098\5\26\f\2\u0097\u0095\3\2\2\2\u0097"+
		"\u0096\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u008f\3\2\2\2\u0099\u0094\3\2"+
		"\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\23\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u00ad\5\20\t\2\u009f\u00a0\7\32"+
		"\2\2\u00a0\u00ac\5\20\t\2\u00a1\u00a2\7\33\2\2\u00a2\u00ac\5\20\t\2\u00a3"+
		"\u00a4\7\34\2\2\u00a4\u00ac\5\20\t\2\u00a5\u00a6\7\35\2\2\u00a6\u00ac"+
		"\5\20\t\2\u00a7\u00a8\7\36\2\2\u00a8\u00ac\5\20\t\2\u00a9\u00aa\7\37\2"+
		"\2\u00aa\u00ac\5\20\t\2\u00ab\u009f\3\2\2\2\u00ab\u00a1\3\2\2\2\u00ab"+
		"\u00a3\3\2\2\2\u00ab\u00a5\3\2\2\2\u00ab\u00a7\3\2\2\2\u00ab\u00a9\3\2"+
		"\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\25\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b9\7\'\2\2\u00b1\u00b2\7\27\2"+
		"\2\u00b2\u00b3\5\22\n\2\u00b3\u00b4\7\17\2\2\u00b4\u00b9\3\2\2\2\u00b5"+
		"\u00b9\5\24\13\2\u00b6\u00b7\7 \2\2\u00b7\u00b9\5\26\f\2\u00b8\u00b0\3"+
		"\2\2\2\u00b8\u00b1\3\2\2\2\u00b8\u00b5\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9"+
		"\27\3\2\2\2\u00ba\u00bb\7!\2\2\u00bb\u00bc\7\5\2\2\u00bc\u00bd\7\6\2\2"+
		"\u00bd\u00be\5\2\2\2\u00be\u00bf\7\"\2\2\u00bf\u00c0\5\4\3\2\u00c0\u00c1"+
		"\7\21\2\2\u00c1\31\3\2\2\2\u00c2\u00c3\5\4\3\2\u00c3\u00c4\7\"\2\2\u00c4"+
		"\u00c5\5\4\3\2\u00c5\u00c6\7\21\2\2\u00c6\33\3\2\2\2\u00c7\u00ce\t\2\2"+
		"\2\u00c8\u00c9\7\27\2\2\u00c9\u00ca\5\4\3\2\u00ca\u00cb\7\17\2\2\u00cb"+
		"\u00cd\3\2\2\2\u00cc\u00c8\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2"+
		"\2\2\u00ce\u00cf\3\2\2\2\u00cf\35\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2"+
		"\t\3\2\2\u00d2\37\3\2\2\2\27%-CKXcisu}\177\u0089\u008d\u0092\u0097\u0099"+
		"\u009b\u00ab\u00ad\u00b8\u00ce";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}