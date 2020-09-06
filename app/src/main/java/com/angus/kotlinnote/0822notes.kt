package com.angus.kotlinnote

//物件後.run回傳最後一行、.also回傳自己，可了解run also let apply差別(scope function)，apply()原本物件在應用東西在他身上intent生出後.apply()
//.apply()後回傳intent物件
 //物件生出後有三樣東西伴隨 屬性(property)可寫在內部或建構子 、 方法 、 (內部)類別
//kotlin 中類別預設不寫表示final無法在繼承，需再多加open class、open fun 表示可以被子類別覆寫(沒有open 只能呼叫不能覆寫)
// init{}為呼叫完建構子後自動執行區塊
//res/raw 聲音檔
//res/xml 設定畫面
//res/navigation 自己google
// show as action : collapseActionView 、 withText 平板上有圖有字
//intent 分兩大類 隱性 顯性
// construction 中沒有 var val 會從屬性變成區域變數，次要建構子變數不能變屬性
//drawable-V24 是android5.0新功能
//Java以前倒數計時使用TimerTask，kotlin 使用corutine協程
//只有main thread可以碰到元件，TimeTask中不能碰到元件相關會有ExecuteThread問題發生
//加入enum 取代 1 = paper, 2 = sissors, 3 = rocks, 回傳Comparator<Type>
// data class 表示專門用來傳遞資料用，比較沒有function 繼承的功能，有功能就又一般class，data class不能繼承別人
//kotlin listof<>()預設為immutable, 若要改變要用mutableListof<>()，記憶體成本考量
//tab 取代，enter接續 template
//configurationChange 翻轉改變監聽, viewModel
//MVVM

//HW : lifedata 透過 監聽result MVVM方法，用在猜拳試試看、計算機內容
