package com.example.mycoverageattempts.ui.timers

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.mycoverageattempts.databinding.FragmentTimersBinding

class TimersFragment : Fragment() {

private var _binding: FragmentTimersBinding? = null
  // This property is only valid between onCreateView and
  // onDestroyView.
  private val binding get() = _binding!!

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    val timersViewModel =
            ViewModelProvider(this).get(TimersViewModel::class.java)

    _binding = FragmentTimersBinding.inflate(inflater, container, false)
    val root: View = binding.root

    val textView: TextView = binding.textTimers
    timersViewModel.text.observe(viewLifecycleOwner) {
      textView.text = it
    }
    return root
  }

override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}