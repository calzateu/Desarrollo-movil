// Generated by view binder compiler. Do not edit!
package com.mintic22.celecta.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.mintic22.celecta.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentComentsBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final EditText fad1;

  @NonNull
  public final RelativeLayout rlBaseComments;

  @NonNull
  public final RecyclerView rvComments;

  private FragmentComentsBinding(@NonNull FrameLayout rootView, @NonNull EditText fad1,
      @NonNull RelativeLayout rlBaseComments, @NonNull RecyclerView rvComments) {
    this.rootView = rootView;
    this.fad1 = fad1;
    this.rlBaseComments = rlBaseComments;
    this.rvComments = rvComments;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentComentsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentComentsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_coments, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentComentsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.fad1;
      EditText fad1 = ViewBindings.findChildViewById(rootView, id);
      if (fad1 == null) {
        break missingId;
      }

      id = R.id.rlBaseComments;
      RelativeLayout rlBaseComments = ViewBindings.findChildViewById(rootView, id);
      if (rlBaseComments == null) {
        break missingId;
      }

      id = R.id.rvComments;
      RecyclerView rvComments = ViewBindings.findChildViewById(rootView, id);
      if (rvComments == null) {
        break missingId;
      }

      return new FragmentComentsBinding((FrameLayout) rootView, fad1, rlBaseComments, rvComments);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
