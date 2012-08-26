var Example = function($){
	
	var keyTimeout;
	
	function init(){
		handleInputTypeEvent();
	}
	
	function handleInputTypeEvent(){
		var delay = false;
		$("input[name='textToReverse']").bind("keyup",function(){
			var value = $(this).val();
			if(keyTimeout){
				clearTimeout(keyTimeout);
			}
			keyTimeout = setTimeout(function(){
				ajaxReverseText(value);
			},200);
			
		});
	}
	
	function setResult(text){
		$("section.result-box").text(text);
	}
	
	function ajaxReverseText(text){
		$.ajax({
			url : SETTINGS.URL_REVERSE + text,
			success : function(data, textStatus, jqXHR){
				setResult(data.value);
			},
			error : function(jqXHR, textStatus, errorThrown){
				console.log(jqXHR, textStatus, errorThrown);
			}
		});
	}
	
	return{
		init : init
	}
	
}(jQuery);

Example.init();