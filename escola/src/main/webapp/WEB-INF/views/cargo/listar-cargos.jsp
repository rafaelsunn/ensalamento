<%@include file="/WEB-INF/tags/taglibs.jsp"%>
<jsp:include page="../templates/topo.jsp" />

	<div class="container">
		<c:if test="${mensagem != null}">
			<div class="alert alert-success" role="alert">${mensagem}</div>
		</c:if>
		<div class="panel panel-default">
			<div class="panel-heading">
				<h3 class="panel-title text-center">CLIENTES CADASTRADOS</h3>
			</div>
			
			<div class="panel-body">
				<a href="novo" class="btn btn-primary">
					<span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Novo
				</a>
				
				<div class="table-responsive">
					<table class="table table-striped table-hover">
						<thead>
							<tr>
								<th>ID</th>
								<th>FUNÇÃO</th>
								<th>DESCRIÇÃO</th>
								<th>AÇÕES</th>	
							</tr>
						</thead>

					<c:forEach var="cargo" items="${cargos}">
					
						<tbody>
							<tr>
								<td>${cargo.idCargo}</td>	
								<td>${cargo.funcao}</td>
								<td>${cargo.descricao}</td>
								<td>
									<a href="editar/${cargo.idCargo}" class="btn btn-info">
										<span class="glyphicon glyphicon-edit" aria-hidden="true"></span> Editar
									</a>
									<a href="excluir/${cargo.idCargo}" class="btn btn-danger">
										<span class="glyphicon glyphicon-trash" aria-hidden="true"></span> Excluir
									</a>
								</td>
							</tr>
						</tbody>					
					</c:forEach>	
						
					</table>
				</div>
			
				<nav class="text-center">
					<ul class="pagination">
						<li>
							<a href="#" aria-label="Previous">
								<span aria-hidden="true">&laquo;</span>
							</a>
						</li>
						<li><a href="#">1</a></li>
						<li><a href="#">2</a></li>
						<li><a href="#">3</a></li>
						<li><a href="#">4</a></li>
						<li><a href="#">5</a></li>
						<li>
							<a href="#" aria-label="Next">
								<span aria-hidden="true">&raquo;</span>
							</a>
						</li>
					</ul>
				</nav>
			</div>
		</div>
		</div>

<jsp:include page="../templates/footer.jsp" />