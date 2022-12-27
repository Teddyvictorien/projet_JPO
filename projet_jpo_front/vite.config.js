import { fileURLToPath, URL } from 'node:url'

import { defineConfig } from 'vite'
import vue from '@vitejs/plugin-vue'
import vueJsx from '@vitejs/plugin-vue-jsx'
// Import the functions you need from the SDKs you need
import { initializeApp } from "firebase/app";
import { getAnalytics } from "firebase/analytics";
// TODO: Add SDKs for Firebase products that you want to use
// https://firebase.google.com/docs/web/setup#available-libraries

// Your web app's Firebase configuration
// For Firebase JS SDK v7.20.0 and later, measurementId is optional
const firebaseConfig = {
    apiKey: "AIzaSyBxeYQDVuvgJab9m5lleCPbo4pMe9nifx8",
    authDomain: "projet-jpo.firebaseapp.com",
    projectId: "projet-jpo",
    storageBucket: "projet-jpo.appspot.com",
    messagingSenderId: "609979799008",
    appId: "1:609979799008:web:4c0dbe57bd5a9b78e5c785",
    measurementId: "G-6NKMFYTK1Z"
};

// Initialize Firebase
const app = initializeApp(firebaseConfig);
const analytics = getAnalytics(app);
// https://vitejs.dev/config/


export default defineConfig({
  plugins: [vue(), vueJsx()],
  resolve: {
    alias: {
      '@': fileURLToPath(new URL('./src', import.meta.url))
    }
  }
})
