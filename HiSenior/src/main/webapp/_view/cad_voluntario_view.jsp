    <main>
        <div class="container ">
            <div class="row ">

                <div>
                    <hr class="hrtitulo">
                    <p class="pq1 ">Por que ser voluntário?</p>
                    <p class="txtVoluntario ">Sendo um voluntário você vai estar ajudando idosos do seu bairro de forma responsável. E ainda é possivel ganhar um certificado de voluntário do HiSenior. </p>
                    <div class="requisitos ">
                        <hr class="hrsubtitulo">
                        <h2 class="pq1 ">Requisitos</h2>
                        <ul>
                            <li class="l1 ">Ser maior de idade</li>
                            <li class="l1 ">Morar em São Paulo, no bairro Jardim Brasil.</li>
                            <li class="l1 ">Ter a ficha criminal limpa.</li>
                            <li class="l1 ">Ter disponibilidade para entregas.</li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
        <div class="divh1">Cadastro Voluntário</div>
        <!-- Cadastro -->

        <div class="container ">
         <form method="post" action="cad_voluntario_action.jsp"> 	
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
