<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>TBankTask</title>
    <link rel="stylesheet" href="/css/style.css">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="icon" href="https://proxy.imgsmail.ru/?e=1760474343&h=NMxHtmtkuBBS0rQ2yHvdlA&email174=bbil26%40vk.com&flags=0&message_id=17533562750671681240&is_https=1&url174=aHR0cHM6Ly9pbWdwcm94eS5jZG4tdGlua29mZi5ydS9jb21wcmVzc2VkL2FIUjBjSE02THk5bGJXRnBiQzFpZFdsc1pHVnlMV0YwZEdGamFHMWxiblJ6TG5NekxXMXpheTUwYVc1cmIyWm1MbkoxTHpka1pUVTNOekJoTW1NM05ESmtNR1ExTW1JelltRm1NRGd4WkRBd09HSms~">
</head>
<body>

    <div id="contentPage">

        <#list tasks as task>

            <div class="task">

                <div class="taskTitle">
                    ${task.title}
                </div>

               <div class="descriptionTask">
                    ${task.description}
               </div>

                <div class="resolveTask">
                    ${task.resolve}

                    <#if task.slides??>

                        <div class="slide">

                            <div class="scrollLeft">
                                <i class="material-icons">keyboard_arrow_left</i>
                            </div>

                            <#list task.slides as slide>

                                <div class="story
                                <#if slide?counter != 1>hide-block</#if>"
                                id="${slide?counter}">

                                    <div class="contentStory">
                                        <div class="titleStory">${slide.title}</div>
                                        <div class="textStory">${slide.text}</div>
                                        <#if slide.link??>
                                            <a class="linkBtn" href="${slide.link.url}">
                                                <div class="textUrl">${slide.link.preview}</div>
                                            </a>
                                        </#if>
                                    </div>
                                    <img class="imageStory" src="${slide.imageUrl}">
                                </div>

                            </#list>

                            <div class="scrollRight">
                                <i class="material-icons">keyboard_arrow_right</i>
                            </div>

                        </div>

                    </#if>

                </div>

            </div>

            <hr>

        </#list>

    </div>

<script src="/js/script.js"></script>
</body>
</html>