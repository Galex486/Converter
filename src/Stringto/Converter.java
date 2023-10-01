package Stringto;


public class Converter {

    String Bool1 = "tRue";
    String Byte2 = "120";
    String Short3 = "32000";
    String Int4 = "147895632";
    String Long5 = "987654321987654321";
    String Double6 = "4444.5d";
    String Float7 = "2354.56f";


    public void converter() {


        boolean Bool_ = Boolean.parseBoolean(Bool1);
        System.out.println("Boolean= " + Bool_);

        byte Byte_ = Byte.parseByte(Byte2);
        System.out.println("Byte= " + Byte_);

        short Short_ = Short.parseShort(Short3);
        System.out.println("Short= " + Short_);

        int Int_ = Integer.parseInt(Int4);
        System.out.println("Int= " + Int_);

        long Long_ = Long.parseLong(Long5);
        System.out.println("Long= " + Long_);

        double Double_ = Double.parseDouble(Double6);
        System.out.println("Double= " + Double_);

        float Float_ = Float.parseFloat(Float7);
        System.out.println("Float= " + Float_);
    }
}



