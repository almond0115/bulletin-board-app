import React from 'react';
import { Link } from 'react-router-dom';

const BoardRead = ({no, board}) => {
    return (
        <div>
            <h1>게시글 조회</h1>
            <h3> 번호 : {no} </h3>
            <hr />
            <table border={1}>
                <tbody>
                    <tr>
                        <td>번호</td>
                        <td>
                            <input type="text" value={board.no} readOnly />
                        </td>
                    </tr>
                    <tr>
                        <td>등록 일자</td>
                        <td>
                            <input type="text" value={board.regDate} readOnly />
                        </td>
                    </tr>
                    <tr>
                        <td>작성자</td>
                        <td>
                            <input type="text" value={board.writer} readOnly />
                        </td>
                    </tr>
                    <tr>
                        <td>내용</td>
                        <td>
                            <textarea cols="40" rows="5" value={board.content} readOnly />
                        </td>
                    </tr>
                </tbody>
            </table>
            <hr />
            <Link to={`/boards/update/${no}`}>수정</Link>
            <span> </span>
            <Link to="/boards">목록</Link>
        </div>
    )
}

export default BoardRead;