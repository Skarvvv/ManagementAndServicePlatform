// pages/login/login.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    uname: '',
    upassword: '',
    loginMsg: '',

    canSee: false
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad(options) {

  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady() {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow() {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide() {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload() {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh() {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom() {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage() {

  },

  updateUname: function(e){
    this.setData({
      uname: e.detail.value
    })
  },
  updateUpassword: function(e){
    this.setData({
      upassword: e.detail.value
    })
  },

  clearLoginMsg: function(){
    this.setData({
      loginMsg: ''
    })
  },
  doLogin: function(){
    const app = getApp()
    wx.request({
      url: app.globalData.requestAddr + '/user/userInfo',
      method: 'GET',
      data: {
        uname: this.data.uname,
        upassword: this.data.upassword
      },
      success: (result) => {
        if(result.data!=''){
          this.clearLoginMsg()
          const app = getApp()
          app.globalData.userInfo = result.data
          wx.switchTab({
            url: '/pages/home/home',
          })
        }else{
          this.setData({
            loginMsg: 'uname or upassword is incorrect'
          })
        }
      },
      fail: (err) => {},
      complete: (res) => {}

    })
  },
  doRegister: function(){
    this.clearLoginMsg
    wx.navigateTo({
      url: '/pages/register/register',
    })
  },
  changeSee: function(){
    this.setData({
      canSee: !this.data.canSee
    })
  }
})