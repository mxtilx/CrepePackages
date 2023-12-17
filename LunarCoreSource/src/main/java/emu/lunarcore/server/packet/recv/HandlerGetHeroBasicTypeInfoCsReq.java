package emu.lunarcore.server.packet.recv;

import emu.lunarcore.server.game.GameSession;
import emu.lunarcore.server.packet.CmdId;
import emu.lunarcore.server.packet.Opcodes;
import emu.lunarcore.server.packet.PacketHandler;
import emu.lunarcore.server.packet.send.PacketGetHeroBasicTypeInfoScRsp;

@Opcodes(CmdId.GetHeroBasicTypeInfoCsReq)
public class HandlerGetHeroBasicTypeInfoCsReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] data) throws Exception {
        session.send(new PacketGetHeroBasicTypeInfoScRsp(session.getPlayer()));
    }

}
