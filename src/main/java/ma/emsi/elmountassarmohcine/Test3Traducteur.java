package ma.emsi.elmountassarmohcine;

import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.google.genai.GoogleGenAiChatModel;
import dev.langchain4j.model.input.Prompt;
import dev.langchain4j.model.input.PromptTemplate;

import java.util.Map;

public class Test3Traducteur {

    public static void main(String[] args) {

        String cle = System.getenv("GEMINI_KEY");
        // Création du modèle avec un builder
        ChatModel modele = GoogleGenAiChatModel.builder()
                .apiKey(cle)
                .modelName("gemini-3.5-flash-lite")
                .temperature(0.7)
                .build();

        PromptTemplate template = PromptTemplate.from("""
traduit en {{langue}} ce que l'utilisateur tape :
{{texte}}
Question : {{texte}}""");
        Prompt prompt = template.apply(Map.of(
                "langue","espagnol",
                "texte", "Je suis étudiant à l'EMSI."
        ));
        System.out.println("je suis étudiant à l'EMSI");
        String reponse = modele.chat(prompt.text());
        System.out.println("reponse est :"+reponse);

    }

}
