package co;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ns {
    static String url="http://www.cnblogs.com/zyw-205520/archive/2012/12/20/2826402.html";
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        for (int i=1;i<=45;i++){
        	article(i);
        	
        }
    	
    }

 
    /**
     * ��ȡ��ҳ�г����ӵı��������
     */
    public static void article(int i) {
        Document doc;
        try {
            doc = Jsoup.connect("https://ipr.zbj.com/sort/"+i+"/").get();
            //Elements ListDiv = doc.getElementsByAttributeValue("class","grid");
            Elements ListDiv2 = doc.getElementsByAttributeValue("class","category-top");
            Elements els=doc.select(".category-con > p");
            Elements els2=doc.getElementsByAttributeValue("class","category-des");
            //System.out.println(ListDiv.toString().replace(" <a href=\"https://ipr.zbj.com/sort/\" title=\"�̱����\" target=\"_blank\">�̱����</a>", "").replace("<div class=\"grid\">", "").replace(" <span>&gt;</span>", "").replace("</div>", "").replace("  �㵱ǰ��λ�ã�", "").replace("\n", ""));
            System.out.print(ListDiv2.toString().replace("</div>", "").replace("<div class=\"category-top\"> ", "").replace("  ��ѯ�ܷ�ע������", "").replace(" <div class=\"advanced-search pop-btn\" data-category-name=\"", "^^").replace("\" id=\"advanced-search\">", "").replace(" <h1>", "").replace("</h1> ", "").replace("\n", ""));
            System.out.print(els.toString().replace("<p>", "^^").replace("</p>", "").replace("\n", ""));
            System.out.print(els2.toString().replace("<div class=\"category-des\"> ", "^^").replace(" <p class=\"category-notes\">��ע�͡�</p> ", "").replace("</div>", "").replace("\n", ""));
            System.out.println();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    /**
     * ��ȡָ���������µ�����
     */
    public static void blog() {
        Document doc;
        try {
            doc = Jsoup.connect("http://www.cnblogs.com/zyw-205520/archive/2012/12/20/2826402.html").get();
            Elements ListDiv = doc.getElementsByAttributeValue("class","postBody");
            for (Element element :ListDiv) {
                System.out.println(element.html());
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

}