package com.aman.mvvmexample.customBinders;

import android.databinding.BindingAdapter;
import android.databinding.InverseBindingAdapter;
import android.databinding.InverseBindingListener;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;

import com.aman.mvvmexample.R;

/**
 * Created by amandeep on 18/1/18.
 */

public class EditTextBinder {
    @BindingAdapter(value = "realValueAttrChanged")
    public static void setListener(EditText editText, final InverseBindingListener listener) {
        if (listener != null) {
            editText.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                    Log.e("test change before",s.toString()+" received");
                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    Log.e("test change onChnage",s.toString()+" received");
                }

                @Override
                public void afterTextChanged(Editable s) {
                    Log.e("test change after",s.toString()+" received");
                    listener.onChange();
                }
            });
        }
    }

    @BindingAdapter("realValue")
    public static void setRealValue(EditText view, String value) {

        view.setText(value);
    }
@InverseBindingAdapter(attribute  ="realValue")
    public static String getRealValue(EditText view){
        return view.getText().toString().trim();
}

}
