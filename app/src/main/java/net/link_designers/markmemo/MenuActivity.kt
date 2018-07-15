package net.link_designers.markmemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.view.Menu
import android.view.View

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.setContentView(R.layout.activity_menu)

        // FloatingActionButton
        // 型推論，FloatingActionButton? 型になる
        var fab = this.findViewById<FloatingActionButton?>(R.id.fab_add)

        fab?.setOnClickListener {
            var intent = Intent(this, MarkActivity::class.java) // thisはapplicationのが良い?
            this.startActivity(intent)
        }
        //nullでなければ実行，そうでなければnullを返す


/*    FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
    fab.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, SubActivity.class);
            startActivity(intent);
        }
    });*/
    }


}
