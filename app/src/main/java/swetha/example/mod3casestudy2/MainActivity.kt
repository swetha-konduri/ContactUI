package swetha.example.mod3casestudy2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import swetha.example.mod3casestudy2.adapter.ContactAdapter
import swetha.example.mod3casestudy2.model.Contact
import swetha.example.mod3casestudy2.utils.ContactDataGenerator

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var contactAdapter: ContactAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Setup toolbar
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.title = "Contacts"

        recyclerView = findViewById(R.id.recyclerView)
        setupRecyclerView()
        loadContacts()
    }

    private fun setupRecyclerView() {
        contactAdapter = ContactAdapter { contact ->
            navigateToDetail(contact)
        }
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = contactAdapter
    }

    private fun loadContacts() {
        val contacts = ContactDataGenerator.generateContacts()
        contactAdapter.updateContacts(contacts)
    }

    private fun navigateToDetail(contact: Contact) {
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra("contact", contact)
        startActivity(intent)
    }
}