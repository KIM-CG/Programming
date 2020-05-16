<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="ko">
    <head>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <link href="css/index.css" rel="stylesheet">
        <style>
            .carousel-inner > .carousel-item > img{
                width: 640px;
                height: 640px;
            }
        </style>
        <title>서울호서직업전문학교 JSP 김채규</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-sm navbar-dark bg-danger">
            <a class="navbar-brand" href="">MyWeb</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbars" aria-controls="navbars" aria-expanded="false">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbars">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="">홈</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="./page/maker.html">개발자</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link disabled" href="#">비활성 메뉴</a>
                    </li>
                </ul>
            </div>
        </nav>
        <div id="carousel" class="carousel slide" data-ride="carousel">
            <ol class="carousel-indicators">
                <li data-target="#carousel" data-slide-to="0" class="active"></li>
                <li data-target="#carousel" data-slide-to="1"></li>
                <li data-target="#carousel" data-slide-to="2"></li>
            </ol>
            <div class="carousel-inner">
                <div class="carousel-item active"> <!--가로-->
                    <img class="d-block w-100" src="https://images.pexels.com/photos/213399/pexels-photo-213399.jpeg?auto=compress&cs=tinysrgb&h=650&w=940" alt="First slide">
                    <div class="carousel-caption d-none d-md-block">
                        <h1 class="display-3">Welcome to My WebSite!</h1>
                        <p>This is a template for a simple marketing or informational website. It includes a large callout called a jumbotron and three supporting pieces of content. Use it as a starting point to create something more unique.</p>
                        <p><a class="btn btn-primary btn-lg" href="#" role="button">테스트 버튼 »</a></p>
                    </div>
                </div>
                <div class="carousel-item">
                    <img class="d-block w-100" src="https://images.pexels.com/photos/2355519/pexels-photo-2355519.jpeg?auto=compress&cs=tinysrgb&dpr=3&h=750&w=1260" alt="Second slide">
                    <div class="carousel-caption d-none d-md-block">
                        <h5>MyWeb MainTitle</h5>
                        <p>MyWeb SubTitle</p>
                    </div>
                </div>
                <div class="carousel-item">
                    <img class="d-block w-100" src="https://images.pexels.com/photos/2544554/pexels-photo-2544554.jpeg?auto=compress&cs=tinysrgb&h=650&w=940" alt="Third slide">
                    <div class="carousel-caption d-none d-md-block">
                        <h5>MyWeb MainTitle</h5>
                        <p>MyWeb SubTitle</p>
                    </div>
                </div>
            </div>
            <a class="carousel-control-prev" href="#carousel" role="button" data-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="sr-only">이전</span>
            </a>
            <a class="carousel-control-next" href="#carousel" role="button" data-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="sr-only">다음</span>
            </a>
        </div>

        <div class="container">
            <div class="index">
                <h1>Main Page</h1>
                <p class="lead">This Page use to <br />jquery 3.4.1<br />Bootstrap 4.4.1</p>
            </div>
        </div><!-- /.container -->

        <footer class="card-footer">
            <p class="text-muted">CopyRight 2020. 김채규. All rights reserved.</p>
        </footer>

        <!-- Bootstrap core JavaScript
        ================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
        <script>
            $('.carousel').carousel({
                interval: 5000 //기본 5초
            })
        </script>
        <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
        <script src="js/ie10-viewport-bug-workaround.js"></script>
    </body>
</html>