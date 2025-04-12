<template>
  <div>
    {{ test }}
    <button @click="buttonHandler">Click me</button>
  </div>
</template>

<script setup>
import {ref} from 'vue';
import axios from "axios";

const test = ref('Hello World');
const buttonHandler = () => {
  axios.get('http://localhost:8080/test')
      .then(response => {
        test.value = response.data;
      })
      .catch(error => {
        console.error('Error fetching data:', error);
      });

}

</script>

<style scoped>

</style>