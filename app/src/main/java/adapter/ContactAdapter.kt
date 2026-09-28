package swetha.example.mod3casestudy2.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import swetha.example.mod3casestudy2.R
import swetha.example.mod3casestudy2.model.Contact

class ContactAdapter(
    private var contacts: List<Contact> = emptyList(),
    private val onItemClick: (Contact) -> Unit
) : RecyclerView.Adapter<ContactAdapter.ContactViewHolder>() {

    class ContactViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val tvName: TextView = itemView.findViewById(R.id.tvContactName)
        private val tvPhone: TextView = itemView.findViewById(R.id.tvContactPhone)
        private val tvCompany: TextView = itemView.findViewById(R.id.tvContactCompany)
        private val cardView: CardView = itemView.findViewById(R.id.cardView)

        fun bind(contact: Contact, onItemClick: (Contact) -> Unit) {
            tvName.text = contact.name
            tvPhone.text = contact.phone
            tvCompany.text = contact.company

            cardView.setOnClickListener {
                onItemClick(contact)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_contact, parent, false)
        return ContactViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        holder.bind(contacts[position], onItemClick)
    }

    override fun getItemCount(): Int = contacts.size

    fun updateContacts(newContacts: List<Contact>) {
        contacts = newContacts
        notifyDataSetChanged()
    }
}
