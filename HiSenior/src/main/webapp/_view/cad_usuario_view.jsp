
<body>
    <main>
        <div class="container ">
            <div class="row ">

                <div>
                    <hr class="hrtitulo">
                    <p class="pq1 ">Por que ser um usuário?</p>
                    <p class="txtVoluntario ">O usuário do HiSenior tem muitos beneficios, recebe remédios em casa com um otimo atendimento dos voluntarios cadastrados no site.
                    </p>
                    <div class="requisitos ">
                        <hr class="hrsubtitulo">
                        <h2 class="pq1 ">Requisitos</h2>
                        <ul>
                            <li class="l1 ">Ter 60 anos de idade ou mais</li>
                            <li class="l1 ">Morar em São Paulo, no bairro Jardim Brasil.</li>
                            <li class="l1 ">Ter cadastro no SUS.</li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
        <div class="divh1">Cadastro Usuário</div>
        <!-- Cadastro -->

        <div class="container">
	        <form method="post" action="cad_usuario_action.jsp"> 
	        	
	            <div class="row ">
	
	                <div class="col-md-12 ">
	
	                    <!-- Lista de itens -->
	                    <hr class='hrcad mt-5' size="4">
	                    <label class="label2">Nome: <br>  
	                    	<input class="inputform border border-2 border-secondary rounded " type="text" name="Nome" placeholder="Escreva seu nome aqui "></label>	       
	                    <hr class='hrcad' size="4">
	                    <label class="label2">Data de nascimento: <br>
	                        <input class="inputform border border-2 border-secondary rounded " type="text" name="Data_de_nascimento" placeholder="Digite aqui"></label>
	                    <hr class='hrcad' size="4">
	                    <label class="label2">CPF: <br>
	                        <input class="inputform border border-2 border-secondary rounded " type="text" name="CPF" placeholder="Digite aqui "></label>
	                    <hr class='hrcad' size="4">
	                    <label class="label2">Estado: <br>
	                        <input class="inputform border border-2 border-secondary rounded " type="text" name="Estado" placeholder="Escreva aqui"></label>
	                    <hr class='hrcad' size="4">
	                    <label class="label2">Cidade: <br> 
	                        <input class=" inputform border border-2 border-secondary rounded " type="text" name="Cidade" placeholder="Escreva aqui"></label>
	                    <hr class='hrcad' size="4">
	                    <label class="label2">CEP: <br>
	                        <input class="inputform border border-2 border-secondary rounded " type="text" name="CEP" placeholder="Digite aqui"></label>
	                    <hr class='hrcad' size="4">
	                    <label class="label2">Endereço: <br> 
	                        <input class="inputform border border-2 border-secondary rounded " type="text" name="Logradouro" placeholder="Escreva aqui"></label>
	                    <hr class='hrcad' size="4">
	                    <label class="label2">Número: <br> 
	                        <input class="inputform border border-2 border-secondary rounded " type="text" name="Numero" placeholder="Escreva aqui"></label>
	                    <hr class='hrcad' size="4">
						<div class="label2">Alguma deficiência: <br>
							<label><input class="input-radio" type="radio" name="PCD" value="Sim"> Sim</label>
							<label class="ms-5"><input class="input-radio" type="radio" name="PCD" value="Nao"> Não</label>
						</div>
	                    <hr class='hrcad' size="4">
	                    <label class="label2">Email: <br> 
	                        <input class="inputform border border-2 border-secondary rounded " type="text" name="Email" placeholder="Escreva aqui"></label>
	                    <hr class='hrcad' size="4">
	                    <label class="label2">Senha: <br>
	                        <input class="inputform border border-2 border-secondary rounded " type="password" name="Senha" placeholder="Escreva aqui"></label>
	                    <hr class='hrcad' size="4">
	                    <label class="label2">DDD: <br>
	                        <input class="inputform border border-2 border-secondary rounded " type="text" name="DDD" placeholder="Digite aqui"></label>
	                    <hr class='hrcad' size="4">
	                    <label class="label2">Telefone: <br>
	                        <input class="inputform border border-2 border-secondary rounded " type="text" name="Telefone" placeholder="Digite aqui"></label>
	                    <hr class='hrcad' size="4">
	           			<br>
	                    <div class="alinha">
	                        <button class="btn btnConfirmar text-center" type="submit"> Confirmar cadastro</button>
	                    </div>
	                    <!-- Fim da lista -->
	            	</div>
            	</div>
        	</form>
        </div>
    </main>