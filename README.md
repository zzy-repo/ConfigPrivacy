# spring boot配置数据隐私化

### 项目简介

在项目上传至代码库的过程中，配置数据如数据库账号和密码，往往会出现隐私泄露的问题。

于是笔者想到了通过引入系统变量的方式，将敏感配置信息从代码库中抽离，实现配置数据的隐私化。

### 方法

添加系统变量

![image-20240904153820400](https://gitee.com/zzy2401/picbed/raw/master/images/image-20240904153820400.png)

在配置文件中用`${...}`导入即可

![image-20240904153858407](https://gitee.com/zzy2401/picbed/raw/master/images/image-20240904153858407.png)

### 测试结果

![image-20240904154232519](https://gitee.com/zzy2401/picbed/raw/master/images/image-20240904154232519.png)