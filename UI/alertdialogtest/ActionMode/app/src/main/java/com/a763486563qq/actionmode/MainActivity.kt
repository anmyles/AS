package com.a763486563qq.actionmode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.R
import android.view.MenuInflater
import android.view.ContextMenu.ContextMenuInfo
import android.widget.EditText
import androidx.test.core.app.ApplicationProvider.getApplicationContext
import android.app.Activity


class MainActivity : Activity() {
    private var mContext: Context? = null
    private var mEditMenu: EditText? = null
    private var mMenuInflater: MenuInflater? = null

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mContext = applicationContext

        // 绑定菜单按钮事件
        mEditMenu = findViewById(R.id.input_text3) as EditText
        // 注册上下文菜单
        registerForContextMenu(mEditMenu)
    }

    // 上下文菜单，与EditView控件绑定，长按显示菜单项
    fun onCreateContextMenu(
        menu: ContextMenu,
        view: View,
        contextMenuInfo: ContextMenu.ContextMenuInfo
    ) {
        super.onCreateContextMenu(menu, view, contextMenuInfo)
        // 创建新的contextMenu对象
        mMenuInflater = MenuInflater(this)
        // 使用XML与原menu对象对新ContextMenu对象初始化
        mMenuInflater!!.inflate(R.menu.text_menu, menu)
    }

    // 上下文菜单，触发上下文菜单项点击事件时响应
    fun onContextItemSelected(item: MenuItem): Boolean {
        when (item.getItemId()) {
            R.id.file_new -> {
                Toast.makeText(mContext, "File new.", Toast.LENGTH_SHORT).show()
            }
            R.id.file_save -> {
                Toast.makeText(mContext, "File save.", Toast.LENGTH_SHORT).show()
            }
            R.id.cut -> {
                Toast.makeText(mContext, "Edit cut.", Toast.LENGTH_SHORT).show()
            }
            R.id.copy -> {
                Toast.makeText(mContext, "Edit copy.", Toast.LENGTH_SHORT).show()
            }
            R.id.paste -> {
                Toast.makeText(mContext, "Edit paste.", Toast.LENGTH_SHORT).show()
            }
            else -> Toast.makeText(mContext, "无响应", Toast.LENGTH_SHORT).show()
        }
        return true
    }

    // 注销注册过的上下文菜单
    public override fun onDestroy() {
        super.onDestroy()
        unregisterForContextMenu(mEditMenu)
    }

    companion object {
        private val TAG = "MainActivity"
    }
}
