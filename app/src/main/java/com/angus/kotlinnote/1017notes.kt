package com.angus.kotlinnote

// data class 表示專門用來傳遞資料用，比較沒有function 繼承的功能，有功能就又一般class，data class不能繼承別人
//android studio 4.1 沒加apply plugin: 'kotlin-android-extensions'、id 'kotlin-kapt'
//lifecycle 導入  ViewModel、LiveData、Annotation processor
//run 回傳最後一行物件
//room 導入


//coroutines 導入    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.9' 、    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.9'
//by lazy 一開始不產生，直到有人要此東西
//viewModel 如果裡面要有context 可以繼承androidViewModel(application)
//viewModel 中可直接寫入coroutine工作
//較複雜的viewModel 可以用factory教
//fragment 建議單一物件化，但其實也不太會當機，優化
//資料庫首次新增資料 需要被呼叫
//有database的app 需要刪掉重新安裝，模擬器也重新生出
//Word : parcelable
//Word @Parcelize

//HW menu insert new Activity new Vocabulary(name means diff star 要有打字)
