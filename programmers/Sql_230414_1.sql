//중고거래 댓글 조회: https://school.programmers.co.kr/learn/courses/30/lessons/164673
SELECT B.TITLE, B.BOARD_ID, C.REPLY_ID, C.WRITER_ID, C.CONTENTS, 
DATE_FORMAT(C.CREATED_DATE, '%Y-%m-%d') AS CREATED_DATE
FROM USED_GOODS_REPLY C LEFT JOIN USED_GOODS_BOARD B ON C.BOARD_ID = B.BOARD_ID
WHERE DATE_FORMAT(B.CREATED_DATE, '%Y-%m') = '2022-10'
ORDER BY C.CREATED_DATE ASC, B.TITLE ASC;
