// pages/newsDetail/newsDetail.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    news: {},
    flag: false,
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad(options) {
    const app = getApp()
    wx.request({
      url: app.globalData.requestAddr + '/news/newsByNid',
      method: 'GET',
      data: {
        nid: options.nid
      },
      success: (result) => {
        this.setData({
          news: result.data
        })
      },
      fail: (err) => {},
      complete: (res) => {}
    })
    // var that=this;
    // var info= JSON.parse(options.info);
    // console.log(info.detail);
    // that.setData({
    //   info:info
    // })
    // console.log(this.data.info);
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


  changeCollect: function () {
    this.setData({
      flag: !this.data.flag
    })
    if (this.data.flag) {
      wx.showToast({
        title: '已收藏',
        icon: 'none',
        duration: 2000
      })
    } else {
      wx.showToast({
        title: '已取消收藏',
        icon: 'none',
        duration: 2000
      })
    }
  },
  onUnload: function () {
    wx.reLaunch({
      url: '../news/news'
    })
  },
  onShareAppMessage: function () {
    return {
     
    }
  },
  onShareTimeline: function(res){
    return {
      
    }
  },
  onPageScroll:function(){

  }


})