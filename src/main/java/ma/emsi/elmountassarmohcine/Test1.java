package ma.emsi.elmountassarmohcine;

import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.google.genai.GoogleGenAiChatModel;

public class Test1 {
    public static void main(String[] args) {

        String cle = System.getenv("GEMINI_KEY");
        // Création du modèle avec un builder
        ChatModel modele = GoogleGenAiChatModel.builder()
                .apiKey(cle)
                .modelName("gemini-3.5-flash-lite")
                .temperature(0.7)
                .build();
        // Pose une question au modèle
        String reponse =
                modele.chat("Bonjour je suis Mohcine El Mountassar etudiant à l'emsi");
        System.out.println("question : Bonjour je suis Mohcine El Mountassar etudiant à l'emsi");
        // Affiche réponse du modèle (hello)
        System.out.println("reponse :"+reponse);

        reponse = modele.chat("Quel est mon nom ?");
        System.out.println("question :Quel est mon nom ?");
        // Affiche réponse du modèle (hello)
        System.out.println("reponse :"+reponse);
    }

}
