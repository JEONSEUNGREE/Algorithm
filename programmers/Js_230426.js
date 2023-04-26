// 개인정보수집유효기간
// https://school.programmers.co.kr/learn/courses/30/lessons/150370

function solution(today, terms, privacies) {
    let answer = [];
    // key Map 형태로 분리
    let termsMap = new Map();

    let transDate = new Date(today);
    let calcDate = transDate.getMonth() + 1;
    let addMonth = calcDate % 12;
    let addYear = Math.floor(calcDate / 12);

    transDate.setMonth(addMonth);
    transDate.setFullYear(transDate.getFullYear() + addYear);

    terms.map(item => {
    termsMap.set(item.split(" ")[0], item.split(" ")[1]);
    });

    privacies.map((item,idx) => {
        let tmpDate = new Date(item.split(" ")[0]);
        let calcDate = tmpDate.getMonth() + parseInt(termsMap.get(item.split(" ")[1])) + 1;
        let addMonth = calcDate % 12;
        let addYear = Math.floor(calcDate / 12);
        tmpDate.setMonth(addMonth);
        tmpDate.setFullYear(tmpDate.getFullYear() + addYear);

        if(tmpDate < transDate || (tmpDate.getTime() === transDate.getTime())){
            answer.push(idx + 1);
        }
    });

    return answer;
}
