package emu.lunarcore.server.packet.send;

import emu.lunarcore.game.player.Player;
import emu.lunarcore.proto.FriendApplyListInfoOuterClass.FriendApplyListInfo;
import emu.lunarcore.proto.SyncApplyFriendScNotifyOuterClass.SyncApplyFriendScNotify;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketSyncApplyFriendScNotify extends BasePacket {

    public PacketSyncApplyFriendScNotify(Player friend) {
        super(CmdId.SyncApplyFriendScNotify);
        
        var data = SyncApplyFriendScNotify.newInstance()
                .setFriendApplyInfo(FriendApplyListInfo.newInstance().setSimpleInfo(friend.toSimpleInfo()));
        
        this.setData(data);
    }
}
