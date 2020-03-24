package ru.skillbranch.devintensive

import org.junit.Test

import org.junit.Assert.*
import ru.skillbranch.devintensive.extentsions.dformat
import ru.skillbranch.devintensive.models.BaseMessage
import ru.skillbranch.devintensive.models.Chat
import ru.skillbranch.devintensive.models.User
import java.util.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
    @Test
    fun test_this_shit() {
        val user = User("1")
        val user2 = User("2","I fuck","Dou")
        user.printThisDud()
        user2.printThisDud()
    }
    @Test
    fun test_factory(){
        val user =User.Factory.makeUser("Danya Nosyk")
        val user1 =User.Factory.makeUser("Danya")
        val user2 =User.Factory.makeUser("Danya Nosyk3")
        val user3=user.copy(lastVisit = Date())//not
        println(user3.lastVisit?.dformat())
        print(user)

        user.printThisDud()
        user1.printThisDud()

        val date = Date()
        println(date.dformat("HH:mm"))
    }
    @Test
    fun test_abstract_factory(){
        val user = User.makeUser("Danya Nosyk")
    }

}
