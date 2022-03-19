package co.farooq.viewmodelnheritance.ui.dashboard

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import co.farooq.viewmodelnheritance.databinding.FragmentDashboardBinding
import co.farooq.viewmodelnheritance.ui.BaseViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private val dashboardViewModel: DashboardViewModel by activityViewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textView: TextView = binding.textDashboard
        dashboardViewModel.baseViewModel._textTest.observe(viewLifecycleOwner) {
            textView.text = it
        }

        Handler().postDelayed({
            dashboardViewModel.baseViewModel._textTest.apply {
                value = "This is Dashboard Fragment"
            }
        },2400)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}