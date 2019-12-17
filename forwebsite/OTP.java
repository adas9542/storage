public class OTP {

    String out;

    void generator(int leng){
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        String output = "";

        for(int i = 0; i < leng; i++){
            int range = (Integer.MAX_VALUE);
            output = output + str.charAt((int)(Math.random()*range) % str.length());
        }
        this.out = output;
    }

    public static void main(String[] args){
        OTP o = new OTP();
        o.generator(6);
        System.out.println(o.out);
    }
}
