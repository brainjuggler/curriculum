import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		
//      問① 下記の配列はString型しか格納できないように修正してください。
//		   現状は全てのクラスの継承元であるObject型を指定しているので、Integerもintも格納可能になっています。
//	       List<Object> array = new ArrayList<>();
	       List<String> array = new ArrayList<>();
	       
//      問② 前から二つ目の要素を"bar"にしましょう。
	       array.add(0, "aar");
	       array.add(1, "bar");
	       
	       int count = 0;

//	    問③ fooが格納されているインデックスを出力してください。
	       for ( int i=0; i<array.size(); i++) {
	    	   if( array.get(i) == "foo") {
	    		   count = i;
	    	   };
	       }
	       System.out.println( "fooのインデックス:" + count);
	       
//	    問④ キーがString型、バリューがObject型の要素を三つ格納しましょう。
			
//			値をmapに一つずつ格納
			Map<String, Object> map = new HashMap<>();
			map.put("address", "/////");
			map.put("name", "Kosuke");
			map.put("age", 29);
			
//		問⑤上記で格納したキーを繰り返し文で出力しましょう。

			for( Map.Entry<String, Object> entry : map.entrySet()) {
				System.out.println("key:" + entry.getKey());
			}
			
//		問⑥上記で格納したバリューを繰り返し文で出力しましょう。

			for( Map.Entry<String, Object> entry : map.entrySet()) {
				System.out.println("value:" + entry.getValue());
			}
			
//		問⑦ 配列arrayDateに今の年・月・日を入れてください。
	        Calendar cal = Calendar.getInstance();
//		    <以下記述>

	        int[] arrayDate = {1111,11,11};
	        
	        arrayDate[0] = cal.get(Calendar.YEAR);
	        arrayDate[1] = cal.get(Calendar.MONTH)+1;
	        arrayDate[2] = cal.get(Calendar.DATE);
	        
	        
//	    問⑧ 配列arrayDateをList型に変更しましょう。
//		    <以下記述>
	        List<Integer> listDate = new ArrayList<>();
	        for (int i = 0; i < arrayDate.length; i++) {
	        	listDate.add(arrayDate[i]);
	        }
	             
//	    問⑨ 上記で格納した要素を繰り返しで出力しましょう。
//		    <以下記述>
			for ( int i = 0; i < listDate.size(); i++ ) {
				System.out.println( listDate.get(i) );
		}
	}
}