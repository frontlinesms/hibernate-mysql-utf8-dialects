package net.frontlinesms.hibernate.dialect;

import org.hibernate.dialect.MySQL5InnoDBDialect;

// with thanks to http://hartsock.blogspot.com/2008/05/terrible-hibernate-hack-for-grails.html and http://blog.tremend.ro/2007/08/14/how-to-set-the-default-charset-to-utf-8-for-create-table-when-using-hibernate-with-java-persistence-annotations/
public class MySQL5Utf8InnoDBDialect extends MySQL5InnoDBDialect {
	public String getTableTypeString() {
		return " ENGINE=InnoDB DEFAULT CHARSET=utf8";
	}
}

