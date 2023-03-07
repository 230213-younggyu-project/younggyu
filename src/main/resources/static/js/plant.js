window.onload = () => {
    PlantApi.getInstance().getAllPlant();
    
    PlantService.getInstance().loadPlant();
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
        let reponseData = null;

        $.ajax ({
            async: false,
            type: "get",
            url: "http://localhost:8000/api/plant/all",
            dataType: "json",
            success: response => {
                console.log(response);
                reponseData = response.data;
            },
            error: error => {
                console.log(error);
            }
        });

        return reponseData;
    }
    
}

class PlantService {
    static #instance = null;
    static getInstance() {
        if(this.#instance == null){
            this.#instance = new PlantService();
        }

        return this.#instance;
    }

    loadPlant() {
        const responseData = PlantApi.getInstance().getAllPlant();

        const mainAsideContentData = document.querySelector(".main-aside-content-data");
        mainAsideContentData.innerHTML = `
            <li>${parseInt(responseData.getPlantEntity.totalPlant).toLocaleString('ko-KR')}개소</li>
            <li>${parseInt(responseData.getPlantEntity.totalCapacity).toLocaleString('ko-KR')}kWh</li>
            <li>${parseInt(responseData.getTotalCpgEntity.totalTpg).toLocaleString('ko-KR')}MWh</li>
            <li>${parseInt(responseData.getTotalCpgEntity.totalMpg).toLocaleString('ko-KR')}MWh</li>
            <li>${parseInt(responseData.getTotalCpgEntity.totalCpg).toLocaleString('ko-KR')}GWh</li>
        `;

        const labelsNameList = new Array();
        const dataList = new Array();

        responseData.businessEntities.forEach(data => {
            labelsNameList.push(data.business);
            dataList.push(data.businessCount);
        });

        var context = document
            .getElementById('doughnutChart')
            .getContext('2d');
        var myChart = new Chart(context, {
            type: 'doughnut', // 차트의 형태
            data: { // 차트에 들어갈 데이터
                labels: labelsNameList,
                datasets: [
                    { //데이터
                        label: 'business', //차트 제목
                        fill: false, // line 형태일 때, 선 안쪽을 채우는지 안채우는지
                        data: dataList,
                        backgroundColor: [
                            //색상
                            'rgba(255, 99, 132, 0.2)',
                            'rgba(54, 162, 235, 0.2)',
                            'rgba(255, 206, 86, 0.2)',
                        ],
                        
                
                    }/* ,
                    {
                        label: 'test2',
                        fill: false,
                        data: [
                            8, 34, 12, 24
                        ],
                        backgroundColor: 'rgb(157, 109, 12)',
                        borderColor: 'rgb(157, 109, 12)'
                    } */
                ]
            },
            options: {
                scales: {
                    
                }
            }
        });

        const fistState = document.querySelectorAll(".state-info-green div:nth-child(1), .state-info-blue div:nth-child(1), .state-info-yellow div:nth-child(1), .state-info-red div:nth-child(1), .state-info-white div:nth-child(1)")
        const secondState = document.querySelectorAll("")
        
        responseData.stateEntities.forEach(data =>{
            state.innerHTML += `
               

            `


        });
    }

}

