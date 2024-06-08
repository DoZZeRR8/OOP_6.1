package com.example.oop_61

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.oop_61.databinding.FragmentBlankBinding

private const val ARG_PARAM1 = "Number"

class BlankFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var Number: String? = null
    private var _binding: FragmentBlankBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            Number = it.getString(ARG_PARAM1)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBlankBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvTable.text = generateMultiplicationTable()
    }

    fun generateMultiplicationTable(): String {
        val num = Number?.toIntOrNull() ?: 1

        val table = StringBuilder()
        for (i in 1..10) {
            val product = num * i
            table.append("$num * $i = $product\n")
        }
        return table.toString()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    companion object {
        @JvmStatic
        fun newInstance(Number: String) =
            BlankFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, Number)
                }
            }
    }
}