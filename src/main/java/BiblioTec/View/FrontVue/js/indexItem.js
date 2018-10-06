$(document).ready(function() {
	var data = {
		title: 'Livros',
		livros: [],
		livro: {},
	};
	function listar(){
		$.get( "http://localhost:8080/livro", function( ret ) {
	  		data.livros = ret;
		});
	}
	listar();
	new Vue({ 
		el: '#app', 
		data: data,
		methods: { 
			salvar: function () { 
				$.ajaxSetup({
					headers: {
						'Content-Type': 'application/json',
						'Accept': 'application/json'
					}
				});
	   		  	$.post( "http://localhost:8080/livro", JSON.stringify(this.livro), function(ret){ 
					listar();
					data.livro = {};
					document.getElementById('cadastrarModal').style.display='none';
				},"json");
				
			},
			alterar: function (valor) { 
				this.livro = valor;
				document.getElementById('cadastrarModal').style.display='block';	
			},
			excluir: function (valor) { 
				if(confirm("Tem certeza que deseja excluir?")){
					$.ajax({
						url: 'http://localhost:8080/livro/'+valor.id,
						type: 'DELETE',
						headers: {
							'Content-Type': 'application/json',
							'Accept': 'application/json'
						},
						success: function() {
							listar();
						},
						error: function(request,msg,error){
							console.log(request);
						}
					});	
				}
			} 
		}
	});
	
});
