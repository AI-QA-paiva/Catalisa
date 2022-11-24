const cep = document.querySelector("#cep")

const showData = (result) =>{
    for(const campo in result){
        if(document.querySelector("#"+campo)){
            document.querySelector("#"+campo).value = result[campo]                       
            console.log(campo)
        }        
    }
}


cep.addEventListener("blur",(e)=>{
    let search = cep.value.replace("-","")
    const options = {
        method: 'GET',
        mode:'cors',
        cache: 'defautl'
    }

    fetch(`https://viacep.com.br/ws/${search}/json/`)
    .then(response =>{response.json()
        .then(data => showData(data))
    })
    .catch(e => console.log('Deu erro: '+e,message))
    
})



//evento linha 3 onde vamos colocar alguns itens
//linha 4, cria a variavel nome search recebe uma busca do replace, que localiza o que quer buscar,
//e depois muda o formato
//
//linha 6, cria o caminho da url, para ser acessada pelo fetch
//o cifrao ele indica uma ação dinamica, recebe outro argumento como variavel

//console.log(cep.value)