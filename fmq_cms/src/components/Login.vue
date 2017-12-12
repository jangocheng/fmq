<template>
  <div class="login"> 
    <h1>{{ msg }}</h1>
    <ul>
       <div class="footer">
        <div class="input_text">
          <table align="center">
            <tr>
               <td class="fr"><label>用户名：</label></td>
               <td><input type="text" placeholder="用户名" maxlength="40" v-model="loginName" class="loginName"/></td>
            </tr>
            <tr>
              <td class="fr"><label>密码：</label></td>
              <td><input type="password"  placeholder="密码" maxlength="40"  v-model="loginPwd" class="loginPwd"/></td>
            </tr>
          </table>
        </div>
        <div class="error"></div>
        <div>
          <a href="javascript:void(0);" class="login" @click='login'>登录</a>
        </div>
      </div>
    </ul>
  </div>
</template>



<script>



export default {
  name: 'Login',
  data () {
    return {
      msg: '欢迎使用后台管理系统',
      loginName:'',
      loginPwd:''

    }


  },
    methods: {
       login () {
        var  self= this;
         var pams={
            account:self.loginName || 'abc',
            password:self.loginPwd || 123
        }
         
         this.$ajax({
          method: 'get',
          url: 'http://localhost:8081/loginPost',
          data: JSON.stringify(pams)
         }).then(function(e){
            console.info(e);
         })
        

      }
}
}
</script>


<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1, h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
