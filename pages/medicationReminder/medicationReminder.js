// pages/medicationReminder/medicationReminder.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    medicinesSelected: []
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
    this.medicineListByUid()
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


  medicineListByUid: function(){
    const app = getApp()
    wx.request({
      url: app.globalData.requestAddr + '/medicine/medicineListByUid',
      data: {
        uid: app.globalData.userInfo.uid
      },
      method: 'GET',
      success: (result) => {
        this.setData({
          medicinesSelected: result.data
        })
      },
      fail: (err) => {
        console.log("通过uid找medicine信息失败了哇~")
      },
      complete: (res) => {},
    })
  },
  addMedicine: function(){
    wx.navigateTo({
      url: '/pages/addMedicine/addMedicine',
    })
  }

})