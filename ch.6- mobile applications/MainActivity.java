//ex 6.2a; mainActivity.Java code


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  Button b1;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    b1 = (Button)findViewById(R.id.button);
    b1.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Textview txtView = (TextView) findViewById(R.id.textview);
        txtView.setText("button has been clicked");
        txtView.setTextSize(25);
      }
    });
  }
}
