// pages/person/person.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    userInfo: {}
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
    this.uploadUserInfo()
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

  // getUser() {
  //   const app = getApp()
  //   wx.request({
  //     url: app.globalData.requestAddr + '/user/userInfo',
  //     data: {
  //       ucode: 'testUser_001'
  //     },
  //     method: 'GET',
  //     success: (result) => {
  //       this.setData({
  //         userInfo: result
  //       })
  //     },
  //     fail: (err) => {
  //       console.log("找信息失败了哇~")
  //     },
  //     complete: (res) => {},
  //   })
  // },
  uploadUserInfo: function(){
    const app = getApp()
    this.setData({
      userInfo: app.globalData.userInfo
    })
  },
  toUpdateInformation: function(){
    wx.navigateTo({
      url: '/pages/updateInfotmation/updateInformation',
    })
  },
  toUpdatePassword: function(){
    wx.navigateTo({
      url: '/pages/updatePassword/updatePassword',
    })
  }

})