package org.moql.ext;

import junit.framework.TestCase;
import org.moql.MoqlException;
import org.moql.Selector;
import org.moql.engine.MoqlEngine;
import org.moql.parser.MoqlParser;
import org.moql.sql.SqlDialectType;
import org.moql.translator.MoqlTranslator;

public class ExtendedTest extends TestCase {

	public void testGrammar() {
		String sql = "select l.仿冒网站IP数量,r.仿冒页面数量 from lInput l  full join rInput r";
		try {
			Selector selector = MoqlEngine.createSelector(sql);
		} catch (MoqlException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void testSelectAsterisk() {
		String sql = "select l.*, r.* from lInput l, rInput r";
		try {
			String xml = MoqlParser.translateMoql2Xml(sql);
			System.out.println(xml);
			sql = MoqlTranslator.translateXml2Sql(xml, SqlDialectType.ORACLE);
			System.out.println(sql);
		} catch (MoqlException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
