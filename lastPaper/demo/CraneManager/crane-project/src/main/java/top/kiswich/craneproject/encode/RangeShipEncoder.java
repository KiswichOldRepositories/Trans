package top.kiswich.craneproject.encode;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

public class RangeShipEncoder extends MessageToByteEncoder {
    @Override
    public void encode(ChannelHandlerContext ctx, Object msg, ByteBuf out) throws Exception {

    }
}
