package day7_1;

public class Sample1 {
	int a;
	
	void varTest() {
		this.a++;
	}
//	int varTest(int a) {
//        a++;
//        return a;
//    }

//	int sum(int a,int b) {
//		return a+b;
//	}
//	void sayNick(String nick) {
//		if("fool".equals(nick)) {
//			return;
//		}
//		System.out.println("나의 별명은 "+ nick+"입니다.");
//	}
	

	public static void main(String[] args) {
		Sample1 sample = new Sample1();
		sample.a = 1;
		sample.varTest();
		System.out.println(sample.a);
	}
}
//		 int a = 1;
//	        Sample1 sample = new Sample1();
//	        a= sample.varTest(a);
//	        System.out.println(a);
//	}
//}
		// TODO Auto-generated method stub
//		Sample1 sample1 = new Sample1();
//		        sample1.sayNick("angel");
//		        sample1.sayNick("fool");
//		}
//	}

//		int a= 3;
//		int b = 4;
//		
//		Sample1 sample1 = new Sample1();
//		int c = sample1.sum(a, b);
//		
//		System.out.println(c);
	