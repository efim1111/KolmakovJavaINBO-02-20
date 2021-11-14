package Lab19and20;

public class Generator {
    private char[] ch = new char[12];
    private short reg;

    public Generator() {
        ch[0]='А';
        ch[1]='В';
        ch[2]='Е';
        ch[3]='К';
        ch[4]='М';
        ch[5]='Н';
        ch[6]='О';
        ch[7]='Р';
        ch[8]='С';
        ch[9]='Т';
        ch[10]='У';
        ch[11]='Х';

    }



    public String num(){
        reg = (short) ((short)(Math.random()*198)+1);
        String strReg="";
        byte n = (byte) ((byte)(Math.random()*9));
        if (reg < 10)
        {
            strReg = "0";
        }
        strReg += Short.toString(reg);
        byte i1 = (byte) ((byte)(Math.random()*11));
        byte i2 = (byte) ((byte)(Math.random()*11));
        byte i3 = (byte) ((byte)(Math.random()*11));

        return ch[i1]+Byte.toString(n)+Byte.toString(n)+Byte.toString(n)+ch[i2]+ch[i3]+strReg;
    }
}
