document.addEventListener('DOMContentLoaded', function () {
    const stories = document.querySelectorAll('.story');
    let currentIndex = 0;

    const emailBtn = document.querySelector('.emailBtn');
    const scrollLeft = document.querySelector('.scrollLeft');
    const scrollRight = document.querySelector('.scrollRight');
    document.getElementById("1").querySelector(".contentStory").classList.add("firstStory");

    function showStep(index) {
        stories.forEach(step => step.classList.add('hide-block'));

        stories[index].classList.remove('hide-block');
    }

    scrollRight.addEventListener('click', function (e) {
        e.preventDefault();
        if (currentIndex < stories.length - 1) {
            currentIndex++;
            showStep(currentIndex);
        }
    });

    scrollLeft.addEventListener('click', function (e) {
        e.preventDefault();
        if (currentIndex > 0) {
            currentIndex--;
            showStep(currentIndex);
        }
    });

    emailBtn.addEventListener('click', function (e) {
        window.open('/mail.html', 'emailWindow', 'width=700,height=800,scrollbars=yes');
    });

});