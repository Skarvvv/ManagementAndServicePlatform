// pages/riskWarning/riskWarning.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    riskWarnings: []
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad(options) {
    this.riskWarningsByUid()
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
    wx.showToast({
      title: 'refreshing...'
    })
    this.riskWarningsByUid()
    wx.stopPullDownRefresh({
      success: (res) =>{}
    })
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


  riskWarningsByUid: function(){
    const app = getApp()
    wx.request({
      url: app.globalData.requestAddr + '/riskWarning/riskWarningsByUid',
      data: {
        uid: app.globalData.userInfo.uid
      },
      method: 'GET',
      success: (result) => {
        this.setData({
          riskWarnings: result.data
        })
      },
      fail: (err) => {
        console.log("通过uid找riskWarning信息失败了哇~")
      },
      complete: (res) => {},
    })
  }



})