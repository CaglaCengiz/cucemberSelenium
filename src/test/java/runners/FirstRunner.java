package runners;
/*
// Sadece @smoke tagine sahip olan senaryoları çalıştıran runner
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/01_Tags.feature"}, // şirkete çoklu testler oldugundan className ile değil de
        // src/test/resources/features klasör name uzantısını veririz
        glue = {"stepdefinitions"},
        tags = "@smoke or @regression",
        /**
         * and/ or kullanımlar
         * "@fast" = @fast ile etiketlenen senaryolar
         * "@wip and not @slow" =  @wip ile etiketlenen senaryolar,@slow etkilenmeyen senaryolar
         * "@smoke and @fast" = Her ikisi ile etiketlenen senaryolar @smoke ve @fast
         * "@gui or @database" = @gui ya da @database ile etiketlenen senaryolar
        */
   /*     dryRun = false
                // dryRun = true => Testleri browser olmadan çalışırken eksik herhangi bir JAVA kodu olup olmadığını KONTROL ET!!.
                // dryRun = false => Testlerin browser çalışırken eksik herhangi bir JAVA kodu olup olmadığını KONTROL ETME !!
                /**
                 * true olarak run edildiğinde ve pass olarak testlerimiz işaretlendiğinde aslında testlerimiz pass olmuyor
                 * senaryolarımızın düzgün hazırladığının sonucunu vermiş olur .Test yapmaya hazır bir hale gelmiş anlamına
                 * gelir.
                 * True'da brakılmamalı.Step'ler çalışmaz false oldugu halde step'lerimiz çalışır.Asıl test false durumunda gerçekleşir.
                 * Mümkünse kullanmayın, Kullanıcağımız zaman Sadece step'leri compaile edicegimizde true kullanabiliriz
                 */






import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
     features = {"src/test/resources/features/firstFeature.feature"},

        glue = "stepdefinitions"

)

public class FirstRunner {
}
