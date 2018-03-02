package com.example.a21650598.exameninterfacesfaivercanoromero;

import android.content.Intent;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private SwipeRefreshLayout swipeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Intent intent = new Intent(this, SpalshActivity.class);

        startActivity(intent);


        TextView mycontext = (TextView) findViewById(R.id.textTap);
        registerForContextMenu(mycontext);


        swipeLayout = (SwipeRefreshLayout) findViewById(R.id.myswipe);
        swipeLayout.setOnRefreshListener(mOnRefreshListener);


    }


    protected SwipeRefreshLayout.OnRefreshListener mOnRefreshListener = new SwipeRefreshLayout.OnRefreshListener() {
        @Override
        public void onRefresh() {
            Toast toast0 = Toast.makeText(MainActivity.this, "going swipeREFRESH", Toast.LENGTH_LONG);
            toast0.show();
            swipeLayout.setRefreshing(false);
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_context, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();


        if (id == R.id.icono1) {
            return true;
        }
        if (id == R.id.icono2) {
            Toast toast = Toast.makeText(this,"aCCEDER", Toast.LENGTH_LONG );
            toast.show();
        }

        return super.onOptionsItemSelected(item);
    }



    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);


    }


    @Override
    public boolean onContextItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        switch (item.getItemId()) {
            case R.id.item:
                Toast toast = Toast.makeText(this,"going perfil", Toast.LENGTH_LONG );
                toast.show();
                return true;
            case R.id.action_settings:
                Toast toast2 = Toast.makeText(this,"going ALumnos", Toast.LENGTH_LONG );
                toast2.show();
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }



}