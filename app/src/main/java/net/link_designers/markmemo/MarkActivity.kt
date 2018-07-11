package net.link_designers.markmemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.TextView

class MarkActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.setContentView(R.layout.activity_mark)

        var answersListView = this.findViewById<ListView>(R.id.answersList)

        var answersList = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1)

//        var text : TextView? = null
//
//        var listNum = 1
//
//        text?.setText(listNum)

        var item : Item = Item()

        answersList.add(item.getString())

        answersListView.setAdapter(answersList)

        var prevItemButton = this.findViewById<Button>(R.id.buttonPrev)

        prevItemButton.setOnClickListener {
            answersList.remove(item.getString())
            item.prevItem()
            answersList.add(item.getString())
        }

        var nextItemButton = this.findViewById<Button>(R.id.buttonNext)

        nextItemButton.setOnClickListener {
            answersList.remove(item.getString())
            item.nextItem()
            answersList.add(item.getString())
        }

        var upItemButton = this.findViewById<Button>(R.id.buttonUp)

        upItemButton.setOnClickListener {
            answersList.remove(item.getString())
            item.upIndent()
            answersList.add(item.getString())
        }

        var downItemButton = this.findViewById<Button>(R.id.buttonDown)

        downItemButton.setOnClickListener {
            answersList.remove(item.getString())
            item.downIndent()
            answersList.add(item.getString())
        }
    }
}
