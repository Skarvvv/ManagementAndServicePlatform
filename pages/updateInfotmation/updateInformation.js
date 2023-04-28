// pages/updateInfotmation/updateInformation.js

//引入事先写好的日期设置util.js文件
var datePicker = require('../../utils/dataSetting')
 
//设定当前的时间，将其设定为常量
const date = new Date();
const year = date.getFullYear();
const month = date.getMonth() + 1;

Page({

  /**
   * 页面的初始数据
   */
  data: {
    uname: '',
    urealname: '',
    ugender: '',
    ubirthday: '',
    utel: '',
    uidentity: '',
    timess: [],

    msg: '',

    isSelect: false,//展示类型？
    genders: [
      {
        gid: 1,
        gender: 'female'
      },{
        gid: 2,
        gender: 'male'
      }
    ],
    gid: 0, //最终选择的性别

    time: '',
    multiArray: [],
    multiIndex: [],
    choose_year: ""
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad(options) {
    this.uploadUserInfo()
    this.setData({
      multiArray:
        [
          [
            year - 99 + "年", year - 98 + "年", year - 97 + "年", year - 96 + "年", year - 95 + "年", year - 94 + "年", year - 93 + "年", year - 92 + "年", year - 91 + "年", year - 90 + "年", year - 89 + "年", year - 88 + "年", year - 87 + "年", year - 86 + "年", year - 85 + "年", year - 84 + "年", year - 83 + "年", year - 82 + "年", year - 81 + "年", year - 80 + "年", year - 79 + "年", year - 78 + "年", year - 77 + "年", year - 76 + "年", year - 75 + "年", year - 74 + "年", year - 73 + "年", year - 72 + "年", year - 71 + "年", year - 70 + "年", year - 69 + "年", year - 68 + "年", year - 67 + "年", year - 66 + "年", year - 65 + "年", year - 64 + "年", year - 63 + "年", year - 62 + "年", year - 61 + "年", year - 60 + "年", year - 59 + "年", year - 58 + "年", year - 57 + "年", year - 56 + "年", year - 55 + "年", year - 54 + "年", year - 53 + "年", year - 52 + "年", year - 51 + "年", year - 50 + "年", year - 49 + "年", year - 48 + "年", year - 47 + "年", year - 46 + "年", year - 45 + "年", year - 44 + "年", year - 43 + "年", year - 42 + "年", year - 41 + "年", year - 40 + "年", year - 39 + "年", year - 38 + "年", year - 37 + "年", year - 36 + "年", year - 35 + "年", year - 34 + "年", year - 33 + "年", year - 32 + "年", year - 31 + "年", year - 30 + "年", year - 29 + "年", year - 28 + "年", year - 27 + "年", year - 26 + "年", year - 25 + "年", year - 24 + "年", year - 23 + "年", year - 22 + "年", year - 21 + "年", year - 20 + "年", year - 19 + "年", year - 18 + "年", year - 17 + "年", year - 16 + "年", year - 15 + "年", year - 14 + "年", year - 13 + "年", year - 12 + "年", year - 11 + "年", year -10 + "年", year - 9 + "年", year - 8 + "年", year - 7 + "年", year - 6 + "年", year - 5 + "年", year - 4 + "年", year - 3 + "年", year - 2 + "年", year - 1 + "年", year + "年"
          ],
          datePicker.determineMonth(),
          datePicker.determineDay(year, month)
        ],
        multiIndex: [2023 - this.data.ubirthday.split("-")[0] + 55, parseInt(this.data.ubirthday.split("-")[1])-4>0?parseInt(this.data.ubirthday.split("-")[1])-4:parseInt(this.data.ubirthday.split("-")[1])+8, this.data.ubirthday.split("-")[2] - 1]
    })
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
  updateCheckUpassword: function(e){
    this.setData({
      checkUpassword: e.detail.value
    })
  },
  updateUrealname: function(e){
    this.setData({
      urealname: e.detail.value
    })
  },
  updateUtel: function(e){
    this.setData({
      utel: e.detail.value
    })
  },
  updateUidentity: function(e){
    this.setData({
      uidentity: e.detail.value
    })
  },
  doClear: function(){
    this.setData({
      uname: '',
      urealname: '',
      ugender: '',
      ubirthdar: '',
      utel: '',
      uidentity: ''
    })
  },


  uploadUserInfo: function(){
    const app = getApp()
    this.setData({
      uname: app.globalData.userInfo.uname,
      urealname: app.globalData.userInfo.urealname,
      ugender: app.globalData.userInfo.ugender,
      ubirthday: app.globalData.userInfo.ubirthday,
      utel: app.globalData.userInfo.utel,
      uidentity: app.globalData.userInfo.uidentity
    })
  },
  //点击控制下拉框的展示、隐藏
  select:function(){
   var isSelect = this.data.isSelect
   this.setData({ isSelect:!isSelect})
 },
 //点击下拉框选项，选中并隐藏下拉框
 getType:function(e){
   let gid = e.currentTarget.dataset.gid
   let ugender = e.currentTarget.dataset.gender
   this.setData({
     gid: gid,
     ugender: ugender,
     isSelect: false,
   })
 },
 //最后呈现时间的函数。
 bindMultiPickerChange: function (e) {
    var dateStr = this.data.multiArray[0][this.data.multiIndex[0]] +
      this.data.multiArray[1][this.data.multiIndex[1]] +
      this.data.multiArray[2][this.data.multiIndex[2]];
    this.setData({
      time: dateStr
    })
  },
  //当时间选择器呈现并进行滚动选择时间时调用该函数。
  bindMultiPickerColumnChange: function (e) {
    //e.detail.column记录哪一行发生改变，e.detail.value记录改变的值（相当于multiIndex）
    switch (e.detail.column) {
      //这里case的值有0/1/2/3/4,但除了需要记录年和月来确定具体的天数外，其他的都可以暂不在switch中处理。
      case 0:
        //记录改变的年的值
        let year = this.data.multiArray[0][e.detail.value];
        this.setData({
          choose_year: year.substring(0, year.length - 1)
        })
        break;
      case 1:
        //根据选择的年与月，确定天数，并改变multiArray中天的具体值
        let month = this.data.multiArray[1][e.detail.value];
        let dayDates = datePicker.determineDay(this.data.choose_year, month.substring(0, month.length - 1));
        //这里需要额外注意，改变page中设定的data，且只要改变data中某一个值，可以采用下面这种方法
        this.setData({
          ['multiArray[2]']: dayDates
        })
        break;
    }
    //同上，上面改变的是二维数组中的某一个一维数组，这个是改变一个一维数组中某一个值，可供参考。
    this.setData({
      ["multiIndex[" + e.detail.column + "]"]: e.detail.value
    })
  },
  doUpdate: function(){
    if(this.data.time!=''){
      const app = getApp()
      wx.request({
        url: app.globalData.requestAddr + '/user/updateInformation',
        method: 'GET',
        data: {
          uid: app.globalData.userInfo.uid,
          uname: this.data.uname,
          urealname: this.data.urealname,
          ugender: this.data.ugender,
          ubirthday: this.data.time,
          utel: this.data.utel,
          uidentity: this.data.uidentity
        },
        success: (result) => {
          console.log(result)
          // app.globalData.userInfo.uname = this.data.uname
          // app.globalData.userInfo.urealname = this.data.urealname
          // app.globalData.userInfo.ugender = this.data.ugender
          // app.globalData.userInfo.ubirthday = this.data.ubirthday
          // app.globalData.userInfo.utel = this.data.utel
          // app.globalData.userInfo.uidentity = this.data.uidentity
          app.globalData.userInfo = result.data
          wx.switchTab({
            url: '/pages/person/person',
          })
        },
        fail: (err) => {},
        complete: (res) => {}
      })
    }else{
      this.setData({
        msg: 'the value of birthday can not be null'
      })
    }
  }


})