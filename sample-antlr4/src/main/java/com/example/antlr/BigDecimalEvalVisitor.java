package com.example.antlr;

import java.math.BigDecimal;
import java.math.MathContext;

import com.example.antlr.ExpressionParser.AtomExprContext;
import com.example.antlr.ExpressionParser.OpExprContext;
import com.example.antlr.ExpressionParser.ParenExprContext;
import com.example.antlr.ExpressionParser.StartContext;

public class BigDecimalEvalVisitor extends ExpressionBaseVisitor<BigDecimal> {

	private final MathContext mc;

	public BigDecimalEvalVisitor(MathContext mc) {
		this.mc = mc;
	}

	@Override
	public BigDecimal visitStart(StartContext ctx) {
		return this.visit(ctx.expr());
	}

	@Override
	public BigDecimal visitOpExpr(OpExprContext ctx) {
		BigDecimal left = visit(ctx.left);
		BigDecimal right = visit(ctx.right);
		String op = ctx.op.getText();
		switch (op.charAt(0)) {
		case '*':
			return left.multiply(right, mc);
		case '/':
			return left.divide(right, mc);
		case '+':
			return left.add(right, mc);
		case '-':
			return left.subtract(right, mc);
		default:
			throw new IllegalArgumentException("Unknown operator " + op);
		}
	}

	@Override
	public BigDecimal visitAtomExpr(AtomExprContext ctx) {
		return new BigDecimal(ctx.getText());
	}

	@Override
	public BigDecimal visitParenExpr(ParenExprContext ctx) {
		return this.visit(ctx.expr());
	}

}
