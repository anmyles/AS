## 实验三

3.1利用SimpleAdapter实现如下界面效果

（1）注意列表项的布局 （2）图片使用QQ群附件资源 （3）使用Toast显示选中的列表项信息



![img](https://github.com/anmyles/AS/blob/master/images/1.png)

这里创建一个simpleadapter，里面的item包括personname和header 即动物的名字和头像

![img](https://github.com/anmyles/AS/blob/master/images/2.png)

设置一个layout文件，这里用到了线性布局，并以horizontal的方向

![img](https://github.com/anmyles/AS/blob/master/images/3.png)

这是每一行的布局

![img](https://github.com/anmyles/AS/blob/master/images/4.png)

设置Toast，每次点击后就出现一个文本，显示的是该位置的动物名字

![img](https://github.com/anmyles/AS/blob/master/images/5.png)

编译执行genymotion

![img](https://github.com/anmyles/AS/blob/master/images/6.png)

选中后

![img](https://github.com/anmyles/AS/blob/master/images/7.png)

3.2 创建如图所示的自定义对话框 ◼ 请创建一个如图所示的布局， ◼ 调用 AlertDialog.Builder 对象上的 setView() 将布局添加到 AlertDialog。

首先在login.xml里设置对话框的布局，包括一个TextView（这里作为标题栏，尝试过直接设置标题修改标题栏的背景颜色，但是改变背景颜色后除了文本框其他地方都有颜色，与题意不符，就把标题直接改成TextView，有两个编辑框，一个输入用户名，一个输入密码

![img](https://github.com/anmyles/AS/blob/master/images/8.png)

![img](https://github.com/anmyles/AS/blob/master/images/9.png)

 

这里用于创建一个AlertDialog.Builder，并调用setView设置对话框显示的对象，包括Sign in 和Cancel按键，最后用.show()显示对话框

![img](https://github.com/anmyles/AS/blob/master/images/10.png)

最后编译运行

![img](https://github.com/anmyles/AS/blob/master/images/11.png)

点击自定义VIEW对话框

![img](https://github.com/anmyles/AS/blob/master/images/12.png)

3.3使用XML定义菜单 ◼ 字体大小（有小，中，大这3个选项；分 别对应10号字，16号字和20号字）； 点击之后设置测试文本的字体 ◼ 普通菜单项，点击之后弹出Toast提示 ◼ 字体颜色（有红色和黑色这2个选项）， 点击之后设置测试文本的字体

设置可选的小中大三种字体，分别为10号，16号，20号

![img](https://github.com/anmyles/AS/blob/master/images/13.png)

设置可选颜色为红、黑

![img](https://github.com/anmyles/AS/blob/master/images/14.png)

设置Toast提示

![img](https://github.com/anmyles/AS/blob/master/images/15.png)

编译执行

![img](https://github.com/anmyles/AS/blob/master/images/16.png)

选择字体大小

![img](https://github.com/anmyles/AS/blob/master/images/17.png)

选中大后

![img](https://github.com/anmyles/AS/blob/master/images/18.png)

选择字体颜色

![img](https://github.com/anmyles/AS/blob/master/images/19.png)

选择红色

![img](https://github.com/anmyles/AS/blob/master/images/20.png)

点击普通菜单项，出现Toast

![img](https://github.com/anmyles/AS/blob/master/images/21.png)

3.4创建如图模式的上下文菜单 ◼ 使用ListView或者ListActivity创建 List ◼ 为List Item创建ActionMode形式 的上下文菜单

设置多选模式

![img](https://github.com/anmyles/AS/blob/master/images/22.png)

设置layout规定每一行的格式

![img](https://github.com/anmyles/AS/blob/master/images/23.png)

设置menu布局来规定长按后标题栏显示的内容，这里包括全选和删除

![img](https://github.com/anmyles/AS/blob/master/images/24.png)

编译执行

![img](https://github.com/anmyles/AS/blob/master/images/25.png)

长按后

![img](file:///C:/Users/anmyles/AppData/Local/Temp/msohtmlclip1/01/clip_image052.jpg)

## 实验四

1.获取URL地址并启动隐式Intent的调用。
 1.1添加一个edittext框用来填写网址，并提示用户输入的格式为http://...

![img](https://github.com/anmyles/AS/blob/master/images/4.1.png)

1.2 用inputText来存放从edittext获取到的网址，并用intent打开

![img](https://github.com/anmyles/AS/blob/master/images/4.2.png)

1.3 运行

![img](https://github.com/anmyles/AS/blob/master/images/4.3.png)

1.4输入http://www.baidu.com,并点击游览该网页按钮，跳转到百度页面

![img](https://github.com/anmyles/AS/blob/master/images/4.4.png)

2.自定义WebView来加载URL

2.1创建web的工程来自定义游览器，游览器的界面如下

![img](https://github.com/anmyles/AS/blob/master/images/4.5.png)

2.2AndroidManifest.xml配置文件

![img](https://github.com/anmyles/AS/blob/master/images/4.6.png)

2.3编辑intent工程

![img](https://github.com/anmyles/AS/blob/master/images/4.7.png)

2.4 先运行web工程，再运行intent

![img](https://github.com/anmyles/AS/blob/master/images/4.8.png)

点击游览该网页后，选择web游览器

![img](https://github.com/anmyles/AS/blob/master/images/4.9.png)

可以用web查看网页了

![img](https://github.com/anmyles/AS/blob/master/images/4.10.png)