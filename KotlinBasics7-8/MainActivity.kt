package dev.skyfish.kotlinoverview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //////////////////////////////////////////////////////////////////

        var user1 = "tim05"
        var password1 = "password123"
        var subActive1 = true

        var user2 = "bob23"
        var password2 = "pass321"
        var subActive2 = false

        var user3 = "redsoxfan21"
        var password3 = "resox1"
        var subActive3 = true

        val text1 = userToString(user1, password1, subActive1)
        val text2 = userToString(user2, password2, subActive2)
        val text3 = userToString(user3, password3, subActive3)

        var usernames = mutableListOf(user1,user2,user3)
        var passwords = mutableListOf(password1,password2,password3)
        var subs = mutableListOf(subActive1,subActive2,subActive3)

        var newUser = UserAccount(
            password = "pass123",
            username = "tim05",
            isLocked = true
        )

        newUser.printlog()

        var anotherUser = UserAccount(
            username = "redsoxfav25",
            password = "pas\$word"
        )

        anotherUser.printlog()

        var trialUser = TrialUserAccount(
            username = "trialUser",
            password = "pass123",
        )
        trialUser.printlog()



    }

    fun userToString(username: String, password: String, active: Boolean): String {
        return "username = $username\npassword = $password\nsubActive = $active"
    }

    fun printlog(message: String){
        Log.i("DEMO",message)
    }

}