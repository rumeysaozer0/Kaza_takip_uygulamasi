package com.rumeysaozer.kazanamazitakip

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.rumeysaozer.kazanamazitakip.databinding.FragmentNamazBinding

class NamazFragment : Fragment() {

    private var _binding: FragmentNamazBinding? = null
    private val binding get() = _binding!!

    var sabah = 0
    var ogle = 0
    var ikindi = 0
    var aksam = 0
    var yatsi = 0
    var vitir = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentNamazBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        try{
            val preferences = this.requireActivity().getSharedPreferences("com.rumeysaozer.kazanamazitakip", Context.MODE_PRIVATE)
            sabah = preferences.getInt("sabah",0)
            binding.s.text = sabah.toString()
        }catch(e: Exception){
            e.printStackTrace()
        }
        try{
            val preferences = this.requireActivity().getSharedPreferences("com.rumeysaozer.kazanamazitakip", Context.MODE_PRIVATE)
            ogle = preferences.getInt("ogle",0)
            binding.o.text = ogle.toString()
        }catch(e: Exception){
            e.printStackTrace()
        }
        try{
            val preferences = this.requireActivity().getSharedPreferences("com.rumeysaozer.kazanamazitakip", Context.MODE_PRIVATE)
            ikindi = preferences.getInt("ikindi",0)
            binding.i.text = ikindi.toString()
        }catch(e: Exception){
            e.printStackTrace()
        }
        try{
            val preferences = this.requireActivity().getSharedPreferences("com.rumeysaozer.kazanamazitakip", Context.MODE_PRIVATE)
            aksam = preferences.getInt("aksam",0)
            binding.a.text = aksam.toString()
        }catch(e: Exception){
            e.printStackTrace()
        }

        try{
            val preferences = this.requireActivity().getSharedPreferences("com.rumeysaozer.kazanamazitakip", Context.MODE_PRIVATE)
            yatsi = preferences.getInt("yatsi",0)
            binding.y.text = yatsi.toString()
        }catch(e: Exception){
            e.printStackTrace()
        }

        try{
            val preferences = this.requireActivity().getSharedPreferences("com.rumeysaozer.kazanamazitakip", Context.MODE_PRIVATE)
            vitir = preferences.getInt("vitir",0)
            binding.v.text = vitir.toString()
        }catch(e: Exception){
            e.printStackTrace()
        }


        binding.sa.setOnClickListener {
            val preferences = this.requireActivity().getSharedPreferences("com.rumeysaozer.kazanamazitakip", Context.MODE_PRIVATE)
            sabah = preferences.getInt("sabah",0)
            try {
                sabah++
                binding.s.text = sabah.toString()
                preferences.edit().putInt("sabah",sabah).apply()
            }catch(e: Exception){
                e.printStackTrace()
            }


        }
        binding.se.setOnClickListener {
            val preferences = this.requireActivity().getSharedPreferences("com.rumeysaozer.kazanamazitakip", Context.MODE_PRIVATE)
            sabah = preferences.getInt("sabah",0)
            try {
                if (sabah <= 0) {
                    sabah = 0
                    binding.s.text = sabah.toString()
                } else {
                    sabah--
                    binding.s.text = sabah.toString()
                }
                preferences.edit().putInt("sabah",sabah).apply()
            }catch(e: Exception){
                e.printStackTrace()
            }

        }
        binding.oa.setOnClickListener {
            val preferences = this.requireActivity().getSharedPreferences("com.rumeysaozer.kazanamazitakip", Context.MODE_PRIVATE)
            ogle = preferences.getInt("ogle",0)
           try {
               ogle++
               binding.o.text = ogle.toString()
               preferences.edit().putInt("ogle",ogle).apply()
           }catch(e: Exception){
               e.printStackTrace()
           }

        }
        binding.oe.setOnClickListener {
            val preferences = this.requireActivity().getSharedPreferences("com.rumeysaozer.kazanamazitakip", Context.MODE_PRIVATE)
            ogle = preferences.getInt("ogle",0)
            try {
                if (ogle <= 0) {
                    ogle = 0
                    binding.o.text = ogle.toString()
                } else {
                    ogle--
                    binding.o.text = ogle.toString()
                }
                preferences.edit().putInt("ogle",ogle).apply()
            }catch(e: Exception){
                e.printStackTrace()
            }


        }
        binding.ia.setOnClickListener {
            val preferences = this.requireActivity().getSharedPreferences("com.rumeysaozer.kazanamazitakip", Context.MODE_PRIVATE)
            ikindi = preferences.getInt("ikindi",0)
            try {
                ikindi++
                binding.i.text = ikindi.toString()
                preferences.edit().putInt("ikindi",ikindi).apply()
            }catch(e: Exception){
                e.printStackTrace()
            }

        }
        binding.ie.setOnClickListener {
            val preferences = this.requireActivity().getSharedPreferences("com.rumeysaozer.kazanamazitakip", Context.MODE_PRIVATE)
            ikindi = preferences.getInt("ikindi",0)
            try {
                if (ikindi <= 0) {
                    ikindi = 0
                    binding.i.text = ikindi.toString()
                } else {
                    ikindi--
                    binding.i.text = ikindi.toString()
                }
                preferences.edit().putInt("ikindi",ikindi).apply()
            }catch(e: Exception){
                e.printStackTrace()
            }
        }

        binding.aa.setOnClickListener {
            val preferences = this.requireActivity().getSharedPreferences("com.rumeysaozer.kazanamazitakip", Context.MODE_PRIVATE)
            aksam = preferences.getInt("aksam",0)
            try {
                aksam++
                binding.a.text = aksam.toString()
                preferences.edit().putInt("aksam",aksam).apply()
            }catch(e: Exception){
                e.printStackTrace()
            }

        }
        binding.ae.setOnClickListener {
            val preferences = this.requireActivity().getSharedPreferences("com.rumeysaozer.kazanamazitakip", Context.MODE_PRIVATE)
            aksam = preferences.getInt("aksam",0)
            try {
                if (aksam <= 0) {
                    aksam = 0
                    binding.a.text = aksam.toString()
                } else {
                    aksam--
                    binding.a.text = aksam.toString()
                }
                preferences.edit().putInt("aksam",aksam).apply()
            }catch(e: Exception){
                e.printStackTrace()
            }
        }

        binding.ya.setOnClickListener {
            val preferences = this.requireActivity().getSharedPreferences("com.rumeysaozer.kazanamazitakip", Context.MODE_PRIVATE)
            yatsi = preferences.getInt("yatsi",0)
            try {
                yatsi++
                binding.y.text = yatsi.toString()
                preferences.edit().putInt("yatsi",yatsi).apply()
            }catch(e: Exception){
                e.printStackTrace()
            }

        }
        binding.ye.setOnClickListener {
            val preferences = this.requireActivity().getSharedPreferences("com.rumeysaozer.kazanamazitakip", Context.MODE_PRIVATE)
            yatsi = preferences.getInt("yatsi",0)
            try {
                if (yatsi <= 0) {
                    yatsi = 0
                    binding.y.text = yatsi.toString()
                } else {
                    yatsi--
                    binding.y.text = yatsi.toString()
                }
                preferences.edit().putInt("yatsi",yatsi).apply()
            }catch(e: Exception){
                e.printStackTrace()
            }
        }
        binding.va.setOnClickListener {
            val preferences = this.requireActivity().getSharedPreferences("com.rumeysaozer.kazanamazitakip", Context.MODE_PRIVATE)
            vitir = preferences.getInt("vitir",0)
            try {
                vitir++
                binding.v.text = vitir.toString()
                preferences.edit().putInt("vitir",vitir).apply()
            }catch(e: Exception){
                e.printStackTrace()
            }

        }
        binding.ve.setOnClickListener {
            val preferences = this.requireActivity().getSharedPreferences("com.rumeysaozer.kazanamazitakip", Context.MODE_PRIVATE)
            vitir = preferences.getInt("vitir",0)
            try {
                if (vitir <= 0) {
                    vitir = 0
                    binding.v.text = vitir.toString()
                } else {
                    vitir--
                    binding.v.text = vitir.toString()
                }
                preferences.edit().putInt("vitir",vitir).apply()
            }catch(e: Exception){
                e.printStackTrace()
            }
        }
    }
}