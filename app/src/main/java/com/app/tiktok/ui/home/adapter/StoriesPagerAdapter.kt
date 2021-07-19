package com.app.tiktok.ui.home.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.app.tiktok.model.StoriesDataModel
import com.app.tiktok.ui.story.StoryViewFragment

class StoriesPagerAdapter(fragment: Fragment, private val dataList: List<StoriesDataModel> = mutableListOf())
    : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = dataList.size

    override fun createFragment(position: Int): Fragment =
        StoryViewFragment.newInstance(dataList[position])
}