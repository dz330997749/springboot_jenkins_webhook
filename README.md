springboot+vue的练习demo

员工管理系统

一、功能点
1. 用户相关
        a 用户登陆，b 用户注册，c 页面上展示：欢迎XXX用户，d 用户的退出
2. 员工相关：
        员工信息的增、删、改、查 显示的分页功能        

二、使用技术
1.  前端：vue(没有用到vue-cli脚手架), jquery(用于), bootstrap
    后端：springboot + mybatis + mysql + tomcat
    前后端交互：axios
    项目管理：maven
    
2. 项目名称：vue_springboot_emp
   项目端口：server.port = 8082
   项目访问路径：server.servlet.context-path=/vue_springboot_emp
   

三、数据库
1. 数据库名字：springboot_emp
2. 数据库表 3 张：
    表1: tbl_user 
        字段：id, username, password
    表2：tbl_emp
        字段：id, emp_name, age, gender, salary, dept_id
    表3：tbl_dept
        字段：id, dept_name
3. 数据库文件位置：./src/main/resources/sql/ 下

四、项目的目录结构
1. 代码文件：
src/main/java/
             me.xz.bean
                  .controller
                  .dao
                  .service
             启动类springbootApplication
             
2. 资源文件
src/main/resources/
                  me/xz/mapper
                  sql
                  application.properties
                  static/
                         login.html
                         register.html
                         ......等等html

五、开发步骤：
1.  用户登录页面 login.html **完成**
2.  实现用户登陆的响应 **完成**
    完成login.htm页面上的用户注册，写一个register.html **完成**
    如果已经登陆就在   每一个页面上展示：欢迎XXX用户，使用localstorage和v-show **完成**
                      以及用户的退出功能 **完成**
3.  用户相关功能完成 开始做员工相关的功能 

(1) 员工查询功能：   
    首先是员工的列表 写一个empList.html页面 
    a   员工列表进入时查询数据库并显示员工相关数据填入表格 
    细节需要实现：数据库gender为M和F 要显示为男 女 **完成**
    
    {{ emp.gender == 'M' ? '男' : '女' }} 这样即可实现 **完成**
    

(2) 员工添加功能：
    使用bootstrap的模态框实现 点击员工列表的'添加员工信息' 弹出员工添加模态框进行操作
    下拉选框，选择部门，部门的名称从数据库中获得
    进入页面时发送axios请求 查询department数据库 返回页面
        细节问题：部门信息怎么渲染到<select><select>中
        直接在option列中使用v-for
        <option v-for="dept in depts">{{dept.dept_name}}</option>
    员工表单的提交 
        **问题: 员工的下拉选单<select>里的<option>显示的是部门名字
                那么部门id怎么传到controller层去？**
        方法： <select class="form-control" v-model="emp_add_modal.dept_id">
                   <option v-for="(dept, index) in depts">{{ dept.dept_name }}</option>
               </select> **完成**
    员工数据表的Insert操作
    员工添加功能 **完成**


(3) 翻页功能
    1. 画一个分页栏 bootstrap 完成
    2. 使用分页插件pageHelper
    返回给前台分页信息
        开始渲染分页信息
        难点 如何渲染分页栏及跳转的显示
        思路： a 先用v-for渲染分页导航条 完成
                如果pageNum==当前页的index 那么高亮显示, 即class=active
               b 绑定data里的page和导航条的页码，点击第几页就刷新一次 重新请求页面
               page就等于几然后重新渲染一次 
        问题：点击页码触发click事件后，page值修改了 但是重新刷新又恢复默认值了
        因此不能重新刷新，而是直接发送查询全部员工的axios请求 然后页面会重新渲染
    说明一点：方法直接调用要在调用前加this 用this.method()的方式才能调用**完成**
        分页导航栏上当前页码的高亮/激活显示 **完成**
        :class="item==page? 'active': '' " 
        实现首页和尾页的跳转 前一页和后一页的隐藏 **完成**

(4) 员工删除功能
    a.点击删除，弹出确认对话框，
    点击确定删除记录
    点击确定 将id值作为删除函数的参数传入axios请求中 **完成**

(5) 员工修改功能
    a. 点击修改，弹出修改模态框  **完成**
    b. 传入当前点击的员工信息的数据至 员工修改的模态框中显示 **完成**
    **TODO：**
    c. 修改操作
    后台能正常接收axios传入的Employee参数
    写update语句
**完成**


















