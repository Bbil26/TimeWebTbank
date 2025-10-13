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
                                    "20%",
                                        null,
                                    "https://4.downloader.disk.yandex.ru/preview/e8f029b25953300a53ee24119e6fff928dcd75bb09a5990c7e0f92b74a391312/inf/-Jr7et4jldfdOK7bmiHaTNyHD6q_WjLRvmuXWIdbUIJbPpiljFdUi0UvKM1XGlD7XB6UVq995pnrlLpFiSZpfw%3D%3D?uid=239140172&filename=crisis-1.png&disposition=inline&hash=&limit=0&content_type=image%2Fpng&owner_uid=239140172&tknv=v3&size=1891x885"
                                ),
                                new Task.Slide(
                                        "1866—1867",
                                        "В России производили больше тканей, чем нужно, а за рубежом упали цены на хлопок — экспортировать выгодно не получалось. Экономику спасли железные дороги: их строительство помогло развить угольную промышленность и металлургию.",
                                        "70%",
                                        null,
                                        "https://3.downloader.disk.yandex.ru/preview/83b84a707c9baec346f36b1b7d3b72ddb775cd4ad7560db7b73d76622a81468d/inf/X3cc7aOUOOGPoXYAYGpIFZNwk5NuuUNB1dlsNsELF-m8nSzqHx1mk-hJj2mOWKxqftr21vBS-kweHwo-zFdlSg%3D%3D?uid=239140172&filename=crisis-2.png&disposition=inline&hash=&limit=0&content_type=image%2Fpng&owner_uid=239140172&tknv=v3&size=1891x885"
                                ),
                                new Task.Slide(
                                        "1873—1875",
                                        "Упали фондовые рынки Европы и США, а в России было перепроизводство товаров — начались банкротства компаний. Промышленность удалось спасти благодаря введению высоких пошлин на импортные товары.",
                                        "70%",
                                        null,
                                        "https://2.downloader.disk.yandex.ru/preview/d65c12ca1ab1d317a11d798ab631706f0ad1267a635958bc1a36f70c56eee087/inf/YclkTDHmwV-u5Pf1QmRWlpNwk5NuuUNB1dlsNsELF-kwsSe1DVN4mkrdG3CfxtoKESoMOhuNCG13S_yiQHvMVA%3D%3D?uid=239140172&filename=crisis-3.png&disposition=inline&hash=&limit=0&content_type=image%2Fpng&owner_uid=239140172&tknv=v3&size=1891x885"
                                ),
                                new Task.Slide(
                                        "1900—1903",
                                        "В эти годы произошел мировой кризис, а российская промышленность была менее развитой, чем в других странах. Чтобы преодолеть кризис, государство поддержало крупные компании и банки деньгами и сократило заказы за границей.",
                                        "70%",
                                        null,
                                        "https://2.downloader.disk.yandex.ru/preview/00f1ecf345c6cc9e9cb96fbf7f399e2599eadcbf6ed4c78da734a567756ed054/inf/8pcfzzsn0SLT9H6csvXy9ZNwk5NuuUNB1dlsNsELF-nOeWZO8zsZlOkuaWCgfyvDN7jqLG2XT88xP6FdaLbu8g%3D%3D?uid=239140172&filename=crisis-4.png&disposition=inline&hash=&limit=0&content_type=image%2Fpng&owner_uid=239140172&tknv=v3&size=1891x885"
                                ),
                                new Task.Slide(
                                        "1923—1924",
                                        "Товары стоили дорого, потому что экономика сильно пострадала из-за гражданской войны. Чтобы справиться с кризисом, компании уменьшили издержки производства: сократили персонал и количество посредников. С какими еще кризисами справились в России — в статье Т—Ж. ",
                                        "70%",
                                        new Task.Link(
                                                "Интересно",
                                                "https://journal.tinkoff.ru/short/arctic-fox/?utm_source=stories&utm_medium=mobile&utm_campaign="
                                        ),
                                        "https://1.downloader.disk.yandex.ru/preview/7b02e8d876cd4671b7f4304d0e282b46c23fd7f5b0d6a92fe7aad55ddf9c2cd0/inf/b8bkShb0VE3l-YIhcoPzrZNwk5NuuUNB1dlsNsELF-nuWp598J-11fJi8UOcP0u6fqjxz5b4_DwizEtVagwl_A%3D%3D?uid=239140172&filename=crisis-5.png&disposition=inline&hash=&limit=0&content_type=image%2Fpng&owner_uid=239140172&tknv=v3&size=1891x885"
                                )
                            )
                        )
                )
        );
/*
        tasks.add(
                new Task(
                        "Задание 4",
                        "Пропиши путь до значения product в JSON из примера:",
                        "Если провести полносью путь до значения 'product', то будет: payload.purchases[0].product , " +
                                "однако обычно 'payload' вшит на уровне сервиса в пути к объекту его не указыввают: purchases[0].product",
                        null
                )
        );
*/
        return tasks;
    }

}
