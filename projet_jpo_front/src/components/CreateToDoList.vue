<script>
export default {
    name:'CreateToDoList',
    data(){
        return{
            ajouter : false,
            toDoList:{
                titre: "",
                date : "",
                elements : [],
            },
            elements: [],
        }
    },
    methods: {
        ajouterToDoList(){
            this.ajouter = true; 
        },
        annuler(){
            this.ajouter = false;
            this.toDoList.titre = "";
            this.toDoList.elements = [];
        },
        addElement(){
            this.elements.push({ value: '' });
        },
        sauvegarder(){
            this.toDoList.date = this.getDate;
            this.elements.forEach(element => {
                if(element.value != ""){
                    this.toDoList.elements.push(element.value);
                }
            });
            fetch('')
            .then(response => {
                console.log(response);
            })
        }
    },
    computed : {
        getDate(){
            const today = new Date;
            const date = today.getDay() + "-" + (today.getMonth()+1) + "-" + today.getFullYear();
            return date;
        }
    }
}
</script>

<template>
  <div>
    <button @click="ajouterToDoList">Ajouter une tâche</button>
    <div v-if="ajouter">
        <label for="title" >Titre :</label>
        <input type="text" id="title" v-model="toDoList.titre" placeholder="Veuillez renseigner le titre de votre ToDoList" size="100">
        <div v-for="(element,index) in elements">
            <p>ToDo {{index+1}} :</p>
            <label for="content">Contenu :</label>
            <textarea type="text" v-model="element.value" id="content" placeholder="veuillez ajouter un élement à votre ToDoList" style="width: 200px;"></textarea>
            
        </div>
        <button @click="addElement">Ajouter un élément</button>
        <button @click="annuler">Annuler</button>
        <button @click="sauvegarder">Sauvegarder</button>
    </div>
  </div>
</template>

<style scoped>

</style>