//package ma.emsi.elmountassarmohcine;
//
//import dev.langchain4j.model.google.genai.GoogleGenAiEmbeddingModel;
//import java.time.Duration;
//import dev.langchain4j.data.embedding.Embedding;
//import dev.langchain4j.model.embedding.EmbeddingModel;
//import dev.langchain4j.model.embedding.onnx.bgesmallenv15.BgeSmallEnV15EmbeddingModel;
//import dev.langchain4j.store.embedding.CosineSimilarity;
//
//public class Test4Embeddings {
//
//    public static void main(String[] args) {
//
//        EmbeddingModel modele =
//                new BgeSmallEnV15EmbeddingModel();
//
//        String phrase1 = "agent 007 a une license pour tuer";
//        String phrase2 = "l'agent james bond a une license ";
//
//        String phrase3 = "Q est un genie de gadget !";
//        String phrase4 = "la voiture de Mme M est en panne";
//
//        String phrase5 ="l'agence mi6 contient beaucoup d'agent britanique";
//        String phrase6 = "007 est un agent britanique";
//
//        String phrase7 = "James Bond réussit sa mission.";
//        String phrase8 = "James Bond échoue dans sa mission.";
//
//        String phrase9 = "Q construit un nouveau gadget.";
//        String phrase10 = "Q fabrique un nouvel appareil.";
//
//        String phrase11 = "James Bond conduit une Aston Martin.";
//        String phrase12 = "Les fleurs poussent au printemps.";
//
//        Embedding embedding1 =
//                modele.embed(phrase1).content();
//
//        Embedding embedding2 =
//                modele.embed(phrase2).content();
//
//        Embedding embedding3 =
//                modele.embed(phrase3).content();
//
//        Embedding embedding4 =
//                modele.embed(phrase4).content();
//
//        Embedding embedding5 =
//                modele.embed(phrase5).content();
//
//        Embedding embedding6 =
//                modele.embed(phrase6).content();
//
//        Embedding embedding7 = modele.embed(phrase7).content();
//        Embedding embedding8 = modele.embed(phrase8).content();
//        Embedding embedding9 = modele.embed(phrase9).content();
//        Embedding embedding10 = modele.embed(phrase10).content();
//        Embedding embedding11 = modele.embed(phrase11).content();
//        Embedding embedding12 = modele.embed(phrase12).content();
//
//        double similarite =
//                CosineSimilarity.between(embedding1, embedding2);
//        double similarite2 =
//                CosineSimilarity.between(embedding3, embedding4);
//        double similarite3 =
//                CosineSimilarity.between(embedding5, embedding6);
//        double similarite4 =
//                CosineSimilarity.between(embedding7, embedding8);
//        double similarite5 =
//                CosineSimilarity.between(embedding9, embedding10);
//        double similarite6 =
//                CosineSimilarity.between(embedding11, embedding12);
//
//        System.out.println("Phrase 1 : " + phrase1);
//        System.out.println("Phrase 2 : " + phrase2);
//        System.out.println("Similarité : " + similarite);
//
//        System.out.println("Phrase 3 : " + phrase3);
//        System.out.println("Phrase 4 : " + phrase4);
//        System.out.println("Similarité : " + similarite2);
//
//        System.out.println("Phrase 5 : " + phrase5);
//        System.out.println("Phrase 6 : " + phrase6);
//        System.out.println("Similarité : " + similarite3);
//
//        System.out.println("Phrase 7 : " + phrase7);
//        System.out.println("Phrase 8 : " + phrase8);
//        System.out.println("Similarité : " + similarite4);
//
//        System.out.println("Phrase 9 : " + phrase9);
//        System.out.println("Phrase 10 : " + phrase10);
//        System.out.println("Similarité : " + similarite5);
//
//        System.out.println("Phrase 11 : " + phrase11);
//        System.out.println("Phrase 12 : " + phrase12);
//        System.out.println("Similarité : " + similarite6);
//
//        EmbeddingModel modeleGoogle = GoogleGenAiEmbeddingModel.builder()
//                .apiKey(System.getenv("GEMINI_KEY"))
//                .modelName("gemini-embedding-001")
//                .taskType(GoogleGenAiEmbeddingModel.TaskTypeEnum.SEMANTIC_SIMILARITY)
//                .timeout(Duration.ofSeconds(60))
//                .build();
//
//        String[][] couples = {
//                {phrase1, phrase2},
//                {phrase3, phrase4},
//                {phrase5, phrase6},
//                {phrase7, phrase8},
//                {phrase9, phrase10},
//                {phrase11, phrase12}
//        };
//
//        System.out.println("\nRésultats du modèle Google---");
//
//        for (String[] couple : couples) {
//            Embedding premier = modeleGoogle.embed(couple[0]).content();
//            Embedding deuxieme = modeleGoogle.embed(couple[1]).content();
//
//            double score = CosineSimilarity.between(premier, deuxieme);
//
//            System.out.println("Phrase 1 : " + couple[0]);
//            System.out.println("Phrase 2 : " + couple[1]);
//            System.out.println("Similarité Google : " + score);
//            System.out.println();
//        }
//    }
//}