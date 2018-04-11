## 第一期web文件整合
#### 前言：
* 也许还可以更细致一些，但我觉得这样就够了...
* 目录结构不一定是最好的，但还算能看

#### 注意事项：
* 带有main函数的class可以直接右键run， usermanager注意添加运行参数（这个懒得截图了，百度吧）
* 因为cfg.xml已经开启了自动建表（hbm2ddl.auto属性，update）， 所以不用手动到数据库建表，第一次跑store参数，第二次跑list即可
* 共有三个地方需要填写数据库信息，App class， hibernate.cfg.xml， webapp下面的test.jsp
* jdk9缺少了一些奇怪的包，已经添加在依赖项中
* 顺手最新版的spring + struts + hibernate全整合了，关于配置项等待下期更新...
* 依赖项很多，添加了部分注释（缺少包时请访问：http://mvnrepository.com/， 输入包名，打开之后会有完整的依赖项添加，copy下来放到pom里面即可）
* 因为不会玩jsp，简单看了一下，context.xml需要到tomcat添加，我觉得很烦，所以直接用了别的标签

#### 环境配置：
* 安装jdk 9、tomcat 9、maven （jdk 8 可能会有问题，根据报错手动调整一下依赖项）
* 如果用idea运行，不需要在windows上设置环境变量，在项目左上角可以打开setting，或者右上角有edit configuration 和 project structrue.
* 一般来说，遵循默认的结构，不需要额外配置，但还是建议检查一下（见图片文件）
* tomcat 安装好之后，idea里右上角edit（见图片），deployment里面添加war文件（exploded是热加载）

