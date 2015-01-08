package coms.example.p0181_dynamiclayout3;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;


public class MainActivity extends Activity implements OnSeekBarChangeListener {
	Button btn1;
	Button btn2;
	SeekBar sbWeight;
	
	LinearLayout.LayoutParams lParam1;
	LinearLayout.LayoutParams lParam2;
		
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        sbWeight=(SeekBar) findViewById(R.id.sbWeight);
        
        lParam1 = (LinearLayout.LayoutParams) btn1.getLayoutParams();
        lParam2 = (LinearLayout.LayoutParams) btn2.getLayoutParams();
        
        sbWeight.setOnSeekBarChangeListener(this);
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


	@Override
	public void onProgressChanged(SeekBar seekBar, int progress,
			boolean fromUser) {
		
		int valueLeft = progress;
		int valueRight = seekBar.getMax() - valueLeft;
		
		lParam1.weight = valueLeft;
		lParam2.weight = valueRight;
		
		btn1.setText(String.valueOf(valueLeft));
		btn2.setText(String.valueOf(valueRight));
		
		
		
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onStartTrackingTouch(SeekBar seekBar) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onStopTrackingTouch(SeekBar seekBar) {
		// TODO Auto-generated method stub
		
	}
}
