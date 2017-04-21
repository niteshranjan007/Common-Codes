<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Summernote</title>
  <link href="http://netdna.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.css" rel="stylesheet">
  <script src="http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.4/jquery.js"></script> 
  <script src="http://netdna.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.js"></script> 
  <link href="http://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.3/summernote.css" rel="stylesheet">
  <script src="http://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.3/summernote.js"></script>
  <script type="text/javascript">
  function test(){
	  
	  var markupStr = $('#summernote').summernote('code');
	  alert(markupStr);
  }
  </script>
</head>
<body>
<form action="example">
  <div id="summernote"><p></p></div>
  <input type="submit"onclick="test()">
  </form>
  <script>
    $(document).ready(function() {
        $('#summernote').summernote();
    });
    
    $.extend($.summernote.plugins, {
        'brenter': function (context) {
            this.events = {
                'summernote.enter': function (we, e) {
                    // insert 2 br tags (if only one br tag is inserted the cursor won't go to the next line)
                    document.execCommand('insertHTML', false, '<br><br>');
                    e.preventDefault();
                }
            };
        }
    })
  </script>
</body>
</html>