package com.example.student.androidguide;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Toast;


public class MainTerminology extends MainActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        setContentView(R.layout.activity_terminology);
        final String[] terms = {getString(R.string.term1), getString(R.string.term2), getString(R.string.term3), getString(R.string.term4), getString(R.string.term5), getString(R.string.term6), getString(R.string.term7), getString(R.string.term8), getString(R.string.term9), getString(R.string.term10), getString(R.string.term11), getString(R.string.term12), getString(R.string.term13), getString(R.string.term14), getString(R.string.term15), getString(R.string.term16), getString(R.string.term17), getString(R.string.term18), getString(R.string.term19), getString(R.string.term20)};
        final String[] answers = {getString(R.string.answer1), getString(R.string.answer2), getString(R.string.answer3), getString(R.string.answer4), getString(R.string.answer5), getString(R.string.answer6), getString(R.string.answer7), getString(R.string.answer8), getString(R.string.answer9), getString(R.string.answer10), getString(R.string.answer11), getString(R.string.answer12), getString(R.string.answer13), getString(R.string.answer14), getString(R.string.answer15), getString(R.string.answer16), getString(R.string.answer17), getString(R.string.answer18), getString(R.string.answer19), getString(R.string.answer20)};
        AutoCompleteTextView auto1 = (AutoCompleteTextView) findViewById(R.id.auto1);
        auto1.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, terms));

        auto1.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String name = String.valueOf(parent.getItemAtPosition(position));
                        for (int i = 0; i < terms.length; i++) {
                            if (terms[i].equals(name)) {
                                position = i;
                                break;
                            }
                        }
                        Toast.makeText(getApplicationContext(), answers[position], Toast.LENGTH_LONG).show();
                    }
                }
        );
    }
}