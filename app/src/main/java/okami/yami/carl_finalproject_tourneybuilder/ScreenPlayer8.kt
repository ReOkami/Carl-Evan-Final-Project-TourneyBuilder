package okami.yami.carl_finalproject_tourneybuilder


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_screen_player8.*


class ScreenPlayer8 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_screen_player8, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        button1.setOnClickListener {
            findNavController().navigate(R.id.action_player8Fragment_to_bioFragment)
        }

        button2.setOnClickListener {
            findNavController().navigate(R.id.action_player8Fragment_to_bioFragment)
        }

        button3.setOnClickListener {
            findNavController().navigate(R.id.action_player8Fragment_to_bioFragment)
        }

        button4.setOnClickListener {
            findNavController().navigate(R.id.action_player8Fragment_to_bioFragment)
        }

        button5.setOnClickListener {
            findNavController().navigate(R.id.action_player8Fragment_to_bioFragment)
        }

        button6.setOnClickListener {
            findNavController().navigate(R.id.action_player8Fragment_to_bioFragment)
        }

        button7.setOnClickListener {
            findNavController().navigate(R.id.action_player8Fragment_to_bioFragment)
        }

        button8.setOnClickListener {
            findNavController().navigate(R.id.action_player8Fragment_to_bioFragment)
        }
    }
}
