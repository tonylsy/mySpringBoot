# learn spring boot
## this project contains:
+ springboot
+ mybatis
+ log4j2
## target
to learn how to use the spring boot
## hello world
+ http://localhost:8080/greeting
    > it gets the word: "here use the service and controller"; by service and controller
+ http://localhost:8080/hello
    > 1. it shows "I run a thymeleaf!" by using thymeleaf in a html page
    > 2. clicking button and getting "here the data by jquery, and get the param: getword" by ajax in jquery.
+ http://localhost:8080/customer?id=303
    > it shows customer's data from database (Specifically, CustomersNumber is 303).
#### notes
+ druid may throw an exception when this project initials. The message is "Fatal error compiling". In this situation, check and set the property environment.
+ this project is based onr jdk13