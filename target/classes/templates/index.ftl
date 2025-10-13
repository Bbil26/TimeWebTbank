<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>TbankTask</title>
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

                        <#list task.sldies as slide>
                            ${slide.title}
                            ${slide.text}
                            <img src="${slide.imageUrl}">
                        </#list>

                    </#if>

                </div>

            </div>

        </#list>
    </div>

</body>
</html>