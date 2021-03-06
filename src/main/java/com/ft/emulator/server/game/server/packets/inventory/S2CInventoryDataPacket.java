package com.ft.emulator.server.game.server.packets.inventory;

import com.ft.emulator.server.database.model.pocket.CharacterPlayerPocket;
import com.ft.emulator.server.game.item.EItemCategory;
import com.ft.emulator.server.game.item.EItemUseType;
import com.ft.emulator.server.game.server.Packet;
import com.ft.emulator.server.game.server.PacketID;

import java.nio.file.attribute.FileTime;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class S2CInventoryDataPacket extends Packet {

    public S2CInventoryDataPacket(List<CharacterPlayerPocket> inventoryItemList) {

        super(PacketID.S2CInventoryData);

	this.write((char)inventoryItemList.size());
	for(CharacterPlayerPocket inventoryItem : inventoryItemList) {

	    this.write(Math.toIntExact(inventoryItem.getId()));
	    this.write(EItemCategory.valueOf(inventoryItem.getCategory()).getValue());
	    this.write(Math.toIntExact(inventoryItem.getItemIndex()));
	    this.write(inventoryItem.getUseType().equals("N/A") ? (byte)0 : EItemUseType.valueOf(inventoryItem.getUseType().toUpperCase()).getValue());
	    this.write(inventoryItem.getItemCount());

	    long timeLeft = (inventoryItem.getCreated().getTime() * 10000) - (new Date().getTime() * 10000);
	    if(timeLeft <= 0) {
	        timeLeft = 0;
	    }
	    this.write(timeLeft);
	    // ??
	    this.write((byte)0);
	    this.write((byte)0);
	    this.write((byte)0);
	    this.write((byte)0);
	    this.write((byte)0);
	    this.write((byte)0);
	}
    }
}
