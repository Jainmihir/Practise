// console.log("Hello");



// some basic understandings
console.log("2"+1);
console.log("2"-1);
console.log(2-"2");
console.log("2" + 2 + 1);
console.log(2 + 1 - "2");





// inner text = me jo samne hai wohi dikhega
// textcontent = me jp hidden hai span ke undr woh bhi dikhega
// innerhtml = html ke sath text ad hota hai
// outerhtml = html me like li remove krdeta hai



// const answerFilter = function (data) {
//     const filteredData = data.filter((user) => user.id % 2 == 0);
//     return filteredData;
// }

// const answerMap = (data) => {
//     console.log("map")
//     const mapdata = data.map((user) => ({
//         username: user.login,
//         id: user.id
//     }));
//     return mapdata;
// }

// const answerReduce = (data) => {
//     console.log("reduce")
//     const countNumberOfUser = data.reduce((count, user) => count + 1, 0);
//     return countNumberOfUser;

// }


// async function api(url) {
//     try {
//         const result = await fetch(url);
//         const data = await result.json();

//         displayData(data);
//         console.log(answerFilter(data));
//         console.log(answerMap(data));
//         console.log(answerReduce(data));

//     } catch (error) {
//         console.log(error);
//     }
// }

// function displayData(data) {
//     const datacontainer = document.getElementById('data');
//     datacontainer.innerHTML = '';
//     data.forEach(user => {
//         const userElement = document.createElement('p');
//         userElement.textContent = `Username : ${user.login}`;
//         datacontainer.appendChild(userElement);
//     });


// }


// document.getElementById('btn').addEventListener('click', function (e) {


//     api('https://api.github.com/users');

//     // fetch('https://api.github.com/users')
//     // .then((res) => res.json())
//     // .then((data) => console.log(data))
//     // .catch((err)  => console.log(err));
// })


// Diff : Annoynoums and normal functions
// ** Normal function :- 
// Function declarations are hoisted, which means they are loaded into memory at compilation. 
// That's why in the example below, the function call works even before the function declaration appears.
// Example :-

// console.log(brag(3)) // I can do 3 pushups

// function brag(count) {
//     return("I can do " + count + " pushups");
// } 

// console.log(brag(3)) // I can do 3 pushups

// ** Annoymous functions
// Anonymous functions, on the other hand, are not hoisted. As you can see, 
// when we call the "brag" function before the function declaration, we get an error. When we call it after the declaration, it works.
// Example :- 
// console.log(brag(3)) // TypeError: brag is not a function

// var brag = function(count) {
//     return("I can do " + count + " pushups");
// } 
// console.log(brag(3)) // I can do 3 pushups

// Hoisting
// var a;
// a =12;
// console.log(a);

// IIFE

// (function a() {
//     console.log(a);
// })();

// let obj1  = {
//     "name" : "Mihir",
//     "class" : "passout",
//     fun : function(){
//         console.log("Hello");
//     },
//     arr : [1,2,3],
// }

// for(let i in obj1){
//     console.log(obj1[i]);
// }

// for(let i of Object.keys(obj)){
//     console.log(obj1[i]);
// }

// let obj = [
//     { id : 1 , name :  "Mihir"},
//         { id: 2  , name : "Jain"},
// ]

// const mySym = Symbol("key1")
// let user = {
//     name : "User",
//     [mySym] : "mykey1",
//     "fullname" : "Mihir",
//     age : 18,
//     location : "jaipur",
//     email :  "jainsuresh713@gmail.com",
//     islog : false,
//     lastlogin : ["Monday", "Tuesday"]
// }

// console.log(user.name);
// console.log(user["name"]);
// console.log(user[mySym]);
// console.log(user["fullname"]) // do not access by 
// console.log(user);

// for(let i in user){
//     console.log(user[i]);
// }
// for(let i of Object.keys(user)){
//     console.log(user[i]);
// }
// for(let i in user.lastlogin){
//     console.log(user.lastlogin[i]);
// }

// for(let i in obj){
//     console.log(obj[i]);
// }

// for(let i of Object.keys(obj)){
//     console.log( obj[i].id + " " + obj[i].name);
// }

// obj.forEach(ele => console.log(ele.id))


// set interval and settimeout

// let val = setInterval(() => {
//     console.log("Mihir");
// }, 1);
// setTimeout(() => {
//     clearInterval(val);
// }, 250);

// setTimeout(() => {
//     console.log("Hello i am inside settimeout");
// }, 10)

// callback functions
// function fun(val){
//     console.log(val);
// }

// function add(val,callback){
//     let sum = val+val;
//     callback(sum);
// }

// console.log(add(3,fun));

// let str = "  one  ";

// let answer = str.trim();
// console.log(str.trim());   //print -> one -> it removes the staring and last spaces from an array

// console.log(answer.split("")); // it convertes the string in chracter // -> ['o','n','e']

// console.log(answer.split("").reverse().join(""));  // it reverse the strings // print -> eno

// str.slice(0,2);  // hamesha index -1 chlta h yeh and kuch changes nhi krta strings me // print -> on
// console.log(answer);

// let arr = [1,2,3,3];
// // console.log(arr.slice(0,2));
// const spli = arr.splice(0,2); //indexes element is also deleted in orignal array print ->  1,2  and return new orignal array
// console.log(spli); // 1,2
// // splice ( jha se start krna h , wha se lekr kitne elements delete krne hai (delete count) , agr kuch insert krna inke bich me(insert elements))
// const addSpli =  arr.splice(0,0,"a","b"); // also it inserts an element in the given positions
// console.log(arr); // 3,3


// console.log(Math.random());
// console.log(Math.floor(Math.random()));

// let max = 20;
// let min = 10;

// console.log(Math.floor(Math.random() * ( max - min +1)) + min)
// console.log(Math.ceil(Math.random() * ( max - min +1)) + min)

// floor -> return less value
// ceil -> high value
// round -> return round of value
// let ab =  10.4;
// console.log(Math.floor(ab) + " " + Math.ceil(ab) + " " + Math.round(ab));


// console.log("Hello");

// const selectH1 =  document.querySelector('h1')
// console.log(selectH1);
// selectH1.style.color = 'Red';

// const selectList = document.querySelector('.list')
// const selectOneli = selectList.querySelector('li')
// console.log(selectList.children.length);
// for(let i=0;i<selectList.children.length;i++){
//     selectList.children[i].style.color="white";
// }


// const selectAllList  = document.querySelectorAll('li');
// selectAllList.forEach((ele) => ele.style.color ="Red")

// querySelector -> return single element
// querySelectorAll -> return nodelist supports for each
// getElementByClassName -> return a htmlcollection that converts in the array first

// const getEle = document.getElementsByClassName('one');
// console.log(getEle);
// const array = Array.from(getEle);
// array.forEach((ele) => ele.style.color = "Red");


// const newele =  document.createElement('div')
// newele.style.color = "Red"
// newele.setAttribute('title' , "Mihir");
// // newele.innerText = "Hi hello" // overwrite and tree traverse
// const addText = document.createTextNode("Mihir Jain");
// newele.appendChild(addText);
// document.body.appendChild(newele);

// edit 
// const selectli = document.querySelector('li:first-child')
// console.log(selectli);
// const newele = document.createElement('li')
// newele.innerText ="Mihhir";
// selectli.replaceWith(newele);

// const second = document.querySelector('li:nth-child(2)')
// second.outerHTML = ' <li> Mihir</li>'

// // remove 
// const removeEle = document.querySelector('li:first-child')
// removeEle.remove();

// document.getElementById('owl').onclick = function(){
//     alert('own clicked');
// }
// document.getElementById('images').addEventListener('click', function(e){
//     console.log(`clicked inside the ul`);
// })


// document.getElementById('owl').addEventListener('click', function(e){
//     console.log(`Owl Clicked`);
//     e.stopPropagation(); // bubbling na hoo  only owl clicked hoga upr ke element pr nhi jayega 
// })

// # event propagation
// event capturing -> true -> top to bottom
// event bubbling -> false -> bottom to top
// false parameter by default hota hai


// closures
// function makeFunc(){
//     const name = "Mihir";
//     function displayName(){
//         console.log(name);
//     }
//     return displayName;
// }
// const myFunc = makeFunc();
// myFunc();









