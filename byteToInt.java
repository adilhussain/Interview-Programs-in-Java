
public class byteToInt {
	public static void main(String[] args) {
		int x = 128;
		short a = 128;
		System.out.println(a);
		byte[] b = getBytes(a);
		System.out.println(b[0]);
		System.out.println(b[1]);
		int p =  (b[0] &0xff | b[1]&0xff << 8) ;
		System.out.println("fdsf " + p);
	}

	private static byte[] getBytes(short x) {
		int num = x;
		byte arr[] = new byte[2];
		arr[0] = (byte)num;
		System.out.println("arr[0] " + arr[0]);
		//for(int i=0;i<8;i++)
			num = num >> 8;
		arr[1] = (byte)num;
		System.out.println("arr[1] " + arr[1]);
		return arr;
	}
}
