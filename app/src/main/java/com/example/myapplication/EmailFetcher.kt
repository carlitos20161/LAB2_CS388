package com.example.myapplication

class EmailFetcher {
    companion object {
        private val senders = listOf(
            "Dahlia Cline", "Kevin Miranda", "Kaya Austin", "Laila Calderon",
            "Marquise Rhodes", "Emerson Fox", "Lennon Blake", "Harper Hayes",
            "Quinn Rivera", "Milan Flores", "Rowan Perry", "Skyler Banks",
            "Jordan Ellis", "Avery Hart", "Parker Cruz"
        )
        private const val title = "Welcome to Kotlin!"
        private const val summary = "Welcome to the Android Kotlin Course! We're excited to have you join us."

        fun getEmails(): MutableList<Email> {
            val emails = mutableListOf<Email>()
            for (i in 0 until 10) {
                val email = Email(senders[i], title, summary)
                emails.add(email)
            }
            return emails
        }

        fun getNext5Emails(): MutableList<Email> {
            val newEmails = mutableListOf<Email>()
            for (i in 10 until 15) {
                val email = Email(senders[i], title, summary)
                newEmails.add(email)
            }
            return newEmails
        }
    }
}