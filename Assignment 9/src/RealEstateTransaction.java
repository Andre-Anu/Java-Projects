/**
 * Assignment 9
 * André Martins
 * 03/08/2023
 * 16:00
*/

import java.util.Random;

class RealEstateTransaction {
    private String streetNumber;
    private String streetName;
    private String city;
    private String purchasePrice;

    // Default constructor
    public RealEstateTransaction() {
    }

    // Constructor with arguments
    public RealEstateTransaction(String streetNumber, String streetName, String city, String purchasePrice) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.city = city;
        this.purchasePrice = purchasePrice;
    }

    // Setters and Getters
    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(String purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    // Method to generate the state as one string with lowercase and uppercase letters
    public String generateStateOneString() {
        String fullString = streetNumber + streetName + city + purchasePrice;
        int halfString = fullString.length() / 2;
        return fullString.substring(0, halfString).toLowerCase() + fullString.substring(halfString).toUpperCase();
    }

    // Method to generate a random substring with lowercase and uppercase letters
    public String generateRandomStateOneString() {
        String fullString = streetNumber + streetName + city + purchasePrice;
        Random random = new Random();

        int start1 = random.nextInt(fullString.length());
        int length1 = random.nextInt(fullString.length() - start1);
        String subString1 = fullString.substring(start1, start1 + length1);

        int start2 = random.nextInt(fullString.length());
        int length2 = random.nextInt(fullString.length() - start2);
        String subString2 = fullString.substring(start2, start2 + length2);

        return subString1.toLowerCase() + subString2.toUpperCase();
    }

    // Method to encrypt the state with a key character
    public String encryptState(int inKeyCharacterIndex, int firstCharacterIndex) {
        String fullString = streetNumber + streetName + city + purchasePrice;
        if (inKeyCharacterIndex >= fullString.length() || firstCharacterIndex >= fullString.length()
                || inKeyCharacterIndex >= firstCharacterIndex) {
            return "1"; // Error code to represent an error
        }

        StringBuilder encryptedString = new StringBuilder(fullString);
        char keyCharacter = fullString.charAt(inKeyCharacterIndex);
        for (int i = firstCharacterIndex; i < fullString.length(); i += 3) {
            encryptedString.setCharAt(i, keyCharacter);
        }
        return encryptedString.toString();
    }
}