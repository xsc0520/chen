jdbc.driver=com.mysql.jdbc.Driver
jdbc.url=jdbc:mysql://localhost:3306/idceasypanel242?useUnicode=true&characterEncoding=UTF-8
jdbc.username=idceasypanel242
jdbc.password=ec7dce2494
#\u5B9A\u4E49\u521D\u59CB\u8FDE\u63A5\u6570
jdbc.initialSize=0
#\u5B9A\u4E49\u6700\u5927\u8FDE\u63A5\u6570  
jdbc.maxActive=20
#\u5B9A\u4E49\u6700\u5927\u7A7A\u95F2  
jdbc.maxIdle=20
#\u5B9A\u4E49\u6700\u5C0F\u7A7A\u95F2
jdbc.minIdle=1
#\u5B9A\u4E49\u6700\u957F\u7B49\u5F85\u65F6\u95F4
jdbc.maxWait=60000


#å®ä¹LOGè¾åºçº§å«
log4j.rootLogger=INFO,Console,File
#å®ä¹æ¥å¿è¾åºç®çå°ä¸ºæ§å¶å°
log4j.appender.Console=org.apache.log4j.ConsoleAppender
log4j.appender.Console.Target=System.out
#å¯ä»¥çµæ´»å°æå®æ¥å¿è¾åºæ ¼å¼ï¼ä¸é¢ä¸è¡æ¯æå®å·ä½çæ ¼å¼
log4j.appender.Console.layout = org.apache.log4j.PatternLayout
log4j.appender.Console.layout.ConversionPattern=[%c] - %m%n

#æä»¶å¤§å°å°è¾¾æå®å°ºå¯¸çæ¶åäº§çä¸ä¸ªæ°çæä»¶
log4j.appender.File = org.apache.log4j.RollingFileAppender
#æå®è¾åºç®å½
log4j.appender.File.File = logs/ssm.log
#å®ä¹æä»¶æå¤§å¤§å°
log4j.appender.File.MaxFileSize = 10MB
# è¾åºæä»¥æ¥å¿ï¼å¦ææ¢æDEBUGè¡¨ç¤ºè¾åºDEBUGä»¥ä¸çº§å«æ¥å¿
log4j.appender.File.Threshold = ALL
log4j.appender.File.layout = org.apache.log4j.PatternLayout
log4j.appender.File.layout.ConversionPattern =[%p] [%d{yyyy-MM-dd HH\:mm\:ss}][%c]%m%n