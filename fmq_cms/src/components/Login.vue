<template>
  <div class="login"> 
    <h1>{{ msg }}</h1>
    <ul>
       <div class="footer">
        <div class="input_text">
          <table align="center">
            <li></li>
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
            msg: '欢迎使用后台系统',
            loginName:'',
            loginPwd:''
          }
        },
        methods:{
              login:function (){
                  /*var self = this;
                  var url='http://localhost:8081/loginPost'
                  this.$http.get(url,{
                    params:{
                      account:self.loginName,
                      password:self.loginPwd
                    }, 
                  }).then(function (response) {
                    var errorcode=response.data.errorcode;
                      if(errorcode=="200"){
                           self.$router.push({ path: '/Home' });
                      }else{
                          // self.$router.push({ path: '/Error' });
                      }
                    }).catch(function (error) {
                      console.log(error);
                  });*/

                   var self = this;
                  var url='http://localhost:8081/loginPost'
                  var params={
                      account:self.loginName,
                      password:self.loginPwd
                    }
                  this.$http.post(url,params).then(function (response) {
                    var errorcode=response.data.errorcode;
                      if(errorcode=="200"){
                           self.$router.push({ path: '/Home' });
                      }else{
                          // self.$router.push({ path: '/Error' });
                      }
                    }).catch(function (error) {
                      console.log(error);
                  });
              }
        }
      }
</script>

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





