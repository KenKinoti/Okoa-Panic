package ke.co.wizart.okoapanic;

import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void call(View view){
        Intent contactPickerIntent = new Intent(Intent.ACTION_DIAL);
        contactPickerIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        char [] theNumber = new char[0];
        contactPickerIntent.setData(Uri.parse("tel:"+theNumber));

        startActivity(contactPickerIntent);

        Toast.makeText(MainActivity.this, "Contacting your Emergency Numbers", Toast.LENGTH_SHORT).show();

    }

    public void text(View view){
        Intent sendIntent = new Intent(Intent.ACTION_VIEW);
        sendIntent.setData(Uri.parse("sms:"));
        char[] x = new char[0];
        sendIntent.putExtra("sms_body", x);
        startActivity(sendIntent);

        Toast.makeText(MainActivity.this, "Contacting", Toast.LENGTH_SHORT).show();

//        Intent contactPickerIntent = new Intent(Intent.ACTION_PICK,
//                ContactsContract.Contacts.CONTENT_URI);
//        startActivityForResult(contactPickerIntent, CONTACT_PICKER_RESULT);
    }
}
