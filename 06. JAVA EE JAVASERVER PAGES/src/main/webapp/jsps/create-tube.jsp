
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
   <c:import url="templates/head.jsp"/>
</head>
<body>
    <div class="container">
        <main>
            <div class="jumbotron">
                <form action="/tubes/create" method="post">
                    <div class="row">
                        <div class="col col-md-12 d-flex justify-content-center">
                            <h1>
                                Create Tube!
                            </h1>
                        </div>
                    </div>
                    <hr/>
                    <div class="row">
                        <div class="class col col-md-12">
                            <div class="row mx-auto justify-content-center">
                                <label for="nameInput">Title</label>
                            </div>
                            <div class="row d-flex justify-content-center">
                                <input type="text" id="nameInput" name="name">
                            </div>
                            <hr/>
                            <div class="row d-flex justify-content-center">
                                <label for="descriptionInput">Description</label>
                            </div>
                            <div class="row d-flex justify-content-center">
                                <textarea name="description" id="descriptionInput" cols="22" rows="4"></textarea>
                            </div>
                            <hr/>
                            <div class="row d-flex justify-content-center">
                                <label for="selectInput">YouTube Link</label>
                            </div>
                            <div class="row d-flex justify-content-center">
                                <input type="text" id="selectInput" name="youTubeLink">
                            </div>
                            <hr/>
                            <div class="row d-flex justify-content-center">
                                <label for="uploaderInput">Uploader</label>
                            </div>
                            <div class="row d-flex justify-content-center">
                                <input type="text" id="uploaderInput" name="uploader">
                            </div>
                            <hr/>
                            <div class="class col col-md-12 d-flex justify-content-center mt-4">
                                <button type="submit" class="btn btn-primary">Create Tube</button>
                            </div>
                        </div>
                    </div>
                </form>
                <div class="row">
                    <div class="class col col-md-12 d-flex justify-content-center">
                        <a href="/">Back to homepage</a>
                    </div>
                </div>
            </div>
        </main>
        <footer>
            <c:import url="templates/footer.jsp"/>
        </footer>
    </div>
</body>
</html>
