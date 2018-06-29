package com.bill.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

/**
 * @author LiuYang
 * @version 1.0
 * @package: com.bill.util
 * @description: 邮件发送工具类
 * @date 2018-06-29 9:53
 */
@Component
@Slf4j
public class MailUtil {
    @Autowired
    private  JavaMailSender sender;

    @Value("${spring.mail.username}")
    private  String from;


    /**
     * 发送邮件
     *
     * @param to 接受人
     * @param subject 主题
     * @param html 发送内容
     * @throws MessagingException 异常
     */
    public  void sendMail(String to, String subject, String html) throws MessagingException {
        MimeMessage mimeMessage = sender.createMimeMessage();
        // 设置utf-8或GBK编码，否则邮件会有乱码
        MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true, "UTF-8");
        messageHelper.setFrom(from);
        messageHelper.setTo(to);
        messageHelper.setSubject(subject);
        messageHelper.setText(html, true);
        sender.send(mimeMessage);
    }

    /**
     * 发送邮件
     *
     * @param to 接受人
     * @param subject 主题
     * @param html 发送内容
     * @param pathname  附件地址
     * @param cid  静态资源id
     * @throws MessagingException 异常
     */
    public  void sendInlineMail(String to, String subject, String html,String pathname,String cid) throws MessagingException {
        MimeMessage mimeMessage = sender.createMimeMessage();
        // 设置utf-8或GBK编码，否则邮件会有乱码
        MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true, "UTF-8");
        messageHelper.setFrom(from);
        messageHelper.setTo(to);
        messageHelper.setSubject(subject);
        messageHelper.setText(html, true);
        FileSystemResource file = new FileSystemResource(new File(pathname));
        messageHelper.addInline(cid,file);
        sender.send(mimeMessage);
    }

    /**
     * 发送邮件
     *
     * @param to 接受人
     * @param subject 主题
     * @param html 发送内容
     * @param pathname  附件地址
     * @param picturename  图片名称
     * @throws MessagingException 异常
     */
    public  void sendAttachmentsMail(String to, String subject, String html,String pathname,String picturename) throws MessagingException {
        MimeMessage mimeMessage = sender.createMimeMessage();
        // 设置utf-8或GBK编码，否则邮件会有乱码
        MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true, "UTF-8");
        messageHelper.setFrom(from);
        messageHelper.setTo(to);
        messageHelper.setSubject(subject);
        messageHelper.setText(html, true);
        FileSystemResource file = new FileSystemResource(new File(pathname));
        messageHelper.addAttachment(picturename,file);
        sender.send(mimeMessage);
    }


}
