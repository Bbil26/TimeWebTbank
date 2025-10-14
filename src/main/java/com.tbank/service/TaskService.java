package com.tbank.service;

import com.tbank.model.Task;
import jakarta.annotation.PostConstruct;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Data
public class TaskService {

    @PostConstruct
    public List<Task> getTasks() {

        List<Task> tasks = new ArrayList<>();

        tasks.add(
                new Task(
                        "Задание 1",
                        "Пропиши путь до значения product в JSON из примера:",
                        "Если провести полносью путь до значения 'product', то будет: payload.purchases[0].product , " +
                                "однако обычно 'payload' вшит на уровне сервиса в пути к объекту его не указыввают: purchases[0].product",
                        null
                )
        );

        tasks.add(
                new Task(
                        "Задание 2",
                    "Напиши логику проверки условия на freemarker: " +
                            "Если параметр card равен “Black” или “Platinum” и в параметр eligible пришло булево значение true, то нужно вывести предложение “Вам доступен бонус”. Иначе ничего выводить не нужно.\n",
                        """
                                    <#if (card == 'Black' || 'Platinum') && eligible == true>
                                        Вам доступен бонус! 
                                    &lt;/#if&gt;
                                """,
                        null
                )
        );

        tasks.add(
                new Task(
                        "Задание 3",
                        "Сверстать историю",
                        "",
                        new ArrayList<>(List.of(
                                new Task.Slide(
                                    "Как в России справлялись с кризисами",
                                    "В истории нашей страны было много кризисов, но все постепенно удалось преодолеть. Рассказываем про те, что были до революции и в СССР.",
                                        null,
                                    "https://s3.twcstorage.ru/d4984bde-496f7ace-bd04-484a-a4c4-0298563defe9/crisis-1.png"
                                ),
                                new Task.Slide(
                                        "1866—1867",
                                        "В России производили больше тканей, чем нужно, а за рубежом упали цены на хлопок — экспортировать выгодно не получалось. Экономику спасли железные дороги: их строительство помогло развить угольную промышленность и металлургию.",
                                        null,
                                        "https://s3.twcstorage.ru/d4984bde-496f7ace-bd04-484a-a4c4-0298563defe9/crisis-2.png"
                                ),
                                new Task.Slide(
                                        "1873—1875",
                                        "Упали фондовые рынки Европы и США, а в России было перепроизводство товаров — начались банкротства компаний. Промышленность удалось спасти благодаря введению высоких пошлин на импортные товары.",
                                        null,
                                        "https://s3.twcstorage.ru/d4984bde-496f7ace-bd04-484a-a4c4-0298563defe9/crisis-3.png"
                                ),
                                new Task.Slide(
                                        "1900—1903",
                                        "В эти годы произошел мировой кризис, а российская промышленность была менее развитой, чем в других странах. Чтобы преодолеть кризис, государство поддержало крупные компании и банки деньгами и сократило заказы за границей.",
                                        null,
                                        "https://s3.twcstorage.ru/d4984bde-496f7ace-bd04-484a-a4c4-0298563defe9/crisis-4.png"
                                ),
                                new Task.Slide(
                                        "1923—1924",
                                        "Товары стоили дорого, потому что экономика сильно пострадала из-за гражданской войны. Чтобы справиться с кризисом, компании уменьшили издержки производства: сократили персонал и количество посредников. С какими еще кризисами справились в России — в статье Т—Ж. ",
                                        new Task.Link(
                                                "Интересно",
                                                "https://journal.tinkoff.ru/short/arctic-fox/?utm_source=stories&utm_medium=mobile&utm_campaign="
                                        ),
                                        "https://s3.twcstorage.ru/d4984bde-496f7ace-bd04-484a-a4c4-0298563defe9/crisis-5.png"
                                )
                            )
                        )
                )
        );

        tasks.add(
                new Task(
                        "Задание 4",
                        "Подготовь текст для рассылки клиентам Тинькофф Инвестиций об оплате налогов",
                        "<div class='emailBtn'> Отправить email </div>",
                        null
                )
        );

        return tasks;
    }

}
