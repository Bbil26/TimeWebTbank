<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>TbankTask</title>
    <link rel="stylesheet" href="/css/style.css">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
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

                                <#if slide.link??>
                                    <a id="link" class="hide-block" href="${slide.link.url}">
                                </#if>

                                <div class="story
                                <#if slide?counter != 1>hide-block</#if>"
                                id="${slide?counter}">

                                    <div class="contentStory">
                                        <div class="titleStory">${slide.title}</div>
                                        <div class="textStory">${slide.text}</div>
                                        <#if slide.link??>
                                           <div class="textUrl">${slide.link.preview}</div>
                                        </#if>
                                    </div>
                                    <img class="imageStory" src="${slide.imageUrl}">
                                </div>
                                <#if slide.link??>
                                    </a>
                                </#if>
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