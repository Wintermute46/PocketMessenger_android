package com.gb.pocketmessenger.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.gb.pocketmessenger.R;
import com.gb.pocketmessenger.models.Dialog;
import com.stfalcon.chatkit.commons.ImageLoader;
import com.stfalcon.chatkit.dialogs.DialogsList;
import com.stfalcon.chatkit.dialogs.DialogsListAdapter;

import java.util.ArrayList;
import java.util.List;

public class ChatList extends Fragment {
    private List<Dialog> dialogs = new ArrayList<>();
    private DialogsList chats;

    public static ChatList newInstance () {
        return new ChatList();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chat_list, container, false);
        chats = view.findViewById(R.id.chatList);

        DialogsListAdapter chatListAdapter = new DialogsListAdapter<>(new ImageLoader() {
            @Override
            public void loadImage(ImageView imageView, String url) {
                //TODO: image loading method
            }
        });
        chatListAdapter.setItems(dialogs);
        chats.setAdapter(chatListAdapter);


        return view;
    }


}
