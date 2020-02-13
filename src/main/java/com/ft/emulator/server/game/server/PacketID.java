package com.ft.emulator.server.game.server;

public final class PacketID {

    public final static char S2CLoginWelcomePacket = 0xFF9A;
    public final static char C2SLoginRequest = 0x0FA1;
    public final static char S2CLoginAnswerPacket = 0x0FA2;
    public final static char C2SHeartbeat = 0x0FA3;
    public final static char C2SDisconnectRequest = 0x0FA7;
    public final static char S2CDisconnectAnswer = 0xFA8;
    public final static char C2SCharacterNameCheck = 0x1019;
    public final static char S2CCharacterNameCheckAnswer = 0x101A;
    public final static char C2SCharacterCreate = 0x101B;
    public final static char S2CCharacterCreateAnswer = 0x101C;
    public final static char C2SLoginFirstCharacterRequest = 0x101E;
    public final static char S2CLoginFirstCharacterAnswer = 0x101F;
    public final static char C2SLoginAliveClient = 0x100F;
    public final static char S2CCharacterList = 0x1005;
    public final static char S2CGameServerList = 0x1010;

    public final static char C2SGameReceiveData = 0x105E;
    public final static char S2CGameAnswerData = 0x105F;
    public final static char C2SGameLoginData = 0x1069;
    public final static char S2CGameLoginData = 0x106A;

    public final static char C2SRoomCreate = 0x1389;
    public final static char S2CRoomCreateAnswer = 0x138A;
    public final static char C2SRoomJoin = 0x138B;
    public final static char S2CRoomJoinAnswer = 0x138C;

    public final static char S2CRoomListAnswer = 0x138E;
    public final static char S2CRoomPlayerInformation = 0x1394;
    public final static char C2SRoomListReq = 0x13EC;

    public final static char C2SLobbyUserListRequest = 0x1707;
    public final static char S2CLobbyUserListAnswer = 0x1708;

    public final static char S2CRoomInformation = 0x177A;

    public final static char C2SRoomReadyChange = 0x1775;
    public final static char C2SRoomStartGame = 0x177B;
    public final static char C2SRoomPositionChange = 0x1785;
    public final static char S2CRoomPositionChangeAnswer = 0x1786;
    public final static char C2SRoomMapChange = 0x1788;
    public final static char S2CRoomMapChangeAnswer = 0x1789;

    public final static char S2CUnknownRoomJoin = 0x189D;

    public final static char C2SInventorySellReq = 0x1D06;
    public final static char S2CInventorySellAnswer = 0x1D07;
    public final static char C2SInventorySellItemCheckReq = 0x1D08;
    public final static char S2CInventorySellItemCheckAnswer = 0x1D09;
    public final static char S2CInventorySellItemAnswer = 0x1D0A;

    public final static char S2CCharacterLevelExpData = 0x22B8;
    public final static char S2CCharacterInfoPlayStatsData = 0x1B6F;

    public final static char C2SInventoryWearClothRequest = 0x1B63;
    public final static char S2CInventoryWearClothAnswer = 0x1B64;
    public final static char C2SInventoryWearQuickRequest = 0x1BD8;
    public final static char S2CInventoryWearQuickAnswer = 0x1BD9;
    public final static char S2CInventoryData = 0x1B69;
    public final static char C2SInventoryItemTimeExpiredRequest = 0x1BBC;
    public final static char S2CInventoryItemRemoveAnswer = 0x1B74;

    public final static char C2SHomeItemsClearReq = 0x2552;
    public final static char C2SHomeItemsPlaceReq = 0x2550;
    public final static char C2SHomeItemsLoadReq = 0x254E;
    public final static char S2CHomeItemsLoadAnswer = 0x254F;
    public final static char S2CHomeData = 0x1519;

    public final static char C2SShopMoneyReq = 0x1B60;
    public final static char S2CShopMoneyAnswer = 0x1B61;
    public final static char C2SShopBuyReq = 0x1B67;
    public final static char S2CShopBuyAnswer = 0x1B68;
    public final static char C2SShopRequestDataPrepare = 0x2389;
    public final static char S2CShopAnswerDataPrepare = 0x238A;
    public final static char C2SShopRequestData = 0x2387;
    public final static char S2CShopAnswerData = 0x2388;

    public final static char C2SChatLobbyReq = 0x1705;
    public final static char S2CChatLobbyAnswer = 0x1706;
    public final static char C2SChatRoomReq = 0x1777;
    public final static char S2CChatRoomAnswer = 0x1778;
    public final static char C2SWhisperReq = 0x1702;
    public final static char S2CWhisperAnswer = 0x1703;

    public final static char C2SCharacterDelete = 0x1B6B;
    public final static char S2CCharacterDelete = 0x1B6C;

    public final static char C2SCharacterStatusPointChange = 0x1B6D;
    public final static char S2CCharacterStatusPointChange = 0x1B6E;

    public final static char C2SChallengeProgressReq = 0x2206;
    public final static char S2CChallengeProgressAck = 0x2207;
    public final static char C2SChallengeBeginReq = 0x2208;
    public final static char C2SChallengeHp = 0x2209;
    public final static char C2SChallengePoint = 0x220A;
    public final static char C2SChallengeSet = 0x220B;
    public final static char S2CChallengeEnd = 0x220C;
    public final static char C2STutorialBegin = 0x220D;
    public final static char C2STutorialEnd = 0x220E;
    public final static char C2STutorialProgressReq = 0x220F;
    public final static char S2CTutorialProgressAck = 0x2210;
    public final static char C2SChallengeDamage = 0x2211;
    public final static char S2CTutorialEnd = 0x2212;

    public final static char C2SEmblemListRequest = 0x226A;
    public final static char S2CEmblemListAnswer = 0x226B;

    public final static char C2SLobbyJoin = 0x237A;
    public final static char C2SLobbyLeave = 0x2379;

    public final static char C2SMessengerFriendDataRequest = 0x1F49;
    public final static char S2CMessengerFriendDataAnswer = 0x1F4A;
    public final static char C2SMessengerFriendAddRequest = 0x1F41;
    public final static char S2CMessengerFriendAddAnswer = 0x1F42;
    public final static char C2SMessengerFriendDeleteRequest = 0x1F55;
    public final static char C2SMessengerMessageSendRequest = 0x1F5F;
    public final static char S2CMessengerMessageSendAnswer = 0x1F60;
    public final static char C2SMessengerMessageDeleteRequest = 0x1F62;
    public final static char C2SMessengerMessageDataRequest = 0x1F63;
    public final static char S2CMessengerMessageDataAnswer = 0x1F64;
    public final static char C2SMessengerMessageReadRequest = 0x1F67;
    public final static char S2CMessengerMessageReadAnswer = 0x1F68;
    public final static char C2SMessengerParcelDataRequest = 0x219C;
    public final static char S2CMessengerParcelDataAnswer = 0x219D;
    public final static char C2SMessengerProposalDataRequest = 0x2526;
    public final static char S2CMessengerProposalDataAnswer = 0x2527;
}