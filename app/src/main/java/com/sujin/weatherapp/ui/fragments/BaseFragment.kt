package com.sujin.weatherapp.ui.fragments

import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.sujin.weatherapp.R

abstract class BaseFragment : Fragment() {

    fun getNavController(): NavController {
        return Navigation.findNavController(
            requireActivity(),
            R.id.nav_frag_container
        )
    }

}