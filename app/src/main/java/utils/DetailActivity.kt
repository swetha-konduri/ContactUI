package swetha.example.mod3casestudy2

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import swetha.example.mod3casestudy2.model.Contact

class DetailActivity : AppCompatActivity() {

    private lateinit var tvName: TextView
    private lateinit var tvPhone: TextView
    private lateinit var tvEmail: TextView
    private lateinit var tvAddress: TextView
    private lateinit var tvCompany: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // Setup toolbar
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        initializeViews()
        loadContactDetails()
    }

    private fun initializeViews() {
        tvName = findViewById(R.id.tvDetailName)
        tvPhone = findViewById(R.id.tvDetailPhone)
        tvEmail = findViewById(R.id.tvDetailEmail)
        tvAddress = findViewById(R.id.tvDetailAddress)
        tvCompany = findViewById(R.id.tvDetailCompany)
    }

    private fun loadContactDetails() {
        val contact = if (android.os.Build.VERSION.SDK_INT >= 33) {
            intent.getParcelableExtra("contact", Contact::class.java)
        } else {
            @Suppress("DEPRECATION")
            intent.getParcelableExtra("contact")
        }

        if (contact != null) {
            tvName.text = contact.name
            tvPhone.text = "📞 ${contact.phone}"
            tvEmail.text = "✉️ ${contact.email}"
            tvAddress.text = "📍 ${contact.address}"
            tvCompany.text = "🏢 ${contact.company}"
            supportActionBar?.title = contact.name
        } else {
            Toast.makeText(this, "Error loading contact details", Toast.LENGTH_SHORT).show()
            finish()
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}