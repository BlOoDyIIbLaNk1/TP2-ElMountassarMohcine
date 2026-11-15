package ma.emsi.elmountassarmohcine;

import dev.langchain4j.data.message.UserMessage;
import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.chat.response.ChatResponse;
import dev.langchain4j.model.google.genai.GoogleGenAiChatModel;
import dev.langchain4j.model.output.TokenUsage;

public class Test2Couts {
    public static void main(String[] args) {

        String cle = System.getenv("GEMINI_KEY");
        // Création du modèle avec un builder
        ChatModel modele = GoogleGenAiChatModel.builder()
                .apiKey(cle)
                .modelName("gemini-3.5-flash-lite")
                .temperature(0.7)
                .build();
        // Pose une question au modèle
        UserMessage message = UserMessage.from("Bonjour je suis Mohcine El Mountassar etudiant à l'emsi");
        ChatResponse reponse = modele.chat(message);
// Récupérer le texte de la réponse
        String texteReponse = reponse.aiMessage().text();
// Obtenir le nombre de tokens utilisés
        TokenUsage usage = reponse.tokenUsage();
        int totalTokens = usage.totalTokenCount();
        int inputTokens = usage.inputTokenCount();
        int outputTokens = usage.outputTokenCount();
        System.out.println("question : Bonjour je suis Mohcine El Mountassar etudiant à l'emsi");
        // Affiche réponse du modèle (hello)
        System.out.println("reponse :"+texteReponse);
        System.out.println("total Token :"+totalTokens);
        System.out.println("input Token :"+inputTokens);
        System.out.println("output Token :"+outputTokens);

    }

}
