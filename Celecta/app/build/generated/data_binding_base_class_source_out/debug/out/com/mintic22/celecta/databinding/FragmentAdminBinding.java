// Generated by view binder compiler. Do not edit!
package com.mintic22.celecta.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.mintic22.celecta.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentAdminBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final EditText fad1;

  @NonNull
  public final ImageView imageView11;

  @NonNull
  public final Button navigateEdition;

  @NonNull
  public final TextView tvAddressAdmin;

  @NonNull
  public final TextView tvMailAdmin;

  @NonNull
  public final TextView tvNameAdmin;

  @NonNull
  public final TextView tvPhoneAdmin;

  private FragmentAdminBinding(@NonNull FrameLayout rootView, @NonNull EditText fad1,
      @NonNull ImageView imageView11, @NonNull Button navigateEdition,
      @NonNull TextView tvAddressAdmin, @NonNull TextView tvMailAdmin,
      @NonNull TextView tvNameAdmin, @NonNull TextView tvPhoneAdmin) {
    this.rootView = rootView;
    this.fad1 = fad1;
    this.imageView11 = imageView11;
    this.navigateEdition = navigateEdition;
    this.tvAddressAdmin = tvAddressAdmin;
    this.tvMailAdmin = tvMailAdmin;
    this.tvNameAdmin = tvNameAdmin;
    this.tvPhoneAdmin = tvPhoneAdmin;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAdminBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAdminBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_admin, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAdminBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.fad1;
      EditText fad1 = ViewBindings.findChildViewById(rootView, id);
      if (fad1 == null) {
        break missingId;
      }

      id = R.id.imageView11;
      ImageView imageView11 = ViewBindings.findChildViewById(rootView, id);
      if (imageView11 == null) {
        break missingId;
      }

      id = R.id.navigate_edition;
      Button navigateEdition = ViewBindings.findChildViewById(rootView, id);
      if (navigateEdition == null) {
        break missingId;
      }

      id = R.id.tvAddressAdmin;
      TextView tvAddressAdmin = ViewBindings.findChildViewById(rootView, id);
      if (tvAddressAdmin == null) {
        break missingId;
      }

      id = R.id.tvMailAdmin;
      TextView tvMailAdmin = ViewBindings.findChildViewById(rootView, id);
      if (tvMailAdmin == null) {
        break missingId;
      }

      id = R.id.tvNameAdmin;
      TextView tvNameAdmin = ViewBindings.findChildViewById(rootView, id);
      if (tvNameAdmin == null) {
        break missingId;
      }

      id = R.id.tvPhoneAdmin;
      TextView tvPhoneAdmin = ViewBindings.findChildViewById(rootView, id);
      if (tvPhoneAdmin == null) {
        break missingId;
      }

      return new FragmentAdminBinding((FrameLayout) rootView, fad1, imageView11, navigateEdition,
          tvAddressAdmin, tvMailAdmin, tvNameAdmin, tvPhoneAdmin);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
