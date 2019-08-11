package data;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

public class ContactUsDataGenerator {
    public static int STRING_LENGTH = 10;
    public static int PHONE_NUMBER_LENGTH = 10;

    public String generateFirstName() {
        int nameLength = RandomUtils.nextInt(3, 5);
        return "Test" + RandomStringUtils.randomAlphanumeric(nameLength);
    }

    public String generateLastName() {
        int nameLength = RandomUtils.nextInt(3, 5);
        return "Last" + RandomStringUtils.randomAlphanumeric(nameLength);
    }

    public String generateCompanyName() {
        int nameLength = RandomUtils.nextInt(3, 5);
        return "Comp" + RandomStringUtils.randomAlphanumeric(nameLength);
    }

    public String generateEmail(){
        String emailAddress = generateFirstName() + generateLastName() + "@" + generateCompanyName() + ".com";
        return emailAddress;
    }

    public String generatePhoneNumber(){
        long phoneNumber = (long) Math.floor(Math.random() * 9000000000L) + 1000000000L;
        return Long.toString(phoneNumber);
    }

    public String generateWebsite(){
        String website="https://"+generateFirstName()+generateCompanyName()+".com";
        return website;
    }

    public int selectOptionIndex(){
        int option=RandomUtils.nextInt(1,2);
        return option;
    }
}
