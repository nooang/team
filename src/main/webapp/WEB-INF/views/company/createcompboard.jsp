<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글을 한 번 생성해 봅시다.</title>
</head>
<body>
	<h1>게시글 빨리 한 번 생성해봐!</h1>
    <form action="" method="post">
        <label for="postTitle">제목</label>
        <input id= "postTitle" type="text" name="postTitle">
        <label for="postCont">내용</label>
        <textarea id="postCont" name="postCont" style="height: 300px; resize: none;"></textarea>
        <div>
            <input type="submit" value="저장">
        </div>

    </form>
</body>
</html>