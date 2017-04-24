<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title></title>
    <style type="text/css">
        body
        {
            font-family: Arial;
            font-size: 10pt;
        }
    </style>
</head>
<body>
    <textarea id="txtTinyMCE" rows="2" cols="20"></textarea>
    <br />
    <div id="character_count">
    </div>
    <br />
    <input type="submit" value="Submit" onclick="return ValidateCharacterLength();" />
    <script type="text/javascript" src="//tinymce.cachefly.net/4.0/tinymce.min.js"></script>
    <script type="text/javascript">
        window.onload = function () {
            tinymce.init({
                selector: 'textarea',
                width: 400,
                menubar:false,
          	  statusbar: false,
          	  valid_elements : '*[*]',
          	  force_br_newlines : true,
          	  force_p_newlines : false,
          	  forced_root_block : '',
          	  toolbar: "bold italic underline",
                setup: function (ed) {
                    ed.on('keyup', function (e) {
                        var count = CountCharacters();
                        document.getElementById("character_count").innerHTML = "Characters: " + count;
                    });
                }
            });
        }
        function CountCharacters() {
            var body = tinymce.get("txtTinyMCE").getBody();
            var content = tinymce.trim(body.innerText || body.textContent);
            return content.length;
        };
        function ValidateCharacterLength() {
            var max = 20;
            var count = CountCharacters();
            var value = tinymce.get('txtTinyMCE').getContent();
      	    alert(value);
            if (count > max) {
                alert("Maximum " + max + " characters allowed.")
                return false;
            }
            return;
        }
    </script>
</body>
</html>
