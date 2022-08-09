package snippet;

public class Snippet {
	<?xml version="1.0" encoding="UTF-8"?>
	<beans xmlns="http://www.springframework.org/schema/beans"
	       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	       xmlns:context="http://www.springframework.org/schema/context"
	       xmlns:mvc="http://www.springframework.org/schema/mvc"
	       xmlns:jpa="http://www.springframework.org/schema/data/jpa"
	       xmlns:tx="http://www.springframework.org/schema/tx"
	       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
	       http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd
	       http://www.springframework.org/schema/mvc http://www.springframework.org/schema/mvc/spring-mvc.xsd
	       http://www.springframework.org/schema/data/jpa http://www.springframework.org/schema/data/jpa/spring-jpa.xsd
	       http://www.springframework.org/schema/tx http://www.springframework.org/schema/tx/spring-tx.xsd">
	
	    <!-- handler mapping (2) -->
	    <context:component-scan base-package="com.globallogic.controller"/>
	
	
	    <!--ViewResolver (5) -->
	    <!--Servlet、JSP-->
	    <bean id="jspViewResolver" class="org.springframework.web.servlet.view.InternalResourceViewResolver">
	        <property name="viewClass" value="org.springframework.web.servlet.view.JstlView"/>
	        <property name="prefix" value="/WEB-INF/pages/"/>
	        <property name="suffix" value=".jsp"/>
	    </bean>
	
	    
	 
	</beans>
}

