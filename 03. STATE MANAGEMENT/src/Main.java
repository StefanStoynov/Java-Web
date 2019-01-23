import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        CustomHttpRequest request = new CustomHttpRequest();

        String[] requestTokens = reader.readLine().split("\\s+");
        request.setRequest(requestTokens[0]);
        request.setPath(requestTokens[1]);

        String line;

        while (true) {
            if ("".equals(line = reader.readLine())) {
                break;
            }
            String[]tokens  = line.split(":\\s+");
            switch (tokens[0]){
                case"Date":
                    request.setDate(tokens[1]);
                    break;
                case"Host":
                    request.setHost(tokens[1]);
                    break;
                case"Content-Type":
                    request.setContentType(tokens[1]);
                    break;
                case"Cookie":
                    String[]cookieTokens = tokens[1].split(";\\s+|\\s+");
                    List<Cookie>cookies = new ArrayList<>();
                    for (String cookieToken : cookieTokens) {
                        String[]cookieParams = cookieToken.split("=");
                        Cookie cookie = new Cookie(cookieParams[0],cookieParams[1]);
                        cookies.add(cookie);
                    }
                    request.setCookie(cookies);
                    break;
            }

        }

        if (!(line = reader.readLine()).equals("")){
            String[]bodyTokens = line.split("&");
            List<Body> bodyList = new ArrayList<>();
            for (String bodyToken : bodyTokens) {
                String[]bodyParams = bodyToken.split("=");
                Body body = new Body(bodyParams[0], bodyParams[1]);
                bodyList.add(body);
            }
            request.setBody(bodyList);
        }

        request.getCookie().forEach(cookie -> {
            System.out.println(cookie.toString());
        });
    }
}
