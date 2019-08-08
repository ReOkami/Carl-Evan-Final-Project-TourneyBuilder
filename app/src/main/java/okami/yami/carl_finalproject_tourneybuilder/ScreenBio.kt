package okami.yami.carl_finalproject_tourneybuilder




import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_screen_bio.*




class ScreenBio : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(
            R.layout.fragment_screen_bio, container, false
        )

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        arguments?.let {

            playerName.text = it.getString(getString(R.string.Participant_Name))
            tournamentName.text = "${it.getString(getString(R.string.Tournament_Name))}"
            playerPreviousWins.text = "${it.getInt(getString(R.string.Previous_Wins))}"
            playerBiography.text = "${it.getString(getString(R.string.Biography))}"
        }
    }
}


