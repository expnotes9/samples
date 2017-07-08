package com.example.antlr;

import com.example.antlr.ExpressionParser.AtomExprContext;
import com.example.antlr.ExpressionParser.OpExprContext;
import com.example.antlr.ExpressionParser.ParenExprContext;
import com.example.antlr.ExpressionParser.StartContext;

public class EvalVisitor extends ExpressionBaseVisitor<Long> {

	@Override
	public Long visitStart(StartContext ctx) {
		return this.visit(ctx.expr());
	}

	@Override
	public Long visitOpExpr(OpExprContext ctx) {
		long left = visit(ctx.left);
		long right = visit(ctx.right);
		String op = ctx.op.getText();
		switch (op.charAt(0)) {
		case '*':
			return left * right;
		case '/':
			return left / right;
		case '+':
			return left + right;
		case '-':
			return left - right;
		default:
			throw new IllegalArgumentException("Unknown operator " + op);
		}
	}

	@Override
	public Long visitAtomExpr(AtomExprContext ctx) {
		return Long.valueOf(ctx.getText());
	}

	@Override
	public Long visitParenExpr(ParenExprContext ctx) {
		return this.visit(ctx.expr());
	}

}
