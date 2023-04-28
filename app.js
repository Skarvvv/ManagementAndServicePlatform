// app.js
App({
  onLaunch() {
    // 展示本地存储能力
    const logs = wx.getStorageSync('logs') || []
    logs.unshift(Date.now())
    wx.setStorageSync('logs', logs)

    // 登录
    wx.login({
      success: res => {
        // 发送 res.code 到后台换取 openId, sessionKey, unionId
      }
    })
  },
  globalData: {
    requestAddr: 'http://localhost:8080',
    userInfo: null
//     userInfo: {
//       ubirthday: '2001-05-27',
// uavatar: "#",
// ucode: "testUser_001",
// ugender: "male",
// uid: 1,
// uidentity: "350702200105270000",
// uname: "zs123",
// upassword: "123",
// urealname: "zhangsan",
// ustate: "001",
// utel: "19859135736"
//     }
  }
})
