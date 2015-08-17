package bushmonkey.scanme;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DetailsCapture extends AppCompatActivity implements View.OnClickListener {
    TextView mainTextView;
    Button saveButton;
    Button newItemButton;
    EditText productNameTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_capture);
        mainTextView = (TextView) findViewById(R.id.InfoText);
        saveButton = (Button) findViewById(R.id.UpdateDetailsBtn);
        saveButton.setOnClickListener(this);
        newItemButton = (Button) findViewById(R.id.NewBtn);
        newItemButton.setOnClickListener(this);
        productNameTxt = (EditText) findViewById(R.id.ProductNameText);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_details_capture, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        mainTextView.setText("Item saved.");
    }
}
