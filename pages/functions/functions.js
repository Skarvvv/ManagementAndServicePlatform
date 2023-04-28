// pages/main/main.js
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
    gridList:[
      {
        id: 1,
        gridName: "symptom report",
        iconSrc: "../../imgs/grids/symptom report.png",
        toPath: "pages/symptomReport/symptomReport"
      },{
        id: 2,
        gridName: "status inspection",
        iconSrc: "../../imgs/grids/status inspection.png",
        toPath: "pages/statusInspection/statusInspection"
      },{
        id: 3,
        gridName: "follow-up schedule",
        iconSrc: "../../imgs/grids/follow-up schedule.png",
        toPath: "pages/followUpSchedule/followUpSchedule"
      },{
        id: 4,
        gridName: "medication reminder",
        iconSrc: "../../imgs/grids/medication reminder.png",
        toPath: "pages/medicationReminder/medicationReminder"
      },{
        id: 5,
        gridName: "risk warning",
        iconSrc: "../../imgs/grids/risk warning.png",
        toPath: "pages/riskWarning/riskWarning"
      },{
        id: 6,
        gridName: "user feedback",
        iconSrc: "../../imgs/grids/user feedback.png",
        toPath: "pages/userFeedback/userFeedback"
      }
    ]
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

  }

})