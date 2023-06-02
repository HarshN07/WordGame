package com.example.wordgame_1;

import android.os.Bundle;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import android.app.ActivityOptions;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;
import org.w3c.dom.Text;
import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.example.wordgame_1.databinding.ActivityMainBinding;
import android.view.Menu;
import android.view.MenuItem;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText word,clue;
    private TextView bestScore;
    private int highScore,new_highScore;
    private static final String FILE_NAME= "highscore.txt";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (highScore>new_highScore) {
            bestScore.setText("Best Score : " + highScore);
        }
        word = findViewById(R.id.editWord);
        clue = findViewById(R.id.editClue);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(word.getText().toString().length()>0&&clue.getText().toString().length()>0){
                    openPage2();
                }
                else{
                    Toast.makeText(MainActivity.this,"Enter Word and Clue",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
    public void openPage2(){
        Bundle bundle=new Bundle();
        bundle.putString("str1",word.toString());
        bundle.putString("str2",clue.toString());

        Intent intent=new Intent(MainActivity.this,MainActivity2.class);
        Bundle b=ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
        intent.putExtra("str1",word.getText().toString());
        intent.putExtra("str2",clue.getText().toString());
        startActivity(intent,b);
    }
    public void save(View v) {

        String string;
        string = bestScore.getText().toString();
        FileOutputStream fileOutputStream = null;

        try {
            fileOutputStream = openFileOutput(FILE_NAME, MODE_PRIVATE);
            fileOutputStream.write(string.getBytes());

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
