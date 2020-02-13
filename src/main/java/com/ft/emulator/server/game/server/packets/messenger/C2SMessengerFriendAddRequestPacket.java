package com.ft.emulator.server.game.server.packets.messenger;

import com.ft.emulator.server.game.server.Packet;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class C2SMessengerFriendAddRequestPacket extends Packet {

    private String nickname;

    public C2SMessengerFriendAddRequestPacket(Packet packet) {

        super(packet);

        this.nickname = this.readUnicodeString().trim().replaceAll("[^a-zA-Z0-9\\s+]", "");
    }
}