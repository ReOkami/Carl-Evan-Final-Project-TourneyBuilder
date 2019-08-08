package okami.yami.carl_finalproject_tourneybuilder

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_recycler_view.*
import kotlinx.android.synthetic.main.fragment_screen_bio.view.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RecyclerViewFragment : Fragment() {
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
        fetchDataFromServer(adapter)
    }

    private fun fetchDataFromServer(adapter: RecyclerViewAdaptor) {

        val apiCalls = RetroFitInstance.retrofit
        val request = apiCalls.create(Endpoints::class.java).getParticipantList()

        request.enqueue(object : Callback<DataModel> {

            override fun onFailure(call: Call<DataModel>, t: Throwable) {

                Log.w(javaClass.name, "getParticipantList() failed. Error: ${t.message}")

                constraintLayout?.let {
                    Snackbar.make(it, "Network request failed.", Snackbar.LENGTH_LONG).show()
                }
            }

            override fun onResponse(call: Call<DataModel>, response: Response<DataModel>) {

                when (response.code()) {

                    200 -> {

                        response.body()?.let {

                            adapter.submitList(it.data)
                        }
                    }

                    else -> {
                        constraintLayout?.let {
                            Snackbar.make(it, "Something went wrong. CODE: ${response.code()}", Snackbar.LENGTH_LONG)
                                .show()
                        }
                    }
                }
            }
        })
    }
}

private fun displayTestData(adapter: RecyclerViewAdaptor) {
    val testData = listOf(
        Participant("Test1", 1, "John1", 32, "Tourney1"),
        Participant("Test2", 2, "John2", 32, "Tourney1"),
        Participant("Test3", 3, "John3", 32, "Tourney1"))
    adapter.submitList(testData)
}




