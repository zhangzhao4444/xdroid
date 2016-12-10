package com.nata.xdroid.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.OperationApplicationException;
import android.os.RemoteException;

import com.nata.xdroid.utils.ContactUtil;

/**
 * Created by Calvin on 2016/12/10.
 */

public class ContactMockReceiver extends BroadcastReceiver {
    public static final String ACTION_MOCK_CONTACTS = "com.nata.xdroid.action.MOCK_CONTACTS";

    public static Intent getUserDataIntent() {
        Intent intent = new Intent(ACTION_MOCK_CONTACTS);
        return intent;
    }

    @Override
    public void onReceive(final Context context, Intent intent) {
        if (ACTION_MOCK_CONTACTS.equals(intent.getAction())) {
            ContactUtil.mockContacts(context);
        }
    }
}