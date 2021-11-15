package ru.oktemsec.pr7_abramov.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import ru.oktemsec.pr7_abramov.FirstActivity
import ru.oktemsec.pr7_abramov.R
import ru.oktemsec.pr7_abramov.SecondActivity
import ru.oktemsec.pr7_abramov.ThirdActivity

private val TAB_TITLES = arrayOf(
    R.string.tab_text_1,
    R.string.tab_text_2,
    R.string.tab_text_3
)

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        when (position) {

            0 -> {
                val tab1:FirstActivity = FirstActivity()
                return tab1
            }
            1 -> {
                val tab2:SecondActivity = SecondActivity()
                return tab2
            }
            2 -> {
                val tab3:ThirdActivity = ThirdActivity()
                return tab3
            }

        }
        return PlaceholderFragment.newInstance(position + 1)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        // Show 2 total pages.
        return 3
    }
}