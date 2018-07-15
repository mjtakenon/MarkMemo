package net.link_designers.markmemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.view.View
import android.widget.*
import net.link_designers.markmemo.Const.*
import net.link_designers.markmemo.Const.Companion.CANDIDATE_BUTTON_ID_BEGIN

class MarkActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.setContentView(R.layout.activity_mark)

        var answersListView = this.findViewById<ListView>(R.id.answers_list)

        var answersList = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1)

        var item = Item()

        answersListView.setAdapter(answersList)


        var candidateListLayout = this.findViewById<LinearLayout>(R.id.candidate_list)

        for(itr in 1..Const.CANDIDATE_NUM)
        {
            var button = Button(this)
            button.text = itr.toString()
            button.id = itr + CANDIDATE_BUTTON_ID_BEGIN
            button.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT,1.0f)
            button.setOnClickListener {
                var answersListView = this.findViewById<ListView>(R.id.answers_list)
                answersList.remove(item.getString())
            }
            candidateListLayout.addView(button)
        }
       // var candidateList =

        // ↑Button
        var prevItemButton = this.findViewById<Button>(R.id.button_prev_item)
        prevItemButton.setOnClickListener {
//            answersList.remove(item.getString())
//            item.prevItem()
//            answersList.add(item.getString())
        }

        // ↓Button
        var nextItemButton = this.findViewById<Button>(R.id.button_next_item)
        nextItemButton.setOnClickListener {
//            answersList.remove(item.getString())
//            item.nextItem()
//            answersList.add(item.getString())
        }

        // →Button
        var upIndentButton = this.findViewById<Button>(R.id.button_up_indent)
        upIndentButton.setOnClickListener {
            answersList.remove(item.getString())
            item.upIndent()
            answersList.add(item.getString())
        }

        // ←Button
        var downIndentButton = this.findViewById<Button>(R.id.button_down_indent)
        downIndentButton.setOnClickListener {
            answersList.remove(item.getString())
            item.downIndent()
            answersList.add(item.getString())
        }
    }
}
