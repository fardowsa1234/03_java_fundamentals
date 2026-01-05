package sess11_additional_java_features;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * Java program to demonstrate Base64 encoding and decoding in Java.
 * This class showcases:
 *  - Standard Base64 encoding/decoding
 *  - URL-safe Base64 encoding/decoding
 *  - MIME Base64 encoding/decoding
 */
public class Base64Demo {

    /* ================= Standard Base64 ================= */

    private static String encodeBase64(String input) {
        return Base64.getEncoder()
                     .encodeToString(input.getBytes(StandardCharsets.UTF_8));
    }

    private static String decodeBase64(String encoded) {
        byte[] decodedBytes = Base64.getDecoder().decode(encoded);
        return new String(decodedBytes, StandardCharsets.UTF_8);
    }

    /* ================= URL-safe Base64 ================= */

    private static String encodeBase64URL(String input) {
        return Base64.getUrlEncoder()
                     .withoutPadding()
                     .encodeToString(input.getBytes(StandardCharsets.UTF_8));
    }

    private static String decodeBase64URL(String encoded) {
        byte[] decodedBytes = Base64.getUrlDecoder().decode(encoded);
        return new String(decodedBytes, StandardCharsets.UTF_8);
    }

    
    /* ================= MIME Base64 ================= */

    /**
     * MIME Base64 encoder inserts line breaks every 76 characters
     * and is commonly used in email (RFC 2045).
     */
    private static String encodeBase64MIME(String input) {
        return Base64.getMimeEncoder()
                     .encodeToString(input.getBytes(StandardCharsets.UTF_8));
    }

    private static String decodeBase64MIME(String encoded) {
        byte[] decodedBytes = Base64.getMimeDecoder().decode(encoded);
        return new String(decodedBytes, StandardCharsets.UTF_8);
    }

    /* ================= Main ================= */

    public static void main(String[] args) {
        try {
            String original = "java string to be encoed with special chars: + / =";

            // Standard Base64
            String encoded = encodeBase64(original);
            String decoded = decodeBase64(encoded);

            System.out.println("=== Standard Base64 ===");
            System.out.println("Original: " + original);
            System.out.println("Encoded : " + encoded);
            System.out.println("Decoded : " + decoded);

            // URL-safe Base64
            String encodedURL = encodeBase64URL(original);
            String decodedURL = decodeBase64URL(encodedURL);

            System.out.println("\n=== URL-safe Base64 ===");
            System.out.println("Original: " + original);
            System.out.println("Encoded : " + encodedURL);
            System.out.println("Decoded : " + decodedURL);

            // MIME Base64
            String encodedMIME = encodeBase64MIME(original);
            String decodedMIME = decodeBase64MIME(encodedMIME);

            System.out.println("\n=== MIME Base64 ===");
            System.out.println("Original: " + original);
            System.out.println("Encoded : " + encodedMIME);
            System.out.println("Decoded : " + decodedMIME);

        } catch (IllegalArgumentException e) {
            System.err.println("Error during Base64 encoding/decoding:");
            System.err.println(e.getMessage());
        }
    }
}
