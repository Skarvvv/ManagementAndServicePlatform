// pages/addMedicine/addMedicine.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    medicines: [],
    medicineChosen: [],
    medicinesSelected: [],
    styles: ['#fff', '#fffacf']
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad(options) {
    this.medicineListByUid()
    this.medicineList()
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
    this.medicineListByUid()
    this.medicineList()
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

  
  medicineList: function(){
    const app = getApp()
    wx.request({
      url: app.globalData.requestAddr + '/medicine/medicineList',
      data: {},
      method: 'GET',
      success: (result) => {
        this.setData({
          medicines: result.data,
          medicineChosen: new Array(result.data.length)
        })
        for(var i = 0;i<this.data.medicines.length;i++){
          this.data.medicineChosen[i] = 0;
        }
        for(var i = 0;i<this.data.medicinesSelected.length;i++){
          this.data.medicineChosen[this.data.medicinesSelected[i].mid-1] = 1
        }
      },
      fail: (err) => {
        console.log("找medicine信息失败了哇~")
      },
      complete: (res) => {},
    })
  },
  doChoose: function(e){
    const index = e.currentTarget.dataset.index; // 获取当前点击元素的下标
    const medicineChosen = this.data.medicineChosen;
    medicineChosen[index] = 1 - medicineChosen[index]; // 切换选中状态

    this.setData({
      medicineChosen: medicineChosen // 更新数组数据，触发数据绑定更新视图
    });
    console.log(medicineChosen)
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
  submit: function(){
    const app = getApp()
    wx.request({
      url: app.globalData.requestAddr + '/medicine/distributeMedicines',
      method: 'GET',
      data: {
        uid: app.globalData.userInfo.uid,
        medicineChosen: this.data.medicineChosen
      },
      success: (result) => {
        wx.showToast({
          title: 'submit medicine successfully',
        })
        wx.switchTab({
          url: '/pages/functions/functions',
        })
      },
      fail: (err) => {
        wx.showToast({
          title: 'submit medicine failure',
        })
      },
      complete: (res) => {
        wx.hideToast()
      }
    })
  }


})