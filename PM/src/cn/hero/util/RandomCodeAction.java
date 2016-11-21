package cn.hero.util;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

public class RandomCodeAction extends ActionSupport implements ServletRequestAware,ServletResponseAware{
    
	private HttpServletRequest request;
	private HttpServletResponse response;
	
	private static final long serialVersionUID = 9215857664193523109L;
	//����ͼƬ��Ⱥͳ���
	private int width = 60;
	private int height = 20;
	private char[] codeSequence = {'A','B','C','D','E','F','G','H','I',
								   'J','K','L','M','N','O','P','Q','R',
								   'S','T','U','V','W','X','Y','Z','0',
								   '1','2','3','4','5','6','7','8','9'};
	
	public String execute()throws Exception{
		
		 BufferedImage buffImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_BGR);
		 Graphics2D g = buffImg.createGraphics();
		 //����һ������������
		 Random random = new Random();
		 g.setColor(Color.WHITE);
		 g.fillRect(0, 0, width, height);
		 //�������壬�����СӦ�ø��ͼƬ�ĸ߶�����
		 Font font = new Font("����",	Font.BOLD, 20);
		 //��������
		 g.setFont(font);
		 //���߿�
		 g.setColor(Color.BLACK);
		 g.drawRect(0, 0, width-1, height-1);
		 //��������ʮ�������ߣ�ʹͼ���е���֤�벻�ױ������̽�⵽
		 g.setColor(Color.WHITE);
		 for(int i = 0;i < 40;i++){
			 int x = random.nextInt(width);
			 int y = random.nextInt(height);
			 int x1 = random.nextInt(12);
			 int y1 = random.nextInt(12);
			 g.drawLine(x, y, x+x1, y+y1);
		 }
		 //randomCode���ڱ������������֤�룬�Ա��û���¼
		 StringBuffer randomCode = new StringBuffer();
		 int red = 0,green = 0,blue = 0;
		 //������4λ���ֵ���֤��
		 for(int i = 0;i < 4;i++){
			 //�õ����������֤������
			 String strRand  = String.valueOf(codeSequence[random.nextInt(codeSequence.length)]);
			 //����������ɫ������������ɫֵ
			 red = random.nextInt(50);
			 green = random.nextInt(50);
			 blue = random.nextInt(50);
			 //�����������ɫ����֤�������ͼ����
			 g.setColor(new Color(red,green,blue));
			 g.drawString(strRand, 13*i+6, 16);
			 //��������ĸ���������һ��
			 randomCode.append(strRand);
		 }
		 //����λ���ֵ���֤�뱣����session��
		 HttpSession session = request.getSession();
		 session.setAttribute("randomCode", randomCode.toString());
		 System.out.println("��֤�룺"+randomCode.toString());
		 //��ֹͼ�񻺴�
		 response.setHeader("Pragma","no-cache");
		 response.setHeader("cache-Control", "no-cache");
		 response.setDateHeader("Expires", 0);
		 
		 response.setContentType("image/jpeg");
		 //��ͼƬ�����servlet�������
		 ServletOutputStream sos = response.getOutputStream();
		 ImageIO.write(buffImg, "jpeg", sos);
		 sos.close();
		 return null;
	}
	
	public void setServletResponse(HttpServletResponse response) {
		// TODO Auto-generated method stub
		this.response = response;
	}

	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		this.request =request;
	}

}
