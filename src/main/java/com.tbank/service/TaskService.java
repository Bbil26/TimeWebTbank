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
                    "Напиши логику проверки условия на freemarker: \n" +
                            "Если параметр card равен “Black” или “Platinum” и в параметр eligible пришло булево значение true, то нужно вывести предложение “Вам доступен бонус”. Иначе ничего выводить не нужно.\n",
                        "<#if (card == 'Black' || 'Platinum') && eligible == true>\n" +
                                    "Вам доступен бонус!\n" +
                                "</#if>",
                        null
                )
        );

        tasks.add(
                new Task(
                        "Задание 3",
                        "Сверстать историю",
                        "Если провести полносью путь до значения 'product', то будет: payload.purchases[0].product , ",
                        new ArrayList<>(List.of(
                                new Task.Slide(
                                    "Как в России справлялись с кризисами",
                                    "В истории нашей страны было много кризисов, но все постепенно удалось преодолеть. Рассказываем про те, что были до революции и в СССР.",
                                    null,
                                    "https://disk.yandex.ru/i/s-d1cAmp4iQExQ"
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
        return null;
    }

}
