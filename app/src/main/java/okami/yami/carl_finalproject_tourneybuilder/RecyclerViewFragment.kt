package okami.yami.carl_finalproject_tourneybuilder

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_recycler_view.*
import kotlinx.android.synthetic.main.fragment_screen_bio.view.*

class RecyclerViewFragment: Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_recycler_view, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val adapter = RecyclerViewAdaptor { participant ->

            val bundle = Bundle()
            bundle.putString(getString(R.string.Participant_Name), participant.name)
            bundle.putString(getString(R.string.Tournament_Name), participant.tournamentName)
            bundle.putInt(getString(R.string.Previous_Wins), participant.previousWins)
            bundle.putString(getString(R.string.Biography), participant.biography)

            findNavController().navigate(R.id.action_player8Fragment_to_bioFragment, bundle)
        }

        recyclerView.apply {
            this.adapter = adapter

            context?.let {

                this.layoutManager = LinearLayoutManager(it)
            }
        }
//        fetchDataFromServer(adapter)
    }
    }

//}


