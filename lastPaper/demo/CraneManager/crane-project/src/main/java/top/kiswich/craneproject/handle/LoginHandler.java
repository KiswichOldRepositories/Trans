package top.kiswich.craneproject.handle;

import io.netty.buffer.ChannelBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class LoginHandler extends ChannelInboundHandlerAdapter {


    @Override
    public void inboundBufferUpdated(ChannelHandlerContext ctx) throws Exception {

    }

    @Override
    public ChannelBuf newInboundBuffer(ChannelHandlerContext ctx) throws Exception {
        return null;
    }

    @Override
    public void freeInboundBuffer(ChannelHandlerContext ctx, ChannelBuf buf) throws Exception {

    }
}
