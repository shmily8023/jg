package co;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CopyOfns {
    static String url="http://www.cnblogs.com/zyw-205520/archive/2012/12/20/2826402.html";
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        	article(101);
        	
    	
    }

 
    /**
     * ��ȡ��ҳ�г����ӵı��������
     */
    public static void article(int i) {
        Document doc;
        try {
            doc = Jsoup.connect("https://ipr.zbj.com/sort/1-0101/").get();
            //Elements ListDiv = doc.getElementsByAttributeValue("class","grid");
            //Elements ListDiv2 = doc.getElementsByAttributeValue("class","group-right");
            Elements els=doc.select(".group-des");
            //Elements els2=doc.getElementsByAttributeValue("class","category-des");
            //System.out.println(ListDiv.toString().replace(" <a href=\"https://ipr.zbj.com/sort/\" title=\"�̱����\" target=\"_blank\">�̱����</a>", "").replace("<div class=\"grid\">", "").replace(" <span>&gt;</span>", "").replace("</div>", "").replace("  �㵱ǰ��λ�ã�", "").replace("\n", ""));
            System.out.print(els.toString());
            //System.out.print(els.toString().replace("<p>", "^^").replace("</p>", "").replace("\n", ""));
            //System.out.print(els2.toString().replace("<div class=\"category-des\"> ", "^^").replace(" <p class=\"category-notes\">��ע�͡�</p> ", "").replace("</div>", "").replace("\n", ""));
            System.out.println();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }


}