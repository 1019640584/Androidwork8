package com.example.androidwork.bean;

import com.example.androidwork.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "联想Thinkbook 14", "戴尔（DELL）灵越5000-5401", "惠普(hp) 星14", "RedmiBook 14", "小米（MI）RedmiBook13", "联想(Lenovo)小新Air15", "联想(Lenovo)小新Air13", "联想ThinkPad E14"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "联想Thinkbook 14 02CD 14英寸窄边框商务轻薄笔记本电脑（十代i5-1035G1 8G 1T+256G SSD 2G独显 FHD高分屏 Win10",
            "戴尔（DELL）灵越5000-5401 14英寸第十代英特尔®酷睿™i5灵越2020版笔记本电脑（i5-1035G1 8GB内存 512GB固态硬盘 2G独显）",
            "惠普(hp) 星14青春版14s-fr0008AU 14英寸锐龙R7轻薄本笔记本电脑(R7-4700U 7纳米制程 16G 512GSSD 月光银）",
            "RedmiBook 14 Ⅱ代 锐龙版 超轻薄 全面屏(AMD R5-4500U 16G 512G SSD ) 银 笔记本电脑 轻薄本 小米 红米",
            "小米（MI）RedmiBook13全面屏超轻薄本(全新十代酷睿i5-10210U 8G 512G SSD MX250 2G独显 )笔记本电脑 手环疾速解锁 游戏 超长续航 月光银",
            "联想(Lenovo)小新Air15 2021款15.6英寸全面屏超轻薄笔记本电脑(i5-1135G7 16G 512G 高色域 Windows10)银",
            "联想(Lenovo)小新Air13 13.3英寸轻薄本笔记本电脑(十代酷睿i5-10210U 8GB 512GB SSD MX250 2G独显 高色域)经典蓝",
            "联想ThinkPad E14（3CCD）第十代英特尔酷睿i5 14英寸轻薄笔记本电脑 i5-10210U 8G 128G+1TB 2G独显 FHD"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {4699, 3999, 2698, 2098,2999, 2899, 2698, 2098};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.a, R.drawable.b, R.drawable.c,R.drawable.d, R.drawable.e, R.drawable.f,R.drawable.g, R.drawable.h
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.a, R.drawable.b, R.drawable.c,R.drawable.d, R.drawable.e, R.drawable.f,R.drawable.g, R.drawable.h
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}