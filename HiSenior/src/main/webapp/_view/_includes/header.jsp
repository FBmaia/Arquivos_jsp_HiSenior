<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="icon" type="image/png" href="_img/Logo.png" />
    <!-- Txtensões bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    <!-- Link do css da home -->
    <link href="_css/home.css" rel="stylesheet">
    <link href="_css/quemsomos.css" rel="stylesheet">
    <link href="_css/cadastro.css" rel="stylesheet">
	<link href="_css/entrar_voluntario.css" rel="stylesheet">
	<link href="_css/entrar_usuario.css" rel="stylesheet">
    
    <!-- Titulo -->
    <title> HiSenior</title>
    <!-- Fontes -->
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Nunito:wght@400;600;700&display=swap" rel="stylesheet">
    <!-- Banner Rotativo JS -->
    <link rel="stylesheet" href="_lib/nivo-slider/nivo-slider.css">
    <link rel="stylesheet" href="_lib/nivo-slider/themes/default/default.css">
    <!-- CSS JS -->
    <link rel="stylesheet" type="text/css" href="_css/util.css">
     <link rel="stylesheet" type="text/css" href="_css/main.css">
    <link href="_css/js.css" rel="stylesheet">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>

</head>

<body>
    <header class="fixed-top">
        <div class="container">
            <nav class="navbar navbar-expand-lg navbar-light">
                <div class="container">
                    <a class="navbar-brand" href="home.jsp">
                        <img src="_img/Logo.png" alt="" height="60" class="d-inline-block align-text-center rounded-circle">HiSenior
                    </a>
                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
				      <span class="navbar-toggler-icon"></span>
				    </button>

                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul class="navbar-nav ml-auto  mx-auto  ms-auto mb-2 mb-lg-0 ">
                            <li class="nav-item">
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="quemsomos.jsp">Quem somos</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="cad_voluntario.jsp">Quero ser voluntário</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="cad_usuario.jsp">Quero ser usuário</a>
                            </li>
                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
				            Entrar
				          </a>
                                <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                                    <li><a class="dropdown-item" href="login_usuario.jsp">Entrar como usúario</a></li>
                                    <li><a class="dropdown-item" href="login_volunt.jsp">Entrar como voluntário</a></li>
                                    <li>

                                    </li>

                                </ul>
                            </li>
                        </ul>
                        <div class="d-flex">
                            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                                <li>
                                    <a class="nav-link" href="https://www.facebook.com/HiSenior.oficial">
                                        <img src="_img/Facebook.jpg" height="30">
                                    </a>
                                </li>
                                <li>
                                    <a class="nav-link" href="https://www.instagram.com/hisenior_oficial/">
                                        <img src="_img/instagram.jpg" height="30">
                                    </a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </nav>
        </div>
    </header>