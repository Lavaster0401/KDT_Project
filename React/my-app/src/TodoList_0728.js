import React, { useState } from "react"; 

export default function TodoList() {

  // React의 상태(state)를 정의 [현재 상태의 값, 상태를 바꾸는 함수] = useState(초기값); 
  const [inputValue, setInputValue] = useState(""); //상태 초기값은 빈 문자열
  const [todoList, setTodoList] = useState([]); //상태 초기값은 빈 배열

  const todoList_Add = () => {
    const check = inputValue;

    if (check === "") {
      alert("[경고] 아무것도 입력하지 않았습니다.");
      return;
    } else if (check.trim() === "") {
      alert("[경고] 공백은 입력할 수 없습니다");
      return;
    }

    //React에서는 기존 상태를 직접 변경 불가(불변성) 
    //[...todoList, inputValue] = ... 이라는 전개 연산자를 통해 기존 배열(todoList)을 복사하고 inputValue을 마지막 항목으로 추가한 새로운 배열을 생성
    //그리고 setTodoList 를 통해 상태를 변경 -> 리액트는 상태가 변경되면 화면을 바로 다시 그려줌 
    setTodoList([...todoList, inputValue]); 
    setInputValue(""); // 입력창 초기화
  };

  const todoList_Remove = (indexToRemove) => {
    //filter()는 배열의 각 요소를 검사해서, 조건을 만족하는 것만 남김
    //index가 일치하지 않는 항목만 남긴 새 배열을 만들고 상태 업데이트
    setTodoList(todoList.filter((_, index) => index !== indexToRemove));
    //todoList.filter(function(_, index) {return index !== indexToRemove;});와 같음 
  };

  return (
    <div>
      <input
        value={inputValue}
        //e는 이벤트 객체
        //onChange는 사용자가 입력할 때마다 호출되는 이벤트 핸들러 함수
        //사용자가 입력창에 뭔가 입력할 때마다, inputValue 상태를 지금 입력된 값으로 업데이트
        onChange={(e) => setInputValue(e.target.value)}
        placeholder="할 일을 입력하세요"
      />
      <button onClick={todoList_Add}>추가</button>

      <ul>
        {/* map 반복문 */}
        {todoList.map((item, index) => (
          <li key={index} onClick={() => todoList_Remove(index)}>
            {item}
          </li>
        ))}
      </ul>
    </div>
  );
}

