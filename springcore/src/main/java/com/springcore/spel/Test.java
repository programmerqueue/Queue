/**
 * 
 */
package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * @author AR
 *
 */
public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com//springcore//spel//spelconfig.xml");
		Demo demo1 = context.getBean("obj", Demo.class);
		System.out.println(demo1);

		SpelExpressionParser expressionParser = new SpelExpressionParser();
		Expression expression = expressionParser.parseExpression("12+12");
		System.out.println(expression.getValue());

	}
}