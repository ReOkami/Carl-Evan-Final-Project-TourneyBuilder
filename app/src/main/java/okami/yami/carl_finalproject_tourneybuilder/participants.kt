package okami.yami.carl_finalproject_tourneybuilder

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_participants.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [participants.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [participants.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class participants : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_participants, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        button9.setOnClickListener{
            findNavController().navigate(R.id.action_participants_to_playerBio)
        }
        button10.setOnClickListener{
            findNavController().navigate(R.id.action_participants_to_playerBio)
        }
        button11.setOnClickListener{
            findNavController().navigate(R.id.action_participants_to_playerBio)
        }
        button12.setOnClickListener{
            findNavController().navigate(R.id.action_participants_to_playerBio)
        }
        button13.setOnClickListener{
            findNavController().navigate(R.id.action_participants_to_playerBio)
        }
        button14.setOnClickListener{
            findNavController().navigate(R.id.action_participants_to_playerBio)
        }
        button15.setOnClickListener{
            findNavController().navigate(R.id.action_participants_to_playerBio)
        }
        button16.setOnClickListener{
            findNavController().navigate(R.id.action_participants_to_playerBio)
        }

    }

}
