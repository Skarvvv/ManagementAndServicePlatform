// pages/home/home.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    swiperList: [
      {
        id: 1,
        imageSrc: "../../imgs/slideshow/pic1.png"
      },{
        id: 2,
        imageSrc: "../../imgs/slideshow/pic2.png"
      }
    ],
    newsList: []
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad(options) {
    this.newsList()
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


  newsList: function(){
    const app = getApp()
    wx.request({
      url: app.globalData.requestAddr + '/news/newsList',
      method: 'GET',
      data: {},
      success: (result) => {
        this.setData({
          newsList: result.data
        })
      },
      fail: (err) => {},
      complete: (res) => {}
    })
  },
  toNewsDetailPage: function(e){
    wx.navigateTo({
      url: '/pages/newsDetail/newsDetail?nid='+e.currentTarget.dataset.nid,
    })
  }

})