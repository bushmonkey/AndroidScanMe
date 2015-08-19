package bushmonkey.scanme;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class ViewDetails extends AppCompatActivity {
    HashMap<String, List<String>> ShoppingCategoryList;
    List<String> ShoppingList;
    ExpandableListView Exp_list;
    ShoppingAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_details);
        Exp_list = (ExpandableListView) findViewById(R.id.exp_list);
        ShoppingCategoryList = DataProvider.getInfo();
        ShoppingList = new ArrayList<String>(ShoppingCategoryList.keySet());
        adapter = new ShoppingAdapter(this, ShoppingCategoryList, ShoppingList);
        Exp_list.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_view_details, menu);
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
}
