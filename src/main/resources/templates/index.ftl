<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>TbankTask</title>
    <link rel="stylesheet" href="/css/style.css">
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

                        <#list task.slides as slide>

                            <div class="story">
                                <div class="contentStory" style="--position:${slide.textPosition}">
                                    <div class="titleStory"> ${slide.title} </div>
                                    <div class="textStory"> ${slide.text} </div>
                                </div>
                                <img class="imageStory" src="${slide.imageUrl}">
                            </div>

                        </#list>

                    </#if>

                </div>

            </div>

            <hr>

        </#list>

    </div>

</body>
</html>