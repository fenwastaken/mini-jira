$(document).ready(function() {

    //Stops the submit request
    $("#selectProject").submit(function(e){
        e.preventDefault();

        //get the form data and then serialize that
        dataLong = $("#selectProject").serialize();

        //make the AJAX request, dataType is set to json
        //meaning we are expecting JSON data in response from the server
        $.ajax({
            url: "http://localhost:9000/projectcontroller/selectProject?"+dataLong,
            type: "POST",
            data: dataLong,
            dataType: "json",

            //if received a response from the server
            success: function( data, textStatus, jqXHR) {
                $("#ajaxResponse").html("");
                $("#ajaxResponse").append("<b>Nom du Projet:</b> " + data.name + "");
                $("#ajaxResponse").append("<b>Description du Projet:</b> " + data.description + "");
                $("#ajaxResponse").append("<b>Date de creation du Projet:</b> " + data.creation + "");


            },

            //If there was no resonse from the server
            error: function(jqXHR, textStatus, errorThrown){
                console.log("Something really bad happened " + textStatus);
                $("#ajaxResponse").html(jqXHR.responseText);
            },

            //capture the request before it was sent to server
            beforeSend: function(jqXHR, settings){
                //adding some Dummy data to the request
                settings.data += "&dummyData=whatever";
                //disable the button until we get the response
                $('#button').attr("disabled", true);
            },

            //this is called after the response or error functions are finsihed
            //so that we can take some action
            complete: function(jqXHR, textStatus){
                //enable the button
                $('#button').attr("disabled", false);
            }

        });
    });

});


