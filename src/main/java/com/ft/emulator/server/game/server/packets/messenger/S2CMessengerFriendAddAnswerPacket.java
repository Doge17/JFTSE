package com.ft.emulator.server.game.server.packets.messenger;

import com.ft.emulator.server.game.server.Packet;
import com.ft.emulator.server.game.server.PacketID;

public class S2CMessengerFriendAddAnswerPacket extends Packet {

    public final static char MESSENGER_FRIEND_ADD_REQUEST_SENT = 0;
    public final static char MESSENGER_FRIEND_ADD_USER_DOES_NOT_EXIST = (char)-1;
    public final static char MESSENGER_FRIEND_ADD_SERVER_IS_BUSY = (char)-3;
    public final static char MESSENGER_FRIEND_ADD_REQUEST_ALREADY_SENT = (char)-4;
    public final static char MESSENGER_FRIEND_ADD_ALREADY_FRIEND = (char)-5;
    public final static char MESSENGER_FRIEND_ADD_CANNOT_REQUEST_SELF = (char)-6;
    public final static char MESSENGER_FRIEND_YOU_CANT_DELETE_COUPLE_BEFORE_BREAK = (char)-9;
    public final static char MESSENGER_FRIEND_ADD_REQUEST_FAILED = (char)-2;

    public S2CMessengerFriendAddAnswerPacket(char result) {

        super(PacketID.S2CMessengerFriendAddAnswer);

        this.write(result);
    }
}
