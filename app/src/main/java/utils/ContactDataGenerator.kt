package swetha.example.mod3casestudy2.utils

import swetha.example.mod3casestudy2.model.Contact

object ContactDataGenerator {
    fun generateContacts(): List<Contact> {
        return listOf(
            Contact(
                1,
                "John Smith",
                "+1 555-0123",
                "john.smith@email.com",
                "123 Main St, New York, NY 10001",
                "Tech Solutions Inc."
            ),
            Contact(
                2,
                "Sarah Johnson",
                "+1 555-0124",
                "sarah.j@email.com",
                "456 Oak Ave, Los Angeles, CA 90001",
                "Creative Design Studio"
            ),
            Contact(
                3,
                "Michael Brown",
                "+1 555-0125",
                "michael.b@email.com",
                "789 Pine Rd, Chicago, IL 60601",
                "Global Marketing Co."
            ),
            Contact(
                4,
                "Emily Davis",
                "+1 555-0126",
                "emily.d@email.com",
                "321 Elm St, Houston, TX 77001",
                "Healthcare Plus"
            ),
            Contact(
                5,
                "David Wilson",
                "+1 555-0127",
                "david.w@email.com",
                "654 Cedar Ln, Phoenix, AZ 85001",
                "Financial Services LLC"
            ),
            Contact(
                6,
                "Lisa Anderson",
                "+1 555-0128",
                "lisa.a@email.com",
                "987 Birch Dr, Philadelphia, PA 19101",
                "Education First"
            ),
            Contact(
                7,
                "James Taylor",
                "+1 555-0129",
                "james.t@email.com",
                "147 Maple Ave, San Antonio, TX 78201",
                "Construction Pro"
            ),
            Contact(
                8,
                "Maria Garcia",
                "+1 555-0130",
                "maria.g@email.com",
                "258 Spruce St, San Diego, CA 92101",
                "Legal Associates"
            )
        )
    }
}