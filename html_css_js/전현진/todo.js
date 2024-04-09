function enterKey(event) {
    if (event.keyCode === 13) {
        addTodo();
    }
}

//todo리스트 목록 추가
function addTodo() {
    const inputValue = document.getElementById("myInput").value;

    //입력값 없으면 알림창 띄우기
    if (inputValue === '') {
        alert("할 일을 입력해주세요");
        return;
    }

    const li = document.createElement("li");
    const text = document.createTextNode(inputValue);
    li.appendChild(text);

    //span태그 요소 가져오기
    const span = document.createElement("span");
    //span태그에 remove 클래스 추가
    span.classList.add("remove");
    const spanText = document.createTextNode("x");
    span.appendChild(spanText);
    li.appendChild(span);

    document.getElementById("UL").appendChild(li);

    document.getElementById("myInput").value = "";
}

const list = document.getElementById('UL');
list.addEventListener('click', function (event) {
    console.log(event.target)
    //li 선택시 체크하기
    if (event.target.tagName === 'LI') {
        event.target.classList.toggle('checked');
    }
    //span(x표시) 선택시 없애기
    else if (event.target.tagName === 'SPAN') {
        event.target.parentElement.style.display = "none";
    }
}, false);