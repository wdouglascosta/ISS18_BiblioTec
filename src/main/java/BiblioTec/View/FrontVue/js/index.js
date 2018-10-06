$(document).ready(function() {
	var data = {
		title: 'Usuários',
		usuarios: [],
		usuario: {},
	};
	function listar(){
		$.get( "http://localhost:8080/api/usuario", function( ret ) {
	  		data.usuarios = ret;
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
	   		  	$.post( "http://localhost:8080/api/usuario", JSON.stringify(this.usuario), function(ret){ 
					listar();
					data.usuario = {};
					document.getElementById('cadastrarModal').style.display='none';
				},"json");
				
			},
			alterar: function (valor) { 
				this.usuario = valor;
				document.getElementById('cadastrarModal').style.display='block';	
			},
			excluir: function (valor) { 
				if(confirm("Tem certeza que deseja excluir?")){
					$.ajax({
						url: 'http://localhost:8080/api/usuario/'+valor.id,
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
