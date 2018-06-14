package top.kiswich.craneproject.decode;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

public class RangeShipDecoder extends ByteToMessageDecoder {
    @Override
    public Object decode(ChannelHandlerContext ctx, ByteBuf in) throws Exception {
        return null;
    }
}
