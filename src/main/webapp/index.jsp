<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title> Fox拍卖网 </title>
    <meta charset="utf-8">
    <link rel="stylesheet" type="text/css" href="CSS/hw_index.css" >
    <link rel="icon" href="img/hw.ico">
    <script src="JS/hw_index.js"></script>
</head>
<body>
<!-- 页面顶部 -->
<!-- 顶部容器 ：width:100% -->
<header id="top">
    <!-- 内容显示区域 ：width : 1211px -->
    <div id="top_box">
        <ul class="lf">
            <li><a href="index">Fox首页</a></li>
            <li><a href="Shopping">购物车</a></li>
        </ul>
        <ul class="rt">
            <li><a href="Login.action">登录</a></li>
            <li><a href="Register">注册</a></li>
            <li><a href="OrderList">我的订单</a></li>
            <li><a href="contact">联系客服</a></li>
            <li><a href="Collection">收藏夹</a></li>
            <li>
                <a href="Navigation">网站导航</a>
                <!--鼠标移入移出事件-->
            </li>
        </ul>
    </div>
</header>
<!-- logo 和 搜索框 -->
<div id="top_main">
    <div class="lf  top_main_left">
        <img src="img/image/logo.png" alt="" />
    </div>
    <div class="lf search_box">
        <div class="search">
            <input type="text" class="text"  value="竞标商品名称" onFocus="this.value = '';" id="txtSearch"/>
            <input type="button" class="button" value="搜索"/>
        </div>
       
    </div>
    
</div><!--top_main-->

<!-- 导航 -->
<nav id="nav">
    <div id="category">
        <a href="#">竞拍商品</a>
    </div>

   
    <ul id="nav_items" class="lf">
        <li><a href="index">首页</a></li>
        <li><a href="Notice">公告</a></li>
        <li><a href="#">预告</a></li>
        <li><a href="#">贷款</a><s></s></li>
        <li><a href="#">我的拍卖</a></li>
        <li><a href="#">零佣金</a></li>
        <li><a href="#">交易保障</a></li>
    </ul>
</nav>
<!-- banner 广告 -->
<div id="banner">
    <ul id="cate_box" class="lf">
        <li>
            <h3><a href="#">所有商品</a></h3>
        
		
        </li>
        <li>
            <h3><a href="#">运动纪念品</a></h3>
            
        </li>
        <li>
            <h3><a href="#">电子产品</a></h3>
           
        </li>
        <li>
            <h3><a href="#">艺术品</a></h3>
            
        </li>
        <li>
            <h3><a href="#">玉石</a></h3>
           
        </li>
		 <li>
            <h3><a href="#">木质家具</a></h3>
           
        </li>
		 <li>
            <h3><a href="#">电器</a></h3>
           
        </li>
       
    </ul>
    <!--图片轮播 -->
    <form>
        <div class="slider">
            <img id="slider_img" class="img_slider" src="img/1.png" alt=""/>
        </div>
    </form>
	

</div>
<div class="hr-2"></div>
<!-- 网页主体 -->
<section id="main">
 <img src="img/image/pp.png" alt="" />
    <div class="layout">
        <div class="fl u-4-3 lf">
            <ul>
                <li class="channel-pro-item">
                    <!--<i class="p-tag"><img src="img/new_ping.png" style="padding-left: 0" alt=""/></i>-->
                    <div class="p-img">
                        <img src="img/phone01.png" alt=""/>
                    </div>
                    <div class="p-name lf"><a href="#">HUAWEI P9 Plus</a></div>
                    <div class="p-shining">
                       
						<div class="p-slogan">预计 04月08日10:00结束</div>
                        <div class="p-promotions">评估价：¥4000元</div>
						
                    </div>
                    <div class="p-price">
                        <em>¥</em>
                        <span>3088</span>
                    </div>
                    <div class="p-button lf">
                        <a href="#">参与竞拍</a>
                    </div>
                </li>
              
                <li class="channel-pro-item" style="background-color:#FFECEF"><!--荣耀畅玩5C-->
                    <!--<i class="p-tag"><img src="img/hot_but.png" alt=""/></i>-->
                    <div class="p-img">
                        <img src="img/NIKE.jpg" alt=""/>
                    </div>
                    <div class="p-name lf"><a href="#">NIKE耐克男鞋跑步鞋</a></div>
                    <div class="p-shining">
                        <div class="p-slogan">预计4月10号10:00结束</div>
                        <div class="p-promotions">评估价：¥300元</div>
                    </div>
                    <div class="p-price">
                        <em>¥</em>
                        <span>250</span>
                    </div>
                    <div class="p-button lf ">
                        <a href="#">参与竞拍</a>
                    </div>
                </li>
            </ul>
        </div><!-- u-4-3结束-->
       <div id="banner">
    <ul id="cate_box" class="lf">
       <li>
            <h3><a href="#">参拍流程</a></h3>
           
        </li>
        <li>
            <h3><a href="#">缴纳保证金</a></h3>
            
        </li>
        <li>
            <h3><a href="#">竞拍规则</a></h3>
           
        </li>
		 <li>
            <h3><a href="#">竞拍流程</a></h3>
           
        </li>
            <div class="hr-2"></div>
            <ul class="h-tab">
                <li class="current" id="tab-notice">
                    <a href="#">公告</a>
                </li>
                <li id="tab-news" class="">
                    <a href="#">预告 </a>
                </li>
                <div class="b">
                    <ul id="tab-notice-content" style="display:block;">
                        <li>
                            <a href="#">仔细研究拍卖规</a>
                        </li>
                        <li>
                            <a href="#">谨慎设置起拍价</a>
                        </li>
                        <li>
                            <a href="#">谨慎选择交易对象</a>
                        </li>
                        <li>
                            <a href="#">请谨慎判断诚信卖家身份</a>
                        </li>
                    </ul>
                </div>
            </ul>
        </div>
        <div class="hr-2"></div>
       




        <script src="js/jquery-1.11.3.js"></script>
        <script src="js/bootstrap.js"></script>

</body>
</html>