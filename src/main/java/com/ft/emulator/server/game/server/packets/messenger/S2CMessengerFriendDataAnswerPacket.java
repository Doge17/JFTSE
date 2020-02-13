package com.ft.emulator.server.game.server.packets.messenger;

import com.ft.emulator.server.database.model.messenger.FriendList;
import com.ft.emulator.server.game.server.Packet;
import com.ft.emulator.server.game.server.PacketID;

import java.util.List;

public class S2CMessengerFriendDataAnswerPacket extends Packet {

    public S2CMessengerFriendDataAnswerPacket(List<FriendList> friendList) {

	super(PacketID.S2CMessengerFriendDataAnswer);

	this.write((byte) friendList.size());
	friendList.forEach(fl -> {
	    this.write(Math.toIntExact(fl.getCharacterPlayerFriend().getId()));
	    this.write(fl.getCharacterPlayerFriend().getName());
	    this.write((char) 0);
	    this.write(fl.getCharacterPlayerFriend().getCType());
	    this.write(fl.getServerId());
	});
    }
}