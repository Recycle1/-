package xiangmu;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Read_file {//���ı�����ȡ������Ϣ
	int sum=0;
	String shuju[][];
	Read_file(File file){
		InputStreamReader in;
		InputStreamReader in1;
		String line;
		String str[];
		int i=0,j=0;
		try {
			in=new InputStreamReader(new FileInputStream(file),"utf-8");
			in1=new InputStreamReader(new FileInputStream(file),"utf-8");
			BufferedReader r=new BufferedReader(in);
            while(r.readLine()!=null) {
					sum++;	
            }
            BufferedReader r1=new BufferedReader(in1);
            String sj[][]=new String[sum][];
            while((line=r1.readLine())!=null) {
            	//���ո�ָ���ַ���
            	str=line.split(" ");
            	sj[i]=new String[str.length];
            	for(j=0;j<str.length;j++) {
			       sj[i][j]=str[j];
		           }
            	
            	i++;
            }
            this.cunchu(sj);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
		    e.printStackTrace();
	    }
	}
	//���õ�������a������Ա����shuju
	void cunchu(String a[][]) {
		shuju=a;
	}
}