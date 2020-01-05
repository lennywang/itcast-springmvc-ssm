
1. Failed to convert property value of type 'java.lang.String' to required type 'java.util.Date' for pr
https://blog.csdn.net/wy2155638451/article/details/97101898

2. post提交乱码
```
  <!-- 处理POST提交乱码问题 -->
  <filter>
    <filter-name>encoding</filter-name>
    <filter-class>org.springframework.web.filter.CharacterEncodingFilter</filter-class>
    <init-param>
      <param-name>encoding</param-name>
      <param-value>UTF-8</param-value>
    </init-param>
  </filter>

  <filter-mapping>
    <filter-name>encoding</filter-name>
    <url-pattern>*.action</url-pattern>
  </filter-mapping>
```

3. post 提交收不到参数 

将`<form id="itemForm"	action="${pageContext.request.contextPath }/item/updateItem.action" method="post"  enctype="multipart/form-data">`
去掉`enctype="multipart/form-data"`  改为 `<form id="itemForm"	action="${pageContext.request.contextPath }/item/updateItem.action" method="post" />`

4.springMVC出现HTTP Status 405 - Request method 'GET' not supported错误的解决方法
https://blog.csdn.net/ahwsk/article/details/79707807

5.java_springMVC_获取post请求的参数
https://blog.csdn.net/qq_41665356/article/details/80234392

