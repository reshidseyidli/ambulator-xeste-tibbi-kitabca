import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        TibbiKitabca tibbiKitabca = new TibbiKitabca();
        
        Entity entity = new Entity();

        entity.setBvmElilVesieqNo("bvmElilVesieqNo");
        entity.setQarabagElilVesieqNo("qarabagElilVesieqNo");
        entity.setBvmIstirakVesiqNo("bvmIstirakVesiqNo");
        entity.setQarabagIstirakVesiqNo("qarabagIstirakVesiqNo");
        entity.setTibbiKitabcaNo("tibbiKitabcaNo");
        entity.setFullName("fullName");
        entity.setBirthDay("birthDay");
        entity.setAddress("address");
        entity.setWorkEducationAddress("workEducationAddress");
        entity.setPhoneNumber("phoneNumber");
        entity.setMobileNumber("mobileNumber");
        entity.setThisLocation("thisLocation");
        entity.setOtherLocation("otherLocation");

        tibbiKitabca.createMexaricPdf(entity);
    }
}
