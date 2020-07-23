package com.kurotkin.navigationarchitecturecom

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_blank1.*

class BlankFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        setHasOptionsMenu(true)

//        val safeArgs: FlowStepFragmentArgs by navArgs()
//        val flowStepNumber = safeArgs.flowStepNumber

        val flowStepNumber = arguments?.getInt("flowStepNumber")
        Toast.makeText(context, "flowStepNumber = $flowStepNumber", Toast.LENGTH_SHORT).show()
        return when (flowStepNumber) {
            2 -> inflater.inflate(R.layout.fragment_blank2, container, false)
            else -> inflater.inflate(R.layout.fragment_blank1, container, false)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        next_button.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.next_action))
    }

}