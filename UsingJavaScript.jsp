<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script type="text/javascript">
function bold() {
    var x = $('#description-box');
    if (x.css("font-weight") !== "bold") {
        x.css("font-weight", "bold");
    } else {
        x.css("font-weight", "normal");
    }
}

function italic() {
    var x = $('#description-box');
    if (x.css("font-style") !== "italic") {
        x.css("font-style", "italic");
    } else {
        x.css("font-style", "normal");
    }
}

function underline() {
    var x = $('#description-box');
    if (x.css("text-decoration") !== "underline") {
        x.css("text-decoration", "underline");
    } else {
        x.css("text-decoration", "normal");
    }
}
</script>
<title>Insert title here</title>
<style type="text/css">
textarea {
    font-weight: normal;
}
}</style>
</head>
<body>
<button onclick="bold()">Bold</button>
<button onclick="italic()">Italic</button>
<button onclick="underline()">Underline</button>
<textarea id="description-box" cols="15" rows="5" class="textarea"></textarea>
</body>
</html>