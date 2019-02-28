public class Codec {
    String s ="abcdefghijklmnopqrstuvwxzABCDFGHIJKLMNOPQRSTUVWXYZ0123456789";
    HashMap<Integer, String> encodeMap;
    HashMap<String, String> decodeMap;

    public Codec() {
        encodeMap = new HashMap<Integer, String>();
        decodeMap = new HashMap<String, String>();
    }
    
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        int key = encodeMap.size() -1;
        encodeMap.put(key , longUrl);
        
        StringBuilder url_key = new StringBuilder("");
        while ( key > 0) {
            int x = key % 64;
            key= key / 64;
            url_key.insert(0, s.charAt(x));
        }
        
        String shortURL = "http://tinyurl.com/" + url_key.toString();
        decodeMap.put(shortURL, longUrl);
        
        return shortURL;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        
        return decodeMap.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
