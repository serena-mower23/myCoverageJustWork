package com.example.mycoverageattempts.ui.trips

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.mycoverageattempts.databinding.FragmentTripsBinding

class TripsFragment : Fragment() {

private var _binding: FragmentTripsBinding? = null
  // This property is only valid between onCreateView and
  // onDestroyView.
  private val binding get() = _binding!!

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    val tripsViewModel =
            ViewModelProvider(this).get(TripsViewModel::class.java)

    _binding = FragmentTripsBinding.inflate(inflater, container, false)
    val root: View = binding.root

    val textView: TextView = binding.textTrips
    tripsViewModel.text.observe(viewLifecycleOwner) {
      textView.text = it
    }
    return root
  }

override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}