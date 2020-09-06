package com.angus.kotlinnote

//20200905 上課筆記
//Quiz.kt @ignore不寫入資料庫
//Roomy 資料庫改任何一個entry時都需要刪除application再重新安裝\
//執行續需要呼叫功能.start()，thread不用呼叫.start()
//coroutines
// shift + f6 改名字
//private var instance : QuizDatabase? = null  若不設成private，main中可能有人會改寫到
//suspend(暫置)，用在fun身上
//pause(暫停)
//live Data
//讓coroutines與Activity連接，不然每次activity結束要關閉全部的Coroutines，或是用CoroutinesScope，
//或是讓coroutines生多個CR，關第一個即關所有
//類別名稱最後有S結尾，通常為工具型類別
//layout 中 infer揣摩上意
//Coroutines -- launch(啟動)
//Room 中suspend fun 只能在coroutines中執行(才可暫停進行其他功能)，不能再thread
//Main(UI)
//IO (網路資料庫)，非UI執行續稱為worker
//Default(CPU較重的工作)

//RecyclerView 有三樣東西需要設定
//android 2011年 還沒recyclerview 自己寫patent 自己暫存資料
//1.身上內容固定大小(fixed)，CPU不用一直算
//2.顯示方式，清單型layoutManager
//3.最後adapter (複寫三個function)
//viewholder 把view暫存起來機制，要用的時候再呼叫出來畫面，設定自己的viewholder類別
//先設計viewholder，在設計adapter在設計adapter內的資料
//sp跟字有關係，dp跟螢幕有關係，利用textAppearance可算手機比例(較開放)
//設計單列layout需再constraintlayout設定layout_height為wrap_content
//adapter類別設定在MainActivity中可省略很多事情(只能給單一activity使用)，若設在外部class中需要建構子將資料傳進去(可給多個activity使用)
//adapter 在MainActivity中需要寫inner class(內部類別)不然無法讀取到quizs
//adapter在內部 產生layoutInflater.inflate，若在外部則使用LayoutInflater.from(parent.context).inflate()
//recycler 需在Main 執行續中
//withContext(Dispatchers.Main){recycler setting}
//withContext只能在coroutine中換情境
//沒有https要連線需要在manifest 中加入 usesCleartext....設定
//網路連線需要設計權限<uses-permission INTERNET...../>
//EPERM (socket error)原因不詳 模擬器反安裝即可，手機實測不會有這個錯誤，大部分都在clearTraffictext 可能沒更新到app裡面去



//0905HW 設定adapter 讀取json並讀取recycler顯示(kotlin json data class)貼上json資料自動分析資料格式
//下次教json、jackson 讀取json 資料庫 (id, emplyee_name, salary, emplyee_age)
//HW login 畫面的fragment及recycler
//一開始需要登入再玩冷知識遊戲(帳號:jack，密碼:1234)，使用fragment，進入後選擇問題