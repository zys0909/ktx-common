package com.group.dev.ui.other

import android.os.Bundle
import com.group.dev.R
import com.group.common.base.BaseActivity
import com.group.common.imageload.ImageLoader
import kotlinx.android.synthetic.main.activity_test_image.*

/**
 * 描述:
 *
 * author zhaoys
 * create by 2019/9/3 0003
 */
class ClipImageActivity : BaseActivity() {
    private val url = "https://ws1.sinaimg.cn/large/0065oQSqly1fytdr77urlj30sg10najf.jpg"
    private lateinit var imageLiad :ImageLoader
    override fun layoutId(): Int = R.layout.activity_test_image

    override fun init(savedInstanceState: Bundle?) {
        initToolbar("图片裁剪")
        imageLiad = ImageLoader(this)
        imageLiad.load(icon_1, url)
        imageLiad.loadCircle(icon_2, url)
        imageLiad.loadTopCircle(icon_3, url)
    }
}