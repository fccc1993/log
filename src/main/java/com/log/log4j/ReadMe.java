package com.log.log4j;/*
	<dependency>
			<groupId>log4j</groupId>
			<artifactId>log4j</artifactId>
			<version>1.2.17</version>
		</dependency>
		
	  一、Log4j简介
	Log4j有三个主要的组件：Loggers(记录器)，Appenders (输出源)和Layouts(布局)。
	可简单理解为日志类别，日志要输出的地方和日志以何种形式输出。
	1、Loggers
	Loggers组件在此系统中被分为五个级别：DEBUG、INFO、WARN、ERROR和FATAL。
	DEBUG < INFO < WARN < ERROR < FATAL，分别用来指定这条日志信息的重要程度，Log4j有一个规则：只输出级别不低于设定级别的日志信息，
	假设Loggers级别设定为INFO，则INFO、WARN、ERROR和FATAL级别的日志信息都会输出，而级别比INFO低的DEBUG则不会输出。
	2、Appenders
	
	禁用和使用日志请求只是Log4j的基本功能，Log4j日志系统还提供许多强大的功能，
	比如允许把日志输出到不同的地方，如控制台（Console）、文件（Files）等，
	可以根据天数或者文件大小产生新的文件，可以以流的形式发送到其它地方等等。
	
	常使用的类如下：
	org.apache.log4j.ConsoleAppender（控制台）
	org.apache.log4j.FileAppender（文件）
	org.apache.log4j.DailyRollingFileAppender（每天产生一个日志文件）
	org.apache.log4j.RollingFileAppender（文件大小到达指定尺寸的时候产生一个新的文件）
	org.apache.log4j.WriterAppender（将日志信息以流格式发送到任意指定的地方）
	
	配置模式：
	log4j.appender.appenderName = className
	log4j.appender.appenderName.Option1 = value1
	…
	log4j.appender.appenderName.OptionN = valueN
	3、Layouts
	
	Layouts提供四种日志输出样式，如根据HTML样式、自由指定样式、包含日志级别与信息的样式和包含日志时间、线程、类别等信息的样式。
	常使用的类如下：
	org.apache.log4j.HTMLLayout（以HTML表格形式布局）
	org.apache.log4j.PatternLayout（可以灵活地指定布局模式）
	org.apache.log4j.SimpleLayout（包含日志信息的级别和信息字符串）
	org.apache.log4j.TTCCLayout（包含日志产生的时间、线程、类别等信息）
	
	配置模式：
	log4j.appender.appenderName.layout =className
	log4j.appender.appenderName.layout.Option1 = value1
	…
	log4j.appender.appenderName.layout.OptionN = valueN
	
	PatternLayout选项：
	ConversionPattern=%m%n：设定以怎样的格式显示消息。
	
	格式化符号说明：
	
	%p：输出日志信息的优先级，即DEBUG，INFO，WARN，ERROR，FATAL。
	%d：输出日志时间点的日期或时间，默认格式为ISO8601，也可以在其后指定格式，如：%d{yyyy/MM/dd HH:mm:ss,SSS}。
	%r：输出自应用程序启动到输出该log信息耗费的毫秒数。
	%t：输出产生该日志事件的线程名。
	%l：输出日志事件的发生位置，相当于%c.%M(%F:%L)的组合，包括类全名、方法、文件名以及在代码中的行数。例如：test.TestLog4j.main(TestLog4j.java:10)。
	%c：输出日志信息所属的类目，通常就是所在类的全名。
	%M：输出产生日志信息的方法名。
	%F：输出日志消息产生时所在的文件名称。
	%L:：输出代码中的行号。
	%m:：输出代码中指定的具体日志信息。
	%n：输出一个回车换行符，Windows平台为"rn"，Unix平台为"n"。
	%x：输出和当前线程相关联的NDC(嵌套诊断环境)，尤其用到像java servlets这样的多客户多线程的应用中。
	%%：输出一个"%"字符。
*/

public class ReadMe {

}
