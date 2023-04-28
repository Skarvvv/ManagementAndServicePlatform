// pages/register/register.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    uname: '',
    upassword: '',
    checkUpassword: '',
    uavatar: '',
    urealname: '',
    ugender: '',
    ubirthday: '',
    utel: '',
    uidentity: '',

    images: [],

    checkUpasswordMsg: ''
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

  checkUpassword: function(){
    if(this.data.upassword != this.data.checkUpassword){
      this.setData({
        checkUpasswordMsg: 'There\'s difference between the passwords you input in twice'
      })
    }
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
  updateUgender: function(e){
    this.setData({
      ugender: e.detail.value
    })
  },
  updateUbirthday: function(e){
    this.setData({
      ubirthday: e.detail.value
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

  chooseImage() {
    wx.chooseImage({
      count: 1, // 可选择的图片数量
      sizeType: ['compressed'], // 压缩图片
      sourceType: ['album', 'camera'], // 来源：相册或相机
      success:  (res)=> {
        // 将选择的图片上传到服务器
        this.uploadImage(res.tempFilePaths[0]);
      }
    })
  },
  uploadImage(imagePath) {
    const app = getApp()
    wx.uploadFile({
      url: app.globalData.requestAddr + '/user/avatarImage', // 上传图片的接口地址
      method: 'GET',
      filePath: imagePath, // 图片文件路径
      name: 'image', // 文件对应的 key , 开发者在服务器端通过这个 key 可以获取到文件二进制内容
      success: (res) => {
        // 上传成功后，将服务器返回的图片地址更新到image标签中
        this.setData({
          imageUrl: res.data
        });
      },
      // fail: function (res) {
      //   console.log(res);
      // }
    })
  },
  doRegister: function(){
    if(this.data.upassword != this.data.checkUpassword){
      this.setData({
        checkUpasswordMsg:　"the passwords input twice are different"
      })
    }else{
      const app = getApp()
      wx.request({
        url: app.globalData.requestAddr + '/user/save',
        method: 'GET',
        data: {
          uname: this.data.uname,
          upassword: this.data.upassword,
          uavatar: this.data.images[0],
          urealname: this.data.urealname,
          ugender :this.data.ugender,
          ubirthday: this.data.ubirthday,
          utel: this.data.utel,
          uidentity: this.data.uidentity
        },
        success: (result) => {
          wx.navigateTo({
            url: '/pages/login/login',
          })
        },
        fail: (err) => {},
        complete: (res) => {}
      })
    }
  },
  doClear: function(){
    this.setData({
      uname: '',
    upassword: '',
    checkUpassword: '',
    uavatar: '',
    urealname: '',
    ugender: '',
    ubirthdar: '',
    utel: '',
    uidentity: '',

    checkUpasswordMsg: ''
    })
    
  },

  chooseImage: function (e) {
    wx.chooseImage({
      sizeType: ['original', 'compressed'], //可选择原图或压缩后的图片
      sourceType: ['album', 'camera'], //可选择性开放访问相册、相机
      success: res => {
        const images = this.data.images.concat(res.tempFilePaths)
        this.setData({
          images: images
        })
      }
    })
  },
  // 删除图片
  removeImage(e) {
    const idx = e.target.dataset.idx;
    this.data.images.splice(idx, 1);
    var del_image = this.data.images;
    this.setData({
      images: del_image
    })
  },
  // 查看大图
  handleImagePreview(e) {
    const idx = e.target.dataset.idx
    const images = this.data.images
    wx.previewImage({
      current: images[idx], //当前预览的图片
      urls: images, //所有要预览的图片
    })
  }

})