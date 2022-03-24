package com.rumeysaozer.kazanamazitakip


import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.content.SharedPreferences;
import com.rumeysaozer.kazanamazitakip.databinding.FragmentOrucBinding

class OrucFragment : Fragment() {
    private var _binding: FragmentOrucBinding? = null
    private val binding get() = _binding!!
    private var a = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentOrucBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var oruc = 0
        try{
            val preferences = this.requireActivity().getSharedPreferences("com.rumeysaozer.kazanamazitakip", Context.MODE_PRIVATE)
            oruc = preferences.getInt("oruc",0)
            binding.sayi.text = oruc.toString()
        }catch(e: Exception){
            e.printStackTrace()
        }


        binding.plus.setOnClickListener {
            val preferences = this.requireActivity().getSharedPreferences("com.rumeysaozer.kazanamazitakip", Context.MODE_PRIVATE)
            oruc = preferences.getInt("oruc",0)
            try {
                oruc++
                a = oruc
                binding.sayi.text = a.toString()
                preferences.edit().putInt("oruc",oruc).apply()
            }catch(e: Exception){
                e.printStackTrace()
            }

        }
        binding.minus.setOnClickListener {
            val preferences = this.requireActivity().getSharedPreferences("com.rumeysaozer.kazanamazitakip", Context.MODE_PRIVATE)
            oruc = preferences.getInt("oruc",0)
            try {


                if (oruc <= 0) {
                    oruc = 0
                    binding.sayi.text = oruc.toString()
                } else {
                    oruc--
                    a = oruc
                    binding.sayi.text = a.toString()
                }
                preferences.edit().putInt("oruc",oruc).apply()
            }catch(e: Exception){
                e.printStackTrace()
            }
        }


    }

}


