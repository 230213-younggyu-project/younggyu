window.onload = () => {
    PlantApi.getInstance().getAllPlant();
}


class PlantApi {
    static #instance = null;
    static getInstance(){
        if(this.#instance == null) {
            this.#instance = new PlantApi();
        }

        return this.#instance;
    }

    getAllPlant() {
        let returnData = null;

        $.ajax ({
            async: false,
            type: "get",
            url: "http://localhost:8000/plant/all",
            dataType: "json",
            success: response => {
                console.log(response);
                returnData = response.data;
            },
            error: error => {
                console.log(error);
            }
        });
        return returnData;
    }
    
}

