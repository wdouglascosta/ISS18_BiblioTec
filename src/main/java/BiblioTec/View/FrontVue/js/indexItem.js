$(document).ready(function () {
	var data = {
		title: 'Livros',
		livros: [],
		livro: {},
		buscaTexto:''
	};
	function listar() {
		$.get("http://localhost:8080/livro", function (ret) {
			data.livros = ret;
		});
	};

	listar();
	new Vue({
		el: '#app',
		data: data,
		methods: {
			buscar: function () {
				console.log(data.buscaTexto)
				$.get("http://localhost:8080/livro/nome/" + data.buscaTexto, function (ret) {
					data.livros = ret;
				});

			},

			buscarAutor: function () {
				console.log('autor = '+data.buscaTexto)
				$.get("http://localhost:8080/livro/autor/" + data.buscaTexto, function (ret) {
					data.livros = ret;
				});

			},

			buscarEditora: function () {
				console.log('editora = '+data.buscaTexto)
				$.get("http://localhost:8080/livro/editora/" + data.buscaTexto, function (ret) {
					data.livros = ret;
				});

			},


			salvar: function () {
				$.ajaxSetup({
					headers: {
						'Content-Type': 'application/json',
						'Accept': 'application/json'
					}
				});
				$.post("http://localhost:8080/livro", JSON.stringify(this.livro), function (ret) {
					listar();
					data.livro = {};
					document.getElementById('cadastrarModal').style.display = 'none';
				}, "json");

			},
			alterar: function (valor) {
				this.livro = valor;
				document.getElementById('cadastrarModal').style.display = 'block';
			},
			excluir: function (valor) {
				if (confirm("Tem certeza que deseja excluir?")) {
					$.ajax({
						url: 'http://localhost:8080/livro/' + valor.id,
						type: 'DELETE',
						headers: {
							'Content-Type': 'application/json',
							'Accept': 'application/json'
						},
						success: function () {
							listar();
						},
						error: function (request, msg, error) {
							console.log(request);
						}
					});
				}
			}
		}
	});

});
