package okami.yami.carl_finalproject_tourneybuilder

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdaptor(private val onClick: (Participant) -> Unit) : ListAdapter<Participant, RecyclerViewAdaptor.ParticipantViewHolder>(ParticipantDiffCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParticipantViewHolder {

        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_participant, parent, false)

        return ParticipantViewHolder(view, onClick)
    }

    override fun onBindViewHolder(holder: ParticipantViewHolder, position: Int) {

        holder.participant = getItem(position)
    }

    class ParticipantViewHolder(itemView: View, private val onClick: (Participant) -> Unit) : RecyclerView.ViewHolder(itemView) {

        var participant: Participant? = null

            set(value) {

                value?.let {

                    field = it

                    itemView.findViewById<TextView>(R.id.textViewVHParticipantName).text = it.name

                    itemView.setOnClickListener { _ -> onClick(it) }

                }
            }
    }

    class ParticipantDiffCallback : DiffUtil.ItemCallback<Participant>() {
        override fun areItemsTheSame(oldItem: Participant, newItem: Participant): Boolean {

            return oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: Participant, newItem: Participant): Boolean {

            return oldItem == newItem
        }
    }

}

