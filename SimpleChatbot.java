import java.util.Scanner;

public class SimpleChatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("AI Chatbot: Hello! Ask me anything. Type 'exit' to quit.");

        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("AI Chatbot: Goodbye!");
                break;
            }

            String response = getSimpleResponse(userInput);
            System.out.println("AI Chatbot: " + response);
        }
        scanner.close();
    }

    private static String getSimpleResponse(String userMessage) {
        if (userMessage.toLowerCase().contains("hello")) {
            return "Hello! How can I help you today?";
        } else if (userMessage.toLowerCase().contains("how are you")) {
            return "I'm just a bot, but I'm doing great!";
        } else {
            return "I'm not sure, but I'm here to chat!";
        }
    }
}

