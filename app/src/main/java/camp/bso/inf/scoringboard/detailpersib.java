package camp.bso.inf.scoringboard;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class detailpersib extends AppCompatActivity {

        Button laman;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailpersib);

        laman = (Button) findViewById(R.id.lamanpersib);
        laman.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                String urllink = "http://www.persib.co.id/beranda.aspx";
                browserIntent.setData(Uri.parse(urllink));
                startActivity(browserIntent);
            }
        });
    }
}
