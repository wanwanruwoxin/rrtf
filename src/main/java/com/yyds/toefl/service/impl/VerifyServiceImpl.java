//package com.yyds.toefl.service.impl;
//
//
//import com.yyds.toefl.entity.Verify;
//import com.yyds.toefl.service.VerifyService;
//import com.yyds.toefl.util.VerifyUtil;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Service;
//
//import javax.imageio.ImageIO;
//import java.awt.*;
//import java.awt.image.BufferedImage;
//import java.io.ByteArrayOutputStream;
//import java.io.IOException;
//import java.io.OutputStream;
//import java.util.Random;
//
///**
// * Created by zyc on 2022/8/9
// */
//@Service
//public class VerifyServiceImpl implements VerifyService {
//    private static final Logger logger = LoggerFactory.getLogger(VerifyServiceImpl.class);
//
//    private static final String[] FONT_TYPES = { "\u5b8b\u4f53", "\u65b0\u5b8b\u4f53", "\u9ed1\u4f53", "\u6977\u4f53", "\u96b6\u4e66" };
//
//    private static final int VALICATE_CODE_LENGTH = 4;
//
//    /**
//     * 设置背景颜色及大小，干扰线
//     *
//     * @param graphics
//     * @param width
//     * @param height
//     */
//    private static void fillBackground(Graphics graphics, int width, int height) {
//        // 填充背景
//        graphics.setColor(Color.WHITE);
//        //设置矩形坐标x y 为0
//        graphics.fillRect(0, 0, width, height);
//
//        // 加入干扰线条
//        for (int i = 0; i < 8; i++) {
//            //设置随机颜色算法参数
//            graphics.setColor(VerifyUtil.randomColor(40, 150));
//            Random random = new Random();
//            int x = random.nextInt(width);
//            int y = random.nextInt(height);
//            int x1 = random.nextInt(width);
//            int y1 = random.nextInt(height);
//            graphics.drawLine(x, y, x1, y1);
//        }
//    }
//
//    /**
//     * 生成随机字符
//     *
//     * @param width
//     * @param height
//     * @param os
//     * @return
//     * @throws IOException
//     */
//    @Override
//    public String generate(int width, int height, OutputStream os) throws IOException {
//        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
//        Graphics graphics = image.getGraphics();
//        fillBackground(graphics, width, height);
//        String verifyStr = VerifyUtil.randomString(VALICATE_CODE_LENGTH);
//        createCharacter(graphics, verifyStr);
//        graphics.dispose();
//        //设置JPEG格式
//        ImageIO.write(image, "JPEG", os);
//        return verifyStr;
//
//    }
//
//    @Override
//    public Verify generate(int width, int height) throws IOException {
//        Verify verify = null;
//        try (
//                //将流的初始化放到这里就不需要手动关闭流
//                ByteArrayOutputStream baos = new ByteArrayOutputStream();
//        ) {
//            String code = generate(width, height, baos);
//            verify = new Verify();
//            verify.setCode(code);
//            verify.setImBytes(baos.toByteArray());
//        } catch (IOException e) {
//            logger.error(e.getMessage(), e);
//            verify = null;
//        }
//        return verify;
//    }
//
//    /**
//     * 设置字符颜色大小
//     *
//     * @param graphics
//     * @param verifyStr
//     */
//    private void createCharacter(Graphics graphics, String verifyStr) {
//        char[] charArray = verifyStr.toCharArray();
//        for (int i = 0; i < charArray.length; i++) {
//            //设置RGB颜色算法参数
//            graphics.setColor(new Color(50 + VerifyUtil.nextInt(100),
//                    50 + VerifyUtil.nextInt(100), 50 + VerifyUtil.nextInt(100)));
//            //设置字体大小，类型
//            graphics.setFont(new Font(FONT_TYPES[VerifyUtil.nextInt(FONT_TYPES.length)], Font.BOLD, 26));
//            //设置x y 坐标
//            graphics.drawString(String.valueOf(charArray[i]), 15 * i + 5, 19 + VerifyUtil.nextInt(8));
//        }
//    }
//}
